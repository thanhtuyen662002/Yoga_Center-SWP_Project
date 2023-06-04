function showTable() {
    var table = document.getElementById("contentTable");
    table.style.display = "table";
    var alert = document.getElementById("alert");
    alert.style.display = "none"
  }
  function closeTable() {
    var closeTable = document.getElementById("contentTable");
    closeTable.style.display = "none";
    var alert = document.getElementById("alert");
    alert.style.display = "block"
  }