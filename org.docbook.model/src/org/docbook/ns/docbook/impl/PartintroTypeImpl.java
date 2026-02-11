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
import org.docbook.ns.docbook.PartintroType;
import org.docbook.ns.docbook.ProcedureType;
import org.docbook.ns.docbook.ProductionsetType;
import org.docbook.ns.docbook.ProgramlistingType;
import org.docbook.ns.docbook.ProgramlistingcoType;
import org.docbook.ns.docbook.QandasetType;
import org.docbook.ns.docbook.RefentryType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.ScreenType;
import org.docbook.ns.docbook.ScreencoType;
import org.docbook.ns.docbook.ScreenshotType;
import org.docbook.ns.docbook.Sect1Type;
import org.docbook.ns.docbook.SectionType;
import org.docbook.ns.docbook.SegmentedlistType;
import org.docbook.ns.docbook.SidebarType;
import org.docbook.ns.docbook.SimparaType;
import org.docbook.ns.docbook.SimplelistType;
import org.docbook.ns.docbook.SimplesectType;
import org.docbook.ns.docbook.SubtitleType;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partintro Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect <em>Simplesect</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect1 <em>Simplesect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSect1 <em>Sect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect2 <em>Simplesect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRefentry <em>Refentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSection1 <em>Section1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect3 <em>Simplesect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect4 <em>Simplesect4</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSect11 <em>Sect11</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSimplesect5 <em>Simplesect5</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRefentry1 <em>Refentry1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.PartintroTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartintroTypeImpl extends MinimalEObjectImpl.Container implements PartintroType {
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
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionType> section;

	/**
	 * The cached value of the '{@link #getSimplesect() <em>Simplesect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect;

	/**
	 * The cached value of the '{@link #getSimplesect1() <em>Simplesect1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect1()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect1;

	/**
	 * The cached value of the '{@link #getSect1() <em>Sect1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSect1()
	 * @generated
	 * @ordered
	 */
	protected EList<Sect1Type> sect1;

	/**
	 * The cached value of the '{@link #getSimplesect2() <em>Simplesect2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect2()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect2;

	/**
	 * The cached value of the '{@link #getRefentry() <em>Refentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefentry()
	 * @generated
	 * @ordered
	 */
	protected EList<RefentryType> refentry;

	/**
	 * The cached value of the '{@link #getSection1() <em>Section1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection1()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionType> section1;

	/**
	 * The cached value of the '{@link #getSimplesect3() <em>Simplesect3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect3()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect3;

	/**
	 * The cached value of the '{@link #getSimplesect4() <em>Simplesect4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect4()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect4;

	/**
	 * The cached value of the '{@link #getSect11() <em>Sect11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSect11()
	 * @generated
	 * @ordered
	 */
	protected EList<Sect1Type> sect11;

	/**
	 * The cached value of the '{@link #getSimplesect5() <em>Simplesect5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplesect5()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplesectType> simplesect5;

	/**
	 * The cached value of the '{@link #getRefentry1() <em>Refentry1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefentry1()
	 * @generated
	 * @ordered
	 */
	protected EList<RefentryType> refentry1;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Object label = LABEL_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Object status = STATUS_EDEFAULT;

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
	protected PartintroTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getPartintroType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.PARTINTRO_TYPE__GROUP);
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
		return getGroup().list(DocbookPackage.eINSTANCE.getPartintroType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getPartintroType_Titleabbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtitleType> getSubtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getPartintroType_Subtitle());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__INFO, oldInfo, newInfo);
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
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PARTINTRO_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PARTINTRO_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, DocbookPackage.PARTINTRO_TYPE__GROUP1);
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
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Itemizedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Orderedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Procedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Simplelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Variablelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Segmentedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Glosslist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Bibliolist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Calloutlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Qandaset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Example());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Figure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Equation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Informalexample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Informalfigure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Informaltable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Informalequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Sidebar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Epigraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Screenshot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Task());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Productionset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Constraintdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Msgset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Screen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Literallayout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Programlistingco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Screenco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Programlisting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Synopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Bridgehead());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Funcsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Classsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Methodsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Constructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Destructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Fieldsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Cmdsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Caution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Important());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Tip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Warning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Para());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Formalpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Simpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getPartintroType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionType> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<SectionType>(SectionType.class, this, DocbookPackage.PARTINTRO_TYPE__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect() {
		if (simplesect == null) {
			simplesect = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT);
		}
		return simplesect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect1() {
		if (simplesect1 == null) {
			simplesect1 = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1);
		}
		return simplesect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sect1Type> getSect1() {
		if (sect1 == null) {
			sect1 = new EObjectContainmentEList<Sect1Type>(Sect1Type.class, this, DocbookPackage.PARTINTRO_TYPE__SECT1);
		}
		return sect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect2() {
		if (simplesect2 == null) {
			simplesect2 = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2);
		}
		return simplesect2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefentryType> getRefentry() {
		if (refentry == null) {
			refentry = new EObjectContainmentEList<RefentryType>(RefentryType.class, this, DocbookPackage.PARTINTRO_TYPE__REFENTRY);
		}
		return refentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionType> getSection1() {
		if (section1 == null) {
			section1 = new EObjectContainmentEList<SectionType>(SectionType.class, this, DocbookPackage.PARTINTRO_TYPE__SECTION1);
		}
		return section1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect3() {
		if (simplesect3 == null) {
			simplesect3 = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3);
		}
		return simplesect3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect4() {
		if (simplesect4 == null) {
			simplesect4 = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4);
		}
		return simplesect4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sect1Type> getSect11() {
		if (sect11 == null) {
			sect11 = new EObjectContainmentEList<Sect1Type>(Sect1Type.class, this, DocbookPackage.PARTINTRO_TYPE__SECT11);
		}
		return sect11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplesectType> getSimplesect5() {
		if (simplesect5 == null) {
			simplesect5 = new EObjectContainmentEList<SimplesectType>(SimplesectType.class, this, DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5);
		}
		return simplesect5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefentryType> getRefentry1() {
		if (refentry1 == null) {
			refentry1 = new EObjectContainmentEList<RefentryType>(RefentryType.class, this, DocbookPackage.PARTINTRO_TYPE__REFENTRY1);
		}
		return refentry1;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.PARTINTRO_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.PARTINTRO_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Object newLabel) {
		Object oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.PARTINTRO_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
	public Object getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Object newStatus) {
		Object oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__TITLE1, oldTitle1, title1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARTINTRO_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.PARTINTRO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.PARTINTRO_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__ITEMIZEDLIST:
				return ((InternalEList<?>)getItemizedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLELIST:
				return ((InternalEList<?>)getSimplelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__VARIABLELIST:
				return ((InternalEList<?>)getVariablelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SEGMENTEDLIST:
				return ((InternalEList<?>)getSegmentedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__GLOSSLIST:
				return ((InternalEList<?>)getGlosslist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__BIBLIOLIST:
				return ((InternalEList<?>)getBibliolist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CALLOUTLIST:
				return ((InternalEList<?>)getCalloutlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__QANDASET:
				return ((InternalEList<?>)getQandaset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__EXAMPLE:
				return ((InternalEList<?>)getExample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__FIGURE:
				return ((InternalEList<?>)getFigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__EQUATION:
				return ((InternalEList<?>)getEquation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEXAMPLE:
				return ((InternalEList<?>)getInformalexample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INFORMALFIGURE:
				return ((InternalEList<?>)getInformalfigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INFORMALTABLE:
				return ((InternalEList<?>)getInformaltable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEQUATION:
				return ((InternalEList<?>)getInformalequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIDEBAR:
				return ((InternalEList<?>)getSidebar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__EPIGRAPH:
				return ((InternalEList<?>)getEpigraph()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SCREENSHOT:
				return ((InternalEList<?>)getScreenshot()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__PRODUCTIONSET:
				return ((InternalEList<?>)getProductionset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CONSTRAINTDEF:
				return ((InternalEList<?>)getConstraintdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__MSGSET:
				return ((InternalEList<?>)getMsgset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SCREEN:
				return ((InternalEList<?>)getScreen()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__LITERALLAYOUT:
				return ((InternalEList<?>)getLiterallayout()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTINGCO:
				return ((InternalEList<?>)getProgramlistingco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SCREENCO:
				return ((InternalEList<?>)getScreenco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SYNOPSIS:
				return ((InternalEList<?>)getSynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__BRIDGEHEAD:
				return ((InternalEList<?>)getBridgehead()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__FUNCSYNOPSIS:
				return ((InternalEList<?>)getFuncsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CLASSSYNOPSIS:
				return ((InternalEList<?>)getClasssynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__METHODSYNOPSIS:
				return ((InternalEList<?>)getMethodsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CONSTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getConstructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__DESTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getDestructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__FIELDSYNOPSIS:
				return ((InternalEList<?>)getFieldsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CMDSYNOPSIS:
				return ((InternalEList<?>)getCmdsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__CAUTION:
				return ((InternalEList<?>)getCaution()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__IMPORTANT:
				return ((InternalEList<?>)getImportant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__TIP:
				return ((InternalEList<?>)getTip()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__FORMALPARA:
				return ((InternalEList<?>)getFormalpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPARA:
				return ((InternalEList<?>)getSimpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT:
				return ((InternalEList<?>)getSimplesect()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1:
				return ((InternalEList<?>)getSimplesect1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SECT1:
				return ((InternalEList<?>)getSect1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2:
				return ((InternalEList<?>)getSimplesect2()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY:
				return ((InternalEList<?>)getRefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SECTION1:
				return ((InternalEList<?>)getSection1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3:
				return ((InternalEList<?>)getSimplesect3()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4:
				return ((InternalEList<?>)getSimplesect4()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SECT11:
				return ((InternalEList<?>)getSect11()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5:
				return ((InternalEList<?>)getSimplesect5()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY1:
				return ((InternalEList<?>)getRefentry1()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.PARTINTRO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.PARTINTRO_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.PARTINTRO_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.PARTINTRO_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.PARTINTRO_TYPE__INFO:
				return getInfo();
			case DocbookPackage.PARTINTRO_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case DocbookPackage.PARTINTRO_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.PARTINTRO_TYPE__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.PARTINTRO_TYPE__PROCEDURE:
				return getProcedure();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLELIST:
				return getSimplelist();
			case DocbookPackage.PARTINTRO_TYPE__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.PARTINTRO_TYPE__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.PARTINTRO_TYPE__GLOSSLIST:
				return getGlosslist();
			case DocbookPackage.PARTINTRO_TYPE__BIBLIOLIST:
				return getBibliolist();
			case DocbookPackage.PARTINTRO_TYPE__CALLOUTLIST:
				return getCalloutlist();
			case DocbookPackage.PARTINTRO_TYPE__QANDASET:
				return getQandaset();
			case DocbookPackage.PARTINTRO_TYPE__EXAMPLE:
				return getExample();
			case DocbookPackage.PARTINTRO_TYPE__FIGURE:
				return getFigure();
			case DocbookPackage.PARTINTRO_TYPE__TABLE:
				return getTable();
			case DocbookPackage.PARTINTRO_TYPE__EQUATION:
				return getEquation();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEXAMPLE:
				return getInformalexample();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALFIGURE:
				return getInformalfigure();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEQUATION:
				return getInformalequation();
			case DocbookPackage.PARTINTRO_TYPE__SIDEBAR:
				return getSidebar();
			case DocbookPackage.PARTINTRO_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case DocbookPackage.PARTINTRO_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.PARTINTRO_TYPE__EPIGRAPH:
				return getEpigraph();
			case DocbookPackage.PARTINTRO_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.PARTINTRO_TYPE__SCREENSHOT:
				return getScreenshot();
			case DocbookPackage.PARTINTRO_TYPE__TASK:
				return getTask();
			case DocbookPackage.PARTINTRO_TYPE__PRODUCTIONSET:
				return getProductionset();
			case DocbookPackage.PARTINTRO_TYPE__CONSTRAINTDEF:
				return getConstraintdef();
			case DocbookPackage.PARTINTRO_TYPE__MSGSET:
				return getMsgset();
			case DocbookPackage.PARTINTRO_TYPE__SCREEN:
				return getScreen();
			case DocbookPackage.PARTINTRO_TYPE__LITERALLAYOUT:
				return getLiterallayout();
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTINGCO:
				return getProgramlistingco();
			case DocbookPackage.PARTINTRO_TYPE__SCREENCO:
				return getScreenco();
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.PARTINTRO_TYPE__SYNOPSIS:
				return getSynopsis();
			case DocbookPackage.PARTINTRO_TYPE__BRIDGEHEAD:
				return getBridgehead();
			case DocbookPackage.PARTINTRO_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.PARTINTRO_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.PARTINTRO_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.PARTINTRO_TYPE__FUNCSYNOPSIS:
				return getFuncsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__CLASSSYNOPSIS:
				return getClasssynopsis();
			case DocbookPackage.PARTINTRO_TYPE__METHODSYNOPSIS:
				return getMethodsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__FIELDSYNOPSIS:
				return getFieldsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.PARTINTRO_TYPE__CAUTION:
				return getCaution();
			case DocbookPackage.PARTINTRO_TYPE__IMPORTANT:
				return getImportant();
			case DocbookPackage.PARTINTRO_TYPE__NOTE:
				return getNote();
			case DocbookPackage.PARTINTRO_TYPE__TIP:
				return getTip();
			case DocbookPackage.PARTINTRO_TYPE__WARNING:
				return getWarning();
			case DocbookPackage.PARTINTRO_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.PARTINTRO_TYPE__PARA:
				return getPara();
			case DocbookPackage.PARTINTRO_TYPE__FORMALPARA:
				return getFormalpara();
			case DocbookPackage.PARTINTRO_TYPE__SIMPARA:
				return getSimpara();
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.PARTINTRO_TYPE__SECTION:
				return getSection();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT:
				return getSimplesect();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1:
				return getSimplesect1();
			case DocbookPackage.PARTINTRO_TYPE__SECT1:
				return getSect1();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2:
				return getSimplesect2();
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY:
				return getRefentry();
			case DocbookPackage.PARTINTRO_TYPE__SECTION1:
				return getSection1();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3:
				return getSimplesect3();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4:
				return getSimplesect4();
			case DocbookPackage.PARTINTRO_TYPE__SECT11:
				return getSect11();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5:
				return getSimplesect5();
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY1:
				return getRefentry1();
			case DocbookPackage.PARTINTRO_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.PARTINTRO_TYPE__ARCH:
				return getArch();
			case DocbookPackage.PARTINTRO_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.PARTINTRO_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.PARTINTRO_TYPE__BASE:
				return getBase();
			case DocbookPackage.PARTINTRO_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.PARTINTRO_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.PARTINTRO_TYPE__DIR:
				return getDir();
			case DocbookPackage.PARTINTRO_TYPE__HREF:
				return getHref();
			case DocbookPackage.PARTINTRO_TYPE__ID:
				return getId();
			case DocbookPackage.PARTINTRO_TYPE__LABEL:
				return getLabel();
			case DocbookPackage.PARTINTRO_TYPE__LANG:
				return getLang();
			case DocbookPackage.PARTINTRO_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.PARTINTRO_TYPE__OS:
				return getOs();
			case DocbookPackage.PARTINTRO_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.PARTINTRO_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.PARTINTRO_TYPE__ROLE:
				return getRole();
			case DocbookPackage.PARTINTRO_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.PARTINTRO_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.PARTINTRO_TYPE__SHOW:
				return getShow();
			case DocbookPackage.PARTINTRO_TYPE__STATUS:
				return getStatus();
			case DocbookPackage.PARTINTRO_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.PARTINTRO_TYPE__TYPE:
				return getType();
			case DocbookPackage.PARTINTRO_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.PARTINTRO_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.PARTINTRO_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.PARTINTRO_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.PARTINTRO_TYPE__XREFLABEL:
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
			case DocbookPackage.PARTINTRO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends SubtitleType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				getItemizedlist().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLELIST:
				getSimplelist().clear();
				getSimplelist().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__VARIABLELIST:
				getVariablelist().clear();
				getVariablelist().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				getSegmentedlist().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__GLOSSLIST:
				getGlosslist().clear();
				getGlosslist().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				getBibliolist().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				getCalloutlist().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__QANDASET:
				getQandaset().clear();
				getQandaset().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__FIGURE:
				getFigure().clear();
				getFigure().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				getInformalexample().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				getInformalfigure().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				getInformaltable().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				getInformalequation().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIDEBAR:
				getSidebar().clear();
				getSidebar().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__EPIGRAPH:
				getEpigraph().clear();
				getEpigraph().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREENSHOT:
				getScreenshot().clear();
				getScreenshot().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				getProductionset().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				getConstraintdef().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__MSGSET:
				getMsgset().clear();
				getMsgset().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREEN:
				getScreen().clear();
				getScreen().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				getLiterallayout().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				getProgramlistingco().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREENCO:
				getScreenco().clear();
				getScreenco().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SYNOPSIS:
				getSynopsis().clear();
				getSynopsis().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				getBridgehead().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				getFuncsynopsis().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				getClasssynopsis().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				getMethodsynopsis().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				getConstructorsynopsis().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				getDestructorsynopsis().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				getFieldsynopsis().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				getCmdsynopsis().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CAUTION:
				getCaution().clear();
				getCaution().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__IMPORTANT:
				getImportant().clear();
				getImportant().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TIP:
				getTip().clear();
				getTip().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__FORMALPARA:
				getFormalpara().clear();
				getFormalpara().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPARA:
				getSimpara().clear();
				getSimpara().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT:
				getSimplesect().clear();
				getSimplesect().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1:
				getSimplesect1().clear();
				getSimplesect1().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECT1:
				getSect1().clear();
				getSect1().addAll((Collection<? extends Sect1Type>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2:
				getSimplesect2().clear();
				getSimplesect2().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY:
				getRefentry().clear();
				getRefentry().addAll((Collection<? extends RefentryType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECTION1:
				getSection1().clear();
				getSection1().addAll((Collection<? extends SectionType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3:
				getSimplesect3().clear();
				getSimplesect3().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4:
				getSimplesect4().clear();
				getSimplesect4().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECT11:
				getSect11().clear();
				getSect11().addAll((Collection<? extends Sect1Type>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5:
				getSimplesect5().clear();
				getSimplesect5().addAll((Collection<? extends SimplesectType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY1:
				getRefentry1().clear();
				getRefentry1().addAll((Collection<? extends RefentryType>)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LABEL:
				setLabel(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__STATUS:
				setStatus(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.PARTINTRO_TYPE__XREFLABEL:
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
			case DocbookPackage.PARTINTRO_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.PARTINTRO_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROCEDURE:
				getProcedure().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLELIST:
				getSimplelist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__VARIABLELIST:
				getVariablelist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__GLOSSLIST:
				getGlosslist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__QANDASET:
				getQandaset().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__EXAMPLE:
				getExample().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__FIGURE:
				getFigure().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__TABLE:
				getTable().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__EQUATION:
				getEquation().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIDEBAR:
				getSidebar().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__EPIGRAPH:
				getEpigraph().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREENSHOT:
				getScreenshot().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__TASK:
				getTask().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__MSGSET:
				getMsgset().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREEN:
				getScreen().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SCREENCO:
				getScreenco().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SYNOPSIS:
				getSynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__CAUTION:
				getCaution().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__IMPORTANT:
				getImportant().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__NOTE:
				getNote().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__TIP:
				getTip().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__WARNING:
				getWarning().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__FORMALPARA:
				getFormalpara().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPARA:
				getSimpara().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECTION:
				getSection().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT:
				getSimplesect().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1:
				getSimplesect1().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECT1:
				getSect1().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2:
				getSimplesect2().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY:
				getRefentry().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECTION1:
				getSection1().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3:
				getSimplesect3().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4:
				getSimplesect4().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECT11:
				getSect11().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5:
				getSimplesect5().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY1:
				getRefentry1().clear();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.PARTINTRO_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.PARTINTRO_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.PARTINTRO_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.PARTINTRO_TYPE__XREFLABEL:
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
			case DocbookPackage.PARTINTRO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SUBTITLE:
				return !getSubtitle().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INFO:
				return info != null;
			case DocbookPackage.PARTINTRO_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ITEMIZEDLIST:
				return !getItemizedlist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__PROCEDURE:
				return !getProcedure().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLELIST:
				return !getSimplelist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__VARIABLELIST:
				return !getVariablelist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SEGMENTEDLIST:
				return !getSegmentedlist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__GLOSSLIST:
				return !getGlosslist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__BIBLIOLIST:
				return !getBibliolist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CALLOUTLIST:
				return !getCalloutlist().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__QANDASET:
				return !getQandaset().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__EXAMPLE:
				return !getExample().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__FIGURE:
				return !getFigure().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__TABLE:
				return !getTable().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__EQUATION:
				return !getEquation().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEXAMPLE:
				return !getInformalexample().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALFIGURE:
				return !getInformalfigure().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALTABLE:
				return !getInformaltable().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INFORMALEQUATION:
				return !getInformalequation().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIDEBAR:
				return !getSidebar().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__EPIGRAPH:
				return !getEpigraph().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SCREENSHOT:
				return !getScreenshot().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__TASK:
				return !getTask().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__PRODUCTIONSET:
				return !getProductionset().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CONSTRAINTDEF:
				return !getConstraintdef().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__MSGSET:
				return !getMsgset().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SCREEN:
				return !getScreen().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__LITERALLAYOUT:
				return !getLiterallayout().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTINGCO:
				return !getProgramlistingco().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SCREENCO:
				return !getScreenco().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__PROGRAMLISTING:
				return !getProgramlisting().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SYNOPSIS:
				return !getSynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__BRIDGEHEAD:
				return !getBridgehead().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__FUNCSYNOPSIS:
				return !getFuncsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CLASSSYNOPSIS:
				return !getClasssynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__METHODSYNOPSIS:
				return !getMethodsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CONSTRUCTORSYNOPSIS:
				return !getConstructorsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__DESTRUCTORSYNOPSIS:
				return !getDestructorsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__FIELDSYNOPSIS:
				return !getFieldsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CMDSYNOPSIS:
				return !getCmdsynopsis().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__CAUTION:
				return !getCaution().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__IMPORTANT:
				return !getImportant().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__NOTE:
				return !getNote().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__TIP:
				return !getTip().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__WARNING:
				return !getWarning().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__FORMALPARA:
				return !getFormalpara().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPARA:
				return !getSimpara().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SECTION:
				return section != null && !section.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT:
				return simplesect != null && !simplesect.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT1:
				return simplesect1 != null && !simplesect1.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SECT1:
				return sect1 != null && !sect1.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT2:
				return simplesect2 != null && !simplesect2.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY:
				return refentry != null && !refentry.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SECTION1:
				return section1 != null && !section1.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT3:
				return simplesect3 != null && !simplesect3.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT4:
				return simplesect4 != null && !simplesect4.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SECT11:
				return sect11 != null && !sect11.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__SIMPLESECT5:
				return simplesect5 != null && !simplesect5.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__REFENTRY1:
				return refentry1 != null && !refentry1.isEmpty();
			case DocbookPackage.PARTINTRO_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.PARTINTRO_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.PARTINTRO_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.PARTINTRO_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.PARTINTRO_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.PARTINTRO_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.PARTINTRO_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.PARTINTRO_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.PARTINTRO_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.PARTINTRO_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.PARTINTRO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.PARTINTRO_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DocbookPackage.PARTINTRO_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.PARTINTRO_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.PARTINTRO_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.PARTINTRO_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.PARTINTRO_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.PARTINTRO_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.PARTINTRO_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.PARTINTRO_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.PARTINTRO_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.PARTINTRO_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.PARTINTRO_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case DocbookPackage.PARTINTRO_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.PARTINTRO_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.PARTINTRO_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.PARTINTRO_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.PARTINTRO_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.PARTINTRO_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.PARTINTRO_TYPE__XREFLABEL:
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
		result.append(", label: ");
		result.append(label);
		result.append(", lang: ");
		result.append(lang);
		result.append(", linkend: ");
		result.append(linkend);
		result.append(", os: ");
		result.append(os);
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
		result.append(", status: ");
		result.append(status);
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

} //PartintroTypeImpl
