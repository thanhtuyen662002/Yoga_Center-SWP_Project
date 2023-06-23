<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
    />
    <link
      href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
      rel="stylesheet"
    />

    <link
      href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"
    />
    <link rel="stylesheet" href="./../../css/editProfile.css" />
    <title>Header</title>
  </head>
  <body>
      <c:import url="Header_Admin.jsp"/>
      <!-- Content ? ?ây -->
      <div id="content">
        <div class="container bootstrap snippets bootdey">
          <h1 class="text-primary">Edit Profile</h1>
          <hr />
          <div class="row">
            <!-- left column -->
            <div class="col-md-3">
              <div class="text-center">
                <img
                  src="https://bootdey.com/img/Content/avatar/avatar7.png"
                  class="avatar img-circle img-thumbnail"
                  alt="avatar"
                />
                <h3 style="font-weight: 700;">ADMIN</h3>
              </div>
            </div>

            <!-- edit form column -->
            <div class="col-md-9 personal-info">
              <h2>Personal Information</h2>

              <form class="form-horizontal" role="form">
                <div class="form-group">
                  <h4>Information</h4>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label">Name :</label>
                    <div class="col-lg-9">
                      <input class="form-control" type="text" />
                    </div>
                  </div>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label"
                      >Phone :</label
                    >
                    <div class="col-lg-9">
                        <input class="form-control" type="tel" pattern="^0\d{9}$" title="Invalid phone number" required />
                    </div>
                  </div>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label">Address :</label>
                    <div class="col-lg-9">
                      <input class="form-control" type="text" value="" />
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <h4>Security Information</h4>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label"
                      >Old Password :
                    </label>
                    <div class="col-lg-9">
                      <input
                        id="password-input"
                        class="form-control"
                        type="password"
                        required
                        style="background-color: #e8f0fe"
                      />
                      <span
                        id="toggle-password"
                        class="password-toggle"
                        onclick="togglePasswordVisibility()"
                      >
                      </span>
                    </div>
                  </div>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label"
                      >New Password :
                    </label>
                    <div class="col-lg-9">
                      <input
                        id="new-password"
                        class="form-control"
                        type="password"
                        pattern="^(?=.*[!@#$%^&*])(?=.*[A-Z]).{8}$"
                        title="Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter"
                        required
                        style="background-color: #e8f0fe"
                      />
                      <span
                      id="toggle-password-new"
                      class="password-toggle"
                      onclick="togglePasswordNew()"
                    >
                    </div>
                  </div>
                  <div class="form-group-item">
                    <label class="col-lg-3 control-label"
                      >Confirm Password :
                    </label>
                    <div class="col-lg-9">
                      <input
                        id="confirm-password"
                        class="form-control"
                        type="password"
                        pattern="^(?=.*[!@#$%^&*])(?=.*[A-Z]).{8}$"
                        title="Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter"
                        required
                        style="background-color: #e8f0fe"
                        oninput="checkPasswordMatch()"
                      />
                      <div id="password-match-status"></div>
                        <span
                      id="toggle-password-again"
                      class="password-toggle"
                      onclick="togglePasswordAgain()"
                    >
                      
                    </div>
                  </div>
                </div>
              </form>
              <div class="form-btn"><button>Save</button></div>
            </div>
          </div>
        </div>
        <hr />
      </div>
  </div>
    <script src="./../../courseNav/bootstrap.min.js"></script>
    <script src="./../../courseNav/jquery.min.js"></script>
    <script src="./../../courseNav/main.js"></script>
    <script src="./../../courseNav/popper.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script>
      function checkPasswordMatch() {
        var newPassword = document.getElementById("new-password").value;
        var confirmPassword = document.getElementById("confirm-password").value;
        var passwordMatchStatus = document.getElementById(
          "password-match-status"
        );

        if (newPassword === confirmPassword) {
          passwordMatchStatus.innerHTML = "password correct";
          passwordMatchStatus.style.color = "green";
        } else {
          passwordMatchStatus.innerHTML = "password incorrect";
          passwordMatchStatus.style.color = "red";
        }
      }
      function togglePasswordVisibility() {
        var passwordInput = document.getElementById("password-input");
        var togglePassword = document.getElementById("toggle-password");

        if (passwordInput.type === "password") {
          passwordInput.type = "text";
          togglePassword.classList.add("show-password");
        } else {
          passwordInput.type = "password";
          togglePassword.classList.remove("show-password");
        }
      }
      function togglePasswordNew() {
        var passwordInput = document.getElementById("new-password");
        var togglePassword = document.getElementById("toggle-password-new");

        if (passwordInput.type === "password") {
          passwordInput.type = "text";
          togglePassword.classList.add("show-password");
        } else {
          passwordInput.type = "password";
          togglePassword.classList.remove("show-password");
        }
      }
      function togglePasswordAgain() {
        var passwordInput = document.getElementById("confirm-password");
        var togglePassword = document.getElementById("toggle-password-again");

        if (passwordInput.type === "password") {
          passwordInput.type = "text";
          togglePassword.classList.add("show-password");
        } else {
          passwordInput.type = "password";
          togglePassword.classList.remove("show-password");
        }
      }
    </script>
  </body>
</html>
