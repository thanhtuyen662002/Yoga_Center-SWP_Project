Create Database [Yoga Center]
Use [Yoga Center]
CREATE TABLE [dbo].[Attendance](
	[attendanceID] [int] NOT NULL,
	[cusPhone] [char](10) NULL,
	[isPresent] [bit] NULL,
 CONSTRAINT [PK_Attendance] PRIMARY KEY CLUSTERED 
(
	[attendanceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryID] [int] NOT NULL,
	[type] [nchar](10) NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[categoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Class]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Class](
	[classID] [int] IDENTITY(1,1) NOT NULL,
	[courseID] [int] NULL,
	[ptPhone] [char](10) NULL,
	[name] [nvarchar](50) NULL,
	[description] [text] NULL,
	[total_sessions] [int] NULL,
	[capacity] [int] NULL,
 CONSTRAINT [PK_Class] PRIMARY KEY CLUSTERED 
(
	[classID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Classslot]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Classslot](
	[slotID] [int] NOT NULL,
	[start_time] [time](7) NULL,
	[end_time] [time](7) NULL,
 CONSTRAINT [PK_Classslot] PRIMARY KEY CLUSTERED 
(
	[slotID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Courses]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Courses](
	[courseID] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [nvarchar](max) NOT NULL,
	[image] [nvarchar](max) NOT NULL,
	[price] [decimal](18, 0) NULL,
 CONSTRAINT [PK_Courses] PRIMARY KEY CLUSTERED 
(
	[courseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[customerId] [nchar](5) NOT NULL,
	[customerName] [nvarchar](255) NOT NULL,
	[phone] [nchar](10) NOT NULL,
	[address] [text] NULL,
	[status] [bit] NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[customerId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Event]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Event](
	[eventID] [int] NOT NULL,
	[eventName] [nvarchar](max) NULL,
	[courseID] [int] NULL,
	[discount] [float] NULL,
	[daystart] [smalldatetime] NULL,
 CONSTRAINT [PK_Event] PRIMARY KEY CLUSTERED 
(
	[eventID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Feedback]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feedback](
	[feedbackID] [int] IDENTITY(1,1) NOT NULL,
	[comment] [nvarchar](max) NULL,
	[courseID] [int] NULL,
	[cusPhone] [char](10) NULL,
 CONSTRAINT [PK_Feedback] PRIMARY KEY CLUSTERED 
(
	[feedbackID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[News]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[News](
	[newsID] [int] NOT NULL,
	[stPhone] [char](10) NOT NULL,
	[title] [nvarchar](100) NULL,
	[postDate] [datetime] NULL,
	[image] [nvarchar](max) NULL,
	[content] [nvarchar](max) NULL,
	[categoryID] [int] NULL,
 CONSTRAINT [PK_News] PRIMARY KEY CLUSTERED 
(
	[newsID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Paycourses]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Paycourses](
	[paycourseID] [int] IDENTITY(1,1) NOT NULL,
	[status] [bit] NOT NULL,
	[date] [datetime] NOT NULL,
 CONSTRAINT [PK_Paycourses] PRIMARY KEY CLUSTERED 
(
	[paycourseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Paycoursesdetail]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Paycoursesdetail](
	[paycrsdetail] [int] NOT NULL,
	[paycourseID] [int] NULL,
	[courseID] [int] NULL,
	[price] [float] NULL,
 CONSTRAINT [PK_Paycoursesdetail] PRIMARY KEY CLUSTERED 
(
	[paycrsdetail] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[roomID] [varchar](5) NOT NULL,
	[locate] [nvarchar](50) NOT NULL,
	[roomNumber] [nchar](5) NOT NULL,
	[status] [bit] NOT NULL,
	[description] [text] NULL,
 CONSTRAINT [PK_Room] PRIMARY KEY CLUSTERED 
(
	[roomID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Schedule]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Schedule](
	[scheduleID] [int] IDENTITY(1,1) NOT NULL,
	[classID] [int] NOT NULL,
	[ptPhone] [char](10) NOT NULL,
	[slotID] [int] NOT NULL,
	[roomID] [varchar](5) NOT NULL,
	[day] [date] NOT NULL,
	[customerID] [nchar](5) NOT NULL,
 CONSTRAINT [PK_Schedule] PRIMARY KEY CLUSTERED 
(
	[scheduleID] ASC,
	[classID] ASC,
	[ptPhone] ASC,
	[slotID] ASC,
	[roomID] ASC,
	[day] ASC,
	[customerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 6/1/2023 1:06:32 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[phone] [char](10) NOT NULL,
	[password] [nchar](20) NOT NULL,
	[userlogin] [nchar](20) NULL,
	[name] [nvarchar](50) NULL,
	[address] [nvarchar](100) NULL,
	[gender] [nchar](10) NULL,
	[role] [char](2) NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[phone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Class] ON 

INSERT [dbo].[Class] ([classID], [courseID], [ptPhone], [name], [description], [total_sessions], [capacity]) VALUES (2, 2, N'0987654444', N'YogaTest', NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[Class] OFF
GO
INSERT [dbo].[Classslot] ([slotID], [start_time], [end_time]) VALUES (1, CAST(N'07:30:00' AS Time), CAST(N'09:00:00' AS Time))
INSERT [dbo].[Classslot] ([slotID], [start_time], [end_time]) VALUES (2, CAST(N'09:10:00' AS Time), CAST(N'10:40:00' AS Time))
INSERT [dbo].[Classslot] ([slotID], [start_time], [end_time]) VALUES (3, CAST(N'10:40:00' AS Time), CAST(N'12:20:00' AS Time))
INSERT [dbo].[Classslot] ([slotID], [start_time], [end_time]) VALUES (4, NULL, NULL)
INSERT [dbo].[Classslot] ([slotID], [start_time], [end_time]) VALUES (5, NULL, NULL)
GO
SET IDENTITY_INSERT [dbo].[Courses] ON 

INSERT [dbo].[Courses] ([courseID], [name], [description], [image], [price]) VALUES (2, N'TEST01', N'test 1', N'none', NULL)
SET IDENTITY_INSERT [dbo].[Courses] OFF
GO
INSERT [dbo].[Customer] ([customerId], [customerName], [phone], [address], [status]) VALUES (N'C0001', N'Doan Thao Linh', N'0987654321', NULL, 1)
GO
INSERT [dbo].[Room] ([roomID], [locate], [roomNumber], [status], [description]) VALUES (N'BE123', N'Beta', N'123  ', 1, NULL)
GO
SET IDENTITY_INSERT [dbo].[Schedule] ON 

INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (1, 2, N'0987654444', 4, N'BE123', CAST(N'2023-05-29' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (2, 2, N'0987654444', 1, N'BE123', CAST(N'2023-06-02' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (3, 2, N'0987654444', 1, N'BE123', CAST(N'2023-06-03' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (6, 2, N'0987654444', 4, N'BE123', CAST(N'2023-06-02' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (7, 2, N'0987654444', 5, N'BE123', CAST(N'2023-05-30' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (8, 2, N'0987654444', 5, N'BE123', CAST(N'2023-03-03' AS Date), N'C0001')
INSERT [dbo].[Schedule] ([scheduleID], [classID], [ptPhone], [slotID], [roomID], [day], [customerID]) VALUES (9, 2, N'0987654444', 3, N'BE123', CAST(N'2023-06-01' AS Date), N'C0001')
SET IDENTITY_INSERT [dbo].[Schedule] OFF
GO
INSERT [dbo].[User] ([phone], [password], [userlogin], [name], [address], [gender], [role], [status]) VALUES (N'0987654444', N'123                 ', NULL, N'Tran Duc Long', NULL, NULL, NULL, NULL)
GO
ALTER TABLE [dbo].[Attendance]  WITH CHECK ADD  CONSTRAINT [FK_Attendance_User] FOREIGN KEY([cusPhone])
REFERENCES [dbo].[User] ([phone])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Attendance] CHECK CONSTRAINT [FK_Attendance_User]
GO
ALTER TABLE [dbo].[Class]  WITH CHECK ADD  CONSTRAINT [FK_Class_Courses1] FOREIGN KEY([courseID])
REFERENCES [dbo].[Courses] ([courseID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Class] CHECK CONSTRAINT [FK_Class_Courses1]
GO
ALTER TABLE [dbo].[Class]  WITH CHECK ADD  CONSTRAINT [FK_Class_User1] FOREIGN KEY([ptPhone])
REFERENCES [dbo].[User] ([phone])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Class] CHECK CONSTRAINT [FK_Class_User1]
GO
ALTER TABLE [dbo].[Event]  WITH CHECK ADD  CONSTRAINT [FK_Event_Courses] FOREIGN KEY([courseID])
REFERENCES [dbo].[Courses] ([courseID])
GO
ALTER TABLE [dbo].[Event] CHECK CONSTRAINT [FK_Event_Courses]
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD  CONSTRAINT [FK_Feedback_User] FOREIGN KEY([cusPhone])
REFERENCES [dbo].[User] ([phone])
GO
ALTER TABLE [dbo].[Feedback] CHECK CONSTRAINT [FK_Feedback_User]
GO
ALTER TABLE [dbo].[News]  WITH CHECK ADD  CONSTRAINT [FK_News_Category] FOREIGN KEY([categoryID])
REFERENCES [dbo].[Category] ([categoryID])
GO
ALTER TABLE [dbo].[News] CHECK CONSTRAINT [FK_News_Category]
GO
ALTER TABLE [dbo].[News]  WITH CHECK ADD  CONSTRAINT [FK_News_User] FOREIGN KEY([stPhone])
REFERENCES [dbo].[User] ([phone])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[News] CHECK CONSTRAINT [FK_News_User]
GO
ALTER TABLE [dbo].[Paycoursesdetail]  WITH CHECK ADD  CONSTRAINT [FK_Paycoursesdetail_Courses] FOREIGN KEY([courseID])
REFERENCES [dbo].[Courses] ([courseID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Paycoursesdetail] CHECK CONSTRAINT [FK_Paycoursesdetail_Courses]
GO
ALTER TABLE [dbo].[Paycoursesdetail]  WITH CHECK ADD  CONSTRAINT [FK_Paycoursesdetail_Paycourses] FOREIGN KEY([paycourseID])
REFERENCES [dbo].[Paycourses] ([paycourseID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Paycoursesdetail] CHECK CONSTRAINT [FK_Paycoursesdetail_Paycourses]
GO
ALTER TABLE [dbo].[Schedule]  WITH CHECK ADD  CONSTRAINT [FK_Schedule_Class] FOREIGN KEY([classID])
REFERENCES [dbo].[Class] ([classID])
GO
ALTER TABLE [dbo].[Schedule] CHECK CONSTRAINT [FK_Schedule_Class]
GO
ALTER TABLE [dbo].[Schedule]  WITH CHECK ADD  CONSTRAINT [FK_Schedule_Classslot] FOREIGN KEY([slotID])
REFERENCES [dbo].[Classslot] ([slotID])
GO
ALTER TABLE [dbo].[Schedule] CHECK CONSTRAINT [FK_Schedule_Classslot]
GO
ALTER TABLE [dbo].[Schedule]  WITH CHECK ADD  CONSTRAINT [FK_Schedule_Customer] FOREIGN KEY([customerID])
REFERENCES [dbo].[Customer] ([customerId])
GO
ALTER TABLE [dbo].[Schedule] CHECK CONSTRAINT [FK_Schedule_Customer]
GO
ALTER TABLE [dbo].[Schedule]  WITH CHECK ADD  CONSTRAINT [FK_Schedule_Room] FOREIGN KEY([roomID])
REFERENCES [dbo].[Room] ([roomID])
GO
ALTER TABLE [dbo].[Schedule] CHECK CONSTRAINT [FK_Schedule_Room]
GO
ALTER TABLE [dbo].[Schedule]  WITH CHECK ADD  CONSTRAINT [FK_Schedule_User] FOREIGN KEY([ptPhone])
REFERENCES [dbo].[User] ([phone])
GO
ALTER TABLE [dbo].[Schedule] CHECK CONSTRAINT [FK_Schedule_User]
GO
USE [master]
GO
ALTER DATABASE [Yoga Center] SET  READ_WRITE 
GO
