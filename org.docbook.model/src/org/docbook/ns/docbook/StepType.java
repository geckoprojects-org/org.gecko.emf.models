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
package org.docbook.ns.docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSubsteps <em>Substeps</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getStepalternatives <em>Stepalternatives</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getItemizedlist1 <em>Itemizedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getOrderedlist1 <em>Orderedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProcedure1 <em>Procedure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimplelist1 <em>Simplelist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getVariablelist1 <em>Variablelist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSegmentedlist1 <em>Segmentedlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGlosslist1 <em>Glosslist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBibliolist1 <em>Bibliolist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCalloutlist1 <em>Calloutlist1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getQandaset1 <em>Qandaset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getExample1 <em>Example1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFigure1 <em>Figure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTable1 <em>Table1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEquation1 <em>Equation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalexample1 <em>Informalexample1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalfigure1 <em>Informalfigure1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformaltable1 <em>Informaltable1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalequation1 <em>Informalequation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSidebar1 <em>Sidebar1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBlockquote1 <em>Blockquote1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEpigraph1 <em>Epigraph1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMediaobject1 <em>Mediaobject1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenshot1 <em>Screenshot1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTask1 <em>Task1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProductionset1 <em>Productionset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstraintdef1 <em>Constraintdef1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMsgset1 <em>Msgset1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreen1 <em>Screen1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getLiterallayout1 <em>Literallayout1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlistingco1 <em>Programlistingco1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenco1 <em>Screenco1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlisting1 <em>Programlisting1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSynopsis1 <em>Synopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBridgehead1 <em>Bridgehead1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRemark1 <em>Remark1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRevhistory1 <em>Revhistory1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getIndexterm1 <em>Indexterm1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFuncsynopsis1 <em>Funcsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getClasssynopsis1 <em>Classsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMethodsynopsis1 <em>Methodsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstructorsynopsis1 <em>Constructorsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getDestructorsynopsis1 <em>Destructorsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFieldsynopsis1 <em>Fieldsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCmdsynopsis1 <em>Cmdsynopsis1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCaution1 <em>Caution1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getImportant1 <em>Important1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getNote1 <em>Note1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTip1 <em>Tip1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getWarning1 <em>Warning1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnchor1 <em>Anchor1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getPara1 <em>Para1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFormalpara1 <em>Formalpara1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimpara1 <em>Simpara1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSubsteps1 <em>Substeps1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getStepalternatives1 <em>Stepalternatives1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getItemizedlist2 <em>Itemizedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getOrderedlist2 <em>Orderedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProcedure2 <em>Procedure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimplelist2 <em>Simplelist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getVariablelist2 <em>Variablelist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSegmentedlist2 <em>Segmentedlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getGlosslist2 <em>Glosslist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBibliolist2 <em>Bibliolist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCalloutlist2 <em>Calloutlist2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getQandaset2 <em>Qandaset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getExample2 <em>Example2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFigure2 <em>Figure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTable2 <em>Table2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEquation2 <em>Equation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalexample2 <em>Informalexample2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalfigure2 <em>Informalfigure2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformaltable2 <em>Informaltable2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getInformalequation2 <em>Informalequation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSidebar2 <em>Sidebar2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBlockquote2 <em>Blockquote2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getEpigraph2 <em>Epigraph2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMediaobject2 <em>Mediaobject2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenshot2 <em>Screenshot2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTask2 <em>Task2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProductionset2 <em>Productionset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstraintdef2 <em>Constraintdef2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMsgset2 <em>Msgset2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreen2 <em>Screen2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getLiterallayout2 <em>Literallayout2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlistingco2 <em>Programlistingco2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getScreenco2 <em>Screenco2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getProgramlisting2 <em>Programlisting2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSynopsis2 <em>Synopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBridgehead2 <em>Bridgehead2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRemark2 <em>Remark2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRevhistory2 <em>Revhistory2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getIndexterm2 <em>Indexterm2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFuncsynopsis2 <em>Funcsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getClasssynopsis2 <em>Classsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getMethodsynopsis2 <em>Methodsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConstructorsynopsis2 <em>Constructorsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getDestructorsynopsis2 <em>Destructorsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFieldsynopsis2 <em>Fieldsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCmdsynopsis2 <em>Cmdsynopsis2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCaution2 <em>Caution2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getImportant2 <em>Important2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getNote2 <em>Note2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTip2 <em>Tip2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getWarning2 <em>Warning2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnchor2 <em>Anchor2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getPara2 <em>Para2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getFormalpara2 <em>Formalpara2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSimpara2 <em>Simpara2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnnotation2 <em>Annotation2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.StepType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getStepType()
 * @model extendedMetaData="name='step_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Titleabbrev</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TitleabbrevType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titleabbrev</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Titleabbrev()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='titleabbrev' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleabbrevType> getTitleabbrev();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(InfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItemizedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Itemizedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ItemizedlistType> getItemizedlist();

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Orderedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Procedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ProcedureType> getProcedure();

	/**
	 * Returns the value of the '<em><b>Simplelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simplelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<SimplelistType> getSimplelist();

	/**
	 * Returns the value of the '<em><b>Variablelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VariablelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Variablelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<VariablelistType> getVariablelist();

	/**
	 * Returns the value of the '<em><b>Segmentedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SegmentedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Segmentedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<SegmentedlistType> getSegmentedlist();

	/**
	 * Returns the value of the '<em><b>Glosslist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosslistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Glosslist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<GlosslistType> getGlosslist();

	/**
	 * Returns the value of the '<em><b>Bibliolist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliolistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bibliolist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<BibliolistType> getBibliolist();

	/**
	 * Returns the value of the '<em><b>Calloutlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CalloutlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Calloutlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<CalloutlistType> getCalloutlist();

	/**
	 * Returns the value of the '<em><b>Qandaset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QandasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Qandaset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<QandasetType> getQandaset();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Example()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ExampleType> getExample();

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Figure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<FigureType> getFigure();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EquationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Equation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<EquationType> getEquation();

	/**
	 * Returns the value of the '<em><b>Informalexample</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalexampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalexample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<InformalexampleType> getInformalexample();

	/**
	 * Returns the value of the '<em><b>Informalfigure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalfigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalfigure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<InformalfigureType> getInformalfigure();

	/**
	 * Returns the value of the '<em><b>Informaltable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformaltableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informaltable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<InformaltableType> getInformaltable();

	/**
	 * Returns the value of the '<em><b>Informalequation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalequation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<InformalequationType> getInformalequation();

	/**
	 * Returns the value of the '<em><b>Sidebar</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SidebarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Sidebar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<SidebarType> getSidebar();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Epigraph</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EpigraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Epigraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<EpigraphType> getEpigraph();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Mediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject();

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenshotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenshot()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ScreenshotType> getScreenshot();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Task()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<TaskType> getTask();

	/**
	 * Returns the value of the '<em><b>Productionset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductionsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Productionset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ProductionsetType> getProductionset();

	/**
	 * Returns the value of the '<em><b>Constraintdef</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstraintdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constraintdef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ConstraintdefType> getConstraintdef();

	/**
	 * Returns the value of the '<em><b>Msgset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MsgsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Msgset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<MsgsetType> getMsgset();

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screen()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ScreenType> getScreen();

	/**
	 * Returns the value of the '<em><b>Literallayout</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiterallayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Literallayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<LiterallayoutType> getLiterallayout();

	/**
	 * Returns the value of the '<em><b>Programlistingco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingcoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlistingco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ProgramlistingcoType> getProgramlistingco();

	/**
	 * Returns the value of the '<em><b>Screenco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreencoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ScreencoType> getScreenco();

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlisting()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting();

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Synopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<SynopsisType> getSynopsis();

	/**
	 * Returns the value of the '<em><b>Bridgehead</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BridgeheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bridgehead()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<BridgeheadType> getBridgehead();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Remark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<RemarkType> getRemark();

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Revhistory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory();

	/**
	 * Returns the value of the '<em><b>Indexterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Indexterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Funcsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis();

	/**
	 * Returns the value of the '<em><b>Classsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClasssynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Classsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ClasssynopsisType> getClasssynopsis();

	/**
	 * Returns the value of the '<em><b>Methodsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Methodsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<MethodsynopsisType> getMethodsynopsis();

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ConstructorsynopsisType> getConstructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DestructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Destructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<DestructorsynopsisType> getDestructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FieldsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Fieldsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<FieldsynopsisType> getFieldsynopsis();

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Cmdsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis();

	/**
	 * Returns the value of the '<em><b>Caution</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CautionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Caution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<CautionType> getCaution();

	/**
	 * Returns the value of the '<em><b>Important</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ImportantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Important()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ImportantType> getImportant();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<NoteType> getNote();

	/**
	 * Returns the value of the '<em><b>Tip</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Tip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<TipType> getTip();

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WarningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Warning()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<WarningType> getWarning();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Anchor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<AnchorType> getAnchor();

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Para()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Formalpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FormalparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Formalpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<FormalparaType> getFormalpara();

	/**
	 * Returns the value of the '<em><b>Simpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<SimparaType> getSimpara();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Substeps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substeps</em>' containment reference.
	 * @see #setSubsteps(SubstepsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Substeps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substeps' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstepsType getSubsteps();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getSubsteps <em>Substeps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substeps</em>' containment reference.
	 * @see #getSubsteps()
	 * @generated
	 */
	void setSubsteps(SubstepsType value);

	/**
	 * Returns the value of the '<em><b>Stepalternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stepalternatives</em>' containment reference.
	 * @see #setStepalternatives(StepalternativesType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Stepalternatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stepalternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	StepalternativesType getStepalternatives();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getStepalternatives <em>Stepalternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stepalternatives</em>' containment reference.
	 * @see #getStepalternatives()
	 * @generated
	 */
	void setStepalternatives(StepalternativesType value);

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Group2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:62'"
	 * @generated
	 */
	FeatureMap getGroup2();

	/**
	 * Returns the value of the '<em><b>Itemizedlist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItemizedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Itemizedlist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ItemizedlistType> getItemizedlist1();

	/**
	 * Returns the value of the '<em><b>Orderedlist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Orderedlist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist1();

	/**
	 * Returns the value of the '<em><b>Procedure1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Procedure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ProcedureType> getProcedure1();

	/**
	 * Returns the value of the '<em><b>Simplelist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simplelist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<SimplelistType> getSimplelist1();

	/**
	 * Returns the value of the '<em><b>Variablelist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VariablelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Variablelist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<VariablelistType> getVariablelist1();

	/**
	 * Returns the value of the '<em><b>Segmentedlist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SegmentedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Segmentedlist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<SegmentedlistType> getSegmentedlist1();

	/**
	 * Returns the value of the '<em><b>Glosslist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosslistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Glosslist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<GlosslistType> getGlosslist1();

	/**
	 * Returns the value of the '<em><b>Bibliolist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliolistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bibliolist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<BibliolistType> getBibliolist1();

	/**
	 * Returns the value of the '<em><b>Calloutlist1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CalloutlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Calloutlist1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<CalloutlistType> getCalloutlist1();

	/**
	 * Returns the value of the '<em><b>Qandaset1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QandasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Qandaset1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<QandasetType> getQandaset1();

	/**
	 * Returns the value of the '<em><b>Example1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Example1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ExampleType> getExample1();

	/**
	 * Returns the value of the '<em><b>Figure1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Figure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<FigureType> getFigure1();

	/**
	 * Returns the value of the '<em><b>Table1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Table1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<TableType> getTable1();

	/**
	 * Returns the value of the '<em><b>Equation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EquationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Equation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<EquationType> getEquation1();

	/**
	 * Returns the value of the '<em><b>Informalexample1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalexampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalexample1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<InformalexampleType> getInformalexample1();

	/**
	 * Returns the value of the '<em><b>Informalfigure1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalfigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalfigure1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<InformalfigureType> getInformalfigure1();

	/**
	 * Returns the value of the '<em><b>Informaltable1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformaltableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informaltable1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<InformaltableType> getInformaltable1();

	/**
	 * Returns the value of the '<em><b>Informalequation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalequation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<InformalequationType> getInformalequation1();

	/**
	 * Returns the value of the '<em><b>Sidebar1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SidebarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Sidebar1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<SidebarType> getSidebar1();

	/**
	 * Returns the value of the '<em><b>Blockquote1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Blockquote1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote1();

	/**
	 * Returns the value of the '<em><b>Address1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Address1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<AddressType> getAddress1();

	/**
	 * Returns the value of the '<em><b>Epigraph1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EpigraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Epigraph1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<EpigraphType> getEpigraph1();

	/**
	 * Returns the value of the '<em><b>Mediaobject1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Mediaobject1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject1();

	/**
	 * Returns the value of the '<em><b>Screenshot1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenshotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenshot1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ScreenshotType> getScreenshot1();

	/**
	 * Returns the value of the '<em><b>Task1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Task1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<TaskType> getTask1();

	/**
	 * Returns the value of the '<em><b>Productionset1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductionsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Productionset1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ProductionsetType> getProductionset1();

	/**
	 * Returns the value of the '<em><b>Constraintdef1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstraintdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constraintdef1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ConstraintdefType> getConstraintdef1();

	/**
	 * Returns the value of the '<em><b>Msgset1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MsgsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Msgset1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<MsgsetType> getMsgset1();

	/**
	 * Returns the value of the '<em><b>Screen1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screen1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ScreenType> getScreen1();

	/**
	 * Returns the value of the '<em><b>Literallayout1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiterallayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Literallayout1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<LiterallayoutType> getLiterallayout1();

	/**
	 * Returns the value of the '<em><b>Programlistingco1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingcoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlistingco1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ProgramlistingcoType> getProgramlistingco1();

	/**
	 * Returns the value of the '<em><b>Screenco1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreencoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenco1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ScreencoType> getScreenco1();

	/**
	 * Returns the value of the '<em><b>Programlisting1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlisting1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting1();

	/**
	 * Returns the value of the '<em><b>Synopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Synopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<SynopsisType> getSynopsis1();

	/**
	 * Returns the value of the '<em><b>Bridgehead1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BridgeheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bridgehead1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<BridgeheadType> getBridgehead1();

	/**
	 * Returns the value of the '<em><b>Remark1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Remark1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<RemarkType> getRemark1();

	/**
	 * Returns the value of the '<em><b>Revhistory1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Revhistory1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory1();

	/**
	 * Returns the value of the '<em><b>Indexterm1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Indexterm1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm1();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Funcsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis1();

	/**
	 * Returns the value of the '<em><b>Classsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClasssynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Classsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ClasssynopsisType> getClasssynopsis1();

	/**
	 * Returns the value of the '<em><b>Methodsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Methodsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<MethodsynopsisType> getMethodsynopsis1();

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constructorsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ConstructorsynopsisType> getConstructorsynopsis1();

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DestructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Destructorsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<DestructorsynopsisType> getDestructorsynopsis1();

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FieldsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Fieldsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<FieldsynopsisType> getFieldsynopsis1();

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Cmdsynopsis1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis1();

	/**
	 * Returns the value of the '<em><b>Caution1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CautionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Caution1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<CautionType> getCaution1();

	/**
	 * Returns the value of the '<em><b>Important1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ImportantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Important1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ImportantType> getImportant1();

	/**
	 * Returns the value of the '<em><b>Note1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Note1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<NoteType> getNote1();

	/**
	 * Returns the value of the '<em><b>Tip1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Tip1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<TipType> getTip1();

	/**
	 * Returns the value of the '<em><b>Warning1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WarningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Warning1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<WarningType> getWarning1();

	/**
	 * Returns the value of the '<em><b>Anchor1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Anchor1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<AnchorType> getAnchor1();

	/**
	 * Returns the value of the '<em><b>Para1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Para1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<ParaType> getPara1();

	/**
	 * Returns the value of the '<em><b>Formalpara1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FormalparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Formalpara1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<FormalparaType> getFormalpara1();

	/**
	 * Returns the value of the '<em><b>Simpara1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simpara1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<SimparaType> getSimpara1();

	/**
	 * Returns the value of the '<em><b>Annotation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Annotation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:62'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation1();

	/**
	 * Returns the value of the '<em><b>Substeps1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substeps1</em>' containment reference.
	 * @see #setSubsteps1(SubstepsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Substeps1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substeps' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstepsType getSubsteps1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getSubsteps1 <em>Substeps1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substeps1</em>' containment reference.
	 * @see #getSubsteps1()
	 * @generated
	 */
	void setSubsteps1(SubstepsType value);

	/**
	 * Returns the value of the '<em><b>Stepalternatives1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stepalternatives1</em>' containment reference.
	 * @see #setStepalternatives1(StepalternativesType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Stepalternatives1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stepalternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	StepalternativesType getStepalternatives1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getStepalternatives1 <em>Stepalternatives1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stepalternatives1</em>' containment reference.
	 * @see #getStepalternatives1()
	 * @generated
	 */
	void setStepalternatives1(StepalternativesType value);

	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:120'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Itemizedlist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItemizedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Itemizedlist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ItemizedlistType> getItemizedlist2();

	/**
	 * Returns the value of the '<em><b>Orderedlist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Orderedlist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist2();

	/**
	 * Returns the value of the '<em><b>Procedure2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Procedure2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ProcedureType> getProcedure2();

	/**
	 * Returns the value of the '<em><b>Simplelist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simplelist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<SimplelistType> getSimplelist2();

	/**
	 * Returns the value of the '<em><b>Variablelist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VariablelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Variablelist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<VariablelistType> getVariablelist2();

	/**
	 * Returns the value of the '<em><b>Segmentedlist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SegmentedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Segmentedlist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<SegmentedlistType> getSegmentedlist2();

	/**
	 * Returns the value of the '<em><b>Glosslist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosslistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Glosslist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<GlosslistType> getGlosslist2();

	/**
	 * Returns the value of the '<em><b>Bibliolist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliolistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bibliolist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<BibliolistType> getBibliolist2();

	/**
	 * Returns the value of the '<em><b>Calloutlist2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CalloutlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Calloutlist2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<CalloutlistType> getCalloutlist2();

	/**
	 * Returns the value of the '<em><b>Qandaset2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QandasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Qandaset2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<QandasetType> getQandaset2();

	/**
	 * Returns the value of the '<em><b>Example2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Example2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ExampleType> getExample2();

	/**
	 * Returns the value of the '<em><b>Figure2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Figure2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<FigureType> getFigure2();

	/**
	 * Returns the value of the '<em><b>Table2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Table2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<TableType> getTable2();

	/**
	 * Returns the value of the '<em><b>Equation2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EquationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Equation2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<EquationType> getEquation2();

	/**
	 * Returns the value of the '<em><b>Informalexample2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalexampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalexample2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<InformalexampleType> getInformalexample2();

	/**
	 * Returns the value of the '<em><b>Informalfigure2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalfigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalfigure2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<InformalfigureType> getInformalfigure2();

	/**
	 * Returns the value of the '<em><b>Informaltable2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformaltableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informaltable2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<InformaltableType> getInformaltable2();

	/**
	 * Returns the value of the '<em><b>Informalequation2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Informalequation2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<InformalequationType> getInformalequation2();

	/**
	 * Returns the value of the '<em><b>Sidebar2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SidebarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Sidebar2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<SidebarType> getSidebar2();

	/**
	 * Returns the value of the '<em><b>Blockquote2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Blockquote2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote2();

	/**
	 * Returns the value of the '<em><b>Address2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Address2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<AddressType> getAddress2();

	/**
	 * Returns the value of the '<em><b>Epigraph2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EpigraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Epigraph2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<EpigraphType> getEpigraph2();

	/**
	 * Returns the value of the '<em><b>Mediaobject2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Mediaobject2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject2();

	/**
	 * Returns the value of the '<em><b>Screenshot2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenshotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenshot2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ScreenshotType> getScreenshot2();

	/**
	 * Returns the value of the '<em><b>Task2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Task2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<TaskType> getTask2();

	/**
	 * Returns the value of the '<em><b>Productionset2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductionsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Productionset2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ProductionsetType> getProductionset2();

	/**
	 * Returns the value of the '<em><b>Constraintdef2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstraintdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constraintdef2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ConstraintdefType> getConstraintdef2();

	/**
	 * Returns the value of the '<em><b>Msgset2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MsgsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Msgset2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<MsgsetType> getMsgset2();

	/**
	 * Returns the value of the '<em><b>Screen2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screen2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ScreenType> getScreen2();

	/**
	 * Returns the value of the '<em><b>Literallayout2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiterallayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Literallayout2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<LiterallayoutType> getLiterallayout2();

	/**
	 * Returns the value of the '<em><b>Programlistingco2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingcoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlistingco2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ProgramlistingcoType> getProgramlistingco2();

	/**
	 * Returns the value of the '<em><b>Screenco2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreencoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Screenco2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ScreencoType> getScreenco2();

	/**
	 * Returns the value of the '<em><b>Programlisting2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Programlisting2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting2();

	/**
	 * Returns the value of the '<em><b>Synopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Synopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<SynopsisType> getSynopsis2();

	/**
	 * Returns the value of the '<em><b>Bridgehead2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BridgeheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Bridgehead2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<BridgeheadType> getBridgehead2();

	/**
	 * Returns the value of the '<em><b>Remark2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Remark2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<RemarkType> getRemark2();

	/**
	 * Returns the value of the '<em><b>Revhistory2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Revhistory2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory2();

	/**
	 * Returns the value of the '<em><b>Indexterm2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Indexterm2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm2();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Funcsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis2();

	/**
	 * Returns the value of the '<em><b>Classsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClasssynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Classsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ClasssynopsisType> getClasssynopsis2();

	/**
	 * Returns the value of the '<em><b>Methodsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Methodsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<MethodsynopsisType> getMethodsynopsis2();

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Constructorsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ConstructorsynopsisType> getConstructorsynopsis2();

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DestructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Destructorsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<DestructorsynopsisType> getDestructorsynopsis2();

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FieldsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Fieldsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<FieldsynopsisType> getFieldsynopsis2();

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Cmdsynopsis2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis2();

	/**
	 * Returns the value of the '<em><b>Caution2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CautionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Caution2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<CautionType> getCaution2();

	/**
	 * Returns the value of the '<em><b>Important2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ImportantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Important2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ImportantType> getImportant2();

	/**
	 * Returns the value of the '<em><b>Note2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Note2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<NoteType> getNote2();

	/**
	 * Returns the value of the '<em><b>Tip2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Tip2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<TipType> getTip2();

	/**
	 * Returns the value of the '<em><b>Warning2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WarningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Warning2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<WarningType> getWarning2();

	/**
	 * Returns the value of the '<em><b>Anchor2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Anchor2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<AnchorType> getAnchor2();

	/**
	 * Returns the value of the '<em><b>Para2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Para2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<ParaType> getPara2();

	/**
	 * Returns the value of the '<em><b>Formalpara2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FormalparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Formalpara2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<FormalparaType> getFormalpara2();

	/**
	 * Returns the value of the '<em><b>Simpara2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Simpara2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<SimparaType> getSimpara2();

	/**
	 * Returns the value of the '<em><b>Annotation2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Annotation2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:120'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation2();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.StepType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.StepType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Object value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(Object value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Object value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see #setConformance(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Object value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.StepType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.StepType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkend</em>' attribute.
	 * @see #setLinkend(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(Object value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.PerformanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see org.docbook.ns.docbook.PerformanceType
	 * @see #isSetPerformance()
	 * @see #unsetPerformance()
	 * @see #setPerformance(PerformanceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Performance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='performance'"
	 * @generated
	 */
	PerformanceType getPerformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see org.docbook.ns.docbook.PerformanceType
	 * @see #isSetPerformance()
	 * @see #unsetPerformance()
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(PerformanceType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.StepType#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerformance()
	 * @see #getPerformance()
	 * @see #setPerformance(PerformanceType)
	 * @generated
	 */
	void unsetPerformance();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.StepType#getPerformance <em>Performance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Performance</em>' attribute is set.
	 * @see #unsetPerformance()
	 * @see #getPerformance()
	 * @see #setPerformance(PerformanceType)
	 * @generated
	 */
	boolean isSetPerformance();

	/**
	 * Returns the value of the '<em><b>Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap</em>' attribute.
	 * @see #setRemap(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getRemap <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap</em>' attribute.
	 * @see #getRemap()
	 * @generated
	 */
	void setRemap(Object value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Object value);

	/**
	 * Returns the value of the '<em><b>Revisionflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RevisionflagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @generated
	 */
	void setRevisionflag(RevisionflagType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.StepType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.StepType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revisionflag</em>' attribute is set.
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	boolean isSetRevisionflag();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.StepType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.StepType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' attribute.
	 * @see #setTitle1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Title1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getTitle1 <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title1</em>' attribute.
	 * @see #getTitle1()
	 * @generated
	 */
	void setTitle1(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(Object value);

	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getStepType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.StepType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // StepType
