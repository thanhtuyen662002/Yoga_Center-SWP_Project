<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="snackbar"></div>
<c:if test="${msg != null}">
    <script>
        var x = document.getElementById("snackbar");
        x.className = "show";
        x.textContent = '${msg}';
        setTimeout(function () {
            x.className = x.className.replace("show", "");
        }, 3000);
    </script>
</c:if>
<style>
    .a-page {
        background-color: #00FFFF;
        color: white;
        padding: 5px 10px;
        text-decoration: none;
        border-radius: 5px;
        margin: 2px;
    }
    #snackbar {
        visibility: hidden;
        min-width: 250px;
        margin-left: -125px;
        background-color: #333;
        color: #fff;
        text-align: center;
        border-radius: 2px;
        padding: 16px;
        position: fixed;
        z-index: 1;
        left: 50%;
        top: 30px; /* Change bottom to top and adjust the distance from the top */
    }

    #snackbar.show {
        visibility: visible;
        -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
        animation: fadein 0.5s, fadeout 0.5s 2.5s;
    }

    @-webkit-keyframes fadein {
        from {
            top: 0;
            opacity: 0;
        }
        to {
            top: 30px;
            opacity: 1;
        } /* Change bottom to top and adjust the distance from the top */
    }

    @keyframes fadein {
        from {
            top: 0;
            opacity: 0;
        }
        to {
            top: 30px;
            opacity: 1;
        } /* Change bottom to top and adjust the distance from the top */
    }

    @-webkit-keyframes fadeout {
        from {
            top: 30px;
            opacity: 1;
        }
        to {
            top: 0;
            opacity: 0;
        } /* Change bottom to top and adjust the distance from the top */
    }

    @keyframes fadeout {
        from {
            top: 30px;
            opacity: 1;
        }
        to {
            top: 0;
            opacity: 0;
        } /* Change bottom to top and adjust the distance from the top */
    }
</style>