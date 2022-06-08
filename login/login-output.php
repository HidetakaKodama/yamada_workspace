<?php session_start(); ?>
<?php
unset($_SESSION['users']);
$pdo = new PDO(
	// 'mysql:host=localhost;dbname=shop;charset=utf8',
	// 'staff',
	// 'password'
	'mysql:host=mysql1.php.xdomain.ne.jp;dbname=yamadashu2_main;charset=utf8',
	'yamadashu2_date',
	'dbdatebase'
);
$sql = $pdo->prepare('select * from users where email=? and password=?');
$sql->execute([$_REQUEST['email'], $_REQUEST['password']]);
foreach ($sql as $row) {
	$_SESSION['users'] = [
		'id' => $row['id'],
		'name' => $row['name'],
		'email' => $row['email'],
		'password' => $row['password'],
	];
}
if (isset($_SESSION['users'])) {
	// echo 'いらっしゃいませ、', $_SESSION['users']['name'], 'さん。';
	header('Location: http://yamadashu2.php.xdomain.jp/login/home-input.php');
} else {
	echo 'ログイン名またはパスワードが違います。';
}
?>

