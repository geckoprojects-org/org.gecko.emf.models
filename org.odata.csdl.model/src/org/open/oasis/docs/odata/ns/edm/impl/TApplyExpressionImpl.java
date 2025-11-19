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
import org.open.oasis.docs.odata.ns.edm.TRecordExpression;
import org.open.oasis.docs.odata.ns.edm.TStringConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression;
import org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TApply Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TApplyExpressionImpl extends MinimalEObjectImpl.Container implements TApplyExpression {
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
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final Object FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Object function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TApplyExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTApplyExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TAPPLY_EXPRESSION__GROUP);
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
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBinaryConstantExpression> getBinary() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Binary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBoolConstantExpression> getBool() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Bool());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateConstantExpression> getDate() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateTimeOffsetConstantExpression> getDateTimeOffset() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_DateTimeOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecimalConstantExpression> getDecimal() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Decimal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDurationConstantExpression> getDuration() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<List> getEnumMember() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_EnumMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFloatConstantExpression> getFloat() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Float());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TGuidConstantExpression> getGuid() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Guid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIntConstantExpression> getInt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Int());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TStringConstantExpression> getString() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_String());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTimeOfDayConstantExpression> getTimeOfDay() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_TimeOfDay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnotationPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_AnnotationPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TApplyExpression> getApply() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getCast() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Cast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCollectionExpression> getCollection() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Collection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIfExpression> getIf() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_If());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getEq() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Eq());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getNe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Ne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Ge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Gt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLe() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Le());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLt() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Lt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAnd() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getOr() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNot() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getHas() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Has());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getIn() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_In());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAdd() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Add());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getSub() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNeg() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Neg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMul() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Mul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDiv() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDivBy() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_DivBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMod() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Mod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getIsOf() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_IsOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementExpression> getLabeledElement() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_LabeledElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementReferenceExpression> getLabeledElementReference() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_LabeledElementReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNullExpression> getNull() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Null());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModelElementPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_ModelElementPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNavigationPropertyPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_NavigationPropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPropertyPath() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_PropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRecordExpression> getRecord() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_Record());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getUrlRef() {
		return getGroup().list(EdmPackage.eINSTANCE.getTApplyExpression_UrlRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(Object newFunction) {
		Object oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TAPPLY_EXPRESSION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TAPPLY_EXPRESSION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__BINARY:
				return ((InternalEList<?>)getBinary()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__BOOL:
				return ((InternalEList<?>)getBool()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DATE_TIME_OFFSET:
				return ((InternalEList<?>)getDateTimeOffset()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DECIMAL:
				return ((InternalEList<?>)getDecimal()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__GUID:
				return ((InternalEList<?>)getGuid()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__INT:
				return ((InternalEList<?>)getInt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__STRING:
				return ((InternalEList<?>)getString()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDay()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__CAST:
				return ((InternalEList<?>)getCast()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__EQ:
				return ((InternalEList<?>)getEq()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__NE:
				return ((InternalEList<?>)getNe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__GE:
				return ((InternalEList<?>)getGe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__GT:
				return ((InternalEList<?>)getGt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__LE:
				return ((InternalEList<?>)getLe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__LT:
				return ((InternalEList<?>)getLt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__ADD:
				return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__NEG:
				return ((InternalEList<?>)getNeg()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__MUL:
				return ((InternalEList<?>)getMul()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__DIV_BY:
				return ((InternalEList<?>)getDivBy()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__MOD:
				return ((InternalEList<?>)getMod()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__IS_OF:
				return ((InternalEList<?>)getIsOf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT:
				return ((InternalEList<?>)getLabeledElement()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return ((InternalEList<?>)getLabeledElementReference()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__NULL:
				return ((InternalEList<?>)getNull()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case EdmPackage.TAPPLY_EXPRESSION__URL_REF:
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
			case EdmPackage.TAPPLY_EXPRESSION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TAPPLY_EXPRESSION__BINARY:
				return getBinary();
			case EdmPackage.TAPPLY_EXPRESSION__BOOL:
				return getBool();
			case EdmPackage.TAPPLY_EXPRESSION__DATE:
				return getDate();
			case EdmPackage.TAPPLY_EXPRESSION__DATE_TIME_OFFSET:
				return getDateTimeOffset();
			case EdmPackage.TAPPLY_EXPRESSION__DECIMAL:
				return getDecimal();
			case EdmPackage.TAPPLY_EXPRESSION__DURATION:
				return getDuration();
			case EdmPackage.TAPPLY_EXPRESSION__ENUM_MEMBER:
				return getEnumMember();
			case EdmPackage.TAPPLY_EXPRESSION__FLOAT:
				return getFloat();
			case EdmPackage.TAPPLY_EXPRESSION__GUID:
				return getGuid();
			case EdmPackage.TAPPLY_EXPRESSION__INT:
				return getInt();
			case EdmPackage.TAPPLY_EXPRESSION__STRING:
				return getString();
			case EdmPackage.TAPPLY_EXPRESSION__TIME_OF_DAY:
				return getTimeOfDay();
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION_PATH:
				return getAnnotationPath();
			case EdmPackage.TAPPLY_EXPRESSION__APPLY:
				return getApply();
			case EdmPackage.TAPPLY_EXPRESSION__CAST:
				return getCast();
			case EdmPackage.TAPPLY_EXPRESSION__COLLECTION:
				return getCollection();
			case EdmPackage.TAPPLY_EXPRESSION__IF:
				return getIf();
			case EdmPackage.TAPPLY_EXPRESSION__EQ:
				return getEq();
			case EdmPackage.TAPPLY_EXPRESSION__NE:
				return getNe();
			case EdmPackage.TAPPLY_EXPRESSION__GE:
				return getGe();
			case EdmPackage.TAPPLY_EXPRESSION__GT:
				return getGt();
			case EdmPackage.TAPPLY_EXPRESSION__LE:
				return getLe();
			case EdmPackage.TAPPLY_EXPRESSION__LT:
				return getLt();
			case EdmPackage.TAPPLY_EXPRESSION__AND:
				return getAnd();
			case EdmPackage.TAPPLY_EXPRESSION__OR:
				return getOr();
			case EdmPackage.TAPPLY_EXPRESSION__NOT:
				return getNot();
			case EdmPackage.TAPPLY_EXPRESSION__HAS:
				return getHas();
			case EdmPackage.TAPPLY_EXPRESSION__IN:
				return getIn();
			case EdmPackage.TAPPLY_EXPRESSION__ADD:
				return getAdd();
			case EdmPackage.TAPPLY_EXPRESSION__SUB:
				return getSub();
			case EdmPackage.TAPPLY_EXPRESSION__NEG:
				return getNeg();
			case EdmPackage.TAPPLY_EXPRESSION__MUL:
				return getMul();
			case EdmPackage.TAPPLY_EXPRESSION__DIV:
				return getDiv();
			case EdmPackage.TAPPLY_EXPRESSION__DIV_BY:
				return getDivBy();
			case EdmPackage.TAPPLY_EXPRESSION__MOD:
				return getMod();
			case EdmPackage.TAPPLY_EXPRESSION__IS_OF:
				return getIsOf();
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT:
				return getLabeledElement();
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return getLabeledElementReference();
			case EdmPackage.TAPPLY_EXPRESSION__NULL:
				return getNull();
			case EdmPackage.TAPPLY_EXPRESSION__MODEL_ELEMENT_PATH:
				return getModelElementPath();
			case EdmPackage.TAPPLY_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return getNavigationPropertyPath();
			case EdmPackage.TAPPLY_EXPRESSION__PATH:
				return getPath();
			case EdmPackage.TAPPLY_EXPRESSION__PROPERTY_PATH:
				return getPropertyPath();
			case EdmPackage.TAPPLY_EXPRESSION__RECORD:
				return getRecord();
			case EdmPackage.TAPPLY_EXPRESSION__URL_REF:
				return getUrlRef();
			case EdmPackage.TAPPLY_EXPRESSION__FUNCTION:
				return getFunction();
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
			case EdmPackage.TAPPLY_EXPRESSION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__BINARY:
				getBinary().clear();
				getBinary().addAll((Collection<? extends TBinaryConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__BOOL:
				getBool().clear();
				getBool().addAll((Collection<? extends TBoolConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends TDateConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				getDateTimeOffset().addAll((Collection<? extends TDateTimeOffsetConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DECIMAL:
				getDecimal().clear();
				getDecimal().addAll((Collection<? extends TDecimalConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends TDurationConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				getEnumMember().addAll((Collection<? extends List>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends TFloatConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GUID:
				getGuid().clear();
				getGuid().addAll((Collection<? extends TGuidConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__INT:
				getInt().clear();
				getInt().addAll((Collection<? extends TIntConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__STRING:
				getString().clear();
				getString().addAll((Collection<? extends TStringConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				getTimeOfDay().addAll((Collection<? extends TTimeOfDayConstantExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				getAnnotationPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends TApplyExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__CAST:
				getCast().clear();
				getCast().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends TCollectionExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends TIfExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__EQ:
				getEq().clear();
				getEq().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NE:
				getNe().clear();
				getNe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GE:
				getGe().clear();
				getGe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GT:
				getGt().clear();
				getGt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LE:
				getLe().clear();
				getLe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LT:
				getLt().clear();
				getLt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NEG:
				getNeg().clear();
				getNeg().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MUL:
				getMul().clear();
				getMul().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DIV_BY:
				getDivBy().clear();
				getDivBy().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MOD:
				getMod().clear();
				getMod().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IS_OF:
				getIsOf().clear();
				getIsOf().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				getLabeledElement().addAll((Collection<? extends TLabeledElementExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				getLabeledElementReference().addAll((Collection<? extends TLabeledElementReferenceExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends TNullExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				getModelElementPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				getNavigationPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				getPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends TRecordExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__URL_REF:
				getUrlRef().clear();
				getUrlRef().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TAPPLY_EXPRESSION__FUNCTION:
				setFunction(newValue);
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
			case EdmPackage.TAPPLY_EXPRESSION__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__BINARY:
				getBinary().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__BOOL:
				getBool().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DATE:
				getDate().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DECIMAL:
				getDecimal().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DURATION:
				getDuration().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__FLOAT:
				getFloat().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GUID:
				getGuid().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__INT:
				getInt().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__STRING:
				getString().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__APPLY:
				getApply().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__CAST:
				getCast().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__COLLECTION:
				getCollection().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IF:
				getIf().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__EQ:
				getEq().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NE:
				getNe().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GE:
				getGe().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__GT:
				getGt().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LE:
				getLe().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LT:
				getLt().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__AND:
				getAnd().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__OR:
				getOr().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NOT:
				getNot().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__HAS:
				getHas().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IN:
				getIn().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__ADD:
				getAdd().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__SUB:
				getSub().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NEG:
				getNeg().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MUL:
				getMul().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DIV:
				getDiv().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__DIV_BY:
				getDivBy().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MOD:
				getMod().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__IS_OF:
				getIsOf().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NULL:
				getNull().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__PATH:
				getPath().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__RECORD:
				getRecord().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__URL_REF:
				getUrlRef().clear();
				return;
			case EdmPackage.TAPPLY_EXPRESSION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
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
			case EdmPackage.TAPPLY_EXPRESSION__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__BINARY:
				return !getBinary().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__BOOL:
				return !getBool().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DATE:
				return !getDate().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DATE_TIME_OFFSET:
				return !getDateTimeOffset().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DECIMAL:
				return !getDecimal().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DURATION:
				return !getDuration().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__ENUM_MEMBER:
				return !getEnumMember().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__FLOAT:
				return !getFloat().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__GUID:
				return !getGuid().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__INT:
				return !getInt().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__STRING:
				return !getString().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__TIME_OF_DAY:
				return !getTimeOfDay().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__ANNOTATION_PATH:
				return !getAnnotationPath().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__APPLY:
				return !getApply().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__CAST:
				return !getCast().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__COLLECTION:
				return !getCollection().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__IF:
				return !getIf().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__EQ:
				return !getEq().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__NE:
				return !getNe().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__GE:
				return !getGe().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__GT:
				return !getGt().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__LE:
				return !getLe().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__LT:
				return !getLt().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__AND:
				return !getAnd().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__OR:
				return !getOr().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__NOT:
				return !getNot().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__HAS:
				return !getHas().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__IN:
				return !getIn().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__ADD:
				return !getAdd().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__SUB:
				return !getSub().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__NEG:
				return !getNeg().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__MUL:
				return !getMul().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DIV:
				return !getDiv().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__DIV_BY:
				return !getDivBy().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__MOD:
				return !getMod().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__IS_OF:
				return !getIsOf().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT:
				return !getLabeledElement().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return !getLabeledElementReference().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__NULL:
				return !getNull().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__MODEL_ELEMENT_PATH:
				return !getModelElementPath().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return !getNavigationPropertyPath().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__PATH:
				return !getPath().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__PROPERTY_PATH:
				return !getPropertyPath().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__RECORD:
				return !getRecord().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__URL_REF:
				return !getUrlRef().isEmpty();
			case EdmPackage.TAPPLY_EXPRESSION__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
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
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //TApplyExpressionImpl
