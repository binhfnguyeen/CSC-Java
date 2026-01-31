package com.heulwen;

public class Main {
    /** java.lang.Throwable
     *   |
     *   |- java.lang.Error (Lỗi hệ thống nghiêm trọng, thường không xử lý)
     *   |   |
     *   |   |- StackOverflowError (Lỗi tràn bộ nhớ stack)
     *   |   |- OutOfMemoryError (Lỗi hết bộ nhớ heap)
     *   |   |- VirtualMachineError
     *   |   |_ ... (Các lỗi nghiêm trọng khác)
     *   |
     *   |_ java.lang.Exception (Ngoại lệ có thể xử lý bởi ứng dụng)
     *       |
     *       |- java.io.IOException (Lỗi vào/ra - Checked)
     *       |- java.sql.SQLException (Lỗi SQL - Checked)
     *       |- ClassNotFoundException (Không tìm thấy lớp - Checked)
     *       |- ... (Các Checked Exception khác)
     *       |
     *       |_ java.lang.RuntimeException (Ngoại lệ thời gian chạy - Unchecked)
     *            |
     *            |- NullPointerException (Truy cập đối tượng null)
     *            |- ArithmeticException (Lỗi toán học, vd: chia cho 0,...)
     *            |- ArrayIndexOutOfBoundException (Truy cập ngoài chỉ số mảng)
     *            |- IllegalArgumentException (Đối số phương thức không hợp lệ)
     *            |- ClassCastException (Ép kiểu không hợp lệ)
     *            |_ ... (Các Unchecked Exception khác)
     */
    public static void main(String[] args) {

    }
}