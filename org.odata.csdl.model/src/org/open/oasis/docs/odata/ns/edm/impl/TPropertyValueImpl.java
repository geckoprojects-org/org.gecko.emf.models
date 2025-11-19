/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

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

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TApplyExpression;
import org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression;
import org.open.oasis.docs.odata.ns.edm.TCollectionExpression;
import org.open.oasis.docs.odata.ns.edm.TDateConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TIfExpression;
import org.open.oasis.docs.odata.ns.edm.TIntConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression;
import org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression;
import org.open.oasis.docs.odata.ns.edm.TNullExpression;
import org.open.oasis.docs.odata.ns.edm.TOneChildExpression;
import org.open.oasis.docs.odata.ns.edm.TPropertyValue;
import org.open.oasis.docs.odata.ns.edm.TRecordExpression;
import org.open.oasis.docs.odata.ns.edm.TStringConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TProperty Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getAnnotationPath1 <em>Annotation Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getBinary1 <em>Binary1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#isBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDate1 <em>Date1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDateTimeOffset1 <em>Date Time Offset1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDecimal1 <em>Decimal1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getDuration1 <em>Duration1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getEnumMember1 <em>Enum Member1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getGuid1 <em>Guid1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getModelElementPath1 <em>Model Element Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getPath1 <em>Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getPropertyPath1 <em>Property Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getString1 <em>String1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getTimeOfDay1 <em>Time Of Day1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl#getUrlRef1 <em>Url Ref1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPropertyValueImpl extends MinimalEObjectImpl.Container implements TPropertyValue {
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
	 * The default value of the '{@link #getAnnotationPath1() <em>Annotation Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPath1()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_PATH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationPath1() <em>Annotation Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPath1()
	 * @generated
	 * @ordered
	 */
	protected String annotationPath1 = ANNOTATION_PATH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinary1() <em>Binary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary1()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinary1() <em>Binary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary1()
	 * @generated
	 * @ordered
	 */
	protected String binary1 = BINARY1_EDEFAULT;

	/**
	 * The default value of the '{@link #isBool1() <em>Bool1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBool1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBool1() <em>Bool1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBool1()
	 * @generated
	 * @ordered
	 */
	protected boolean bool1 = BOOL1_EDEFAULT;

	/**
	 * This is true if the Bool1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bool1ESet;

	/**
	 * The default value of the '{@link #getDate1() <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate1()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate1() <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate1()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date1 = DATE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTimeOffset1() <em>Date Time Offset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeOffset1()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_OFFSET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeOffset1() <em>Date Time Offset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeOffset1()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateTimeOffset1 = DATE_TIME_OFFSET1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimal1() <em>Decimal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal1()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimal1() <em>Decimal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal1()
	 * @generated
	 * @ordered
	 */
	protected String decimal1 = DECIMAL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration1() <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration1()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration1() <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration1()
	 * @generated
	 * @ordered
	 */
	protected Duration duration1 = DURATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumMember1() <em>Enum Member1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumMember1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ENUM_MEMBER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumMember1() <em>Enum Member1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumMember1()
	 * @generated
	 * @ordered
	 */
	protected List<String> enumMember1 = ENUM_MEMBER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat1() <em>Float1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat1()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOAT1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFloat1() <em>Float1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat1()
	 * @generated
	 * @ordered
	 */
	protected double float1 = FLOAT1_EDEFAULT;

	/**
	 * This is true if the Float1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean float1ESet;

	/**
	 * The default value of the '{@link #getGuid1() <em>Guid1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid1()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid1() <em>Guid1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid1()
	 * @generated
	 * @ordered
	 */
	protected String guid1 = GUID1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt1() <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInt1() <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger int1 = INT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelElementPath1() <em>Model Element Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementPath1()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ELEMENT_PATH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelElementPath1() <em>Model Element Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementPath1()
	 * @generated
	 * @ordered
	 */
	protected String modelElementPath1 = MODEL_ELEMENT_PATH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigationPropertyPath1() <em>Navigation Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPropertyPath1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATION_PROPERTY_PATH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigationPropertyPath1() <em>Navigation Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPropertyPath1()
	 * @generated
	 * @ordered
	 */
	protected String navigationPropertyPath1 = NAVIGATION_PROPERTY_PATH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath1() <em>Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath1()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath1() <em>Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath1()
	 * @generated
	 * @ordered
	 */
	protected String path1 = PATH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyPath1() <em>Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath1()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath1() <em>Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath1()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath1 = PROPERTY_PATH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected String string1 = STRING1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfDay1() <em>Time Of Day1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDay1()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_DAY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfDay1() <em>Time Of Day1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDay1()
	 * @generated
	 * @ordered
	 */
	protected String timeOfDay1 = TIME_OF_DAY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlRef1() <em>Url Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRef1()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_REF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlRef1() <em>Url Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRef1()
	 * @generated
	 * @ordered
	 */
	protected String urlRef1 = URL_REF1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTPropertyValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TPROPERTY_VALUE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBinaryConstantExpression> getBinary() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Binary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBoolConstantExpression> getBool() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Bool());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateConstantExpression> getDate() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateTimeOffsetConstantExpression> getDateTimeOffset() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_DateTimeOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecimalConstantExpression> getDecimal() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Decimal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDurationConstantExpression> getDuration() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<List> getEnumMember() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_EnumMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFloatConstantExpression> getFloat() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Float());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TGuidConstantExpression> getGuid() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Guid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIntConstantExpression> getInt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Int());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TStringConstantExpression> getString() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_String());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTimeOfDayConstantExpression> getTimeOfDay() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_TimeOfDay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnotationPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_AnnotationPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TApplyExpression> getApply() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getCast() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Cast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCollectionExpression> getCollection() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Collection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIfExpression> getIf() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_If());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getEq() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Eq());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getNe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Ne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Ge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Gt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Le());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Lt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAnd() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getOr() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNot() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getHas() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Has());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getIn() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_In());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAdd() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Add());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getSub() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNeg() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Neg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMul() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Mul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDiv() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDivBy() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_DivBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMod() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Mod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getIsOf() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_IsOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementExpression> getLabeledElement() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_LabeledElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementReferenceExpression> getLabeledElementReference() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_LabeledElementReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNullExpression> getNull() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Null());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModelElementPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_ModelElementPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNavigationPropertyPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_NavigationPropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPropertyPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_PropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRecordExpression> getRecord() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_Record());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getUrlRef() {
		return getGroup().list(EdmPackage.eINSTANCE.getTPropertyValue_UrlRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnotationPath1() {
		return annotationPath1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationPath1(String newAnnotationPath1) {
		String oldAnnotationPath1 = annotationPath1;
		annotationPath1 = newAnnotationPath1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH1, oldAnnotationPath1, annotationPath1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinary1() {
		return binary1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinary1(String newBinary1) {
		String oldBinary1 = binary1;
		binary1 = newBinary1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__BINARY1, oldBinary1, binary1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBool1() {
		return bool1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBool1(boolean newBool1) {
		boolean oldBool1 = bool1;
		bool1 = newBool1;
		boolean oldBool1ESet = bool1ESet;
		bool1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__BOOL1, oldBool1, bool1, !oldBool1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBool1() {
		boolean oldBool1 = bool1;
		boolean oldBool1ESet = bool1ESet;
		bool1 = BOOL1_EDEFAULT;
		bool1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TPROPERTY_VALUE__BOOL1, oldBool1, BOOL1_EDEFAULT, oldBool1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBool1() {
		return bool1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDate1() {
		return date1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate1(XMLGregorianCalendar newDate1) {
		XMLGregorianCalendar oldDate1 = date1;
		date1 = newDate1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__DATE1, oldDate1, date1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateTimeOffset1() {
		return dateTimeOffset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeOffset1(XMLGregorianCalendar newDateTimeOffset1) {
		XMLGregorianCalendar oldDateTimeOffset1 = dateTimeOffset1;
		dateTimeOffset1 = newDateTimeOffset1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET1, oldDateTimeOffset1, dateTimeOffset1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecimal1() {
		return decimal1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimal1(String newDecimal1) {
		String oldDecimal1 = decimal1;
		decimal1 = newDecimal1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__DECIMAL1, oldDecimal1, decimal1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration1() {
		return duration1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration1(Duration newDuration1) {
		Duration oldDuration1 = duration1;
		duration1 = newDuration1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__DURATION1, oldDuration1, duration1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEnumMember1() {
		return enumMember1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumMember1(List<String> newEnumMember1) {
		List<String> oldEnumMember1 = enumMember1;
		enumMember1 = newEnumMember1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER1, oldEnumMember1, enumMember1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloat1() {
		return float1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloat1(double newFloat1) {
		double oldFloat1 = float1;
		float1 = newFloat1;
		boolean oldFloat1ESet = float1ESet;
		float1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__FLOAT1, oldFloat1, float1, !oldFloat1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFloat1() {
		double oldFloat1 = float1;
		boolean oldFloat1ESet = float1ESet;
		float1 = FLOAT1_EDEFAULT;
		float1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TPROPERTY_VALUE__FLOAT1, oldFloat1, FLOAT1_EDEFAULT, oldFloat1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFloat1() {
		return float1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuid1() {
		return guid1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuid1(String newGuid1) {
		String oldGuid1 = guid1;
		guid1 = newGuid1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__GUID1, oldGuid1, guid1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getInt1() {
		return int1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt1(BigInteger newInt1) {
		BigInteger oldInt1 = int1;
		int1 = newInt1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__INT1, oldInt1, int1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelElementPath1() {
		return modelElementPath1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElementPath1(String newModelElementPath1) {
		String oldModelElementPath1 = modelElementPath1;
		modelElementPath1 = newModelElementPath1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH1, oldModelElementPath1, modelElementPath1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavigationPropertyPath1() {
		return navigationPropertyPath1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigationPropertyPath1(String newNavigationPropertyPath1) {
		String oldNavigationPropertyPath1 = navigationPropertyPath1;
		navigationPropertyPath1 = newNavigationPropertyPath1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1, oldNavigationPropertyPath1, navigationPropertyPath1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath1() {
		return path1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath1(String newPath1) {
		String oldPath1 = path1;
		path1 = newPath1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__PATH1, oldPath1, path1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyPath1() {
		return propertyPath1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyPath1(String newPropertyPath1) {
		String oldPropertyPath1 = propertyPath1;
		propertyPath1 = newPropertyPath1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH1, oldPropertyPath1, propertyPath1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString1() {
		return string1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString1(String newString1) {
		String oldString1 = string1;
		string1 = newString1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__STRING1, oldString1, string1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfDay1() {
		return timeOfDay1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfDay1(String newTimeOfDay1) {
		String oldTimeOfDay1 = timeOfDay1;
		timeOfDay1 = newTimeOfDay1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY1, oldTimeOfDay1, timeOfDay1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrlRef1() {
		return urlRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrlRef1(String newUrlRef1) {
		String oldUrlRef1 = urlRef1;
		urlRef1 = newUrlRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY_VALUE__URL_REF1, oldUrlRef1, urlRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TPROPERTY_VALUE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__BINARY:
				return ((InternalEList<?>)getBinary()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__BOOL:
				return ((InternalEList<?>)getBool()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET:
				return ((InternalEList<?>)getDateTimeOffset()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DECIMAL:
				return ((InternalEList<?>)getDecimal()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__GUID:
				return ((InternalEList<?>)getGuid()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__INT:
				return ((InternalEList<?>)getInt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__STRING:
				return ((InternalEList<?>)getString()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDay()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__CAST:
				return ((InternalEList<?>)getCast()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__EQ:
				return ((InternalEList<?>)getEq()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__NE:
				return ((InternalEList<?>)getNe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__GE:
				return ((InternalEList<?>)getGe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__GT:
				return ((InternalEList<?>)getGt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__LE:
				return ((InternalEList<?>)getLe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__LT:
				return ((InternalEList<?>)getLt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__ADD:
				return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__NEG:
				return ((InternalEList<?>)getNeg()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__MUL:
				return ((InternalEList<?>)getMul()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__DIV_BY:
				return ((InternalEList<?>)getDivBy()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__MOD:
				return ((InternalEList<?>)getMod()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__IS_OF:
				return ((InternalEList<?>)getIsOf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT:
				return ((InternalEList<?>)getLabeledElement()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE:
				return ((InternalEList<?>)getLabeledElementReference()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__NULL:
				return ((InternalEList<?>)getNull()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case EdmPackage.TPROPERTY_VALUE__URL_REF:
				return ((InternalEList<?>)getUrlRef()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TPROPERTY_VALUE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TPROPERTY_VALUE__BINARY:
				return getBinary();
			case EdmPackage.TPROPERTY_VALUE__BOOL:
				return getBool();
			case EdmPackage.TPROPERTY_VALUE__DATE:
				return getDate();
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET:
				return getDateTimeOffset();
			case EdmPackage.TPROPERTY_VALUE__DECIMAL:
				return getDecimal();
			case EdmPackage.TPROPERTY_VALUE__DURATION:
				return getDuration();
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER:
				return getEnumMember();
			case EdmPackage.TPROPERTY_VALUE__FLOAT:
				return getFloat();
			case EdmPackage.TPROPERTY_VALUE__GUID:
				return getGuid();
			case EdmPackage.TPROPERTY_VALUE__INT:
				return getInt();
			case EdmPackage.TPROPERTY_VALUE__STRING:
				return getString();
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY:
				return getTimeOfDay();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH:
				return getAnnotationPath();
			case EdmPackage.TPROPERTY_VALUE__APPLY:
				return getApply();
			case EdmPackage.TPROPERTY_VALUE__CAST:
				return getCast();
			case EdmPackage.TPROPERTY_VALUE__COLLECTION:
				return getCollection();
			case EdmPackage.TPROPERTY_VALUE__IF:
				return getIf();
			case EdmPackage.TPROPERTY_VALUE__EQ:
				return getEq();
			case EdmPackage.TPROPERTY_VALUE__NE:
				return getNe();
			case EdmPackage.TPROPERTY_VALUE__GE:
				return getGe();
			case EdmPackage.TPROPERTY_VALUE__GT:
				return getGt();
			case EdmPackage.TPROPERTY_VALUE__LE:
				return getLe();
			case EdmPackage.TPROPERTY_VALUE__LT:
				return getLt();
			case EdmPackage.TPROPERTY_VALUE__AND:
				return getAnd();
			case EdmPackage.TPROPERTY_VALUE__OR:
				return getOr();
			case EdmPackage.TPROPERTY_VALUE__NOT:
				return getNot();
			case EdmPackage.TPROPERTY_VALUE__HAS:
				return getHas();
			case EdmPackage.TPROPERTY_VALUE__IN:
				return getIn();
			case EdmPackage.TPROPERTY_VALUE__ADD:
				return getAdd();
			case EdmPackage.TPROPERTY_VALUE__SUB:
				return getSub();
			case EdmPackage.TPROPERTY_VALUE__NEG:
				return getNeg();
			case EdmPackage.TPROPERTY_VALUE__MUL:
				return getMul();
			case EdmPackage.TPROPERTY_VALUE__DIV:
				return getDiv();
			case EdmPackage.TPROPERTY_VALUE__DIV_BY:
				return getDivBy();
			case EdmPackage.TPROPERTY_VALUE__MOD:
				return getMod();
			case EdmPackage.TPROPERTY_VALUE__IS_OF:
				return getIsOf();
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT:
				return getLabeledElement();
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE:
				return getLabeledElementReference();
			case EdmPackage.TPROPERTY_VALUE__NULL:
				return getNull();
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH:
				return getModelElementPath();
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH:
				return getNavigationPropertyPath();
			case EdmPackage.TPROPERTY_VALUE__PATH:
				return getPath();
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH:
				return getPropertyPath();
			case EdmPackage.TPROPERTY_VALUE__RECORD:
				return getRecord();
			case EdmPackage.TPROPERTY_VALUE__URL_REF:
				return getUrlRef();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH1:
				return getAnnotationPath1();
			case EdmPackage.TPROPERTY_VALUE__BINARY1:
				return getBinary1();
			case EdmPackage.TPROPERTY_VALUE__BOOL1:
				return isBool1();
			case EdmPackage.TPROPERTY_VALUE__DATE1:
				return getDate1();
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET1:
				return getDateTimeOffset1();
			case EdmPackage.TPROPERTY_VALUE__DECIMAL1:
				return getDecimal1();
			case EdmPackage.TPROPERTY_VALUE__DURATION1:
				return getDuration1();
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER1:
				return getEnumMember1();
			case EdmPackage.TPROPERTY_VALUE__FLOAT1:
				return getFloat1();
			case EdmPackage.TPROPERTY_VALUE__GUID1:
				return getGuid1();
			case EdmPackage.TPROPERTY_VALUE__INT1:
				return getInt1();
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH1:
				return getModelElementPath1();
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1:
				return getNavigationPropertyPath1();
			case EdmPackage.TPROPERTY_VALUE__PATH1:
				return getPath1();
			case EdmPackage.TPROPERTY_VALUE__PROPERTY:
				return getProperty();
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH1:
				return getPropertyPath1();
			case EdmPackage.TPROPERTY_VALUE__STRING1:
				return getString1();
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY1:
				return getTimeOfDay1();
			case EdmPackage.TPROPERTY_VALUE__URL_REF1:
				return getUrlRef1();
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
			case EdmPackage.TPROPERTY_VALUE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__BINARY:
				getBinary().clear();
				getBinary().addAll((Collection<? extends TBinaryConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__BOOL:
				getBool().clear();
				getBool().addAll((Collection<? extends TBoolConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends TDateConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				getDateTimeOffset().addAll((Collection<? extends TDateTimeOffsetConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DECIMAL:
				getDecimal().clear();
				getDecimal().addAll((Collection<? extends TDecimalConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends TDurationConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER:
				getEnumMember().clear();
				getEnumMember().addAll((Collection<? extends List>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends TFloatConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__GUID:
				getGuid().clear();
				getGuid().addAll((Collection<? extends TGuidConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__INT:
				getInt().clear();
				getInt().addAll((Collection<? extends TIntConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__STRING:
				getString().clear();
				getString().addAll((Collection<? extends TStringConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY:
				getTimeOfDay().clear();
				getTimeOfDay().addAll((Collection<? extends TTimeOfDayConstantExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH:
				getAnnotationPath().clear();
				getAnnotationPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends TApplyExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__CAST:
				getCast().clear();
				getCast().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends TCollectionExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends TIfExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__EQ:
				getEq().clear();
				getEq().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NE:
				getNe().clear();
				getNe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__GE:
				getGe().clear();
				getGe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__GT:
				getGt().clear();
				getGt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__LE:
				getLe().clear();
				getLe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__LT:
				getLt().clear();
				getLt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NEG:
				getNeg().clear();
				getNeg().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__MUL:
				getMul().clear();
				getMul().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DIV_BY:
				getDivBy().clear();
				getDivBy().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__MOD:
				getMod().clear();
				getMod().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__IS_OF:
				getIsOf().clear();
				getIsOf().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT:
				getLabeledElement().clear();
				getLabeledElement().addAll((Collection<? extends TLabeledElementExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				getLabeledElementReference().addAll((Collection<? extends TLabeledElementReferenceExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends TNullExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				getModelElementPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				getNavigationPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH:
				getPropertyPath().clear();
				getPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends TRecordExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__URL_REF:
				getUrlRef().clear();
				getUrlRef().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH1:
				setAnnotationPath1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__BINARY1:
				setBinary1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__BOOL1:
				setBool1((Boolean)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE1:
				setDate1((XMLGregorianCalendar)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET1:
				setDateTimeOffset1((XMLGregorianCalendar)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DECIMAL1:
				setDecimal1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__DURATION1:
				setDuration1((Duration)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER1:
				setEnumMember1((List<String>)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__FLOAT1:
				setFloat1((Double)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__GUID1:
				setGuid1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__INT1:
				setInt1((BigInteger)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH1:
				setModelElementPath1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1:
				setNavigationPropertyPath1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__PATH1:
				setPath1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY:
				setProperty((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH1:
				setPropertyPath1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__STRING1:
				setString1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY1:
				setTimeOfDay1((String)newValue);
				return;
			case EdmPackage.TPROPERTY_VALUE__URL_REF1:
				setUrlRef1((String)newValue);
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
			case EdmPackage.TPROPERTY_VALUE__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__BINARY:
				getBinary().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__BOOL:
				getBool().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE:
				getDate().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DECIMAL:
				getDecimal().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DURATION:
				getDuration().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER:
				getEnumMember().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__FLOAT:
				getFloat().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__GUID:
				getGuid().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__INT:
				getInt().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__STRING:
				getString().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY:
				getTimeOfDay().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH:
				getAnnotationPath().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__APPLY:
				getApply().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__CAST:
				getCast().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__COLLECTION:
				getCollection().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__IF:
				getIf().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__EQ:
				getEq().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__NE:
				getNe().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__GE:
				getGe().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__GT:
				getGt().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__LE:
				getLe().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__LT:
				getLt().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__AND:
				getAnd().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__OR:
				getOr().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__NOT:
				getNot().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__HAS:
				getHas().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__IN:
				getIn().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__ADD:
				getAdd().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__SUB:
				getSub().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__NEG:
				getNeg().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__MUL:
				getMul().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DIV:
				getDiv().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__DIV_BY:
				getDivBy().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__MOD:
				getMod().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__IS_OF:
				getIsOf().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT:
				getLabeledElement().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__NULL:
				getNull().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__PATH:
				getPath().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH:
				getPropertyPath().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__RECORD:
				getRecord().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__URL_REF:
				getUrlRef().clear();
				return;
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH1:
				setAnnotationPath1(ANNOTATION_PATH1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__BINARY1:
				setBinary1(BINARY1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__BOOL1:
				unsetBool1();
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE1:
				setDate1(DATE1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET1:
				setDateTimeOffset1(DATE_TIME_OFFSET1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__DECIMAL1:
				setDecimal1(DECIMAL1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__DURATION1:
				setDuration1(DURATION1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER1:
				setEnumMember1(ENUM_MEMBER1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__FLOAT1:
				unsetFloat1();
				return;
			case EdmPackage.TPROPERTY_VALUE__GUID1:
				setGuid1(GUID1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__INT1:
				setInt1(INT1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH1:
				setModelElementPath1(MODEL_ELEMENT_PATH1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1:
				setNavigationPropertyPath1(NAVIGATION_PROPERTY_PATH1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__PATH1:
				setPath1(PATH1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH1:
				setPropertyPath1(PROPERTY_PATH1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__STRING1:
				setString1(STRING1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY1:
				setTimeOfDay1(TIME_OF_DAY1_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY_VALUE__URL_REF1:
				setUrlRef1(URL_REF1_EDEFAULT);
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
			case EdmPackage.TPROPERTY_VALUE__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__BINARY:
				return !getBinary().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__BOOL:
				return !getBool().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DATE:
				return !getDate().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET:
				return !getDateTimeOffset().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DECIMAL:
				return !getDecimal().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DURATION:
				return !getDuration().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER:
				return !getEnumMember().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__FLOAT:
				return !getFloat().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__GUID:
				return !getGuid().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__INT:
				return !getInt().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__STRING:
				return !getString().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY:
				return !getTimeOfDay().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH:
				return !getAnnotationPath().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__APPLY:
				return !getApply().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__CAST:
				return !getCast().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__COLLECTION:
				return !getCollection().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__IF:
				return !getIf().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__EQ:
				return !getEq().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__NE:
				return !getNe().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__GE:
				return !getGe().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__GT:
				return !getGt().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__LE:
				return !getLe().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__LT:
				return !getLt().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__AND:
				return !getAnd().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__OR:
				return !getOr().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__NOT:
				return !getNot().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__HAS:
				return !getHas().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__IN:
				return !getIn().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__ADD:
				return !getAdd().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__SUB:
				return !getSub().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__NEG:
				return !getNeg().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__MUL:
				return !getMul().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DIV:
				return !getDiv().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__DIV_BY:
				return !getDivBy().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__MOD:
				return !getMod().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__IS_OF:
				return !getIsOf().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT:
				return !getLabeledElement().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE:
				return !getLabeledElementReference().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__NULL:
				return !getNull().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH:
				return !getModelElementPath().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH:
				return !getNavigationPropertyPath().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__PATH:
				return !getPath().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH:
				return !getPropertyPath().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__RECORD:
				return !getRecord().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__URL_REF:
				return !getUrlRef().isEmpty();
			case EdmPackage.TPROPERTY_VALUE__ANNOTATION_PATH1:
				return ANNOTATION_PATH1_EDEFAULT == null ? annotationPath1 != null : !ANNOTATION_PATH1_EDEFAULT.equals(annotationPath1);
			case EdmPackage.TPROPERTY_VALUE__BINARY1:
				return BINARY1_EDEFAULT == null ? binary1 != null : !BINARY1_EDEFAULT.equals(binary1);
			case EdmPackage.TPROPERTY_VALUE__BOOL1:
				return isSetBool1();
			case EdmPackage.TPROPERTY_VALUE__DATE1:
				return DATE1_EDEFAULT == null ? date1 != null : !DATE1_EDEFAULT.equals(date1);
			case EdmPackage.TPROPERTY_VALUE__DATE_TIME_OFFSET1:
				return DATE_TIME_OFFSET1_EDEFAULT == null ? dateTimeOffset1 != null : !DATE_TIME_OFFSET1_EDEFAULT.equals(dateTimeOffset1);
			case EdmPackage.TPROPERTY_VALUE__DECIMAL1:
				return DECIMAL1_EDEFAULT == null ? decimal1 != null : !DECIMAL1_EDEFAULT.equals(decimal1);
			case EdmPackage.TPROPERTY_VALUE__DURATION1:
				return DURATION1_EDEFAULT == null ? duration1 != null : !DURATION1_EDEFAULT.equals(duration1);
			case EdmPackage.TPROPERTY_VALUE__ENUM_MEMBER1:
				return ENUM_MEMBER1_EDEFAULT == null ? enumMember1 != null : !ENUM_MEMBER1_EDEFAULT.equals(enumMember1);
			case EdmPackage.TPROPERTY_VALUE__FLOAT1:
				return isSetFloat1();
			case EdmPackage.TPROPERTY_VALUE__GUID1:
				return GUID1_EDEFAULT == null ? guid1 != null : !GUID1_EDEFAULT.equals(guid1);
			case EdmPackage.TPROPERTY_VALUE__INT1:
				return INT1_EDEFAULT == null ? int1 != null : !INT1_EDEFAULT.equals(int1);
			case EdmPackage.TPROPERTY_VALUE__MODEL_ELEMENT_PATH1:
				return MODEL_ELEMENT_PATH1_EDEFAULT == null ? modelElementPath1 != null : !MODEL_ELEMENT_PATH1_EDEFAULT.equals(modelElementPath1);
			case EdmPackage.TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1:
				return NAVIGATION_PROPERTY_PATH1_EDEFAULT == null ? navigationPropertyPath1 != null : !NAVIGATION_PROPERTY_PATH1_EDEFAULT.equals(navigationPropertyPath1);
			case EdmPackage.TPROPERTY_VALUE__PATH1:
				return PATH1_EDEFAULT == null ? path1 != null : !PATH1_EDEFAULT.equals(path1);
			case EdmPackage.TPROPERTY_VALUE__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case EdmPackage.TPROPERTY_VALUE__PROPERTY_PATH1:
				return PROPERTY_PATH1_EDEFAULT == null ? propertyPath1 != null : !PROPERTY_PATH1_EDEFAULT.equals(propertyPath1);
			case EdmPackage.TPROPERTY_VALUE__STRING1:
				return STRING1_EDEFAULT == null ? string1 != null : !STRING1_EDEFAULT.equals(string1);
			case EdmPackage.TPROPERTY_VALUE__TIME_OF_DAY1:
				return TIME_OF_DAY1_EDEFAULT == null ? timeOfDay1 != null : !TIME_OF_DAY1_EDEFAULT.equals(timeOfDay1);
			case EdmPackage.TPROPERTY_VALUE__URL_REF1:
				return URL_REF1_EDEFAULT == null ? urlRef1 != null : !URL_REF1_EDEFAULT.equals(urlRef1);
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
		result.append(", annotationPath1: ");
		result.append(annotationPath1);
		result.append(", binary1: ");
		result.append(binary1);
		result.append(", bool1: ");
		if (bool1ESet) result.append(bool1); else result.append("<unset>");
		result.append(", date1: ");
		result.append(date1);
		result.append(", dateTimeOffset1: ");
		result.append(dateTimeOffset1);
		result.append(", decimal1: ");
		result.append(decimal1);
		result.append(", duration1: ");
		result.append(duration1);
		result.append(", enumMember1: ");
		result.append(enumMember1);
		result.append(", float1: ");
		if (float1ESet) result.append(float1); else result.append("<unset>");
		result.append(", guid1: ");
		result.append(guid1);
		result.append(", int1: ");
		result.append(int1);
		result.append(", modelElementPath1: ");
		result.append(modelElementPath1);
		result.append(", navigationPropertyPath1: ");
		result.append(navigationPropertyPath1);
		result.append(", path1: ");
		result.append(path1);
		result.append(", property: ");
		result.append(property);
		result.append(", propertyPath1: ");
		result.append(propertyPath1);
		result.append(", string1: ");
		result.append(string1);
		result.append(", timeOfDay1: ");
		result.append(timeOfDay1);
		result.append(", urlRef1: ");
		result.append(urlRef1);
		result.append(')');
		return result.toString();
	}

} //TPropertyValueImpl
