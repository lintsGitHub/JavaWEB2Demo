<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="del" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="/update" method="post" id="sub2">
                    <div class="form-group">
                        <label for="id">PerfumeID</label>
                        <input type="number" class="form-control" name="id" id="id" placeholder="PerfumeID" >
                        <label for="name">PerfumeName</label>
                        <input type="text" class="form-control" name="name" id="name" placeholder="PerfumeName">
                        <label for="brand">Brand</label>
                        <input type="text" class="form-control" name="brand" id="brand" placeholder="Brand">
                        <label for="fragrance">fragrance</label>
                        <input type="text" class="form-control" name="fragrance" id="fragrance" placeholder="fragrance">
                        <label for="odor">odor</label>
                        <input type="text" class="form-control" name="odor" id="odor" placeholder="odor">
                        <label for="perfumer">perfumer</label>
                        <input type="text" class="form-control" name="perfumer" id="perfumer" placeholder="perfumer">
                        <label for="price">price</label>
                        <input type="number" class="form-control" name="price" id="price" placeholder="price">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="x()">Save changes</button>
            </div>
        </div>
    </div>
</div>
<script>
    function updates(id, name, a, b, c, d, e) {
        $("#id").val(id);
        $("#name").val(name);
        // language=JQuery-CSS
        $("#brand").val(a);
        $("#fragrance").val(b);
        $("#odor").val(c);
        $("#perfumer").val(d);
        $("#price").val(e);
    }

    function x() {
        $("#sub2").submit();
    }
</script>