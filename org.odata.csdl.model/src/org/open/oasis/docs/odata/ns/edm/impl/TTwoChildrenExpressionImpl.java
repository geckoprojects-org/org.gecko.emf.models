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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 * An implementation of the model object '<em><b>TTwo Children Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getGExpression <em>GExpression</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl#getAnnotation1 <em>Annotation1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTwoChildrenExpressionImpl extends MinimalEObjectImpl.Container implements TTwoChildrenExpression {
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
	 * The cached value of the '{@link #getGExpression() <em>GExpression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGExpression()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap gExpression;

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
	protected TTwoChildrenExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTTwoChildrenExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGExpression() {
		if (gExpression == null) {
			gExpression = new BasicFeatureMap(this, EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION);
		}
		return gExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBinaryConstantExpression> getBinary() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Binary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBoolConstantExpression> getBool() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Bool());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateConstantExpression> getDate() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateTimeOffsetConstantExpression> getDateTimeOffset() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_DateTimeOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecimalConstantExpression> getDecimal() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Decimal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDurationConstantExpression> getDuration() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<List> getEnumMember() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_EnumMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFloatConstantExpression> getFloat() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Float());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TGuidConstantExpression> getGuid() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Guid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIntConstantExpression> getInt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Int());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TStringConstantExpression> getString() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_String());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTimeOfDayConstantExpression> getTimeOfDay() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_TimeOfDay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnotationPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_AnnotationPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TApplyExpression> getApply() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getCast() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Cast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCollectionExpression> getCollection() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Collection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIfExpression> getIf() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_If());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getEq() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Eq());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getNe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Ne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Ge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Gt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Le());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Lt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAnd() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getOr() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNot() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getHas() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Has());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getIn() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_In());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAdd() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Add());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getSub() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNeg() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Neg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMul() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Mul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDiv() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDivBy() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_DivBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMod() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Mod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getIsOf() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_IsOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementExpression> getLabeledElement() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_LabeledElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementReferenceExpression> getLabeledElementReference() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_LabeledElementReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNullExpression> getNull() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Null());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModelElementPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_ModelElementPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNavigationPropertyPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_NavigationPropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPropertyPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_PropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRecordExpression> getRecord() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_Record());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getUrlRef() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTTwoChildrenExpression_UrlRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation1() {
		if (annotation1 == null) {
			annotation1 = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1);
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
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION:
				return ((InternalEList<?>)getGExpression()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BINARY:
				return ((InternalEList<?>)getBinary()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BOOL:
				return ((InternalEList<?>)getBool()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET:
				return ((InternalEList<?>)getDateTimeOffset()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DECIMAL:
				return ((InternalEList<?>)getDecimal()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GUID:
				return ((InternalEList<?>)getGuid()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__INT:
				return ((InternalEList<?>)getInt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__STRING:
				return ((InternalEList<?>)getString()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDay()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__CAST:
				return ((InternalEList<?>)getCast()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__EQ:
				return ((InternalEList<?>)getEq()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NE:
				return ((InternalEList<?>)getNe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GE:
				return ((InternalEList<?>)getGe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GT:
				return ((InternalEList<?>)getGt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LE:
				return ((InternalEList<?>)getLe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LT:
				return ((InternalEList<?>)getLt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ADD:
				return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NEG:
				return ((InternalEList<?>)getNeg()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MUL:
				return ((InternalEList<?>)getMul()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV_BY:
				return ((InternalEList<?>)getDivBy()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MOD:
				return ((InternalEList<?>)getMod()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IS_OF:
				return ((InternalEList<?>)getIsOf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT:
				return ((InternalEList<?>)getLabeledElement()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return ((InternalEList<?>)getLabeledElementReference()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NULL:
				return ((InternalEList<?>)getNull()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__URL_REF:
				return ((InternalEList<?>)getUrlRef()).basicRemove(otherEnd, msgs);
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION:
				if (coreType) return getGExpression();
				return ((FeatureMap.Internal)getGExpression()).getWrapper();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BINARY:
				return getBinary();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BOOL:
				return getBool();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE:
				return getDate();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET:
				return getDateTimeOffset();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DECIMAL:
				return getDecimal();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DURATION:
				return getDuration();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ENUM_MEMBER:
				return getEnumMember();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__FLOAT:
				return getFloat();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GUID:
				return getGuid();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__INT:
				return getInt();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__STRING:
				return getString();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY:
				return getTimeOfDay();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION_PATH:
				return getAnnotationPath();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__APPLY:
				return getApply();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__CAST:
				return getCast();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__COLLECTION:
				return getCollection();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IF:
				return getIf();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__EQ:
				return getEq();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NE:
				return getNe();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GE:
				return getGe();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GT:
				return getGt();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LE:
				return getLe();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LT:
				return getLt();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__AND:
				return getAnd();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__OR:
				return getOr();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NOT:
				return getNot();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__HAS:
				return getHas();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IN:
				return getIn();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ADD:
				return getAdd();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__SUB:
				return getSub();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NEG:
				return getNeg();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MUL:
				return getMul();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV:
				return getDiv();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV_BY:
				return getDivBy();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MOD:
				return getMod();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IS_OF:
				return getIsOf();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT:
				return getLabeledElement();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return getLabeledElementReference();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NULL:
				return getNull();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MODEL_ELEMENT_PATH:
				return getModelElementPath();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return getNavigationPropertyPath();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PATH:
				return getPath();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PROPERTY_PATH:
				return getPropertyPath();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__RECORD:
				return getRecord();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__URL_REF:
				return getUrlRef();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION:
				((FeatureMap.Internal)getGExpression()).set(newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BINARY:
				getBinary().clear();
				getBinary().addAll((Collection<? extends TBinaryConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BOOL:
				getBool().clear();
				getBool().addAll((Collection<? extends TBoolConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends TDateConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				getDateTimeOffset().addAll((Collection<? extends TDateTimeOffsetConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DECIMAL:
				getDecimal().clear();
				getDecimal().addAll((Collection<? extends TDecimalConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends TDurationConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				getEnumMember().addAll((Collection<? extends List>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends TFloatConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GUID:
				getGuid().clear();
				getGuid().addAll((Collection<? extends TGuidConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__INT:
				getInt().clear();
				getInt().addAll((Collection<? extends TIntConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__STRING:
				getString().clear();
				getString().addAll((Collection<? extends TStringConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				getTimeOfDay().addAll((Collection<? extends TTimeOfDayConstantExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				getAnnotationPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends TApplyExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__CAST:
				getCast().clear();
				getCast().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends TCollectionExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends TIfExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__EQ:
				getEq().clear();
				getEq().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NE:
				getNe().clear();
				getNe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GE:
				getGe().clear();
				getGe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GT:
				getGt().clear();
				getGt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LE:
				getLe().clear();
				getLe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LT:
				getLt().clear();
				getLt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NEG:
				getNeg().clear();
				getNeg().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MUL:
				getMul().clear();
				getMul().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV_BY:
				getDivBy().clear();
				getDivBy().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MOD:
				getMod().clear();
				getMod().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IS_OF:
				getIsOf().clear();
				getIsOf().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				getLabeledElement().addAll((Collection<? extends TLabeledElementExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				getLabeledElementReference().addAll((Collection<? extends TLabeledElementReferenceExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends TNullExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				getModelElementPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				getNavigationPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				getPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends TRecordExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__URL_REF:
				getUrlRef().clear();
				getUrlRef().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION:
				getGExpression().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BINARY:
				getBinary().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BOOL:
				getBool().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE:
				getDate().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DECIMAL:
				getDecimal().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DURATION:
				getDuration().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__FLOAT:
				getFloat().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GUID:
				getGuid().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__INT:
				getInt().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__STRING:
				getString().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__APPLY:
				getApply().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__CAST:
				getCast().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__COLLECTION:
				getCollection().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IF:
				getIf().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__EQ:
				getEq().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NE:
				getNe().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GE:
				getGe().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GT:
				getGt().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LE:
				getLe().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LT:
				getLt().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__AND:
				getAnd().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__OR:
				getOr().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NOT:
				getNot().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__HAS:
				getHas().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IN:
				getIn().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ADD:
				getAdd().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__SUB:
				getSub().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NEG:
				getNeg().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MUL:
				getMul().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV:
				getDiv().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV_BY:
				getDivBy().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MOD:
				getMod().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IS_OF:
				getIsOf().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NULL:
				getNull().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PATH:
				getPath().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__RECORD:
				getRecord().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__URL_REF:
				getUrlRef().clear();
				return;
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GEXPRESSION:
				return gExpression != null && !gExpression.isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BINARY:
				return !getBinary().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__BOOL:
				return !getBool().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE:
				return !getDate().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET:
				return !getDateTimeOffset().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DECIMAL:
				return !getDecimal().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DURATION:
				return !getDuration().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ENUM_MEMBER:
				return !getEnumMember().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__FLOAT:
				return !getFloat().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GUID:
				return !getGuid().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__INT:
				return !getInt().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__STRING:
				return !getString().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY:
				return !getTimeOfDay().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION_PATH:
				return !getAnnotationPath().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__APPLY:
				return !getApply().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__CAST:
				return !getCast().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__COLLECTION:
				return !getCollection().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IF:
				return !getIf().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__EQ:
				return !getEq().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NE:
				return !getNe().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GE:
				return !getGe().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__GT:
				return !getGt().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LE:
				return !getLe().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LT:
				return !getLt().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__AND:
				return !getAnd().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__OR:
				return !getOr().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NOT:
				return !getNot().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__HAS:
				return !getHas().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IN:
				return !getIn().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ADD:
				return !getAdd().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__SUB:
				return !getSub().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NEG:
				return !getNeg().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MUL:
				return !getMul().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV:
				return !getDiv().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__DIV_BY:
				return !getDivBy().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MOD:
				return !getMod().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__IS_OF:
				return !getIsOf().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT:
				return !getLabeledElement().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return !getLabeledElementReference().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NULL:
				return !getNull().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__MODEL_ELEMENT_PATH:
				return !getModelElementPath().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return !getNavigationPropertyPath().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PATH:
				return !getPath().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__PROPERTY_PATH:
				return !getPropertyPath().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__RECORD:
				return !getRecord().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__URL_REF:
				return !getUrlRef().isEmpty();
			case EdmPackage.TTWO_CHILDREN_EXPRESSION__ANNOTATION1:
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
		result.append(" (gExpression: ");
		result.append(gExpression);
		result.append(')');
		return result.toString();
	}

} //TTwoChildrenExpressionImpl
