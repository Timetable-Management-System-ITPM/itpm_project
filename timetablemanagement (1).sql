-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2021 at 08:16 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timetablemanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `consecutive_session`
--

CREATE TABLE `consecutive_session` (
  `con_sessionid` int(255) NOT NULL,
  `session_id` int(255) NOT NULL,
  `lecture1` varchar(1000) NOT NULL,
  `lecture2` varchar(1000) NOT NULL,
  `subcode` varchar(100) NOT NULL,
  `subname` varchar(100) NOT NULL,
  `groupid` varchar(100) NOT NULL,
  `tagname` varchar(100) NOT NULL,
  `no_of_student` int(100) NOT NULL,
  `duration` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `consecutive_session`
--

INSERT INTO `consecutive_session` (`con_sessionid`, `session_id`, `lecture1`, `lecture2`, `subcode`, `subname`, `groupid`, `tagname`, `no_of_student`, `duration`) VALUES
(1, 1, 'Mr. Manuja Prabath', 'Mr. Kamal Perera', 'IT1010', 'IP', 'Y1S1.IT.8', 'Lecture', 60, '2hr'),
(3, 4, 'Ms.Sashika', 'Mr.Gihan Sameera', 'IT1010', 'IP', 'Y1S1.IT.3', 'Lab', 20, '1.30hr');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `id` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `faculty` varchar(100) NOT NULL,
  `center` varchar(100) NOT NULL,
  `building` varchar(1000) NOT NULL,
  `level` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`id`, `name`, `faculty`, `center`, `building`, `level`) VALUES
(1, 'Ms.Niluka premadasa', 'Computing', 'Malabe', 'A', 3),
(2, 'Ms.Sashika', 'Computing', 'Malabe', 'B', 6),
(3, 'Ms. Mihitha De Silva', 'Computing', 'Malabe', 'C', 2),
(4, 'Mr. Dilshan Silva', 'Computing', 'Kandy', 'E', 2),
(5, 'Ms.Dinuka Wijendra', 'Computing', 'Malabe', 'A', 3),
(6, 'Ms. Chamari Silva', 'Computing', 'Malabe', 'B', 6),
(7, 'Ms. Kushnara Suriyawansa', 'Computing', 'Malabe', 'C', 1),
(8, 'Ms. Anuththara Kuruppu', 'Computing', 'Malabe', 'E', 4),
(9, 'Ms. Janani Tharmaseelan', 'Computing', 'Malabe', 'A', 2),
(10, 'Ms. Lokesha Weerasinghe', 'Computing', 'Malabe', 'B', 5),
(11, 'Ms. Pradeepa Bandara', 'Computing', 'Malabe', 'C', 4),
(12, 'Mr. Nalaka R. Dissanayake', 'Computing', 'Malabe', 'E', 6);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `building_name` varchar(255) NOT NULL,
  `capacity` int(11) NOT NULL,
  `room_name` varchar(255) NOT NULL,
  `room_type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`building_name`, `capacity`, `room_name`, `room_type`) VALUES
('A', 150, 'A207', 'Lecture Hall'),
('A', 150, 'A404', 'Lecture Hall'),
('A', 87, 'A78', 'Lab'),
('A', 50, 'A900', 'Lab'),
('B', 40, 'B305', 'Lecture Hall'),
('B', 150, 'B405', 'Lecture Hall'),
('B', 150, 'B407', 'Lecture Hall'),
('E', 30, 'E303', 'Lab'),
('F', 150, 'F101', 'Lecture Hall');

-- --------------------------------------------------------

--
-- Table structure for table `nonavailable_session`
--

CREATE TABLE `nonavailable_session` (
  `nonavailable_id` int(255) NOT NULL,
  `session_id` int(255) NOT NULL,
  `lecture1` varchar(1000) NOT NULL,
  `lecture2` varchar(1000) NOT NULL,
  `subcode` varchar(100) NOT NULL,
  `subname` varchar(100) NOT NULL,
  `groupid` varchar(100) NOT NULL,
  `tagname` varchar(100) NOT NULL,
  `no_of_student` int(100) NOT NULL,
  `duration` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nonavailable_session`
--

