//tăng giảm button
$('input.input-qty').each(function() {
    var $this = $(this),
      qty = $this.parent().find('.is-form'),
      min = Number($this.attr('min')),
      max = Number($this.attr('max'))
    if (min == 0) {
      var d = 0
    } else d = min
    $(qty).on('click', function() {
      if ($(this).hasClass('minus')) {
        if (d > min) d += -1
      } else if ($(this).hasClass('plus')) {
        var x = Number($this.val()) + 1
        if (x <= max) d += 1
      }
      $this.attr('value', d).val(d)
    })
    
  })

//Xóa sản Phẩm
var remove_cart = document.getElementsByClassName("product__items-total-delete");
for (var i = 0; i < remove_cart.length; i++) {
  var button = remove_cart[i]
  button.addEventListener("click", function () {
    var button_remove = event.target
    console.log(button_remove);
    button_remove.parentElement.parentElement.remove()
  })
}

//Update giá sản Phẩm
function updatecart() {
    var cart_item = document.getElementsByClassName("product")[0];
    var cart_rows = cart_item.getElementsByClassName("product__items");
    var total = 0;
    for (var i = 0; i < cart_rows.length; i++) {
      var cart_row = cart_rows[i]
      var price_item = cart_row.getElementsByClassName("Gia1")[0] 
      var quantity_item = cart_row.getElementsByClassName("input-qty")[0]
      var price = parseFloat(price_item.innerText)// chuyển một chuổi string sang number để tính tổng tiền.
      var quantity = quantity_item.value // lấy giá trị trong thẻ input
      total = total + (price * quantity)
      console.log(total);
    }
    document.getElementsByClassName("product__items-total-price")[0].innerText = total 
    
    // Thay đổi text = total trong .cart-total-price. Chỉ có một .cart-total-price nên mình sử dụng [0].
}

$(window).on("load", function () {
    $("body").css("overflow", "auto");
    $(".loading").fadeOut(600);
});

$(document).ready(function () {
    $(".nav").addClass("nav--change-style");

    $(".product__items-button-plus").click(function () {
        console.log($(".product__items-button-input").val());
    });
});