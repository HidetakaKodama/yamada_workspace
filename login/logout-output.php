<?php session_start(); ?>
<?php
if (isset($_SESSION['users'])) {
	unset($_SESSION['users']);
	//echo 'ログアウトしました。';
	header('Location: http://yamadashu2.php.xdomain.jp/login/login-input.php');
} else {
	//echo 'すでにログアウトしています。';
	header('Location: http://yamadashu2.php.xdomain.jp/login/login-input.php');
}
?>

