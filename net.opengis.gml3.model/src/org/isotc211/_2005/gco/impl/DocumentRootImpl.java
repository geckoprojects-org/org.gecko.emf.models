/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.isotc211._2005.gco.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.AngleType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.LengthType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.ScaleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.BinaryType;
import org.isotc211._2005.gco.DocumentRoot;
import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.MemberNameType;
import org.isotc211._2005.gco.MultiplicityRangeType;
import org.isotc211._2005.gco.MultiplicityType;
import org.isotc211._2005.gco.RecordTypeType;
import org.isotc211._2005.gco.TypeNameType;
import org.isotc211._2005.gco.UnlimitedIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getAbstractGenericName <em>Abstract Generic Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getCharacterString <em>Character String</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getMultiplicityRange <em>Multiplicity Range</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getScopedName <em>Scoped Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getUnlimitedInteger <em>Unlimited Integer</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getIsoType <em>Iso Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.DocumentRootImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCharacterString() <em>Character String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterString()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DECIMAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INTEGER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReal() <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected static final double REAL_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getIsoType() <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsoType() <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoType()
	 * @generated
	 * @ordered
	 */
	protected String isoType = ISO_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GCOPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAbstractGenericName() {
		return (CodeType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGenericName(CodeType newAbstractGenericName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME, newAbstractGenericName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractObject() {
		return (AbstractObjectType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__ABSTRACT_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObject(AbstractObjectType newAbstractObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__ABSTRACT_OBJECT, newAbstractObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getAngle() {
		return (AngleType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__ANGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(AngleType newAngle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__ANGLE, newAngle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngle(AngleType newAngle) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__ANGLE, newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__MEASURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__MEASURE, newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__MEASURE, newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryType getBinary() {
		return (BinaryType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__BINARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(BinaryType newBinary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__BINARY, newBinary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinary(BinaryType newBinary) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__BINARY, newBinary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolean() {
		return (Boolean)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__BOOLEAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolean(boolean newBoolean) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__BOOLEAN, newBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharacterString() {
		return (String)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__CHARACTER_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterString(String newCharacterString) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__CHARACTER_STRING, newCharacterString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDate() {
		return (XMLGregorianCalendar)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(XMLGregorianCalendar newDate) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateTime() {
		return (XMLGregorianCalendar)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTime(XMLGregorianCalendar newDateTime) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__DATE_TIME, newDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDecimal() {
		return (BigDecimal)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__DECIMAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimal(BigDecimal newDecimal) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__DECIMAL, newDecimal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthType getDistance() {
		return (LengthType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__DISTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(LengthType newDistance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__DISTANCE, newDistance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(LengthType newDistance) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__DISTANCE, newDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthType getLength() {
		return (LengthType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(LengthType newLength, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__LENGTH, newLength, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(LengthType newLength) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getInteger() {
		return (BigInteger)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__INTEGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteger(BigInteger newInteger) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__INTEGER, newInteger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getLocalName() {
		return (CodeType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__LOCAL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalName(CodeType newLocalName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__LOCAL_NAME, newLocalName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalName(CodeType newLocalName) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__LOCAL_NAME, newLocalName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberNameType getMemberName() {
		return (MemberNameType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__MEMBER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberName(MemberNameType newMemberName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__MEMBER_NAME, newMemberName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberName(MemberNameType newMemberName) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__MEMBER_NAME, newMemberName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityType getMultiplicity() {
		return (MultiplicityType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(MultiplicityType newMultiplicity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY, newMultiplicity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(MultiplicityType newMultiplicity) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY, newMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityRangeType getMultiplicityRange() {
		return (MultiplicityRangeType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY_RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicityRange(MultiplicityRangeType newMultiplicityRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY_RANGE, newMultiplicityRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicityRange(MultiplicityRangeType newMultiplicityRange) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__MULTIPLICITY_RANGE, newMultiplicityRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getReal() {
		return (Double)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__REAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReal(double newReal) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__REAL, newReal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRecord() {
		return (EObject)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__RECORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(EObject newRecord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__RECORD, newRecord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecord(EObject newRecord) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__RECORD, newRecord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTypeType getRecordType() {
		return (RecordTypeType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__RECORD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordType(RecordTypeType newRecordType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__RECORD_TYPE, newRecordType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordType(RecordTypeType newRecordType) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__RECORD_TYPE, newRecordType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaleType getScale() {
		return (ScaleType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(ScaleType newScale, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__SCALE, newScale, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(ScaleType newScale) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getScopedName() {
		return (CodeType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__SCOPED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopedName(CodeType newScopedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__SCOPED_NAME, newScopedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopedName(CodeType newScopedName) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__SCOPED_NAME, newScopedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeNameType getTypeName() {
		return (TypeNameType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__TYPE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeName(TypeNameType newTypeName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__TYPE_NAME, newTypeName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(TypeNameType newTypeName) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlimitedIntegerType getUnlimitedInteger() {
		return (UnlimitedIntegerType)getMixed().get(GCOPackage.Literals.DOCUMENT_ROOT__UNLIMITED_INTEGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlimitedInteger(UnlimitedIntegerType newUnlimitedInteger, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GCOPackage.Literals.DOCUMENT_ROOT__UNLIMITED_INTEGER, newUnlimitedInteger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnlimitedInteger(UnlimitedIntegerType newUnlimitedInteger) {
		((FeatureMap.Internal)getMixed()).set(GCOPackage.Literals.DOCUMENT_ROOT__UNLIMITED_INTEGER, newUnlimitedInteger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsoType() {
		return isoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsoType(String newIsoType) {
		String oldIsoType = isoType;
		isoType = newIsoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.DOCUMENT_ROOT__ISO_TYPE, oldIsoType, isoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.DOCUMENT_ROOT__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME:
				return basicSetAbstractGenericName(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return basicSetAbstractObject(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__ANGLE:
				return basicSetAngle(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__BINARY:
				return basicSetBinary(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__DISTANCE:
				return basicSetDistance(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__LENGTH:
				return basicSetLength(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__LOCAL_NAME:
				return basicSetLocalName(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__MEMBER_NAME:
				return basicSetMemberName(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY_RANGE:
				return basicSetMultiplicityRange(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__RECORD:
				return basicSetRecord(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__RECORD_TYPE:
				return basicSetRecordType(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__SCALE:
				return basicSetScale(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__SCOPED_NAME:
				return basicSetScopedName(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__TYPE_NAME:
				return basicSetTypeName(null, msgs);
			case GCOPackage.DOCUMENT_ROOT__UNLIMITED_INTEGER:
				return basicSetUnlimitedInteger(null, msgs);
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
			case GCOPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME:
				return getAbstractGenericName();
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return getAbstractObject();
			case GCOPackage.DOCUMENT_ROOT__ANGLE:
				return getAngle();
			case GCOPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case GCOPackage.DOCUMENT_ROOT__BINARY:
				return getBinary();
			case GCOPackage.DOCUMENT_ROOT__BOOLEAN:
				return isBoolean();
			case GCOPackage.DOCUMENT_ROOT__CHARACTER_STRING:
				return getCharacterString();
			case GCOPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case GCOPackage.DOCUMENT_ROOT__DATE_TIME:
				return getDateTime();
			case GCOPackage.DOCUMENT_ROOT__DECIMAL:
				return getDecimal();
			case GCOPackage.DOCUMENT_ROOT__DISTANCE:
				return getDistance();
			case GCOPackage.DOCUMENT_ROOT__LENGTH:
				return getLength();
			case GCOPackage.DOCUMENT_ROOT__INTEGER:
				return getInteger();
			case GCOPackage.DOCUMENT_ROOT__LOCAL_NAME:
				return getLocalName();
			case GCOPackage.DOCUMENT_ROOT__MEMBER_NAME:
				return getMemberName();
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY:
				return getMultiplicity();
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY_RANGE:
				return getMultiplicityRange();
			case GCOPackage.DOCUMENT_ROOT__REAL:
				return getReal();
			case GCOPackage.DOCUMENT_ROOT__RECORD:
				return getRecord();
			case GCOPackage.DOCUMENT_ROOT__RECORD_TYPE:
				return getRecordType();
			case GCOPackage.DOCUMENT_ROOT__SCALE:
				return getScale();
			case GCOPackage.DOCUMENT_ROOT__SCOPED_NAME:
				return getScopedName();
			case GCOPackage.DOCUMENT_ROOT__TYPE_NAME:
				return getTypeName();
			case GCOPackage.DOCUMENT_ROOT__UNLIMITED_INTEGER:
				return getUnlimitedInteger();
			case GCOPackage.DOCUMENT_ROOT__ISO_TYPE:
				return getIsoType();
			case GCOPackage.DOCUMENT_ROOT__NIL_REASON:
				return getNilReason();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GCOPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__ANGLE:
				setAngle((AngleType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__BINARY:
				setBinary((BinaryType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__CHARACTER_STRING:
				setCharacterString((String)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime((XMLGregorianCalendar)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__DECIMAL:
				setDecimal((BigDecimal)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance((LengthType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__LENGTH:
				setLength((LengthType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__INTEGER:
				setInteger((BigInteger)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__LOCAL_NAME:
				setLocalName((CodeType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__MEMBER_NAME:
				setMemberName((MemberNameType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY:
				setMultiplicity((MultiplicityType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY_RANGE:
				setMultiplicityRange((MultiplicityRangeType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__REAL:
				setReal((Double)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__RECORD:
				setRecord((EObject)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__RECORD_TYPE:
				setRecordType((RecordTypeType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__SCALE:
				setScale((ScaleType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__SCOPED_NAME:
				setScopedName((CodeType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__TYPE_NAME:
				setTypeName((TypeNameType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__UNLIMITED_INTEGER:
				setUnlimitedInteger((UnlimitedIntegerType)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__ISO_TYPE:
				setIsoType((String)newValue);
				return;
			case GCOPackage.DOCUMENT_ROOT__NIL_REASON:
				setNilReason(newValue);
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
			case GCOPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GCOPackage.DOCUMENT_ROOT__ANGLE:
				setAngle((AngleType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__BINARY:
				setBinary((BinaryType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__CHARACTER_STRING:
				setCharacterString(CHARACTER_STRING_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__DECIMAL:
				setDecimal(DECIMAL_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance((LengthType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__LENGTH:
				setLength((LengthType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__INTEGER:
				setInteger(INTEGER_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__LOCAL_NAME:
				setLocalName((CodeType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__MEMBER_NAME:
				setMemberName((MemberNameType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY:
				setMultiplicity((MultiplicityType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY_RANGE:
				setMultiplicityRange((MultiplicityRangeType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__REAL:
				setReal(REAL_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__RECORD:
				setRecord((EObject)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__RECORD_TYPE:
				setRecordType((RecordTypeType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__SCALE:
				setScale((ScaleType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__SCOPED_NAME:
				setScopedName((CodeType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__TYPE_NAME:
				setTypeName((TypeNameType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__UNLIMITED_INTEGER:
				setUnlimitedInteger((UnlimitedIntegerType)null);
				return;
			case GCOPackage.DOCUMENT_ROOT__ISO_TYPE:
				setIsoType(ISO_TYPE_EDEFAULT);
				return;
			case GCOPackage.DOCUMENT_ROOT__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GCOPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GCOPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GCOPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME:
				return getAbstractGenericName() != null;
			case GCOPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return getAbstractObject() != null;
			case GCOPackage.DOCUMENT_ROOT__ANGLE:
				return getAngle() != null;
			case GCOPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case GCOPackage.DOCUMENT_ROOT__BINARY:
				return getBinary() != null;
			case GCOPackage.DOCUMENT_ROOT__BOOLEAN:
				return isBoolean() != BOOLEAN_EDEFAULT;
			case GCOPackage.DOCUMENT_ROOT__CHARACTER_STRING:
				return CHARACTER_STRING_EDEFAULT == null ? getCharacterString() != null : !CHARACTER_STRING_EDEFAULT.equals(getCharacterString());
			case GCOPackage.DOCUMENT_ROOT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case GCOPackage.DOCUMENT_ROOT__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? getDateTime() != null : !DATE_TIME_EDEFAULT.equals(getDateTime());
			case GCOPackage.DOCUMENT_ROOT__DECIMAL:
				return DECIMAL_EDEFAULT == null ? getDecimal() != null : !DECIMAL_EDEFAULT.equals(getDecimal());
			case GCOPackage.DOCUMENT_ROOT__DISTANCE:
				return getDistance() != null;
			case GCOPackage.DOCUMENT_ROOT__LENGTH:
				return getLength() != null;
			case GCOPackage.DOCUMENT_ROOT__INTEGER:
				return INTEGER_EDEFAULT == null ? getInteger() != null : !INTEGER_EDEFAULT.equals(getInteger());
			case GCOPackage.DOCUMENT_ROOT__LOCAL_NAME:
				return getLocalName() != null;
			case GCOPackage.DOCUMENT_ROOT__MEMBER_NAME:
				return getMemberName() != null;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY:
				return getMultiplicity() != null;
			case GCOPackage.DOCUMENT_ROOT__MULTIPLICITY_RANGE:
				return getMultiplicityRange() != null;
			case GCOPackage.DOCUMENT_ROOT__REAL:
				return getReal() != REAL_EDEFAULT;
			case GCOPackage.DOCUMENT_ROOT__RECORD:
				return getRecord() != null;
			case GCOPackage.DOCUMENT_ROOT__RECORD_TYPE:
				return getRecordType() != null;
			case GCOPackage.DOCUMENT_ROOT__SCALE:
				return getScale() != null;
			case GCOPackage.DOCUMENT_ROOT__SCOPED_NAME:
				return getScopedName() != null;
			case GCOPackage.DOCUMENT_ROOT__TYPE_NAME:
				return getTypeName() != null;
			case GCOPackage.DOCUMENT_ROOT__UNLIMITED_INTEGER:
				return getUnlimitedInteger() != null;
			case GCOPackage.DOCUMENT_ROOT__ISO_TYPE:
				return ISO_TYPE_EDEFAULT == null ? isoType != null : !ISO_TYPE_EDEFAULT.equals(isoType);
			case GCOPackage.DOCUMENT_ROOT__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", isoType: ");
		result.append(isoType);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
