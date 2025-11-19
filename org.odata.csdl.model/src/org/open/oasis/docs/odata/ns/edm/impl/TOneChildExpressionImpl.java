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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
import org.open.oasis.docs.odata.ns.edm.TRecordExpression;
import org.open.oasis.docs.odata.ns.edm.TStringConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOne Child Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl#getAnnotation1 <em>Annotation1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOneChildExpressionImpl extends MinimalEObjectImpl.Container implements TOneChildExpression {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationType> annotation;

	/**
	 * The cached value of the '{@link #getBinary() <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected TBinaryConstantExpression binary;

	/**
	 * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBool()
	 * @generated
	 * @ordered
	 */
	protected TBoolConstantExpression bool;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TDateConstantExpression date;

	/**
	 * The cached value of the '{@link #getDateTimeOffset() <em>Date Time Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeOffset()
	 * @generated
	 * @ordered
	 */
	protected TDateTimeOffsetConstantExpression dateTimeOffset;

	/**
	 * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected TDecimalConstantExpression decimal;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected TDurationConstantExpression duration;

	/**
	 * The default value of the '{@link #getEnumMember() <em>Enum Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumMember()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ENUM_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumMember() <em>Enum Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumMember()
	 * @generated
	 * @ordered
	 */
	protected List<String> enumMember = ENUM_MEMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected TFloatConstantExpression float_;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected TGuidConstantExpression guid;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected TIntConstantExpression int_;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected TStringConstantExpression string;

	/**
	 * The cached value of the '{@link #getTimeOfDay() <em>Time Of Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDay()
	 * @generated
	 * @ordered
	 */
	protected TTimeOfDayConstantExpression timeOfDay;

	/**
	 * The default value of the '{@link #getAnnotationPath() <em>Annotation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationPath() <em>Annotation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPath()
	 * @generated
	 * @ordered
	 */
	protected String annotationPath = ANNOTATION_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApply() <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply()
	 * @generated
	 * @ordered
	 */
	protected TApplyExpression apply;

	/**
	 * The cached value of the '{@link #getCast() <em>Cast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCast()
	 * @generated
	 * @ordered
	 */
	protected TCastOrIsOfExpression cast;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected TCollectionExpression collection;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected TIfExpression if_;

	/**
	 * The cached value of the '{@link #getEq() <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEq()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression eq;

	/**
	 * The cached value of the '{@link #getNe() <em>Ne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNe()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression ne;

	/**
	 * The cached value of the '{@link #getGe() <em>Ge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGe()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression ge;

	/**
	 * The cached value of the '{@link #getGt() <em>Gt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGt()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression gt;

	/**
	 * The cached value of the '{@link #getLe() <em>Le</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLe()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression le;

	/**
	 * The cached value of the '{@link #getLt() <em>Lt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLt()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression lt;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression and;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression or;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected TOneChildExpression not;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression has;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression in;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression add;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression sub;

	/**
	 * The cached value of the '{@link #getNeg() <em>Neg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeg()
	 * @generated
	 * @ordered
	 */
	protected TOneChildExpression neg;

	/**
	 * The cached value of the '{@link #getMul() <em>Mul</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMul()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression mul;

	/**
	 * The cached value of the '{@link #getDiv() <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiv()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression div;

	/**
	 * The cached value of the '{@link #getDivBy() <em>Div By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivBy()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression divBy;

	/**
	 * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMod()
	 * @generated
	 * @ordered
	 */
	protected TTwoChildrenExpression mod;

	/**
	 * The cached value of the '{@link #getIsOf() <em>Is Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOf()
	 * @generated
	 * @ordered
	 */
	protected TCastOrIsOfExpression isOf;

	/**
	 * The cached value of the '{@link #getLabeledElement() <em>Labeled Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledElement()
	 * @generated
	 * @ordered
	 */
	protected TLabeledElementExpression labeledElement;

	/**
	 * The cached value of the '{@link #getLabeledElementReference() <em>Labeled Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledElementReference()
	 * @generated
	 * @ordered
	 */
	protected TLabeledElementReferenceExpression labeledElementReference;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected TNullExpression null_;

	/**
	 * The default value of the '{@link #getModelElementPath() <em>Model Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ELEMENT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelElementPath() <em>Model Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementPath()
	 * @generated
	 * @ordered
	 */
	protected String modelElementPath = MODEL_ELEMENT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigationPropertyPath() <em>Navigation Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATION_PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigationPropertyPath() <em>Navigation Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String navigationPropertyPath = NAVIGATION_PROPERTY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected TRecordExpression record;

	/**
	 * The cached value of the '{@link #getUrlRef() <em>Url Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRef()
	 * @generated
	 * @ordered
	 */
	protected TOneChildExpression urlRef;

	/**
	 * The cached value of the '{@link #getAnnotation1() <em>Annotation1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation1()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationType> annotation1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOneChildExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTOneChildExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBinaryConstantExpression getBinary() {
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(TBinaryConstantExpression newBinary, NotificationChain msgs) {
		TBinaryConstantExpression oldBinary = binary;
		binary = newBinary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__BINARY, oldBinary, newBinary);
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
	public void setBinary(TBinaryConstantExpression newBinary) {
		if (newBinary != binary) {
			NotificationChain msgs = null;
			if (binary != null)
				msgs = ((InternalEObject)binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__BINARY, null, msgs);
			if (newBinary != null)
				msgs = ((InternalEObject)newBinary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__BINARY, null, msgs);
			msgs = basicSetBinary(newBinary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__BINARY, newBinary, newBinary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoolConstantExpression getBool() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBool(TBoolConstantExpression newBool, NotificationChain msgs) {
		TBoolConstantExpression oldBool = bool;
		bool = newBool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__BOOL, oldBool, newBool);
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
	public void setBool(TBoolConstantExpression newBool) {
		if (newBool != bool) {
			NotificationChain msgs = null;
			if (bool != null)
				msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__BOOL, null, msgs);
			if (newBool != null)
				msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__BOOL, null, msgs);
			msgs = basicSetBool(newBool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__BOOL, newBool, newBool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDateConstantExpression getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TDateConstantExpression newDate, NotificationChain msgs) {
		TDateConstantExpression oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DATE, oldDate, newDate);
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
	public void setDate(TDateConstantExpression newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDateTimeOffsetConstantExpression getDateTimeOffset() {
		return dateTimeOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeOffset(TDateTimeOffsetConstantExpression newDateTimeOffset, NotificationChain msgs) {
		TDateTimeOffsetConstantExpression oldDateTimeOffset = dateTimeOffset;
		dateTimeOffset = newDateTimeOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET, oldDateTimeOffset, newDateTimeOffset);
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
	public void setDateTimeOffset(TDateTimeOffsetConstantExpression newDateTimeOffset) {
		if (newDateTimeOffset != dateTimeOffset) {
			NotificationChain msgs = null;
			if (dateTimeOffset != null)
				msgs = ((InternalEObject)dateTimeOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET, null, msgs);
			if (newDateTimeOffset != null)
				msgs = ((InternalEObject)newDateTimeOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET, null, msgs);
			msgs = basicSetDateTimeOffset(newDateTimeOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET, newDateTimeOffset, newDateTimeOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecimalConstantExpression getDecimal() {
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecimal(TDecimalConstantExpression newDecimal, NotificationChain msgs) {
		TDecimalConstantExpression oldDecimal = decimal;
		decimal = newDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL, oldDecimal, newDecimal);
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
	public void setDecimal(TDecimalConstantExpression newDecimal) {
		if (newDecimal != decimal) {
			NotificationChain msgs = null;
			if (decimal != null)
				msgs = ((InternalEObject)decimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL, null, msgs);
			if (newDecimal != null)
				msgs = ((InternalEObject)newDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL, null, msgs);
			msgs = basicSetDecimal(newDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL, newDecimal, newDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDurationConstantExpression getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(TDurationConstantExpression newDuration, NotificationChain msgs) {
		TDurationConstantExpression oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DURATION, oldDuration, newDuration);
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
	public void setDuration(TDurationConstantExpression newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEnumMember() {
		return enumMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumMember(List<String> newEnumMember) {
		List<String> oldEnumMember = enumMember;
		enumMember = newEnumMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__ENUM_MEMBER, oldEnumMember, enumMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFloatConstantExpression getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat(TFloatConstantExpression newFloat, NotificationChain msgs) {
		TFloatConstantExpression oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__FLOAT, oldFloat, newFloat);
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
	public void setFloat(TFloatConstantExpression newFloat) {
		if (newFloat != float_) {
			NotificationChain msgs = null;
			if (float_ != null)
				msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__FLOAT, null, msgs);
			if (newFloat != null)
				msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__FLOAT, null, msgs);
			msgs = basicSetFloat(newFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__FLOAT, newFloat, newFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGuidConstantExpression getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuid(TGuidConstantExpression newGuid, NotificationChain msgs) {
		TGuidConstantExpression oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GUID, oldGuid, newGuid);
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
	public void setGuid(TGuidConstantExpression newGuid) {
		if (newGuid != guid) {
			NotificationChain msgs = null;
			if (guid != null)
				msgs = ((InternalEObject)guid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GUID, null, msgs);
			if (newGuid != null)
				msgs = ((InternalEObject)newGuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GUID, null, msgs);
			msgs = basicSetGuid(newGuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GUID, newGuid, newGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntConstantExpression getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInt(TIntConstantExpression newInt, NotificationChain msgs) {
		TIntConstantExpression oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__INT, oldInt, newInt);
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
	public void setInt(TIntConstantExpression newInt) {
		if (newInt != int_) {
			NotificationChain msgs = null;
			if (int_ != null)
				msgs = ((InternalEObject)int_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__INT, null, msgs);
			if (newInt != null)
				msgs = ((InternalEObject)newInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__INT, null, msgs);
			msgs = basicSetInt(newInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__INT, newInt, newInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStringConstantExpression getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(TStringConstantExpression newString, NotificationChain msgs) {
		TStringConstantExpression oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__STRING, oldString, newString);
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
	public void setString(TStringConstantExpression newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimeOfDayConstantExpression getTimeOfDay() {
		return timeOfDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeOfDay(TTimeOfDayConstantExpression newTimeOfDay, NotificationChain msgs) {
		TTimeOfDayConstantExpression oldTimeOfDay = timeOfDay;
		timeOfDay = newTimeOfDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY, oldTimeOfDay, newTimeOfDay);
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
	public void setTimeOfDay(TTimeOfDayConstantExpression newTimeOfDay) {
		if (newTimeOfDay != timeOfDay) {
			NotificationChain msgs = null;
			if (timeOfDay != null)
				msgs = ((InternalEObject)timeOfDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY, null, msgs);
			if (newTimeOfDay != null)
				msgs = ((InternalEObject)newTimeOfDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY, null, msgs);
			msgs = basicSetTimeOfDay(newTimeOfDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY, newTimeOfDay, newTimeOfDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnotationPath() {
		return annotationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationPath(String newAnnotationPath) {
		String oldAnnotationPath = annotationPath;
		annotationPath = newAnnotationPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION_PATH, oldAnnotationPath, annotationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TApplyExpression getApply() {
		return apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApply(TApplyExpression newApply, NotificationChain msgs) {
		TApplyExpression oldApply = apply;
		apply = newApply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__APPLY, oldApply, newApply);
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
	public void setApply(TApplyExpression newApply) {
		if (newApply != apply) {
			NotificationChain msgs = null;
			if (apply != null)
				msgs = ((InternalEObject)apply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__APPLY, null, msgs);
			if (newApply != null)
				msgs = ((InternalEObject)newApply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__APPLY, null, msgs);
			msgs = basicSetApply(newApply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__APPLY, newApply, newApply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCastOrIsOfExpression getCast() {
		return cast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCast(TCastOrIsOfExpression newCast, NotificationChain msgs) {
		TCastOrIsOfExpression oldCast = cast;
		cast = newCast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__CAST, oldCast, newCast);
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
	public void setCast(TCastOrIsOfExpression newCast) {
		if (newCast != cast) {
			NotificationChain msgs = null;
			if (cast != null)
				msgs = ((InternalEObject)cast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__CAST, null, msgs);
			if (newCast != null)
				msgs = ((InternalEObject)newCast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__CAST, null, msgs);
			msgs = basicSetCast(newCast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__CAST, newCast, newCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCollectionExpression getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(TCollectionExpression newCollection, NotificationChain msgs) {
		TCollectionExpression oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION, oldCollection, newCollection);
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
	public void setCollection(TCollectionExpression newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIfExpression getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(TIfExpression newIf, NotificationChain msgs) {
		TIfExpression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IF, oldIf, newIf);
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
	public void setIf(TIfExpression newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getEq() {
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEq(TTwoChildrenExpression newEq, NotificationChain msgs) {
		TTwoChildrenExpression oldEq = eq;
		eq = newEq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__EQ, oldEq, newEq);
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
	public void setEq(TTwoChildrenExpression newEq) {
		if (newEq != eq) {
			NotificationChain msgs = null;
			if (eq != null)
				msgs = ((InternalEObject)eq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__EQ, null, msgs);
			if (newEq != null)
				msgs = ((InternalEObject)newEq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__EQ, null, msgs);
			msgs = basicSetEq(newEq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__EQ, newEq, newEq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getNe() {
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNe(TTwoChildrenExpression newNe, NotificationChain msgs) {
		TTwoChildrenExpression oldNe = ne;
		ne = newNe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NE, oldNe, newNe);
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
	public void setNe(TTwoChildrenExpression newNe) {
		if (newNe != ne) {
			NotificationChain msgs = null;
			if (ne != null)
				msgs = ((InternalEObject)ne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NE, null, msgs);
			if (newNe != null)
				msgs = ((InternalEObject)newNe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NE, null, msgs);
			msgs = basicSetNe(newNe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NE, newNe, newNe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getGe() {
		return ge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGe(TTwoChildrenExpression newGe, NotificationChain msgs) {
		TTwoChildrenExpression oldGe = ge;
		ge = newGe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GE, oldGe, newGe);
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
	public void setGe(TTwoChildrenExpression newGe) {
		if (newGe != ge) {
			NotificationChain msgs = null;
			if (ge != null)
				msgs = ((InternalEObject)ge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GE, null, msgs);
			if (newGe != null)
				msgs = ((InternalEObject)newGe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GE, null, msgs);
			msgs = basicSetGe(newGe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GE, newGe, newGe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getGt() {
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGt(TTwoChildrenExpression newGt, NotificationChain msgs) {
		TTwoChildrenExpression oldGt = gt;
		gt = newGt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GT, oldGt, newGt);
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
	public void setGt(TTwoChildrenExpression newGt) {
		if (newGt != gt) {
			NotificationChain msgs = null;
			if (gt != null)
				msgs = ((InternalEObject)gt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GT, null, msgs);
			if (newGt != null)
				msgs = ((InternalEObject)newGt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__GT, null, msgs);
			msgs = basicSetGt(newGt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__GT, newGt, newGt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getLe() {
		return le;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLe(TTwoChildrenExpression newLe, NotificationChain msgs) {
		TTwoChildrenExpression oldLe = le;
		le = newLe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LE, oldLe, newLe);
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
	public void setLe(TTwoChildrenExpression newLe) {
		if (newLe != le) {
			NotificationChain msgs = null;
			if (le != null)
				msgs = ((InternalEObject)le).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LE, null, msgs);
			if (newLe != null)
				msgs = ((InternalEObject)newLe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LE, null, msgs);
			msgs = basicSetLe(newLe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LE, newLe, newLe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getLt() {
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLt(TTwoChildrenExpression newLt, NotificationChain msgs) {
		TTwoChildrenExpression oldLt = lt;
		lt = newLt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LT, oldLt, newLt);
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
	public void setLt(TTwoChildrenExpression newLt) {
		if (newLt != lt) {
			NotificationChain msgs = null;
			if (lt != null)
				msgs = ((InternalEObject)lt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LT, null, msgs);
			if (newLt != null)
				msgs = ((InternalEObject)newLt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LT, null, msgs);
			msgs = basicSetLt(newLt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LT, newLt, newLt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(TTwoChildrenExpression newAnd, NotificationChain msgs) {
		TTwoChildrenExpression oldAnd = and;
		and = newAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__AND, oldAnd, newAnd);
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
	public void setAnd(TTwoChildrenExpression newAnd) {
		if (newAnd != and) {
			NotificationChain msgs = null;
			if (and != null)
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__AND, newAnd, newAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(TTwoChildrenExpression newOr, NotificationChain msgs) {
		TTwoChildrenExpression oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__OR, oldOr, newOr);
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
	public void setOr(TTwoChildrenExpression newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__OR, newOr, newOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOneChildExpression getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(TOneChildExpression newNot, NotificationChain msgs) {
		TOneChildExpression oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NOT, oldNot, newNot);
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
	public void setNot(TOneChildExpression newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas(TTwoChildrenExpression newHas, NotificationChain msgs) {
		TTwoChildrenExpression oldHas = has;
		has = newHas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__HAS, oldHas, newHas);
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
	public void setHas(TTwoChildrenExpression newHas) {
		if (newHas != has) {
			NotificationChain msgs = null;
			if (has != null)
				msgs = ((InternalEObject)has).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__HAS, null, msgs);
			if (newHas != null)
				msgs = ((InternalEObject)newHas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__HAS, null, msgs);
			msgs = basicSetHas(newHas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__HAS, newHas, newHas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(TTwoChildrenExpression newIn, NotificationChain msgs) {
		TTwoChildrenExpression oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IN, oldIn, newIn);
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
	public void setIn(TTwoChildrenExpression newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(TTwoChildrenExpression newAdd, NotificationChain msgs) {
		TTwoChildrenExpression oldAdd = add;
		add = newAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__ADD, oldAdd, newAdd);
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
	public void setAdd(TTwoChildrenExpression newAdd) {
		if (newAdd != add) {
			NotificationChain msgs = null;
			if (add != null)
				msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__ADD, null, msgs);
			if (newAdd != null)
				msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__ADD, null, msgs);
			msgs = basicSetAdd(newAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__ADD, newAdd, newAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getSub() {
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(TTwoChildrenExpression newSub, NotificationChain msgs) {
		TTwoChildrenExpression oldSub = sub;
		sub = newSub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__SUB, oldSub, newSub);
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
	public void setSub(TTwoChildrenExpression newSub) {
		if (newSub != sub) {
			NotificationChain msgs = null;
			if (sub != null)
				msgs = ((InternalEObject)sub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__SUB, null, msgs);
			if (newSub != null)
				msgs = ((InternalEObject)newSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__SUB, null, msgs);
			msgs = basicSetSub(newSub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__SUB, newSub, newSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOneChildExpression getNeg() {
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeg(TOneChildExpression newNeg, NotificationChain msgs) {
		TOneChildExpression oldNeg = neg;
		neg = newNeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NEG, oldNeg, newNeg);
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
	public void setNeg(TOneChildExpression newNeg) {
		if (newNeg != neg) {
			NotificationChain msgs = null;
			if (neg != null)
				msgs = ((InternalEObject)neg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NEG, null, msgs);
			if (newNeg != null)
				msgs = ((InternalEObject)newNeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NEG, null, msgs);
			msgs = basicSetNeg(newNeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NEG, newNeg, newNeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getMul() {
		return mul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMul(TTwoChildrenExpression newMul, NotificationChain msgs) {
		TTwoChildrenExpression oldMul = mul;
		mul = newMul;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__MUL, oldMul, newMul);
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
	public void setMul(TTwoChildrenExpression newMul) {
		if (newMul != mul) {
			NotificationChain msgs = null;
			if (mul != null)
				msgs = ((InternalEObject)mul).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__MUL, null, msgs);
			if (newMul != null)
				msgs = ((InternalEObject)newMul).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__MUL, null, msgs);
			msgs = basicSetMul(newMul, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__MUL, newMul, newMul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getDiv() {
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiv(TTwoChildrenExpression newDiv, NotificationChain msgs) {
		TTwoChildrenExpression oldDiv = div;
		div = newDiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DIV, oldDiv, newDiv);
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
	public void setDiv(TTwoChildrenExpression newDiv) {
		if (newDiv != div) {
			NotificationChain msgs = null;
			if (div != null)
				msgs = ((InternalEObject)div).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DIV, null, msgs);
			if (newDiv != null)
				msgs = ((InternalEObject)newDiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DIV, null, msgs);
			msgs = basicSetDiv(newDiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DIV, newDiv, newDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getDivBy() {
		return divBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivBy(TTwoChildrenExpression newDivBy, NotificationChain msgs) {
		TTwoChildrenExpression oldDivBy = divBy;
		divBy = newDivBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY, oldDivBy, newDivBy);
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
	public void setDivBy(TTwoChildrenExpression newDivBy) {
		if (newDivBy != divBy) {
			NotificationChain msgs = null;
			if (divBy != null)
				msgs = ((InternalEObject)divBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY, null, msgs);
			if (newDivBy != null)
				msgs = ((InternalEObject)newDivBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY, null, msgs);
			msgs = basicSetDivBy(newDivBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY, newDivBy, newDivBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTwoChildrenExpression getMod() {
		return mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMod(TTwoChildrenExpression newMod, NotificationChain msgs) {
		TTwoChildrenExpression oldMod = mod;
		mod = newMod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__MOD, oldMod, newMod);
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
	public void setMod(TTwoChildrenExpression newMod) {
		if (newMod != mod) {
			NotificationChain msgs = null;
			if (mod != null)
				msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__MOD, null, msgs);
			if (newMod != null)
				msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__MOD, null, msgs);
			msgs = basicSetMod(newMod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__MOD, newMod, newMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCastOrIsOfExpression getIsOf() {
		return isOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOf(TCastOrIsOfExpression newIsOf, NotificationChain msgs) {
		TCastOrIsOfExpression oldIsOf = isOf;
		isOf = newIsOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IS_OF, oldIsOf, newIsOf);
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
	public void setIsOf(TCastOrIsOfExpression newIsOf) {
		if (newIsOf != isOf) {
			NotificationChain msgs = null;
			if (isOf != null)
				msgs = ((InternalEObject)isOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IS_OF, null, msgs);
			if (newIsOf != null)
				msgs = ((InternalEObject)newIsOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__IS_OF, null, msgs);
			msgs = basicSetIsOf(newIsOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__IS_OF, newIsOf, newIsOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLabeledElementExpression getLabeledElement() {
		return labeledElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabeledElement(TLabeledElementExpression newLabeledElement, NotificationChain msgs) {
		TLabeledElementExpression oldLabeledElement = labeledElement;
		labeledElement = newLabeledElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT, oldLabeledElement, newLabeledElement);
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
	public void setLabeledElement(TLabeledElementExpression newLabeledElement) {
		if (newLabeledElement != labeledElement) {
			NotificationChain msgs = null;
			if (labeledElement != null)
				msgs = ((InternalEObject)labeledElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT, null, msgs);
			if (newLabeledElement != null)
				msgs = ((InternalEObject)newLabeledElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT, null, msgs);
			msgs = basicSetLabeledElement(newLabeledElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT, newLabeledElement, newLabeledElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLabeledElementReferenceExpression getLabeledElementReference() {
		return labeledElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabeledElementReference(TLabeledElementReferenceExpression newLabeledElementReference, NotificationChain msgs) {
		TLabeledElementReferenceExpression oldLabeledElementReference = labeledElementReference;
		labeledElementReference = newLabeledElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE, oldLabeledElementReference, newLabeledElementReference);
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
	public void setLabeledElementReference(TLabeledElementReferenceExpression newLabeledElementReference) {
		if (newLabeledElementReference != labeledElementReference) {
			NotificationChain msgs = null;
			if (labeledElementReference != null)
				msgs = ((InternalEObject)labeledElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE, null, msgs);
			if (newLabeledElementReference != null)
				msgs = ((InternalEObject)newLabeledElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetLabeledElementReference(newLabeledElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE, newLabeledElementReference, newLabeledElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNullExpression getNull() {
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNull(TNullExpression newNull, NotificationChain msgs) {
		TNullExpression oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NULL, oldNull, newNull);
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
	public void setNull(TNullExpression newNull) {
		if (newNull != null_) {
			NotificationChain msgs = null;
			if (null_ != null)
				msgs = ((InternalEObject)null_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NULL, null, msgs);
			if (newNull != null)
				msgs = ((InternalEObject)newNull).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__NULL, null, msgs);
			msgs = basicSetNull(newNull, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NULL, newNull, newNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelElementPath() {
		return modelElementPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElementPath(String newModelElementPath) {
		String oldModelElementPath = modelElementPath;
		modelElementPath = newModelElementPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH, oldModelElementPath, modelElementPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavigationPropertyPath() {
		return navigationPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigationPropertyPath(String newNavigationPropertyPath) {
		String oldNavigationPropertyPath = navigationPropertyPath;
		navigationPropertyPath = newNavigationPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH, oldNavigationPropertyPath, navigationPropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRecordExpression getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(TRecordExpression newRecord, NotificationChain msgs) {
		TRecordExpression oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__RECORD, oldRecord, newRecord);
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
	public void setRecord(TRecordExpression newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOneChildExpression getUrlRef() {
		return urlRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrlRef(TOneChildExpression newUrlRef, NotificationChain msgs) {
		TOneChildExpression oldUrlRef = urlRef;
		urlRef = newUrlRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__URL_REF, oldUrlRef, newUrlRef);
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
	public void setUrlRef(TOneChildExpression newUrlRef) {
		if (newUrlRef != urlRef) {
			NotificationChain msgs = null;
			if (urlRef != null)
				msgs = ((InternalEObject)urlRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__URL_REF, null, msgs);
			if (newUrlRef != null)
				msgs = ((InternalEObject)newUrlRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TONE_CHILD_EXPRESSION__URL_REF, null, msgs);
			msgs = basicSetUrlRef(newUrlRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TONE_CHILD_EXPRESSION__URL_REF, newUrlRef, newUrlRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation1() {
		if (annotation1 == null) {
			annotation1 = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1);
		}
		return annotation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__BINARY:
				return basicSetBinary(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__BOOL:
				return basicSetBool(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE:
				return basicSetDate(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET:
				return basicSetDateTimeOffset(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL:
				return basicSetDecimal(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DURATION:
				return basicSetDuration(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__FLOAT:
				return basicSetFloat(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__GUID:
				return basicSetGuid(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__INT:
				return basicSetInt(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__STRING:
				return basicSetString(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY:
				return basicSetTimeOfDay(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__APPLY:
				return basicSetApply(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__CAST:
				return basicSetCast(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION:
				return basicSetCollection(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__IF:
				return basicSetIf(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__EQ:
				return basicSetEq(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__NE:
				return basicSetNe(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__GE:
				return basicSetGe(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__GT:
				return basicSetGt(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__LE:
				return basicSetLe(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__LT:
				return basicSetLt(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__AND:
				return basicSetAnd(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__OR:
				return basicSetOr(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__NOT:
				return basicSetNot(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__HAS:
				return basicSetHas(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__IN:
				return basicSetIn(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__ADD:
				return basicSetAdd(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__SUB:
				return basicSetSub(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__NEG:
				return basicSetNeg(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__MUL:
				return basicSetMul(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV:
				return basicSetDiv(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY:
				return basicSetDivBy(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__MOD:
				return basicSetMod(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__IS_OF:
				return basicSetIsOf(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT:
				return basicSetLabeledElement(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return basicSetLabeledElementReference(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__NULL:
				return basicSetNull(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__RECORD:
				return basicSetRecord(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__URL_REF:
				return basicSetUrlRef(null, msgs);
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1:
				return ((InternalEList<?>)getAnnotation1()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TONE_CHILD_EXPRESSION__BINARY:
				return getBinary();
			case EdmPackage.TONE_CHILD_EXPRESSION__BOOL:
				return getBool();
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE:
				return getDate();
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET:
				return getDateTimeOffset();
			case EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL:
				return getDecimal();
			case EdmPackage.TONE_CHILD_EXPRESSION__DURATION:
				return getDuration();
			case EdmPackage.TONE_CHILD_EXPRESSION__ENUM_MEMBER:
				return getEnumMember();
			case EdmPackage.TONE_CHILD_EXPRESSION__FLOAT:
				return getFloat();
			case EdmPackage.TONE_CHILD_EXPRESSION__GUID:
				return getGuid();
			case EdmPackage.TONE_CHILD_EXPRESSION__INT:
				return getInt();
			case EdmPackage.TONE_CHILD_EXPRESSION__STRING:
				return getString();
			case EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY:
				return getTimeOfDay();
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION_PATH:
				return getAnnotationPath();
			case EdmPackage.TONE_CHILD_EXPRESSION__APPLY:
				return getApply();
			case EdmPackage.TONE_CHILD_EXPRESSION__CAST:
				return getCast();
			case EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION:
				return getCollection();
			case EdmPackage.TONE_CHILD_EXPRESSION__IF:
				return getIf();
			case EdmPackage.TONE_CHILD_EXPRESSION__EQ:
				return getEq();
			case EdmPackage.TONE_CHILD_EXPRESSION__NE:
				return getNe();
			case EdmPackage.TONE_CHILD_EXPRESSION__GE:
				return getGe();
			case EdmPackage.TONE_CHILD_EXPRESSION__GT:
				return getGt();
			case EdmPackage.TONE_CHILD_EXPRESSION__LE:
				return getLe();
			case EdmPackage.TONE_CHILD_EXPRESSION__LT:
				return getLt();
			case EdmPackage.TONE_CHILD_EXPRESSION__AND:
				return getAnd();
			case EdmPackage.TONE_CHILD_EXPRESSION__OR:
				return getOr();
			case EdmPackage.TONE_CHILD_EXPRESSION__NOT:
				return getNot();
			case EdmPackage.TONE_CHILD_EXPRESSION__HAS:
				return getHas();
			case EdmPackage.TONE_CHILD_EXPRESSION__IN:
				return getIn();
			case EdmPackage.TONE_CHILD_EXPRESSION__ADD:
				return getAdd();
			case EdmPackage.TONE_CHILD_EXPRESSION__SUB:
				return getSub();
			case EdmPackage.TONE_CHILD_EXPRESSION__NEG:
				return getNeg();
			case EdmPackage.TONE_CHILD_EXPRESSION__MUL:
				return getMul();
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV:
				return getDiv();
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY:
				return getDivBy();
			case EdmPackage.TONE_CHILD_EXPRESSION__MOD:
				return getMod();
			case EdmPackage.TONE_CHILD_EXPRESSION__IS_OF:
				return getIsOf();
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT:
				return getLabeledElement();
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return getLabeledElementReference();
			case EdmPackage.TONE_CHILD_EXPRESSION__NULL:
				return getNull();
			case EdmPackage.TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH:
				return getModelElementPath();
			case EdmPackage.TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return getNavigationPropertyPath();
			case EdmPackage.TONE_CHILD_EXPRESSION__PATH:
				return getPath();
			case EdmPackage.TONE_CHILD_EXPRESSION__PROPERTY_PATH:
				return getPropertyPath();
			case EdmPackage.TONE_CHILD_EXPRESSION__RECORD:
				return getRecord();
			case EdmPackage.TONE_CHILD_EXPRESSION__URL_REF:
				return getUrlRef();
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1:
				return getAnnotation1();
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
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__BINARY:
				setBinary((TBinaryConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__BOOL:
				setBool((TBoolConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE:
				setDate((TDateConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET:
				setDateTimeOffset((TDateTimeOffsetConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL:
				setDecimal((TDecimalConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DURATION:
				setDuration((TDurationConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ENUM_MEMBER:
				setEnumMember((List<String>)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__FLOAT:
				setFloat((TFloatConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GUID:
				setGuid((TGuidConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__INT:
				setInt((TIntConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__STRING:
				setString((TStringConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY:
				setTimeOfDay((TTimeOfDayConstantExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION_PATH:
				setAnnotationPath((String)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__APPLY:
				setApply((TApplyExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__CAST:
				setCast((TCastOrIsOfExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION:
				setCollection((TCollectionExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IF:
				setIf((TIfExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__EQ:
				setEq((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NE:
				setNe((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GE:
				setGe((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GT:
				setGt((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LE:
				setLe((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LT:
				setLt((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__AND:
				setAnd((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__OR:
				setOr((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NOT:
				setNot((TOneChildExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__HAS:
				setHas((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IN:
				setIn((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ADD:
				setAdd((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__SUB:
				setSub((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NEG:
				setNeg((TOneChildExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MUL:
				setMul((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV:
				setDiv((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY:
				setDivBy((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MOD:
				setMod((TTwoChildrenExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IS_OF:
				setIsOf((TCastOrIsOfExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT:
				setLabeledElement((TLabeledElementExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				setLabeledElementReference((TLabeledElementReferenceExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NULL:
				setNull((TNullExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH:
				setModelElementPath((String)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				setNavigationPropertyPath((String)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__PATH:
				setPath((String)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__PROPERTY_PATH:
				setPropertyPath((String)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__RECORD:
				setRecord((TRecordExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__URL_REF:
				setUrlRef((TOneChildExpression)newValue);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1:
				getAnnotation1().clear();
				getAnnotation1().addAll((Collection<? extends AnnotationType>)newValue);
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
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__BINARY:
				setBinary((TBinaryConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__BOOL:
				setBool((TBoolConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE:
				setDate((TDateConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET:
				setDateTimeOffset((TDateTimeOffsetConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL:
				setDecimal((TDecimalConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DURATION:
				setDuration((TDurationConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ENUM_MEMBER:
				setEnumMember(ENUM_MEMBER_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__FLOAT:
				setFloat((TFloatConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GUID:
				setGuid((TGuidConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__INT:
				setInt((TIntConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__STRING:
				setString((TStringConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY:
				setTimeOfDay((TTimeOfDayConstantExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION_PATH:
				setAnnotationPath(ANNOTATION_PATH_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__APPLY:
				setApply((TApplyExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__CAST:
				setCast((TCastOrIsOfExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION:
				setCollection((TCollectionExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IF:
				setIf((TIfExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__EQ:
				setEq((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NE:
				setNe((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GE:
				setGe((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__GT:
				setGt((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LE:
				setLe((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LT:
				setLt((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__AND:
				setAnd((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__OR:
				setOr((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NOT:
				setNot((TOneChildExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__HAS:
				setHas((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IN:
				setIn((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ADD:
				setAdd((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__SUB:
				setSub((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NEG:
				setNeg((TOneChildExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MUL:
				setMul((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV:
				setDiv((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY:
				setDivBy((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MOD:
				setMod((TTwoChildrenExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__IS_OF:
				setIsOf((TCastOrIsOfExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT:
				setLabeledElement((TLabeledElementExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				setLabeledElementReference((TLabeledElementReferenceExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NULL:
				setNull((TNullExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH:
				setModelElementPath(MODEL_ELEMENT_PATH_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				setNavigationPropertyPath(NAVIGATION_PROPERTY_PATH_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__RECORD:
				setRecord((TRecordExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__URL_REF:
				setUrlRef((TOneChildExpression)null);
				return;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1:
				getAnnotation1().clear();
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
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TONE_CHILD_EXPRESSION__BINARY:
				return binary != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__BOOL:
				return bool != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE:
				return date != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET:
				return dateTimeOffset != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DECIMAL:
				return decimal != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DURATION:
				return duration != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__ENUM_MEMBER:
				return ENUM_MEMBER_EDEFAULT == null ? enumMember != null : !ENUM_MEMBER_EDEFAULT.equals(enumMember);
			case EdmPackage.TONE_CHILD_EXPRESSION__FLOAT:
				return float_ != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__GUID:
				return guid != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__INT:
				return int_ != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__STRING:
				return string != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__TIME_OF_DAY:
				return timeOfDay != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION_PATH:
				return ANNOTATION_PATH_EDEFAULT == null ? annotationPath != null : !ANNOTATION_PATH_EDEFAULT.equals(annotationPath);
			case EdmPackage.TONE_CHILD_EXPRESSION__APPLY:
				return apply != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__CAST:
				return cast != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__COLLECTION:
				return collection != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__IF:
				return if_ != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__EQ:
				return eq != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__NE:
				return ne != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__GE:
				return ge != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__GT:
				return gt != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__LE:
				return le != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__LT:
				return lt != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__AND:
				return and != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__OR:
				return or != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__NOT:
				return not != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__HAS:
				return has != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__IN:
				return in != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__ADD:
				return add != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__SUB:
				return sub != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__NEG:
				return neg != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__MUL:
				return mul != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV:
				return div != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__DIV_BY:
				return divBy != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__MOD:
				return mod != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__IS_OF:
				return isOf != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT:
				return labeledElement != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return labeledElementReference != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__NULL:
				return null_ != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH:
				return MODEL_ELEMENT_PATH_EDEFAULT == null ? modelElementPath != null : !MODEL_ELEMENT_PATH_EDEFAULT.equals(modelElementPath);
			case EdmPackage.TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return NAVIGATION_PROPERTY_PATH_EDEFAULT == null ? navigationPropertyPath != null : !NAVIGATION_PROPERTY_PATH_EDEFAULT.equals(navigationPropertyPath);
			case EdmPackage.TONE_CHILD_EXPRESSION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case EdmPackage.TONE_CHILD_EXPRESSION__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
			case EdmPackage.TONE_CHILD_EXPRESSION__RECORD:
				return record != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__URL_REF:
				return urlRef != null;
			case EdmPackage.TONE_CHILD_EXPRESSION__ANNOTATION1:
				return annotation1 != null && !annotation1.isEmpty();
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
		result.append(" (enumMember: ");
		result.append(enumMember);
		result.append(", annotationPath: ");
		result.append(annotationPath);
		result.append(", modelElementPath: ");
		result.append(modelElementPath);
		result.append(", navigationPropertyPath: ");
		result.append(navigationPropertyPath);
		result.append(", path: ");
		result.append(path);
		result.append(", propertyPath: ");
		result.append(propertyPath);
		result.append(')');
		return result.toString();
	}

} //TOneChildExpressionImpl
