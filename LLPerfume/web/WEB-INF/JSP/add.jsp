<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Add A Perfume</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="/add" method="post" id="sub">
                    <div class="form-group">
                        <label for="addid">PerfumeID</label>
                        <input type="number" class="form-control" name="id" id="addid" placeholder="PerfumeID">
                        <label for="addname">PerfumeName</label>
                        <input type="text" class="form-control" name="name" id="addname" placeholder="PerfumeName">
                        <label for="addbrand">Brand</label>
                        <input type="text" class="form-control" name="brand" id="addbrand" placeholder="Brand">
                        <label for="addfragrance">fragrance</label>
                        <input type="text" class="form-control" name="fragrance" id="addfragrance" placeholder="fragrance">
                        <label for="addodor">odor</label>
                        <input type="text" class="form-control" name="odor" id="addodor" placeholder="odor">
                        <label for="addperfumer">perfumer</label>
                        <input type="text" class="form-control" name="perfumer" id="addperfumer" placeholder="perfumer">
                        <label for="addprice">price</label>
                        <input type="number" class="form-control" name="price" id="addprice" placeholder="price">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Close"/>
                <button type="button" class="btn btn-primary" id="btn" onclick="add()">Add</button>
            </div>
        </div>
    </div>
</div>
<script>
    function add() {
        $("#sub").submit();
    }
</script>