class Interpreter {
    // Parsing of something

    // Global information
    class Context {
        String parseme;
    }

    class abstract AbstractExpression {
        interpret(Context c);
    }

    class TerminalExpression extends AbstractExpression {

    }


    class NonTerminalExpression extends AbstractExpression {
        
    }

// SQL syntax
    class Select implements AbstractExpression {

        private String column;
        private From from;

        // constructor

        @Override
        public List<String> interpret(Context ctx) {
            ctx.setColumn(column);
            return from.interpret(ctx);
        }
    }

    class From implements AbstractExpression {
        private String table;
        private Where where;

        // constructors

        @Override
        public List<String> interpret(Context ctx) {
            ctx.setTable(table);
            if (where == null) {
                return ctx.search();
            }
            return where.interpret(ctx);
        }
    }

    class Where implements AbstractExpression {
        private Predicate<String> filter;
        // constructor

        @Override
        public List<String> interpret(Context ctx) {
            ctx.setFilter(filter);
            return ctx.search();
        }
    }

    class Context {
        private static Map<String, List<Row>> tables = new HashMap<>();
        static {
            List<Row> list = new ArrayList<>();
            list.add(new Row("John", "Doe"));
            list.add(new Row("Jan", "Kowalski"));
            list.add(new Row("Dominic", "Doom"));

            tables.put("people", list);
        }
        private String table;
        private String column;
        private Predicate<String> whereFilter;

        // ... 

        List<String> search() {
            List<String> result = tables.entrySet()
            .stream()
            .filter(entry -> entry.getKey().equalsIgnoreCase(table))
            .flatMap(entry -> Stream.of(entry.getValue()))
            .flatMap(Collection::stream)
            .map(Row::toString)
            .flatMap(columnMapper)
            .filter(whereFilter)
            .collect(Collectors.toList());

            clear();

            return result;
        }
    }

    public static void main(String[] args) {
        Expression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        System.out.println(result);

        Expression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

        Expression query3 = new Select("name", 
          new From("people", 
            new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        System.out.println(result3);
    }
}