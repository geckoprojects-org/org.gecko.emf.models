/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook.impl;

import java.util.Collection;

import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.BibliolistType;
import org.docbook.ns.docbook.BlockquoteType;
import org.docbook.ns.docbook.BridgeheadType;
import org.docbook.ns.docbook.CalloutlistType;
import org.docbook.ns.docbook.CautionType;
import org.docbook.ns.docbook.ClasssynopsisType;
import org.docbook.ns.docbook.CmdsynopsisType;
import org.docbook.ns.docbook.ConstraintdefType;
import org.docbook.ns.docbook.ConstructorsynopsisType;
import org.docbook.ns.docbook.DestructorsynopsisType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EpigraphType;
import org.docbook.ns.docbook.EquationType;
import org.docbook.ns.docbook.ExampleType;
import org.docbook.ns.docbook.FieldsynopsisType;
import org.docbook.ns.docbook.FigureType;
import org.docbook.ns.docbook.FormalparaType;
import org.docbook.ns.docbook.FuncsynopsisType;
import org.docbook.ns.docbook.GlosslistType;
import org.docbook.ns.docbook.ImportantType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.InformalequationType;
import org.docbook.ns.docbook.InformalexampleType;
import org.docbook.ns.docbook.InformalfigureType;
import org.docbook.ns.docbook.InformaltableType;
import org.docbook.ns.docbook.ItemizedlistType;
import org.docbook.ns.docbook.LiterallayoutType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.MethodsynopsisType;
import org.docbook.ns.docbook.MsgsetType;
import org.docbook.ns.docbook.NoteType;
import org.docbook.ns.docbook.OrderedlistType;
import org.docbook.ns.docbook.ParaType;
import org.docbook.ns.docbook.PerformanceType;
import org.docbook.ns.docbook.ProcedureType;
import org.docbook.ns.docbook.ProductionsetType;
import org.docbook.ns.docbook.ProgramlistingType;
import org.docbook.ns.docbook.ProgramlistingcoType;
import org.docbook.ns.docbook.QandasetType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.ScreenType;
import org.docbook.ns.docbook.ScreencoType;
import org.docbook.ns.docbook.ScreenshotType;
import org.docbook.ns.docbook.SegmentedlistType;
import org.docbook.ns.docbook.SidebarType;
import org.docbook.ns.docbook.SimparaType;
import org.docbook.ns.docbook.SimplelistType;
import org.docbook.ns.docbook.StepType;
import org.docbook.ns.docbook.StepalternativesType;
import org.docbook.ns.docbook.SubstepsType;
import org.docbook.ns.docbook.SynopsisType;
import org.docbook.ns.docbook.TableType;
import org.docbook.ns.docbook.TaskType;
import org.docbook.ns.docbook.TipType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.VariablelistType;
import org.docbook.ns.docbook.WarningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSubsteps <em>Substeps</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getStepalternatives <em>Stepalternatives</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getItemizedlist1 <em>Itemizedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getOrderedlist1 <em>Orderedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProcedure1 <em>Procedure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimplelist1 <em>Simplelist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getVariablelist1 <em>Variablelist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSegmentedlist1 <em>Segmentedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGlosslist1 <em>Glosslist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBibliolist1 <em>Bibliolist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCalloutlist1 <em>Calloutlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getQandaset1 <em>Qandaset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getExample1 <em>Example1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFigure1 <em>Figure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTable1 <em>Table1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEquation1 <em>Equation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalexample1 <em>Informalexample1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalfigure1 <em>Informalfigure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformaltable1 <em>Informaltable1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalequation1 <em>Informalequation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSidebar1 <em>Sidebar1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBlockquote1 <em>Blockquote1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEpigraph1 <em>Epigraph1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMediaobject1 <em>Mediaobject1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenshot1 <em>Screenshot1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTask1 <em>Task1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProductionset1 <em>Productionset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstraintdef1 <em>Constraintdef1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMsgset1 <em>Msgset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreen1 <em>Screen1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getLiterallayout1 <em>Literallayout1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlistingco1 <em>Programlistingco1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenco1 <em>Screenco1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlisting1 <em>Programlisting1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSynopsis1 <em>Synopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBridgehead1 <em>Bridgehead1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRemark1 <em>Remark1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRevhistory1 <em>Revhistory1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getIndexterm1 <em>Indexterm1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFuncsynopsis1 <em>Funcsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getClasssynopsis1 <em>Classsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMethodsynopsis1 <em>Methodsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstructorsynopsis1 <em>Constructorsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getDestructorsynopsis1 <em>Destructorsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFieldsynopsis1 <em>Fieldsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCmdsynopsis1 <em>Cmdsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCaution1 <em>Caution1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getImportant1 <em>Important1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getNote1 <em>Note1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTip1 <em>Tip1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getWarning1 <em>Warning1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnchor1 <em>Anchor1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getPara1 <em>Para1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFormalpara1 <em>Formalpara1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimpara1 <em>Simpara1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSubsteps1 <em>Substeps1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getStepalternatives1 <em>Stepalternatives1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getItemizedlist2 <em>Itemizedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getOrderedlist2 <em>Orderedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProcedure2 <em>Procedure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimplelist2 <em>Simplelist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getVariablelist2 <em>Variablelist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSegmentedlist2 <em>Segmentedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getGlosslist2 <em>Glosslist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBibliolist2 <em>Bibliolist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCalloutlist2 <em>Calloutlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getQandaset2 <em>Qandaset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getExample2 <em>Example2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFigure2 <em>Figure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTable2 <em>Table2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEquation2 <em>Equation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalexample2 <em>Informalexample2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalfigure2 <em>Informalfigure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformaltable2 <em>Informaltable2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getInformalequation2 <em>Informalequation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSidebar2 <em>Sidebar2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBlockquote2 <em>Blockquote2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getEpigraph2 <em>Epigraph2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMediaobject2 <em>Mediaobject2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenshot2 <em>Screenshot2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTask2 <em>Task2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProductionset2 <em>Productionset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstraintdef2 <em>Constraintdef2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMsgset2 <em>Msgset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreen2 <em>Screen2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getLiterallayout2 <em>Literallayout2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlistingco2 <em>Programlistingco2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getScreenco2 <em>Screenco2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getProgramlisting2 <em>Programlisting2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSynopsis2 <em>Synopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBridgehead2 <em>Bridgehead2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRemark2 <em>Remark2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRevhistory2 <em>Revhistory2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getIndexterm2 <em>Indexterm2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFuncsynopsis2 <em>Funcsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getClasssynopsis2 <em>Classsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getMethodsynopsis2 <em>Methodsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConstructorsynopsis2 <em>Constructorsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getDestructorsynopsis2 <em>Destructorsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFieldsynopsis2 <em>Fieldsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCmdsynopsis2 <em>Cmdsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCaution2 <em>Caution2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getImportant2 <em>Important2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getNote2 <em>Note2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTip2 <em>Tip2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getWarning2 <em>Warning2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnchor2 <em>Anchor2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getPara2 <em>Para2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getFormalpara2 <em>Formalpara2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSimpara2 <em>Simpara2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnnotation2 <em>Annotation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.StepTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepTypeImpl extends MinimalEObjectImpl.Container implements StepType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected InfoType info;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The cached value of the '{@link #getSubsteps() <em>Substeps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsteps()
	 * @generated
	 * @ordered
	 */
	protected SubstepsType substeps;

	/**
	 * The cached value of the '{@link #getStepalternatives() <em>Stepalternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepalternatives()
	 * @generated
	 * @ordered
	 */
	protected StepalternativesType stepalternatives;

	/**
	 * The cached value of the '{@link #getGroup2() <em>Group2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group2;

	/**
	 * The cached value of the '{@link #getSubsteps1() <em>Substeps1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsteps1()
	 * @generated
	 * @ordered
	 */
	protected SubstepsType substeps1;

	/**
	 * The cached value of the '{@link #getStepalternatives1() <em>Stepalternatives1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepalternatives1()
	 * @generated
	 * @ordered
	 */
	protected StepalternativesType stepalternatives1;

	/**
	 * The cached value of the '{@link #getGroup3() <em>Group3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group3;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANNOTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected Object annotations = ANNOTATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected Object arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected Object arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUDIENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected Object audience = AUDIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final Object BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Object base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Object condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONFORMANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected Object conformance = CONFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType DIR_EDEFAULT = DirType.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final Object HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected Object href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkend() <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkend()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkend() <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkend()
	 * @generated
	 * @ordered
	 */
	protected String linkend = LINKEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final Object OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected Object os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final PerformanceType PERFORMANCE_EDEFAULT = PerformanceType.OPTIONAL;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected PerformanceType performance = PERFORMANCE_EDEFAULT;

	/**
	 * This is true if the Performance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean performanceESet;

	/**
	 * The default value of the '{@link #getRemap() <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemap()
	 * @generated
	 * @ordered
	 */
	protected static final Object REMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemap() <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemap()
	 * @generated
	 * @ordered
	 */
	protected Object remap = REMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final Object REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Object revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionflag() <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionflag()
	 * @generated
	 * @ordered
	 */
	protected static final RevisionflagType REVISIONFLAG_EDEFAULT = RevisionflagType.CHANGED;

	/**
	 * The cached value of the '{@link #getRevisionflag() <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionflag()
	 * @generated
	 * @ordered
	 */
	protected RevisionflagType revisionflag = REVISIONFLAG_EDEFAULT;

	/**
	 * This is true if the Revisionflag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionflagESet;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Object role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected Object role1 = ROLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final Object SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Object security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected Object title1 = TITLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserlevel() <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserlevel()
	 * @generated
	 * @ordered
	 */
	protected static final Object USERLEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserlevel() <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserlevel()
	 * @generated
	 * @ordered
	 */
	protected Object userlevel = USERLEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final Object VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Object vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Object VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Object version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected static final Object WORDSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected Object wordsize = WORDSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object XREFLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected Object xreflabel = XREFLABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.STEP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getStepType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getStepType_Titleabbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoType getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(InfoType newInfo, NotificationChain msgs) {
		InfoType oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(InfoType newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, DocbookPackage.STEP_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemizedlistType> getItemizedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Itemizedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Orderedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Procedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Simplelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Variablelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Segmentedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Glosslist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Bibliolist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Calloutlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Qandaset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Example());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Figure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Equation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Informalexample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Informalfigure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Informaltable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Informalequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Sidebar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Epigraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Screenshot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Task());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Productionset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Constraintdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Msgset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Screen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Literallayout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Programlistingco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Screenco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Programlisting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Synopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Bridgehead());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Funcsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Classsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Methodsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Constructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Destructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Fieldsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Cmdsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Caution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Important());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Tip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Warning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Para());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Formalpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Simpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getStepType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstepsType getSubsteps() {
		return substeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsteps(SubstepsType newSubsteps, NotificationChain msgs) {
		SubstepsType oldSubsteps = substeps;
		substeps = newSubsteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SUBSTEPS, oldSubsteps, newSubsteps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsteps(SubstepsType newSubsteps) {
		if (newSubsteps != substeps) {
			NotificationChain msgs = null;
			if (substeps != null)
				msgs = ((InternalEObject)substeps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__SUBSTEPS, null, msgs);
			if (newSubsteps != null)
				msgs = ((InternalEObject)newSubsteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__SUBSTEPS, null, msgs);
			msgs = basicSetSubsteps(newSubsteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SUBSTEPS, newSubsteps, newSubsteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepalternativesType getStepalternatives() {
		return stepalternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepalternatives(StepalternativesType newStepalternatives, NotificationChain msgs) {
		StepalternativesType oldStepalternatives = stepalternatives;
		stepalternatives = newStepalternatives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__STEPALTERNATIVES, oldStepalternatives, newStepalternatives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepalternatives(StepalternativesType newStepalternatives) {
		if (newStepalternatives != stepalternatives) {
			NotificationChain msgs = null;
			if (stepalternatives != null)
				msgs = ((InternalEObject)stepalternatives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__STEPALTERNATIVES, null, msgs);
			if (newStepalternatives != null)
				msgs = ((InternalEObject)newStepalternatives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__STEPALTERNATIVES, null, msgs);
			msgs = basicSetStepalternatives(newStepalternatives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__STEPALTERNATIVES, newStepalternatives, newStepalternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup2() {
		if (group2 == null) {
			group2 = new BasicFeatureMap(this, DocbookPackage.STEP_TYPE__GROUP2);
		}
		return group2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemizedlistType> getItemizedlist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Itemizedlist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Orderedlist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Procedure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Simplelist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Variablelist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Segmentedlist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Glosslist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Bibliolist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Calloutlist1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Qandaset1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Example1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Figure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Table1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Equation1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Informalexample1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Informalfigure1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Informaltable1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Informalequation1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Sidebar1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Blockquote1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Address1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Epigraph1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Mediaobject1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Screenshot1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Task1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Productionset1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Constraintdef1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Msgset1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Screen1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Literallayout1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Programlistingco1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Screenco1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Programlisting1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Synopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Bridgehead1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Remark1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Revhistory1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Indexterm1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Funcsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Classsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Methodsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Constructorsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Destructorsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Fieldsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Cmdsynopsis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Caution1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Important1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Note1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Tip1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Warning1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Anchor1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Para1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Formalpara1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Simpara1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation1() {
		return getGroup2().list(DocbookPackage.eINSTANCE.getStepType_Annotation1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstepsType getSubsteps1() {
		return substeps1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsteps1(SubstepsType newSubsteps1, NotificationChain msgs) {
		SubstepsType oldSubsteps1 = substeps1;
		substeps1 = newSubsteps1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SUBSTEPS1, oldSubsteps1, newSubsteps1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsteps1(SubstepsType newSubsteps1) {
		if (newSubsteps1 != substeps1) {
			NotificationChain msgs = null;
			if (substeps1 != null)
				msgs = ((InternalEObject)substeps1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__SUBSTEPS1, null, msgs);
			if (newSubsteps1 != null)
				msgs = ((InternalEObject)newSubsteps1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__SUBSTEPS1, null, msgs);
			msgs = basicSetSubsteps1(newSubsteps1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SUBSTEPS1, newSubsteps1, newSubsteps1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepalternativesType getStepalternatives1() {
		return stepalternatives1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepalternatives1(StepalternativesType newStepalternatives1, NotificationChain msgs) {
		StepalternativesType oldStepalternatives1 = stepalternatives1;
		stepalternatives1 = newStepalternatives1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__STEPALTERNATIVES1, oldStepalternatives1, newStepalternatives1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepalternatives1(StepalternativesType newStepalternatives1) {
		if (newStepalternatives1 != stepalternatives1) {
			NotificationChain msgs = null;
			if (stepalternatives1 != null)
				msgs = ((InternalEObject)stepalternatives1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__STEPALTERNATIVES1, null, msgs);
			if (newStepalternatives1 != null)
				msgs = ((InternalEObject)newStepalternatives1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.STEP_TYPE__STEPALTERNATIVES1, null, msgs);
			msgs = basicSetStepalternatives1(newStepalternatives1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__STEPALTERNATIVES1, newStepalternatives1, newStepalternatives1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup3() {
		if (group3 == null) {
			group3 = new BasicFeatureMap(this, DocbookPackage.STEP_TYPE__GROUP3);
		}
		return group3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemizedlistType> getItemizedlist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Itemizedlist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Orderedlist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Procedure2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Simplelist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Variablelist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Segmentedlist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Glosslist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Bibliolist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Calloutlist2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Qandaset2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Example2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Figure2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Table2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Equation2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Informalexample2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Informalfigure2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Informaltable2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Informalequation2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Sidebar2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Blockquote2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Address2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Epigraph2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Mediaobject2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Screenshot2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Task2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Productionset2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Constraintdef2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Msgset2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Screen2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Literallayout2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Programlistingco2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Screenco2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Programlisting2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Synopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Bridgehead2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Remark2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Revhistory2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Indexterm2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Funcsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Classsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Methodsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Constructorsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Destructorsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Fieldsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Cmdsynopsis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Caution2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Important2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Note2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Tip2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Warning2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Anchor2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Para2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Formalpara2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Simpara2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation2() {
		return getGroup3().list(DocbookPackage.eINSTANCE.getStepType_Annotation2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.STEP_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotations(Object newAnnotations) {
		Object oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ANNOTATIONS, oldAnnotations, annotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArch(Object newArch) {
		Object oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcrole(Object newArcrole) {
		Object oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAudience() {
		return audience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudience(Object newAudience) {
		Object oldAudience = audience;
		audience = newAudience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__AUDIENCE, oldAudience, audience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Object newBase) {
		Object oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Object newCondition) {
		Object oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformance(Object newConformance) {
		Object oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__CONFORMANCE, oldConformance, conformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(DirType newDir) {
		DirType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDir() {
		DirType oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.STEP_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(Object newHref) {
		Object oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkend() {
		return linkend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkend(String newLinkend) {
		String oldLinkend = linkend;
		linkend = newLinkend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__LINKEND, oldLinkend, linkend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(Object newOs) {
		Object oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceType getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformance(PerformanceType newPerformance) {
		PerformanceType oldPerformance = performance;
		performance = newPerformance == null ? PERFORMANCE_EDEFAULT : newPerformance;
		boolean oldPerformanceESet = performanceESet;
		performanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__PERFORMANCE, oldPerformance, performance, !oldPerformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPerformance() {
		PerformanceType oldPerformance = performance;
		boolean oldPerformanceESet = performanceESet;
		performance = PERFORMANCE_EDEFAULT;
		performanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.STEP_TYPE__PERFORMANCE, oldPerformance, PERFORMANCE_EDEFAULT, oldPerformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPerformance() {
		return performanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRemap() {
		return remap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemap(Object newRemap) {
		Object oldRemap = remap;
		remap = newRemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__REMAP, oldRemap, remap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(Object newRevision) {
		Object oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevisionflagType getRevisionflag() {
		return revisionflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionflag(RevisionflagType newRevisionflag) {
		RevisionflagType oldRevisionflag = revisionflag;
		revisionflag = newRevisionflag == null ? REVISIONFLAG_EDEFAULT : newRevisionflag;
		boolean oldRevisionflagESet = revisionflagESet;
		revisionflagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRevisionflag() {
		RevisionflagType oldRevisionflag = revisionflag;
		boolean oldRevisionflagESet = revisionflagESet;
		revisionflag = REVISIONFLAG_EDEFAULT;
		revisionflagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.STEP_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRevisionflag() {
		return revisionflagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Object newRole) {
		Object oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole1(Object newRole1) {
		Object oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Object newSecurity) {
		Object oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.STEP_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle1(Object newTitle1) {
		Object oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUserlevel() {
		return userlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserlevel(Object newUserlevel) {
		Object oldUserlevel = userlevel;
		userlevel = newUserlevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__USERLEVEL, oldUserlevel, userlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(Object newVendor) {
		Object oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getWordsize() {
		return wordsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordsize(Object newWordsize) {
		Object oldWordsize = wordsize;
		wordsize = newWordsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__WORDSIZE, oldWordsize, wordsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getXreflabel() {
		return xreflabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXreflabel(Object newXreflabel) {
		Object oldXreflabel = xreflabel;
		xreflabel = newXreflabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.STEP_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.STEP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.STEP_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST:
				return ((InternalEList<?>)getItemizedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPLELIST:
				return ((InternalEList<?>)getSimplelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__VARIABLELIST:
				return ((InternalEList<?>)getVariablelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST:
				return ((InternalEList<?>)getSegmentedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__GLOSSLIST:
				return ((InternalEList<?>)getGlosslist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BIBLIOLIST:
				return ((InternalEList<?>)getBibliolist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CALLOUTLIST:
				return ((InternalEList<?>)getCalloutlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__QANDASET:
				return ((InternalEList<?>)getQandaset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EXAMPLE:
				return ((InternalEList<?>)getExample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIGURE:
				return ((InternalEList<?>)getFigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EQUATION:
				return ((InternalEList<?>)getEquation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE:
				return ((InternalEList<?>)getInformalexample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE:
				return ((InternalEList<?>)getInformalfigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALTABLE:
				return ((InternalEList<?>)getInformaltable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION:
				return ((InternalEList<?>)getInformalequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIDEBAR:
				return ((InternalEList<?>)getSidebar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EPIGRAPH:
				return ((InternalEList<?>)getEpigraph()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENSHOT:
				return ((InternalEList<?>)getScreenshot()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET:
				return ((InternalEList<?>)getProductionset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF:
				return ((InternalEList<?>)getConstraintdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MSGSET:
				return ((InternalEList<?>)getMsgset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREEN:
				return ((InternalEList<?>)getScreen()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT:
				return ((InternalEList<?>)getLiterallayout()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO:
				return ((InternalEList<?>)getProgramlistingco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENCO:
				return ((InternalEList<?>)getScreenco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SYNOPSIS:
				return ((InternalEList<?>)getSynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD:
				return ((InternalEList<?>)getBridgehead()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS:
				return ((InternalEList<?>)getFuncsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS:
				return ((InternalEList<?>)getClasssynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS:
				return ((InternalEList<?>)getMethodsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getConstructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getDestructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS:
				return ((InternalEList<?>)getFieldsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS:
				return ((InternalEList<?>)getCmdsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CAUTION:
				return ((InternalEList<?>)getCaution()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__IMPORTANT:
				return ((InternalEList<?>)getImportant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TIP:
				return ((InternalEList<?>)getTip()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FORMALPARA:
				return ((InternalEList<?>)getFormalpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPARA:
				return ((InternalEList<?>)getSimpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SUBSTEPS:
				return basicSetSubsteps(null, msgs);
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES:
				return basicSetStepalternatives(null, msgs);
			case DocbookPackage.STEP_TYPE__GROUP2:
				return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST1:
				return ((InternalEList<?>)getItemizedlist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ORDEREDLIST1:
				return ((InternalEList<?>)getOrderedlist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROCEDURE1:
				return ((InternalEList<?>)getProcedure1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPLELIST1:
				return ((InternalEList<?>)getSimplelist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__VARIABLELIST1:
				return ((InternalEList<?>)getVariablelist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST1:
				return ((InternalEList<?>)getSegmentedlist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__GLOSSLIST1:
				return ((InternalEList<?>)getGlosslist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BIBLIOLIST1:
				return ((InternalEList<?>)getBibliolist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CALLOUTLIST1:
				return ((InternalEList<?>)getCalloutlist1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__QANDASET1:
				return ((InternalEList<?>)getQandaset1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EXAMPLE1:
				return ((InternalEList<?>)getExample1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIGURE1:
				return ((InternalEList<?>)getFigure1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TABLE1:
				return ((InternalEList<?>)getTable1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EQUATION1:
				return ((InternalEList<?>)getEquation1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE1:
				return ((InternalEList<?>)getInformalexample1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE1:
				return ((InternalEList<?>)getInformalfigure1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALTABLE1:
				return ((InternalEList<?>)getInformaltable1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION1:
				return ((InternalEList<?>)getInformalequation1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIDEBAR1:
				return ((InternalEList<?>)getSidebar1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE1:
				return ((InternalEList<?>)getBlockquote1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ADDRESS1:
				return ((InternalEList<?>)getAddress1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EPIGRAPH1:
				return ((InternalEList<?>)getEpigraph1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT1:
				return ((InternalEList<?>)getMediaobject1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENSHOT1:
				return ((InternalEList<?>)getScreenshot1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TASK1:
				return ((InternalEList<?>)getTask1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET1:
				return ((InternalEList<?>)getProductionset1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF1:
				return ((InternalEList<?>)getConstraintdef1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MSGSET1:
				return ((InternalEList<?>)getMsgset1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREEN1:
				return ((InternalEList<?>)getScreen1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT1:
				return ((InternalEList<?>)getLiterallayout1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO1:
				return ((InternalEList<?>)getProgramlistingco1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENCO1:
				return ((InternalEList<?>)getScreenco1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING1:
				return ((InternalEList<?>)getProgramlisting1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SYNOPSIS1:
				return ((InternalEList<?>)getSynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD1:
				return ((InternalEList<?>)getBridgehead1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REMARK1:
				return ((InternalEList<?>)getRemark1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REVHISTORY1:
				return ((InternalEList<?>)getRevhistory1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INDEXTERM1:
				return ((InternalEList<?>)getIndexterm1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS1:
				return ((InternalEList<?>)getFuncsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS1:
				return ((InternalEList<?>)getClasssynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS1:
				return ((InternalEList<?>)getMethodsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS1:
				return ((InternalEList<?>)getConstructorsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS1:
				return ((InternalEList<?>)getDestructorsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS1:
				return ((InternalEList<?>)getFieldsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS1:
				return ((InternalEList<?>)getCmdsynopsis1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CAUTION1:
				return ((InternalEList<?>)getCaution1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__IMPORTANT1:
				return ((InternalEList<?>)getImportant1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__NOTE1:
				return ((InternalEList<?>)getNote1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TIP1:
				return ((InternalEList<?>)getTip1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__WARNING1:
				return ((InternalEList<?>)getWarning1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANCHOR1:
				return ((InternalEList<?>)getAnchor1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PARA1:
				return ((InternalEList<?>)getPara1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FORMALPARA1:
				return ((InternalEList<?>)getFormalpara1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPARA1:
				return ((InternalEList<?>)getSimpara1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANNOTATION1:
				return ((InternalEList<?>)getAnnotation1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SUBSTEPS1:
				return basicSetSubsteps1(null, msgs);
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES1:
				return basicSetStepalternatives1(null, msgs);
			case DocbookPackage.STEP_TYPE__GROUP3:
				return ((InternalEList<?>)getGroup3()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST2:
				return ((InternalEList<?>)getItemizedlist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ORDEREDLIST2:
				return ((InternalEList<?>)getOrderedlist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROCEDURE2:
				return ((InternalEList<?>)getProcedure2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPLELIST2:
				return ((InternalEList<?>)getSimplelist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__VARIABLELIST2:
				return ((InternalEList<?>)getVariablelist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST2:
				return ((InternalEList<?>)getSegmentedlist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__GLOSSLIST2:
				return ((InternalEList<?>)getGlosslist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BIBLIOLIST2:
				return ((InternalEList<?>)getBibliolist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CALLOUTLIST2:
				return ((InternalEList<?>)getCalloutlist2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__QANDASET2:
				return ((InternalEList<?>)getQandaset2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EXAMPLE2:
				return ((InternalEList<?>)getExample2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIGURE2:
				return ((InternalEList<?>)getFigure2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TABLE2:
				return ((InternalEList<?>)getTable2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EQUATION2:
				return ((InternalEList<?>)getEquation2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE2:
				return ((InternalEList<?>)getInformalexample2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE2:
				return ((InternalEList<?>)getInformalfigure2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALTABLE2:
				return ((InternalEList<?>)getInformaltable2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION2:
				return ((InternalEList<?>)getInformalequation2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIDEBAR2:
				return ((InternalEList<?>)getSidebar2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE2:
				return ((InternalEList<?>)getBlockquote2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ADDRESS2:
				return ((InternalEList<?>)getAddress2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__EPIGRAPH2:
				return ((InternalEList<?>)getEpigraph2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT2:
				return ((InternalEList<?>)getMediaobject2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENSHOT2:
				return ((InternalEList<?>)getScreenshot2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TASK2:
				return ((InternalEList<?>)getTask2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET2:
				return ((InternalEList<?>)getProductionset2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF2:
				return ((InternalEList<?>)getConstraintdef2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__MSGSET2:
				return ((InternalEList<?>)getMsgset2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREEN2:
				return ((InternalEList<?>)getScreen2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT2:
				return ((InternalEList<?>)getLiterallayout2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO2:
				return ((InternalEList<?>)getProgramlistingco2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SCREENCO2:
				return ((InternalEList<?>)getScreenco2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING2:
				return ((InternalEList<?>)getProgramlisting2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SYNOPSIS2:
				return ((InternalEList<?>)getSynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD2:
				return ((InternalEList<?>)getBridgehead2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REMARK2:
				return ((InternalEList<?>)getRemark2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__REVHISTORY2:
				return ((InternalEList<?>)getRevhistory2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__INDEXTERM2:
				return ((InternalEList<?>)getIndexterm2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS2:
				return ((InternalEList<?>)getFuncsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS2:
				return ((InternalEList<?>)getClasssynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS2:
				return ((InternalEList<?>)getMethodsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS2:
				return ((InternalEList<?>)getConstructorsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS2:
				return ((InternalEList<?>)getDestructorsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS2:
				return ((InternalEList<?>)getFieldsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS2:
				return ((InternalEList<?>)getCmdsynopsis2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__CAUTION2:
				return ((InternalEList<?>)getCaution2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__IMPORTANT2:
				return ((InternalEList<?>)getImportant2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__NOTE2:
				return ((InternalEList<?>)getNote2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__TIP2:
				return ((InternalEList<?>)getTip2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__WARNING2:
				return ((InternalEList<?>)getWarning2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANCHOR2:
				return ((InternalEList<?>)getAnchor2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__PARA2:
				return ((InternalEList<?>)getPara2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__FORMALPARA2:
				return ((InternalEList<?>)getFormalpara2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__SIMPARA2:
				return ((InternalEList<?>)getSimpara2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.STEP_TYPE__ANNOTATION2:
				return ((InternalEList<?>)getAnnotation2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.STEP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.STEP_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.STEP_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.STEP_TYPE__INFO:
				return getInfo();
			case DocbookPackage.STEP_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.STEP_TYPE__PROCEDURE:
				return getProcedure();
			case DocbookPackage.STEP_TYPE__SIMPLELIST:
				return getSimplelist();
			case DocbookPackage.STEP_TYPE__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.STEP_TYPE__GLOSSLIST:
				return getGlosslist();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST:
				return getBibliolist();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST:
				return getCalloutlist();
			case DocbookPackage.STEP_TYPE__QANDASET:
				return getQandaset();
			case DocbookPackage.STEP_TYPE__EXAMPLE:
				return getExample();
			case DocbookPackage.STEP_TYPE__FIGURE:
				return getFigure();
			case DocbookPackage.STEP_TYPE__TABLE:
				return getTable();
			case DocbookPackage.STEP_TYPE__EQUATION:
				return getEquation();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE:
				return getInformalexample();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE:
				return getInformalfigure();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION:
				return getInformalequation();
			case DocbookPackage.STEP_TYPE__SIDEBAR:
				return getSidebar();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case DocbookPackage.STEP_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.STEP_TYPE__EPIGRAPH:
				return getEpigraph();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.STEP_TYPE__SCREENSHOT:
				return getScreenshot();
			case DocbookPackage.STEP_TYPE__TASK:
				return getTask();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET:
				return getProductionset();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF:
				return getConstraintdef();
			case DocbookPackage.STEP_TYPE__MSGSET:
				return getMsgset();
			case DocbookPackage.STEP_TYPE__SCREEN:
				return getScreen();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT:
				return getLiterallayout();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO:
				return getProgramlistingco();
			case DocbookPackage.STEP_TYPE__SCREENCO:
				return getScreenco();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.STEP_TYPE__SYNOPSIS:
				return getSynopsis();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD:
				return getBridgehead();
			case DocbookPackage.STEP_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.STEP_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.STEP_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS:
				return getFuncsynopsis();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS:
				return getClasssynopsis();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS:
				return getMethodsynopsis();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS:
				return getFieldsynopsis();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.STEP_TYPE__CAUTION:
				return getCaution();
			case DocbookPackage.STEP_TYPE__IMPORTANT:
				return getImportant();
			case DocbookPackage.STEP_TYPE__NOTE:
				return getNote();
			case DocbookPackage.STEP_TYPE__TIP:
				return getTip();
			case DocbookPackage.STEP_TYPE__WARNING:
				return getWarning();
			case DocbookPackage.STEP_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.STEP_TYPE__PARA:
				return getPara();
			case DocbookPackage.STEP_TYPE__FORMALPARA:
				return getFormalpara();
			case DocbookPackage.STEP_TYPE__SIMPARA:
				return getSimpara();
			case DocbookPackage.STEP_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.STEP_TYPE__SUBSTEPS:
				return getSubsteps();
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES:
				return getStepalternatives();
			case DocbookPackage.STEP_TYPE__GROUP2:
				if (coreType) return getGroup2();
				return ((FeatureMap.Internal)getGroup2()).getWrapper();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST1:
				return getItemizedlist1();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST1:
				return getOrderedlist1();
			case DocbookPackage.STEP_TYPE__PROCEDURE1:
				return getProcedure1();
			case DocbookPackage.STEP_TYPE__SIMPLELIST1:
				return getSimplelist1();
			case DocbookPackage.STEP_TYPE__VARIABLELIST1:
				return getVariablelist1();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST1:
				return getSegmentedlist1();
			case DocbookPackage.STEP_TYPE__GLOSSLIST1:
				return getGlosslist1();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST1:
				return getBibliolist1();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST1:
				return getCalloutlist1();
			case DocbookPackage.STEP_TYPE__QANDASET1:
				return getQandaset1();
			case DocbookPackage.STEP_TYPE__EXAMPLE1:
				return getExample1();
			case DocbookPackage.STEP_TYPE__FIGURE1:
				return getFigure1();
			case DocbookPackage.STEP_TYPE__TABLE1:
				return getTable1();
			case DocbookPackage.STEP_TYPE__EQUATION1:
				return getEquation1();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE1:
				return getInformalexample1();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE1:
				return getInformalfigure1();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE1:
				return getInformaltable1();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION1:
				return getInformalequation1();
			case DocbookPackage.STEP_TYPE__SIDEBAR1:
				return getSidebar1();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE1:
				return getBlockquote1();
			case DocbookPackage.STEP_TYPE__ADDRESS1:
				return getAddress1();
			case DocbookPackage.STEP_TYPE__EPIGRAPH1:
				return getEpigraph1();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT1:
				return getMediaobject1();
			case DocbookPackage.STEP_TYPE__SCREENSHOT1:
				return getScreenshot1();
			case DocbookPackage.STEP_TYPE__TASK1:
				return getTask1();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET1:
				return getProductionset1();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF1:
				return getConstraintdef1();
			case DocbookPackage.STEP_TYPE__MSGSET1:
				return getMsgset1();
			case DocbookPackage.STEP_TYPE__SCREEN1:
				return getScreen1();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT1:
				return getLiterallayout1();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO1:
				return getProgramlistingco1();
			case DocbookPackage.STEP_TYPE__SCREENCO1:
				return getScreenco1();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING1:
				return getProgramlisting1();
			case DocbookPackage.STEP_TYPE__SYNOPSIS1:
				return getSynopsis1();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD1:
				return getBridgehead1();
			case DocbookPackage.STEP_TYPE__REMARK1:
				return getRemark1();
			case DocbookPackage.STEP_TYPE__REVHISTORY1:
				return getRevhistory1();
			case DocbookPackage.STEP_TYPE__INDEXTERM1:
				return getIndexterm1();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS1:
				return getFuncsynopsis1();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS1:
				return getClasssynopsis1();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS1:
				return getMethodsynopsis1();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS1:
				return getConstructorsynopsis1();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS1:
				return getDestructorsynopsis1();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS1:
				return getFieldsynopsis1();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS1:
				return getCmdsynopsis1();
			case DocbookPackage.STEP_TYPE__CAUTION1:
				return getCaution1();
			case DocbookPackage.STEP_TYPE__IMPORTANT1:
				return getImportant1();
			case DocbookPackage.STEP_TYPE__NOTE1:
				return getNote1();
			case DocbookPackage.STEP_TYPE__TIP1:
				return getTip1();
			case DocbookPackage.STEP_TYPE__WARNING1:
				return getWarning1();
			case DocbookPackage.STEP_TYPE__ANCHOR1:
				return getAnchor1();
			case DocbookPackage.STEP_TYPE__PARA1:
				return getPara1();
			case DocbookPackage.STEP_TYPE__FORMALPARA1:
				return getFormalpara1();
			case DocbookPackage.STEP_TYPE__SIMPARA1:
				return getSimpara1();
			case DocbookPackage.STEP_TYPE__ANNOTATION1:
				return getAnnotation1();
			case DocbookPackage.STEP_TYPE__SUBSTEPS1:
				return getSubsteps1();
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES1:
				return getStepalternatives1();
			case DocbookPackage.STEP_TYPE__GROUP3:
				if (coreType) return getGroup3();
				return ((FeatureMap.Internal)getGroup3()).getWrapper();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST2:
				return getItemizedlist2();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST2:
				return getOrderedlist2();
			case DocbookPackage.STEP_TYPE__PROCEDURE2:
				return getProcedure2();
			case DocbookPackage.STEP_TYPE__SIMPLELIST2:
				return getSimplelist2();
			case DocbookPackage.STEP_TYPE__VARIABLELIST2:
				return getVariablelist2();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST2:
				return getSegmentedlist2();
			case DocbookPackage.STEP_TYPE__GLOSSLIST2:
				return getGlosslist2();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST2:
				return getBibliolist2();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST2:
				return getCalloutlist2();
			case DocbookPackage.STEP_TYPE__QANDASET2:
				return getQandaset2();
			case DocbookPackage.STEP_TYPE__EXAMPLE2:
				return getExample2();
			case DocbookPackage.STEP_TYPE__FIGURE2:
				return getFigure2();
			case DocbookPackage.STEP_TYPE__TABLE2:
				return getTable2();
			case DocbookPackage.STEP_TYPE__EQUATION2:
				return getEquation2();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE2:
				return getInformalexample2();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE2:
				return getInformalfigure2();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE2:
				return getInformaltable2();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION2:
				return getInformalequation2();
			case DocbookPackage.STEP_TYPE__SIDEBAR2:
				return getSidebar2();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE2:
				return getBlockquote2();
			case DocbookPackage.STEP_TYPE__ADDRESS2:
				return getAddress2();
			case DocbookPackage.STEP_TYPE__EPIGRAPH2:
				return getEpigraph2();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT2:
				return getMediaobject2();
			case DocbookPackage.STEP_TYPE__SCREENSHOT2:
				return getScreenshot2();
			case DocbookPackage.STEP_TYPE__TASK2:
				return getTask2();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET2:
				return getProductionset2();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF2:
				return getConstraintdef2();
			case DocbookPackage.STEP_TYPE__MSGSET2:
				return getMsgset2();
			case DocbookPackage.STEP_TYPE__SCREEN2:
				return getScreen2();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT2:
				return getLiterallayout2();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO2:
				return getProgramlistingco2();
			case DocbookPackage.STEP_TYPE__SCREENCO2:
				return getScreenco2();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING2:
				return getProgramlisting2();
			case DocbookPackage.STEP_TYPE__SYNOPSIS2:
				return getSynopsis2();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD2:
				return getBridgehead2();
			case DocbookPackage.STEP_TYPE__REMARK2:
				return getRemark2();
			case DocbookPackage.STEP_TYPE__REVHISTORY2:
				return getRevhistory2();
			case DocbookPackage.STEP_TYPE__INDEXTERM2:
				return getIndexterm2();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS2:
				return getFuncsynopsis2();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS2:
				return getClasssynopsis2();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS2:
				return getMethodsynopsis2();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS2:
				return getConstructorsynopsis2();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS2:
				return getDestructorsynopsis2();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS2:
				return getFieldsynopsis2();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS2:
				return getCmdsynopsis2();
			case DocbookPackage.STEP_TYPE__CAUTION2:
				return getCaution2();
			case DocbookPackage.STEP_TYPE__IMPORTANT2:
				return getImportant2();
			case DocbookPackage.STEP_TYPE__NOTE2:
				return getNote2();
			case DocbookPackage.STEP_TYPE__TIP2:
				return getTip2();
			case DocbookPackage.STEP_TYPE__WARNING2:
				return getWarning2();
			case DocbookPackage.STEP_TYPE__ANCHOR2:
				return getAnchor2();
			case DocbookPackage.STEP_TYPE__PARA2:
				return getPara2();
			case DocbookPackage.STEP_TYPE__FORMALPARA2:
				return getFormalpara2();
			case DocbookPackage.STEP_TYPE__SIMPARA2:
				return getSimpara2();
			case DocbookPackage.STEP_TYPE__ANNOTATION2:
				return getAnnotation2();
			case DocbookPackage.STEP_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.STEP_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.STEP_TYPE__ARCH:
				return getArch();
			case DocbookPackage.STEP_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.STEP_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.STEP_TYPE__BASE:
				return getBase();
			case DocbookPackage.STEP_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.STEP_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.STEP_TYPE__DIR:
				return getDir();
			case DocbookPackage.STEP_TYPE__HREF:
				return getHref();
			case DocbookPackage.STEP_TYPE__ID:
				return getId();
			case DocbookPackage.STEP_TYPE__LANG:
				return getLang();
			case DocbookPackage.STEP_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.STEP_TYPE__OS:
				return getOs();
			case DocbookPackage.STEP_TYPE__PERFORMANCE:
				return getPerformance();
			case DocbookPackage.STEP_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.STEP_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.STEP_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.STEP_TYPE__ROLE:
				return getRole();
			case DocbookPackage.STEP_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.STEP_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.STEP_TYPE__SHOW:
				return getShow();
			case DocbookPackage.STEP_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.STEP_TYPE__TYPE:
				return getType();
			case DocbookPackage.STEP_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.STEP_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.STEP_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.STEP_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.STEP_TYPE__XREFLABEL:
				return getXreflabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.STEP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.STEP_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				getItemizedlist().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST:
				getSimplelist().clear();
				getSimplelist().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST:
				getVariablelist().clear();
				getVariablelist().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				getSegmentedlist().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST:
				getGlosslist().clear();
				getGlosslist().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				getBibliolist().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				getCalloutlist().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__QANDASET:
				getQandaset().clear();
				getQandaset().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIGURE:
				getFigure().clear();
				getFigure().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				getInformalexample().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				getInformalfigure().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				getInformaltable().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				getInformalequation().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR:
				getSidebar().clear();
				getSidebar().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH:
				getEpigraph().clear();
				getEpigraph().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT:
				getScreenshot().clear();
				getScreenshot().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				getProductionset().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				getConstraintdef().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MSGSET:
				getMsgset().clear();
				getMsgset().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREEN:
				getScreen().clear();
				getScreen().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				getLiterallayout().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				getProgramlistingco().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO:
				getScreenco().clear();
				getScreenco().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS:
				getSynopsis().clear();
				getSynopsis().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				getBridgehead().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				getFuncsynopsis().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				getClasssynopsis().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				getMethodsynopsis().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				getConstructorsynopsis().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				getDestructorsynopsis().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				getFieldsynopsis().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				getCmdsynopsis().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CAUTION:
				getCaution().clear();
				getCaution().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT:
				getImportant().clear();
				getImportant().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TIP:
				getTip().clear();
				getTip().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA:
				getFormalpara().clear();
				getFormalpara().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA:
				getSimpara().clear();
				getSimpara().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SUBSTEPS:
				setSubsteps((SubstepsType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES:
				setStepalternatives((StepalternativesType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GROUP2:
				((FeatureMap.Internal)getGroup2()).set(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST1:
				getItemizedlist1().clear();
				getItemizedlist1().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST1:
				getOrderedlist1().clear();
				getOrderedlist1().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE1:
				getProcedure1().clear();
				getProcedure1().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST1:
				getSimplelist1().clear();
				getSimplelist1().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST1:
				getVariablelist1().clear();
				getVariablelist1().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST1:
				getSegmentedlist1().clear();
				getSegmentedlist1().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST1:
				getGlosslist1().clear();
				getGlosslist1().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST1:
				getBibliolist1().clear();
				getBibliolist1().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST1:
				getCalloutlist1().clear();
				getCalloutlist1().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__QANDASET1:
				getQandaset1().clear();
				getQandaset1().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE1:
				getExample1().clear();
				getExample1().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIGURE1:
				getFigure1().clear();
				getFigure1().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TABLE1:
				getTable1().clear();
				getTable1().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EQUATION1:
				getEquation1().clear();
				getEquation1().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE1:
				getInformalexample1().clear();
				getInformalexample1().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE1:
				getInformalfigure1().clear();
				getInformalfigure1().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE1:
				getInformaltable1().clear();
				getInformaltable1().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION1:
				getInformalequation1().clear();
				getInformalequation1().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR1:
				getSidebar1().clear();
				getSidebar1().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE1:
				getBlockquote1().clear();
				getBlockquote1().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS1:
				getAddress1().clear();
				getAddress1().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH1:
				getEpigraph1().clear();
				getEpigraph1().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT1:
				getMediaobject1().clear();
				getMediaobject1().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT1:
				getScreenshot1().clear();
				getScreenshot1().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TASK1:
				getTask1().clear();
				getTask1().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET1:
				getProductionset1().clear();
				getProductionset1().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF1:
				getConstraintdef1().clear();
				getConstraintdef1().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MSGSET1:
				getMsgset1().clear();
				getMsgset1().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREEN1:
				getScreen1().clear();
				getScreen1().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT1:
				getLiterallayout1().clear();
				getLiterallayout1().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO1:
				getProgramlistingco1().clear();
				getProgramlistingco1().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO1:
				getScreenco1().clear();
				getScreenco1().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING1:
				getProgramlisting1().clear();
				getProgramlisting1().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS1:
				getSynopsis1().clear();
				getSynopsis1().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD1:
				getBridgehead1().clear();
				getBridgehead1().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REMARK1:
				getRemark1().clear();
				getRemark1().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY1:
				getRevhistory1().clear();
				getRevhistory1().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM1:
				getIndexterm1().clear();
				getIndexterm1().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS1:
				getFuncsynopsis1().clear();
				getFuncsynopsis1().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS1:
				getClasssynopsis1().clear();
				getClasssynopsis1().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS1:
				getMethodsynopsis1().clear();
				getMethodsynopsis1().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS1:
				getConstructorsynopsis1().clear();
				getConstructorsynopsis1().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS1:
				getDestructorsynopsis1().clear();
				getDestructorsynopsis1().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS1:
				getFieldsynopsis1().clear();
				getFieldsynopsis1().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS1:
				getCmdsynopsis1().clear();
				getCmdsynopsis1().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CAUTION1:
				getCaution1().clear();
				getCaution1().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT1:
				getImportant1().clear();
				getImportant1().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__NOTE1:
				getNote1().clear();
				getNote1().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TIP1:
				getTip1().clear();
				getTip1().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__WARNING1:
				getWarning1().clear();
				getWarning1().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR1:
				getAnchor1().clear();
				getAnchor1().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PARA1:
				getPara1().clear();
				getPara1().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA1:
				getFormalpara1().clear();
				getFormalpara1().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA1:
				getSimpara1().clear();
				getSimpara1().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION1:
				getAnnotation1().clear();
				getAnnotation1().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SUBSTEPS1:
				setSubsteps1((SubstepsType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES1:
				setStepalternatives1((StepalternativesType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GROUP3:
				((FeatureMap.Internal)getGroup3()).set(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST2:
				getItemizedlist2().clear();
				getItemizedlist2().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST2:
				getOrderedlist2().clear();
				getOrderedlist2().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE2:
				getProcedure2().clear();
				getProcedure2().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST2:
				getSimplelist2().clear();
				getSimplelist2().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST2:
				getVariablelist2().clear();
				getVariablelist2().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST2:
				getSegmentedlist2().clear();
				getSegmentedlist2().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST2:
				getGlosslist2().clear();
				getGlosslist2().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST2:
				getBibliolist2().clear();
				getBibliolist2().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST2:
				getCalloutlist2().clear();
				getCalloutlist2().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__QANDASET2:
				getQandaset2().clear();
				getQandaset2().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE2:
				getExample2().clear();
				getExample2().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIGURE2:
				getFigure2().clear();
				getFigure2().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TABLE2:
				getTable2().clear();
				getTable2().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EQUATION2:
				getEquation2().clear();
				getEquation2().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE2:
				getInformalexample2().clear();
				getInformalexample2().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE2:
				getInformalfigure2().clear();
				getInformalfigure2().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE2:
				getInformaltable2().clear();
				getInformaltable2().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION2:
				getInformalequation2().clear();
				getInformalequation2().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR2:
				getSidebar2().clear();
				getSidebar2().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE2:
				getBlockquote2().clear();
				getBlockquote2().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS2:
				getAddress2().clear();
				getAddress2().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH2:
				getEpigraph2().clear();
				getEpigraph2().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT2:
				getMediaobject2().clear();
				getMediaobject2().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT2:
				getScreenshot2().clear();
				getScreenshot2().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TASK2:
				getTask2().clear();
				getTask2().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET2:
				getProductionset2().clear();
				getProductionset2().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF2:
				getConstraintdef2().clear();
				getConstraintdef2().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__MSGSET2:
				getMsgset2().clear();
				getMsgset2().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREEN2:
				getScreen2().clear();
				getScreen2().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT2:
				getLiterallayout2().clear();
				getLiterallayout2().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO2:
				getProgramlistingco2().clear();
				getProgramlistingco2().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO2:
				getScreenco2().clear();
				getScreenco2().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING2:
				getProgramlisting2().clear();
				getProgramlisting2().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS2:
				getSynopsis2().clear();
				getSynopsis2().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD2:
				getBridgehead2().clear();
				getBridgehead2().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REMARK2:
				getRemark2().clear();
				getRemark2().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY2:
				getRevhistory2().clear();
				getRevhistory2().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM2:
				getIndexterm2().clear();
				getIndexterm2().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS2:
				getFuncsynopsis2().clear();
				getFuncsynopsis2().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS2:
				getClasssynopsis2().clear();
				getClasssynopsis2().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS2:
				getMethodsynopsis2().clear();
				getMethodsynopsis2().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS2:
				getConstructorsynopsis2().clear();
				getConstructorsynopsis2().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS2:
				getDestructorsynopsis2().clear();
				getDestructorsynopsis2().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS2:
				getFieldsynopsis2().clear();
				getFieldsynopsis2().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS2:
				getCmdsynopsis2().clear();
				getCmdsynopsis2().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__CAUTION2:
				getCaution2().clear();
				getCaution2().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT2:
				getImportant2().clear();
				getImportant2().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__NOTE2:
				getNote2().clear();
				getNote2().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TIP2:
				getTip2().clear();
				getTip2().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__WARNING2:
				getWarning2().clear();
				getWarning2().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR2:
				getAnchor2().clear();
				getAnchor2().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__PARA2:
				getPara2().clear();
				getPara2().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA2:
				getFormalpara2().clear();
				getFormalpara2().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA2:
				getSimpara2().clear();
				getSimpara2().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION2:
				getAnnotation2().clear();
				getAnnotation2().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.STEP_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.STEP_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.STEP_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.STEP_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.STEP_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.STEP_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.STEP_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.STEP_TYPE__PERFORMANCE:
				setPerformance((PerformanceType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.STEP_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.STEP_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.STEP_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.STEP_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.STEP_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.STEP_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.STEP_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.STEP_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.STEP_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.STEP_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.STEP_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.STEP_TYPE__XREFLABEL:
				setXreflabel(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocbookPackage.STEP_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.STEP_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.STEP_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.STEP_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE:
				getProcedure().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST:
				getSimplelist().clear();
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST:
				getVariablelist().clear();
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST:
				getGlosslist().clear();
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				return;
			case DocbookPackage.STEP_TYPE__QANDASET:
				getQandaset().clear();
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE:
				getExample().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIGURE:
				getFigure().clear();
				return;
			case DocbookPackage.STEP_TYPE__TABLE:
				getTable().clear();
				return;
			case DocbookPackage.STEP_TYPE__EQUATION:
				getEquation().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR:
				getSidebar().clear();
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH:
				getEpigraph().clear();
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT:
				getScreenshot().clear();
				return;
			case DocbookPackage.STEP_TYPE__TASK:
				getTask().clear();
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				return;
			case DocbookPackage.STEP_TYPE__MSGSET:
				getMsgset().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREEN:
				getScreen().clear();
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO:
				getScreenco().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS:
				getSynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				return;
			case DocbookPackage.STEP_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				return;
			case DocbookPackage.STEP_TYPE__CAUTION:
				getCaution().clear();
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT:
				getImportant().clear();
				return;
			case DocbookPackage.STEP_TYPE__NOTE:
				getNote().clear();
				return;
			case DocbookPackage.STEP_TYPE__TIP:
				getTip().clear();
				return;
			case DocbookPackage.STEP_TYPE__WARNING:
				getWarning().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.STEP_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA:
				getFormalpara().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA:
				getSimpara().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.STEP_TYPE__SUBSTEPS:
				setSubsteps((SubstepsType)null);
				return;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES:
				setStepalternatives((StepalternativesType)null);
				return;
			case DocbookPackage.STEP_TYPE__GROUP2:
				getGroup2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST1:
				getItemizedlist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST1:
				getOrderedlist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE1:
				getProcedure1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST1:
				getSimplelist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST1:
				getVariablelist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST1:
				getSegmentedlist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST1:
				getGlosslist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST1:
				getBibliolist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST1:
				getCalloutlist1().clear();
				return;
			case DocbookPackage.STEP_TYPE__QANDASET1:
				getQandaset1().clear();
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE1:
				getExample1().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIGURE1:
				getFigure1().clear();
				return;
			case DocbookPackage.STEP_TYPE__TABLE1:
				getTable1().clear();
				return;
			case DocbookPackage.STEP_TYPE__EQUATION1:
				getEquation1().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE1:
				getInformalexample1().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE1:
				getInformalfigure1().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE1:
				getInformaltable1().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION1:
				getInformalequation1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR1:
				getSidebar1().clear();
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE1:
				getBlockquote1().clear();
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS1:
				getAddress1().clear();
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH1:
				getEpigraph1().clear();
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT1:
				getMediaobject1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT1:
				getScreenshot1().clear();
				return;
			case DocbookPackage.STEP_TYPE__TASK1:
				getTask1().clear();
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET1:
				getProductionset1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF1:
				getConstraintdef1().clear();
				return;
			case DocbookPackage.STEP_TYPE__MSGSET1:
				getMsgset1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREEN1:
				getScreen1().clear();
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT1:
				getLiterallayout1().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO1:
				getProgramlistingco1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO1:
				getScreenco1().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING1:
				getProgramlisting1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS1:
				getSynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD1:
				getBridgehead1().clear();
				return;
			case DocbookPackage.STEP_TYPE__REMARK1:
				getRemark1().clear();
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY1:
				getRevhistory1().clear();
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM1:
				getIndexterm1().clear();
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS1:
				getFuncsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS1:
				getClasssynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS1:
				getMethodsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS1:
				getConstructorsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS1:
				getDestructorsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS1:
				getFieldsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS1:
				getCmdsynopsis1().clear();
				return;
			case DocbookPackage.STEP_TYPE__CAUTION1:
				getCaution1().clear();
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT1:
				getImportant1().clear();
				return;
			case DocbookPackage.STEP_TYPE__NOTE1:
				getNote1().clear();
				return;
			case DocbookPackage.STEP_TYPE__TIP1:
				getTip1().clear();
				return;
			case DocbookPackage.STEP_TYPE__WARNING1:
				getWarning1().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR1:
				getAnchor1().clear();
				return;
			case DocbookPackage.STEP_TYPE__PARA1:
				getPara1().clear();
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA1:
				getFormalpara1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA1:
				getSimpara1().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION1:
				getAnnotation1().clear();
				return;
			case DocbookPackage.STEP_TYPE__SUBSTEPS1:
				setSubsteps1((SubstepsType)null);
				return;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES1:
				setStepalternatives1((StepalternativesType)null);
				return;
			case DocbookPackage.STEP_TYPE__GROUP3:
				getGroup3().clear();
				return;
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST2:
				getItemizedlist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ORDEREDLIST2:
				getOrderedlist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROCEDURE2:
				getProcedure2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPLELIST2:
				getSimplelist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__VARIABLELIST2:
				getVariablelist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST2:
				getSegmentedlist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__GLOSSLIST2:
				getGlosslist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__BIBLIOLIST2:
				getBibliolist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CALLOUTLIST2:
				getCalloutlist2().clear();
				return;
			case DocbookPackage.STEP_TYPE__QANDASET2:
				getQandaset2().clear();
				return;
			case DocbookPackage.STEP_TYPE__EXAMPLE2:
				getExample2().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIGURE2:
				getFigure2().clear();
				return;
			case DocbookPackage.STEP_TYPE__TABLE2:
				getTable2().clear();
				return;
			case DocbookPackage.STEP_TYPE__EQUATION2:
				getEquation2().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE2:
				getInformalexample2().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE2:
				getInformalfigure2().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALTABLE2:
				getInformaltable2().clear();
				return;
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION2:
				getInformalequation2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIDEBAR2:
				getSidebar2().clear();
				return;
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE2:
				getBlockquote2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ADDRESS2:
				getAddress2().clear();
				return;
			case DocbookPackage.STEP_TYPE__EPIGRAPH2:
				getEpigraph2().clear();
				return;
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT2:
				getMediaobject2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENSHOT2:
				getScreenshot2().clear();
				return;
			case DocbookPackage.STEP_TYPE__TASK2:
				getTask2().clear();
				return;
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET2:
				getProductionset2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF2:
				getConstraintdef2().clear();
				return;
			case DocbookPackage.STEP_TYPE__MSGSET2:
				getMsgset2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREEN2:
				getScreen2().clear();
				return;
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT2:
				getLiterallayout2().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO2:
				getProgramlistingco2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SCREENCO2:
				getScreenco2().clear();
				return;
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING2:
				getProgramlisting2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SYNOPSIS2:
				getSynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD2:
				getBridgehead2().clear();
				return;
			case DocbookPackage.STEP_TYPE__REMARK2:
				getRemark2().clear();
				return;
			case DocbookPackage.STEP_TYPE__REVHISTORY2:
				getRevhistory2().clear();
				return;
			case DocbookPackage.STEP_TYPE__INDEXTERM2:
				getIndexterm2().clear();
				return;
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS2:
				getFuncsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS2:
				getClasssynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS2:
				getMethodsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS2:
				getConstructorsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS2:
				getDestructorsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS2:
				getFieldsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS2:
				getCmdsynopsis2().clear();
				return;
			case DocbookPackage.STEP_TYPE__CAUTION2:
				getCaution2().clear();
				return;
			case DocbookPackage.STEP_TYPE__IMPORTANT2:
				getImportant2().clear();
				return;
			case DocbookPackage.STEP_TYPE__NOTE2:
				getNote2().clear();
				return;
			case DocbookPackage.STEP_TYPE__TIP2:
				getTip2().clear();
				return;
			case DocbookPackage.STEP_TYPE__WARNING2:
				getWarning2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANCHOR2:
				getAnchor2().clear();
				return;
			case DocbookPackage.STEP_TYPE__PARA2:
				getPara2().clear();
				return;
			case DocbookPackage.STEP_TYPE__FORMALPARA2:
				getFormalpara2().clear();
				return;
			case DocbookPackage.STEP_TYPE__SIMPARA2:
				getSimpara2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATION2:
				getAnnotation2().clear();
				return;
			case DocbookPackage.STEP_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.STEP_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.STEP_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__PERFORMANCE:
				unsetPerformance();
				return;
			case DocbookPackage.STEP_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.STEP_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.STEP_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.STEP_TYPE__XREFLABEL:
				setXreflabel(XREFLABEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocbookPackage.STEP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.STEP_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.STEP_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.STEP_TYPE__INFO:
				return info != null;
			case DocbookPackage.STEP_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST:
				return !getItemizedlist().isEmpty();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
			case DocbookPackage.STEP_TYPE__PROCEDURE:
				return !getProcedure().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPLELIST:
				return !getSimplelist().isEmpty();
			case DocbookPackage.STEP_TYPE__VARIABLELIST:
				return !getVariablelist().isEmpty();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST:
				return !getSegmentedlist().isEmpty();
			case DocbookPackage.STEP_TYPE__GLOSSLIST:
				return !getGlosslist().isEmpty();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST:
				return !getBibliolist().isEmpty();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST:
				return !getCalloutlist().isEmpty();
			case DocbookPackage.STEP_TYPE__QANDASET:
				return !getQandaset().isEmpty();
			case DocbookPackage.STEP_TYPE__EXAMPLE:
				return !getExample().isEmpty();
			case DocbookPackage.STEP_TYPE__FIGURE:
				return !getFigure().isEmpty();
			case DocbookPackage.STEP_TYPE__TABLE:
				return !getTable().isEmpty();
			case DocbookPackage.STEP_TYPE__EQUATION:
				return !getEquation().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE:
				return !getInformalexample().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE:
				return !getInformalfigure().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE:
				return !getInformaltable().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION:
				return !getInformalequation().isEmpty();
			case DocbookPackage.STEP_TYPE__SIDEBAR:
				return !getSidebar().isEmpty();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case DocbookPackage.STEP_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.STEP_TYPE__EPIGRAPH:
				return !getEpigraph().isEmpty();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENSHOT:
				return !getScreenshot().isEmpty();
			case DocbookPackage.STEP_TYPE__TASK:
				return !getTask().isEmpty();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET:
				return !getProductionset().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF:
				return !getConstraintdef().isEmpty();
			case DocbookPackage.STEP_TYPE__MSGSET:
				return !getMsgset().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREEN:
				return !getScreen().isEmpty();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT:
				return !getLiterallayout().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO:
				return !getProgramlistingco().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENCO:
				return !getScreenco().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING:
				return !getProgramlisting().isEmpty();
			case DocbookPackage.STEP_TYPE__SYNOPSIS:
				return !getSynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD:
				return !getBridgehead().isEmpty();
			case DocbookPackage.STEP_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.STEP_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.STEP_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS:
				return !getFuncsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS:
				return !getClasssynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS:
				return !getMethodsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS:
				return !getConstructorsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS:
				return !getDestructorsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS:
				return !getFieldsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS:
				return !getCmdsynopsis().isEmpty();
			case DocbookPackage.STEP_TYPE__CAUTION:
				return !getCaution().isEmpty();
			case DocbookPackage.STEP_TYPE__IMPORTANT:
				return !getImportant().isEmpty();
			case DocbookPackage.STEP_TYPE__NOTE:
				return !getNote().isEmpty();
			case DocbookPackage.STEP_TYPE__TIP:
				return !getTip().isEmpty();
			case DocbookPackage.STEP_TYPE__WARNING:
				return !getWarning().isEmpty();
			case DocbookPackage.STEP_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.STEP_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.STEP_TYPE__FORMALPARA:
				return !getFormalpara().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPARA:
				return !getSimpara().isEmpty();
			case DocbookPackage.STEP_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.STEP_TYPE__SUBSTEPS:
				return substeps != null;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES:
				return stepalternatives != null;
			case DocbookPackage.STEP_TYPE__GROUP2:
				return group2 != null && !group2.isEmpty();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST1:
				return !getItemizedlist1().isEmpty();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST1:
				return !getOrderedlist1().isEmpty();
			case DocbookPackage.STEP_TYPE__PROCEDURE1:
				return !getProcedure1().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPLELIST1:
				return !getSimplelist1().isEmpty();
			case DocbookPackage.STEP_TYPE__VARIABLELIST1:
				return !getVariablelist1().isEmpty();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST1:
				return !getSegmentedlist1().isEmpty();
			case DocbookPackage.STEP_TYPE__GLOSSLIST1:
				return !getGlosslist1().isEmpty();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST1:
				return !getBibliolist1().isEmpty();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST1:
				return !getCalloutlist1().isEmpty();
			case DocbookPackage.STEP_TYPE__QANDASET1:
				return !getQandaset1().isEmpty();
			case DocbookPackage.STEP_TYPE__EXAMPLE1:
				return !getExample1().isEmpty();
			case DocbookPackage.STEP_TYPE__FIGURE1:
				return !getFigure1().isEmpty();
			case DocbookPackage.STEP_TYPE__TABLE1:
				return !getTable1().isEmpty();
			case DocbookPackage.STEP_TYPE__EQUATION1:
				return !getEquation1().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE1:
				return !getInformalexample1().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE1:
				return !getInformalfigure1().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE1:
				return !getInformaltable1().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION1:
				return !getInformalequation1().isEmpty();
			case DocbookPackage.STEP_TYPE__SIDEBAR1:
				return !getSidebar1().isEmpty();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE1:
				return !getBlockquote1().isEmpty();
			case DocbookPackage.STEP_TYPE__ADDRESS1:
				return !getAddress1().isEmpty();
			case DocbookPackage.STEP_TYPE__EPIGRAPH1:
				return !getEpigraph1().isEmpty();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT1:
				return !getMediaobject1().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENSHOT1:
				return !getScreenshot1().isEmpty();
			case DocbookPackage.STEP_TYPE__TASK1:
				return !getTask1().isEmpty();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET1:
				return !getProductionset1().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF1:
				return !getConstraintdef1().isEmpty();
			case DocbookPackage.STEP_TYPE__MSGSET1:
				return !getMsgset1().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREEN1:
				return !getScreen1().isEmpty();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT1:
				return !getLiterallayout1().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO1:
				return !getProgramlistingco1().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENCO1:
				return !getScreenco1().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING1:
				return !getProgramlisting1().isEmpty();
			case DocbookPackage.STEP_TYPE__SYNOPSIS1:
				return !getSynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD1:
				return !getBridgehead1().isEmpty();
			case DocbookPackage.STEP_TYPE__REMARK1:
				return !getRemark1().isEmpty();
			case DocbookPackage.STEP_TYPE__REVHISTORY1:
				return !getRevhistory1().isEmpty();
			case DocbookPackage.STEP_TYPE__INDEXTERM1:
				return !getIndexterm1().isEmpty();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS1:
				return !getFuncsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS1:
				return !getClasssynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS1:
				return !getMethodsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS1:
				return !getConstructorsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS1:
				return !getDestructorsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS1:
				return !getFieldsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS1:
				return !getCmdsynopsis1().isEmpty();
			case DocbookPackage.STEP_TYPE__CAUTION1:
				return !getCaution1().isEmpty();
			case DocbookPackage.STEP_TYPE__IMPORTANT1:
				return !getImportant1().isEmpty();
			case DocbookPackage.STEP_TYPE__NOTE1:
				return !getNote1().isEmpty();
			case DocbookPackage.STEP_TYPE__TIP1:
				return !getTip1().isEmpty();
			case DocbookPackage.STEP_TYPE__WARNING1:
				return !getWarning1().isEmpty();
			case DocbookPackage.STEP_TYPE__ANCHOR1:
				return !getAnchor1().isEmpty();
			case DocbookPackage.STEP_TYPE__PARA1:
				return !getPara1().isEmpty();
			case DocbookPackage.STEP_TYPE__FORMALPARA1:
				return !getFormalpara1().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPARA1:
				return !getSimpara1().isEmpty();
			case DocbookPackage.STEP_TYPE__ANNOTATION1:
				return !getAnnotation1().isEmpty();
			case DocbookPackage.STEP_TYPE__SUBSTEPS1:
				return substeps1 != null;
			case DocbookPackage.STEP_TYPE__STEPALTERNATIVES1:
				return stepalternatives1 != null;
			case DocbookPackage.STEP_TYPE__GROUP3:
				return group3 != null && !group3.isEmpty();
			case DocbookPackage.STEP_TYPE__ITEMIZEDLIST2:
				return !getItemizedlist2().isEmpty();
			case DocbookPackage.STEP_TYPE__ORDEREDLIST2:
				return !getOrderedlist2().isEmpty();
			case DocbookPackage.STEP_TYPE__PROCEDURE2:
				return !getProcedure2().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPLELIST2:
				return !getSimplelist2().isEmpty();
			case DocbookPackage.STEP_TYPE__VARIABLELIST2:
				return !getVariablelist2().isEmpty();
			case DocbookPackage.STEP_TYPE__SEGMENTEDLIST2:
				return !getSegmentedlist2().isEmpty();
			case DocbookPackage.STEP_TYPE__GLOSSLIST2:
				return !getGlosslist2().isEmpty();
			case DocbookPackage.STEP_TYPE__BIBLIOLIST2:
				return !getBibliolist2().isEmpty();
			case DocbookPackage.STEP_TYPE__CALLOUTLIST2:
				return !getCalloutlist2().isEmpty();
			case DocbookPackage.STEP_TYPE__QANDASET2:
				return !getQandaset2().isEmpty();
			case DocbookPackage.STEP_TYPE__EXAMPLE2:
				return !getExample2().isEmpty();
			case DocbookPackage.STEP_TYPE__FIGURE2:
				return !getFigure2().isEmpty();
			case DocbookPackage.STEP_TYPE__TABLE2:
				return !getTable2().isEmpty();
			case DocbookPackage.STEP_TYPE__EQUATION2:
				return !getEquation2().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEXAMPLE2:
				return !getInformalexample2().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALFIGURE2:
				return !getInformalfigure2().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALTABLE2:
				return !getInformaltable2().isEmpty();
			case DocbookPackage.STEP_TYPE__INFORMALEQUATION2:
				return !getInformalequation2().isEmpty();
			case DocbookPackage.STEP_TYPE__SIDEBAR2:
				return !getSidebar2().isEmpty();
			case DocbookPackage.STEP_TYPE__BLOCKQUOTE2:
				return !getBlockquote2().isEmpty();
			case DocbookPackage.STEP_TYPE__ADDRESS2:
				return !getAddress2().isEmpty();
			case DocbookPackage.STEP_TYPE__EPIGRAPH2:
				return !getEpigraph2().isEmpty();
			case DocbookPackage.STEP_TYPE__MEDIAOBJECT2:
				return !getMediaobject2().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENSHOT2:
				return !getScreenshot2().isEmpty();
			case DocbookPackage.STEP_TYPE__TASK2:
				return !getTask2().isEmpty();
			case DocbookPackage.STEP_TYPE__PRODUCTIONSET2:
				return !getProductionset2().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRAINTDEF2:
				return !getConstraintdef2().isEmpty();
			case DocbookPackage.STEP_TYPE__MSGSET2:
				return !getMsgset2().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREEN2:
				return !getScreen2().isEmpty();
			case DocbookPackage.STEP_TYPE__LITERALLAYOUT2:
				return !getLiterallayout2().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTINGCO2:
				return !getProgramlistingco2().isEmpty();
			case DocbookPackage.STEP_TYPE__SCREENCO2:
				return !getScreenco2().isEmpty();
			case DocbookPackage.STEP_TYPE__PROGRAMLISTING2:
				return !getProgramlisting2().isEmpty();
			case DocbookPackage.STEP_TYPE__SYNOPSIS2:
				return !getSynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__BRIDGEHEAD2:
				return !getBridgehead2().isEmpty();
			case DocbookPackage.STEP_TYPE__REMARK2:
				return !getRemark2().isEmpty();
			case DocbookPackage.STEP_TYPE__REVHISTORY2:
				return !getRevhistory2().isEmpty();
			case DocbookPackage.STEP_TYPE__INDEXTERM2:
				return !getIndexterm2().isEmpty();
			case DocbookPackage.STEP_TYPE__FUNCSYNOPSIS2:
				return !getFuncsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__CLASSSYNOPSIS2:
				return !getClasssynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__METHODSYNOPSIS2:
				return !getMethodsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__CONSTRUCTORSYNOPSIS2:
				return !getConstructorsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__DESTRUCTORSYNOPSIS2:
				return !getDestructorsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__FIELDSYNOPSIS2:
				return !getFieldsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__CMDSYNOPSIS2:
				return !getCmdsynopsis2().isEmpty();
			case DocbookPackage.STEP_TYPE__CAUTION2:
				return !getCaution2().isEmpty();
			case DocbookPackage.STEP_TYPE__IMPORTANT2:
				return !getImportant2().isEmpty();
			case DocbookPackage.STEP_TYPE__NOTE2:
				return !getNote2().isEmpty();
			case DocbookPackage.STEP_TYPE__TIP2:
				return !getTip2().isEmpty();
			case DocbookPackage.STEP_TYPE__WARNING2:
				return !getWarning2().isEmpty();
			case DocbookPackage.STEP_TYPE__ANCHOR2:
				return !getAnchor2().isEmpty();
			case DocbookPackage.STEP_TYPE__PARA2:
				return !getPara2().isEmpty();
			case DocbookPackage.STEP_TYPE__FORMALPARA2:
				return !getFormalpara2().isEmpty();
			case DocbookPackage.STEP_TYPE__SIMPARA2:
				return !getSimpara2().isEmpty();
			case DocbookPackage.STEP_TYPE__ANNOTATION2:
				return !getAnnotation2().isEmpty();
			case DocbookPackage.STEP_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.STEP_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.STEP_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.STEP_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.STEP_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.STEP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.STEP_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.STEP_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.STEP_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.STEP_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.STEP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.STEP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.STEP_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.STEP_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.STEP_TYPE__PERFORMANCE:
				return isSetPerformance();
			case DocbookPackage.STEP_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.STEP_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.STEP_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.STEP_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.STEP_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.STEP_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.STEP_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.STEP_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.STEP_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.STEP_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.STEP_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.STEP_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.STEP_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.STEP_TYPE__XREFLABEL:
				return XREFLABEL_EDEFAULT == null ? xreflabel != null : !XREFLABEL_EDEFAULT.equals(xreflabel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", group2: ");
		result.append(group2);
		result.append(", group3: ");
		result.append(group3);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", arch: ");
		result.append(arch);
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", audience: ");
		result.append(audience);
		result.append(", base: ");
		result.append(base);
		result.append(", condition: ");
		result.append(condition);
		result.append(", conformance: ");
		result.append(conformance);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", linkend: ");
		result.append(linkend);
		result.append(", os: ");
		result.append(os);
		result.append(", performance: ");
		if (performanceESet) result.append(performance); else result.append("<unset>");
		result.append(", remap: ");
		result.append(remap);
		result.append(", revision: ");
		result.append(revision);
		result.append(", revisionflag: ");
		if (revisionflagESet) result.append(revisionflag); else result.append("<unset>");
		result.append(", role: ");
		result.append(role);
		result.append(", role1: ");
		result.append(role1);
		result.append(", security: ");
		result.append(security);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title1: ");
		result.append(title1);
		result.append(", type: ");
		result.append(type);
		result.append(", userlevel: ");
		result.append(userlevel);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", wordsize: ");
		result.append(wordsize);
		result.append(", xreflabel: ");
		result.append(xreflabel);
		result.append(')');
		return result.toString();
	}

} //StepTypeImpl