INSERT INTO `nonavailable_session` (`nonavailable_id`, `session_id`, `lecture1`, `lecture2`, `subcode`, `subname`, `groupid`, `tagname`, `no_of_student`, `duration`) VALUES
(1, 2, 'Ms.Niluka premadasa', 'Mr.Gihan Sameera', 'IT1050', 'ESD', 'Y3S2.IT.4', 'Tute', 40, '1hr'),
(2, 3, 'Ms.Niluka premadasa', '', 'IT1050', 'ESD', 'Y3S2.IT.4', 'Lecture', 60, '2hr'),
(3, 16, '', 'Ms. Jenny Krishara', 'IT4060', 'ML', 'Y4S1.IT.7', 'Lab', 20, '1.30hr'),
(4, 9, 'Mr. Dilshan Silva', 'Mr. Nalaka R. Dissanayake', 'IT4090', 'CC', 'Y4S1.IT.7', 'Lecture', 120, '3hr');

-- --------------------------------------------------------

--
-- Table structure for table `parallel_session`
--

CREATE TABLE `parallel_session` (
  `para_sessionid` int(255) NOT NULL,
  `session_id` int(255) NOT NULL,
  `lecture1` varchar(1000) NOT NULL,
  `lecture2` varchar(1000) NOT NULL,
  `subcode` varchar(100) NOT NULL,
  `subname` varchar(100) NOT NULL,
  `groupid` varchar(100) NOT NULL,
  `tagname` varchar(100) NOT NULL,
  `no_of_student` int(100) NOT NULL,
  `duration` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parallel_session`
--

INSERT INTO `parallel_session` (`para_sessionid`, `session_id`, `lecture1`, `lecture2`, `subcode`, `subname`, `groupid`, `tagname`, `no_of_student`, `duration`) VALUES
(1, 1, 'Mr. Manuja Prabath', 'Mr. Kamal Perera', 'IT1010', 'IP', 'Y1S1.IT.8', 'Lecture', 60, '2hr'),
(2, 3, 'Ms.Niluka premadasa', '', 'IT1050', 'ESD', 'Y3S2.IT.4', 'Lecture', 60, '2hr'),
(3, 7, 'Ms. Mihitha De Silva', 'Mr.Dilanka Nayanajith', 'IT4030', 'IOT', 'Y4S1.IT.7', 'Lecture', 120, '3hr'),
(4, 9, 'Mr. Dilshan Silva', 'Mr. Nalaka R. Dissanayake', 'IT4090', 'CC', 'Y4S1.IT.7', 'Lecture', 120, '3hr'),
(5, 20, 'Mr. Dilshan Silva', 'Ms. Mihitha De Silva', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Tutorial', 98, '2hrs'),
(6, 21, 'Ms.Dinuka Wijendra', 'Ms. Anuththara Kuruppu', 'IT2030', 'IP', 'Y1S2.CSNE.8', 'Lecture', 120, '3hrs');

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE `session` (
  `session_id` int(255) NOT NULL,
  `lecture1` varchar(1000) NOT NULL,
  `lecture2` varchar(1000) NOT NULL,
  `subcode` varchar(100) NOT NULL,
  `subname` varchar(100) NOT NULL,
  `groupid` varchar(100) NOT NULL,
  `tagname` varchar(100) NOT NULL,
  `no_of_student` int(100) NOT NULL,
  `duration` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`session_id`, `lecture1`, `lecture2`, `subcode`, `subname`, `groupid`, `tagname`, `no_of_student`, `duration`) VALUES
(1, 'Ms.Niluka premadasa', 'Ms.Niluka premadasa', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Lecture', 60, '2hr'),
(2, 'Ms.Niluka premadasa', 'Mr.Gihan Sameera', 'IT1050', 'ESD', 'Y3S2.IT.4', 'Tute', 40, '1hr'),
(3, 'Mr. Nalaka R. Dissanayake', '', 'IT1050', 'ESD', 'Y3S2.IT.4', 'Lecture', 60, '2hr'),
(4, 'Ms.Sashika', 'Mr.Gihan Sameera', 'IT1010', 'IP', 'Y1S1.IT.3', 'Lab', 20, '1.30hr'),
(5, 'Ms.Niluka premadasa', 'Mr.Kamal Perera', 'IT3010', 'NDM', 'Y3S1.IT.10', 'Lecture', 120, '3hr'),
(6, 'Ms. Shashika Lokuliyana', '', 'IT3010', 'NDM', 'Y3S1.IT.10', 'Tute', 60, '1hr'),
(7, 'Ms. Mihitha De Silva', 'Mr.Dilanka Nayanajith', 'IT4030', 'IOT', 'Y4S1.IT.7', 'Lecture', 120, '3hr'),
(8, 'Ms. Manori Gamage', 'Mr. Dhammika Silva', 'IT4060', 'ML', 'Y4S1.IT.7', 'Lecture', 120, '3hr'),
(9, 'Mr. Dilshan Silva', 'Mr. Nalaka R. Dissanayake', 'IT4090', 'CC', 'Y4S1.IT.7', 'Lecture', 120, '3hr'),
(10, 'Ms.Dinuka Wijendra', '', 'IT2030', 'OOP', 'Y2S1.IT.8', 'Tute', 60, '1hr'),
(11, '', 'Ms. Pradeepa Bandara', 'IT2030', 'OOP', 'Y2S1.IT.8', 'Lab', 20, '1.30hr'),
(12, 'Ms. Chamari Silva', 'Ms. Lokesha Weerasinghe', 'SE4050', 'PC', 'Y4S1.SE.6', 'Lecture', 120, '3hr'),
(13, 'Ms. Disni Sriyaratna', '', 'IE4060', 'RIS', 'Y4S1.IE.6', 'Lecture', 120, '3hr'),
(14, '', 'Ms. Janani Tharmaseelan', 'IT2010', 'MAD', 'Y2S2.IT', 'Tute', 60, '1hr'),
(15, 'Ms. Kushnara Suriyawansa', 'Ms. Anuththara Kuruppu', 'IT1090', 'ISDM', 'Y1S2.IT.5', 'Lab', 20, '1.30hr'),
(16, '', 'Ms. Jenny Krishara', 'IT4060', 'ML', 'Y4S1.IT.7', 'Lab', 20, '1.30hr'),
(17, 'Mr. Dilshan Silva', 'Ms.Dinuka Wijendra', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Tutorial', 80, '3'),
(18, 'Ms. Chamari Silva', 'Ms. Kushnara Suriyawansa', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Lecture', 50, '2'),
(19, 'Ms.Niluka premadasa', 'Ms.Niluka premadasa', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Lecture', 90, '5'),
(20, 'Mr. Dilshan Silva', 'Ms. Mihitha De Silva', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Tutorial', 98, '2hrs'),
(21, 'Ms.Dinuka Wijendra', 'Ms. Anuththara Kuruppu', 'IT2030', 'IP', 'Y1S2.CSNE.8', 'Lecture', 120, '3hrs'),
(22, 'Ms. Kushnara Suriyawansa', 'Ms. Mihitha De Silva', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Tutorial', 25, '1hr'),
(23, 'Ms. Chamari Silva', 'Ms.Sashika', 'IT4090', 'OOP', 'Y3S1.IM.3', 'Lab', 30, '1hr'),
(24, 'Mr. Dilshan Silva', 'Ms.Sashika', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Lab', 25, '2hrs'),
(25, 'Ms.Niluka premadasa', 'Ms. Chamari Silva', 'IT1010', 'IP', 'Y1S2.CSNE.8', 'Lecture', 120, '3hrs');

-- --------------------------------------------------------

--
-- Table structure for table `session_allocation`
--

CREATE TABLE `session_allocation` (
  `id` int(11) NOT NULL,
  `session_1` varchar(255) NOT NULL,
  `session_2` varchar(255) NOT NULL,
  `allocated_room` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session_allocation`
--

INSERT INTO `session_allocation` (`id`, `session_1`, `session_2`, `allocated_room`) VALUES
(2, 'S5017', 'S7301', 'A207'),
(3, 'S9770', 'None', 'B305'),
(4, 'S4040', 'S5017', 'A900'),
(5, 'S5017', 'None', 'E303'),
(6, 'S9770', 'B306', 'B306'),
(7, 'S9019', 'None', 'B305'),
(8, 'S4040', 'None', 'A404'),
(9, 'B305', 'B305', 'B305'),
(10, '2', '2', 'B407'),
(11, '2', '4', 'E303'),
(12, '1', '4', 'E303'),
(13, '3', 'None', 'B405'),
(14, '4', 'None', 'E202'),
(15, '1', '4', 'E304'),
(16, '4', '4', 'A101'),
(17, 'B407', 'B407', 'B407'),
(18, 'A101', 'A101', 'A101');

-- --------------------------------------------------------

--
-- Table structure for table `student_group`
--

CREATE TABLE `student_group` (
  `sg_id` int(100) NOT NULL,
  `yearseme` varchar(1000) NOT NULL,
  `programme` varchar(1000) NOT NULL,
  `groupno` varchar(100) NOT NULL,
  `groupid` varchar(1000) NOT NULL,
  `subgrpno` varchar(100) NOT NULL,
  `subgrpid` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_group`
--

INSERT INTO `student_group` (`sg_id`, `yearseme`, `programme`, `groupno`, `groupid`, `subgrpno`, `subgrpid`) VALUES
(27, 'Y1S2', 'CSNE', '8', 'Y1S2.CSNE.8', '4', 'Y1S2.CSNE.8.4'),
(29, 'Y3S2', 'ISE', '6', 'Y3S2.ISE.6', '4', 'Y3S2.ISE.6.4'),
(30, 'Y3S2', 'IT', '8', 'Y3S2.IT.8', '5', 'Y3S2.IT.8.5'),
(31, 'Y2S2', 'CSNE', '1', 'Y2S2.CSNE.1', '1', 'Y2S2.CSNE.1.1'),
(32, 'Y3S1', 'IM', '3', 'Y3S1.IM.3', '2', 'Y3S1.IM.3.2'),
(33, 'Y2S1', 'IM', '6', 'Y2S1.IM.6', '3', 'Y2S1.IM.6.3'),
(35, 'Y4S2', 'ISE', '6', 'Y4S2.ISE.6', '5', 'Y4S2.ISE.6.5'),
(37, 'Y1S1', 'IT', '5', 'Y1S1.IT.5', '2', 'Y1S1.IT.5.2'),
(38, 'Y2S1', 'ISE', '6', 'Y2S1.ISE.6', '4', 'Y2S1.ISE.6.4'),
(39, 'Y2S1', 'IM', '5', 'Y2S1.IM.5', '4', 'Y2S1.IM.5.4'),
(41, 'Y3S1', 'CSNE', '2', 'Y3S1.CSNE.2', '4', 'Y3S1.CSNE.2.4'),
(42, 'Y3S2', 'DS', '3', 'Y3S2.DS.3', '7', 'Y3S2.DS.3.7'),
(43, 'Y4S2', 'DS', '3', 'Y4S2.DS.3', '3', 'Y4S2.DS.3.3'),
(44, 'Y4S1', 'CSNE', '7', 'Y4S1.CSNE.7', '3', 'Y4S1.CSNE.7.3'),
(45, 'Y2S2', 'CSNE', '4', 'Y2S2.CSNE.4', '6', 'Y2S2.CSNE.4.6'),
(48, 'Y3S2', 'ISE', '5', 'Y3S2.ISE.5', '4', 'Y3S2.ISE.5.4'),
(49, 'Y3S2', 'DS', '5', 'Y3S2.DS.5', '8', 'Y3S2.DS.5.8'),
(50, 'Y3S1', 'DS', '3', 'Y3S1.DS.3', '3', 'Y3S1.DS.3.3'),
(51, 'Y2S2', 'ISE', '6', 'Y2S2.ISE.6', '4', 'Y2S2.ISE.6.4'),
(52, 'Y4S2', 'SE', '4', 'Y4S2.SE.4', '3', 'Y4S2.SE.4.3'),
(53, 'Y2S2', 'CSNE', '2', 'Y2S2.CSNE.2', '2', 'Y2S2.CSNE.2.2');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `id` int(250) NOT NULL,
  `name` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL,
  `year` int(255) NOT NULL,
  `semester` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`id`, `name`, `code`, `year`, `semester`) VALUES
(1, 'IP', 'IT1010', 1, 2),
(2, 'NDM', 'IT3010', 3, 1),
(3, 'IOT', 'IT4030', 4, 1),
(4, 'ML', 'IT4090', 4, 1),
(5, 'CC', 'IT1050', 2, 2),
(6, 'OOP', 'IT2030', 1, 1),
(7, 'PC', 'SE4050', 4, 1),
(8, 'RIS', 'IE4060', 4, 2),
(9, 'ISDM', 'IT1090', 1, 2),
(10, 'MAD', 'IT2010', 2, 2),
(11, 'ITP', 'IT3040', 2, 2),
(12, 'DS', 'IT3020', 3, 1),
(13, 'CN', 'IT1050', 2, 2),
(14, 'DSA', 'IT1050', 2, 2),
(15, 'PAF', 'IT3030', 3, 1),
(16, 'OOC', 'IT1070', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `subject_tags`
--

CREATE TABLE `subject_tags` (
  `tid` int(100) NOT NULL,
  `tagname` varchar(1000) NOT NULL,
  `tagcode` varchar(1000) NOT NULL,
  `relatedtag` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject_tags`
--

INSERT INTO `subject_tags` (`tid`, `tagname`, `tagcode`, `relatedtag`) VALUES
(1, 'Lecture', 'T001', 'Lecture'),
(2, 'Tute', 'T008', 'Tutorial'),
(3, 'Practical', 'T006', 'Lab'),
(4, 'Tute', 'T006', 'Tutorial'),
(9, 'Lecture', 'T007', 'Tutorial'),
(12, 'Tute', 'T008', 'Tutorial'),
(14, 'Lecture', 'T005', 'Lecture'),
(15, 'tute', '78', 'Tutorial'),
(16, 'Lecture', 'L007', 'Lecture'),
(17, 'Practical', 'T013', 'Lab'),
(18, 'Practical', 'T023', 'Lab');

-- --------------------------------------------------------

--
-- Table structure for table `time slots`
--

CREATE TABLE `time slots` (
  `ID` int(255) NOT NULL,
  `type` varchar(1000) NOT NULL,
  `time` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `workinghours`
--

CREATE TABLE `workinghours` (
  `ID` int(255) NOT NULL,
  `days` varchar(100) NOT NULL,
  `hours` varchar(100) NOT NULL,
  `mins` varchar(100) NOT NULL,
  `mon` varchar(100) NOT NULL,
  `tue` varchar(100) NOT NULL,
  `wed` varchar(100) NOT NULL,
  `thu` varchar(100) NOT NULL,
  `fri` varchar(100) NOT NULL,
  `sat` varchar(100) NOT NULL,
  `sun` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workinghours`
--

INSERT INTO `workinghours` (`ID`, `days`, `hours`, `mins`, `mon`, `tue`, `wed`, `thu`, `fri`, `sat`, `sun`) VALUES
(1, '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
(2, '4', '3', '2', '0', '1', '0', '1', '0', '0', '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `consecutive_session`
--
ALTER TABLE `consecutive_session`
  ADD PRIMARY KEY (`con_sessionid`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`room_name`);

--
-- Indexes for table `nonavailable_session`
--
ALTER TABLE `nonavailable_session`
  ADD PRIMARY KEY (`nonavailable_id`);

--
-- Indexes for table `parallel_session`
--
ALTER TABLE `parallel_session`
  ADD PRIMARY KEY (`para_sessionid`);

--
-- Indexes for table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`session_id`);

--
-- Indexes for table `session_allocation`
--
ALTER TABLE `session_allocation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_group`
--
ALTER TABLE `student_group`
  ADD PRIMARY KEY (`sg_id`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subject_tags`
--
ALTER TABLE `subject_tags`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `time slots`
--
ALTER TABLE `time slots`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `workinghours`
--
ALTER TABLE `workinghours`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `consecutive_session`
--
ALTER TABLE `consecutive_session`
  MODIFY `con_sessionid` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `lecturer`
--
ALTER TABLE `lecturer`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `nonavailable_session`
--
ALTER TABLE `nonavailable_session`
  MODIFY `nonavailable_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `parallel_session`
--
ALTER TABLE `parallel_session`
  MODIFY `para_sessionid` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `session`
--
ALTER TABLE `session`
  MODIFY `session_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `session_allocation`
--
ALTER TABLE `session_allocation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `student_group`
--
ALTER TABLE `student_group`
  MODIFY `sg_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `subject`
--
ALTER TABLE `subject`
  MODIFY `id` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `subject_tags`
--
ALTER TABLE `subject_tags`
  MODIFY `tid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `time slots`
--
ALTER TABLE `time slots`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `workinghours`
--
ALTER TABLE `workinghours`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
