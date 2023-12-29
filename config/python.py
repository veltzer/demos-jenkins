config_requires = []
dev_requires = []
install_requires = []
make_requires = [
    "pymakehelper",
    "pydmt",
    "pylint",
    "pytest",
    "pytest-cov",
    "flake8",
    "pyflakes",
    "mypy",
    "types-chardet",
    "types-PyYAML",
]
test_requires = []
requires = config_requires + install_requires + make_requires + test_requires
