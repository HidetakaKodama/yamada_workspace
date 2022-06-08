<?php session_start(); ?>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>サインアップ</title>
</head>
<?php
$name = $email = $password == '';
if (isset($_SESSION['user'])) {
    $name = $_SESSION['user']['name'];
    $email = $_SESSION['user']['email'];
    $password = $_SESSION['user']['password'];
}

?>

<?php
echo '<div>';
echo '<form action="signup-output.php" method="post">';
echo '<table>';
echo '<tr><td align="center">お名前</td></tr><tr><td>';
echo '<input type="text" name="name" value="', $name, '">';
echo '</td></tr>';
echo '<tr><td align="center">Eメール</td></tr><tr><td>';
echo '<input type="text" name="email" value="', $email, '">';
echo '</td></tr>';
echo '<tr><td align="center">パスワード</td></tr><tr><td>';
echo '<input type="text" name="password" value="', $password, '">';
echo '</td></tr>';
echo '</table>';
echo '<input type="submit" value="確定">';
echo '</form>';
echo '</div>';
?>

<!-- <form action="signup-output.php" method="post">
    <table>
        <tr>
            <td>お名前</td>
            <td><input type="text" name="name" value="$name"></td>
        </tr>
        <tr>
            <td>Eメール</td>
            <td><input type="text" name="email" value="$email"></td>
        </tr>
        <tr>
            <td>パスワード</td>
            <td><input type="text" name="password" value="$password"></td>
        </tr>
    </table>
</form> -->


</body>

</html>