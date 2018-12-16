package com.javaguru.lessons.lesson10.checked;

class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            shouldThrowRuntimeException();
            shouldThrowMyException();
            shouldThrowException();
        } catch (MyCheckedException exception) {
            exception.printStackTrace();
        } catch (MyUncheckedException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            System.out.println("3");
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
    }

    private static void shouldThrowMyException() throws MyCheckedException {
        throw new MyCheckedException("My checked exception");
    }

    private static void shouldThrowRuntimeException() {
        throw new MyUncheckedException("My unchecked exception");
    }

    private static void shouldThrowException() throws Exception {
        throw new Exception();
    }
}
