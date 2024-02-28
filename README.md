# LTDD_Practice_Tabhost
Tasks: (submit)   - Khảo sát các cách dùng kết hợp TabHost với các dạng control khác  - So sánh và nêu những trường hợp ứng dụng của nó   - Hoàn thành lại màn hình Zalo (motivation Exercise - Có dùng tabhost)   - Tạo ra ít nhất 2 ngôn ngữ khác (ngoài ngôn ngữ default). Các em có thể thử các dạng qualifier khác (orientation, night mode).
- Khảo sát các cách dùng kết hợp TabHost với các dạng control khác
TabHost trong Android cung cấp một cách tiện lợi để hiển thị nhiều tab trong cùng một màn hình và chuyển đổi giữa chúng. Các tab có thể chứa nhiều loại điều khiển khác nhau để hiển thị nội dung khác nhau. Dưới đây là một số cách phổ biến để kết hợp TabHost với các loại điều khiển khác trong ứng dụng Android:

1.Fragment: Sử dụng Fragment để hiển thị nội dung cho mỗi tab. Mỗi Fragment có thể chứa một giao diện người dùng độc lập với các điều khiển của riêng nó.

2.ListView hoặc RecyclerView: Hiển thị danh sách dữ liệu trong mỗi tab bằng cách sử dụng ListView hoặc RecyclerView. Mỗi tab có thể chứa một danh sách các mục dữ liệu, và người dùng có thể cuộn qua các mục.

3.WebView: Sử dụng WebView để hiển thị nội dung web trong mỗi tab. Điều này cho phép bạn hiển thị trang web hoặc ứng dụng web trong mỗi tab.

4.GridLayout hoặc LinearLayout: Sử dụng các loại Layout này để sắp xếp các điều khiển khác nhau trong mỗi tab. Bạn có thể tạo giao diện tùy chỉnh bằng cách sử dụng các layout này để đặt các điều khiển theo ý muốn của mình.

5.MapFragment hoặc SupportMapFragment: Nếu bạn muốn hiển thị bản đồ trong một hoặc nhiều tab, bạn có thể sử dụng MapFragment hoặc SupportMapFragment để nhúng bản đồ vào mỗi tab.

6.ScrollView: Nếu nội dung của mỗi tab có thể chứa nhiều hơn một màn hình, bạn có thể sử dụng ScrollView để cho phép người dùng cuộn qua nội dung.

7.ViewPager: Mặc dù ViewPager không phải là một control, nhưng nó thường được sử dụng cùng với TabHost để tạo giao diện tab dễ sử dụng. ViewPager cho phép người dùng cuộn qua các tab và hiển thị nội dung tương ứng với tab đó.
==> Khi kết hợp TabHost với các loại điều khiển khác nhau, hãy xem xét cách bạn muốn người dùng tương tác với ứng dụng của bạn và chọn loại điều khiển phù hợp nhất với nhu cầu của bạn.

- So sánh và nêu những trường hợp ứng dụng của nó
1.Fragment:
Ưu điểm: Fragment cung cấp sự linh hoạt cao và cho phép bạn tái sử dụng mã nguồn và giao diện người dùng. Bạn có thể quản lý logic của từng tab một cách độc lập và dễ dàng tương tác giữa các tab.
Trường hợp ứng dụng: Thích hợp cho các ứng dụng có nhiều tab với nội dung phức tạp, đa dạng và cần tương tác nhiều.

2.ListView hoặc RecyclerView:
Ưu điểm: Cho phép hiển thị danh sách dữ liệu một cách linh hoạt, dễ dàng quản lý và tùy chỉnh.
Trường hợp ứng dụng: Lý tưởng cho các ứng dụng hiển thị danh sách dữ liệu, ví dụ như danh bạ, tin tức, sản phẩm trong cửa hàng, v.v.

3.WebView:
Ưu điểm: Cho phép hiển thị nội dung web trong ứng dụng mà không cần phải chuyển đến trình duyệt ngoài.
Trường hợp ứng dụng: Hữu ích khi cần hiển thị trang web, ứng dụng web hoặc nội dung HTML tĩnh trong một hoặc nhiều tab.

4.GridLayout hoặc LinearLayout:
Ưu điểm: Cung cấp khả năng tùy chỉnh cao trong việc sắp xếp các điều khiển và giao diện người dùng trong từng tab.
Trường hợp ứng dụng: Phù hợp với các ứng dụng cần giao diện người dùng tùy chỉnh, không giới hạn bởi các loại điều khiển sẵn có.

5.MapFragment hoặc SupportMapFragment:
Ưu điểm: Cho phép hiển thị bản đồ Google Maps trong ứng dụng một cách dễ dàng.
Trường hợp ứng dụng: Phù hợp với các ứng dụng yêu cầu hiển thị vị trí, địa điểm hoặc hướng dẫn đi lại.

6.ScrollView:
Ưu điểm: Cho phép hiển thị nhiều nội dung trong mỗi tab và cho phép người dùng cuộn qua nội dung nếu cần.
Trường hợp ứng dụng: Thích hợp cho các ứng dụng có nội dung phong phú, cần phải cuộn qua để xem toàn bộ.

7.ViewPager:
Ưu điểm: Cung cấp khả năng cuộn qua các tab một cách mượt mà và dễ dàng.
Trường hợp ứng dụng: Hữu ích khi cần hiển thị nhiều tab và cho phép người dùng dễ dàng chuyển đổi giữa chúng.

==>Việc lựa chọn cách kết hợp TabHost với các loại điều khiển khác nên dựa trên yêu cầu cụ thể của ứng dụng của bạn và mục tiêu tối ưu hóa trải nghiệm người dùng.

