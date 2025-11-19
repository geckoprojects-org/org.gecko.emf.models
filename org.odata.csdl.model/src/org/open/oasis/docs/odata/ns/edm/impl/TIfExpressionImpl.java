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
 * An implementation of the model object '<em><b>TIf Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getGExpression <em>GExpression</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl#getAnnotation1 <em>Annotation1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TIfExpressionImpl extends MinimalEObjectImpl.Container implements TIfExpression {
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
	protected TIfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTIfExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TIF_EXPRESSION__ANNOTATION);
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
			gExpression = new BasicFeatureMap(this, EdmPackage.TIF_EXPRESSION__GEXPRESSION);
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
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Binary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBoolConstantExpression> getBool() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Bool());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateConstantExpression> getDate() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDateTimeOffsetConstantExpression> getDateTimeOffset() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_DateTimeOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecimalConstantExpression> getDecimal() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Decimal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDurationConstantExpression> getDuration() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<List> getEnumMember() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_EnumMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFloatConstantExpression> getFloat() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Float());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TGuidConstantExpression> getGuid() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Guid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIntConstantExpression> getInt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Int());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TStringConstantExpression> getString() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_String());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTimeOfDayConstantExpression> getTimeOfDay() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_TimeOfDay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnotationPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_AnnotationPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TApplyExpression> getApply() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getCast() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Cast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCollectionExpression> getCollection() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Collection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIfExpression> getIf() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_If());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getEq() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Eq());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getNe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Ne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Ge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getGt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Gt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLe() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Le());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getLt() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Lt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAnd() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getOr() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNot() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getHas() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Has());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getIn() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_In());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getAdd() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Add());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getSub() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getNeg() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Neg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMul() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Mul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDiv() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getDivBy() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_DivBy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTwoChildrenExpression> getMod() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Mod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCastOrIsOfExpression> getIsOf() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_IsOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementExpression> getLabeledElement() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_LabeledElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLabeledElementReferenceExpression> getLabeledElementReference() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_LabeledElementReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNullExpression> getNull() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Null());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModelElementPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_ModelElementPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNavigationPropertyPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_NavigationPropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPropertyPath() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_PropertyPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRecordExpression> getRecord() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_Record());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOneChildExpression> getUrlRef() {
		return getGExpression().list(EdmPackage.eINSTANCE.getTIfExpression_UrlRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation1() {
		if (annotation1 == null) {
			annotation1 = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TIF_EXPRESSION__ANNOTATION1);
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
			case EdmPackage.TIF_EXPRESSION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__GEXPRESSION:
				return ((InternalEList<?>)getGExpression()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__BINARY:
				return ((InternalEList<?>)getBinary()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__BOOL:
				return ((InternalEList<?>)getBool()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DATE_TIME_OFFSET:
				return ((InternalEList<?>)getDateTimeOffset()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DECIMAL:
				return ((InternalEList<?>)getDecimal()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__GUID:
				return ((InternalEList<?>)getGuid()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__INT:
				return ((InternalEList<?>)getInt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__STRING:
				return ((InternalEList<?>)getString()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDay()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__CAST:
				return ((InternalEList<?>)getCast()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__EQ:
				return ((InternalEList<?>)getEq()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__NE:
				return ((InternalEList<?>)getNe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__GE:
				return ((InternalEList<?>)getGe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__GT:
				return ((InternalEList<?>)getGt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__LE:
				return ((InternalEList<?>)getLe()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__LT:
				return ((InternalEList<?>)getLt()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__ADD:
				return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__NEG:
				return ((InternalEList<?>)getNeg()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__MUL:
				return ((InternalEList<?>)getMul()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__DIV_BY:
				return ((InternalEList<?>)getDivBy()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__MOD:
				return ((InternalEList<?>)getMod()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__IS_OF:
				return ((InternalEList<?>)getIsOf()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT:
				return ((InternalEList<?>)getLabeledElement()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return ((InternalEList<?>)getLabeledElementReference()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__NULL:
				return ((InternalEList<?>)getNull()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__URL_REF:
				return ((InternalEList<?>)getUrlRef()).basicRemove(otherEnd, msgs);
			case EdmPackage.TIF_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TIF_EXPRESSION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TIF_EXPRESSION__GEXPRESSION:
				if (coreType) return getGExpression();
				return ((FeatureMap.Internal)getGExpression()).getWrapper();
			case EdmPackage.TIF_EXPRESSION__BINARY:
				return getBinary();
			case EdmPackage.TIF_EXPRESSION__BOOL:
				return getBool();
			case EdmPackage.TIF_EXPRESSION__DATE:
				return getDate();
			case EdmPackage.TIF_EXPRESSION__DATE_TIME_OFFSET:
				return getDateTimeOffset();
			case EdmPackage.TIF_EXPRESSION__DECIMAL:
				return getDecimal();
			case EdmPackage.TIF_EXPRESSION__DURATION:
				return getDuration();
			case EdmPackage.TIF_EXPRESSION__ENUM_MEMBER:
				return getEnumMember();
			case EdmPackage.TIF_EXPRESSION__FLOAT:
				return getFloat();
			case EdmPackage.TIF_EXPRESSION__GUID:
				return getGuid();
			case EdmPackage.TIF_EXPRESSION__INT:
				return getInt();
			case EdmPackage.TIF_EXPRESSION__STRING:
				return getString();
			case EdmPackage.TIF_EXPRESSION__TIME_OF_DAY:
				return getTimeOfDay();
			case EdmPackage.TIF_EXPRESSION__ANNOTATION_PATH:
				return getAnnotationPath();
			case EdmPackage.TIF_EXPRESSION__APPLY:
				return getApply();
			case EdmPackage.TIF_EXPRESSION__CAST:
				return getCast();
			case EdmPackage.TIF_EXPRESSION__COLLECTION:
				return getCollection();
			case EdmPackage.TIF_EXPRESSION__IF:
				return getIf();
			case EdmPackage.TIF_EXPRESSION__EQ:
				return getEq();
			case EdmPackage.TIF_EXPRESSION__NE:
				return getNe();
			case EdmPackage.TIF_EXPRESSION__GE:
				return getGe();
			case EdmPackage.TIF_EXPRESSION__GT:
				return getGt();
			case EdmPackage.TIF_EXPRESSION__LE:
				return getLe();
			case EdmPackage.TIF_EXPRESSION__LT:
				return getLt();
			case EdmPackage.TIF_EXPRESSION__AND:
				return getAnd();
			case EdmPackage.TIF_EXPRESSION__OR:
				return getOr();
			case EdmPackage.TIF_EXPRESSION__NOT:
				return getNot();
			case EdmPackage.TIF_EXPRESSION__HAS:
				return getHas();
			case EdmPackage.TIF_EXPRESSION__IN:
				return getIn();
			case EdmPackage.TIF_EXPRESSION__ADD:
				return getAdd();
			case EdmPackage.TIF_EXPRESSION__SUB:
				return getSub();
			case EdmPackage.TIF_EXPRESSION__NEG:
				return getNeg();
			case EdmPackage.TIF_EXPRESSION__MUL:
				return getMul();
			case EdmPackage.TIF_EXPRESSION__DIV:
				return getDiv();
			case EdmPackage.TIF_EXPRESSION__DIV_BY:
				return getDivBy();
			case EdmPackage.TIF_EXPRESSION__MOD:
				return getMod();
			case EdmPackage.TIF_EXPRESSION__IS_OF:
				return getIsOf();
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT:
				return getLabeledElement();
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return getLabeledElementReference();
			case EdmPackage.TIF_EXPRESSION__NULL:
				return getNull();
			case EdmPackage.TIF_EXPRESSION__MODEL_ELEMENT_PATH:
				return getModelElementPath();
			case EdmPackage.TIF_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return getNavigationPropertyPath();
			case EdmPackage.TIF_EXPRESSION__PATH:
				return getPath();
			case EdmPackage.TIF_EXPRESSION__PROPERTY_PATH:
				return getPropertyPath();
			case EdmPackage.TIF_EXPRESSION__RECORD:
				return getRecord();
			case EdmPackage.TIF_EXPRESSION__URL_REF:
				return getUrlRef();
			case EdmPackage.TIF_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TIF_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__GEXPRESSION:
				((FeatureMap.Internal)getGExpression()).set(newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__BINARY:
				getBinary().clear();
				getBinary().addAll((Collection<? extends TBinaryConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__BOOL:
				getBool().clear();
				getBool().addAll((Collection<? extends TBoolConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends TDateConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				getDateTimeOffset().addAll((Collection<? extends TDateTimeOffsetConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DECIMAL:
				getDecimal().clear();
				getDecimal().addAll((Collection<? extends TDecimalConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends TDurationConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				getEnumMember().addAll((Collection<? extends List>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends TFloatConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__GUID:
				getGuid().clear();
				getGuid().addAll((Collection<? extends TGuidConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__INT:
				getInt().clear();
				getInt().addAll((Collection<? extends TIntConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__STRING:
				getString().clear();
				getString().addAll((Collection<? extends TStringConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				getTimeOfDay().addAll((Collection<? extends TTimeOfDayConstantExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				getAnnotationPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends TApplyExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__CAST:
				getCast().clear();
				getCast().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends TCollectionExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends TIfExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__EQ:
				getEq().clear();
				getEq().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__NE:
				getNe().clear();
				getNe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__GE:
				getGe().clear();
				getGe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__GT:
				getGt().clear();
				getGt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__LE:
				getLe().clear();
				getLe().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__LT:
				getLt().clear();
				getLt().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__NEG:
				getNeg().clear();
				getNeg().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__MUL:
				getMul().clear();
				getMul().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__DIV_BY:
				getDivBy().clear();
				getDivBy().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__MOD:
				getMod().clear();
				getMod().addAll((Collection<? extends TTwoChildrenExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__IS_OF:
				getIsOf().clear();
				getIsOf().addAll((Collection<? extends TCastOrIsOfExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				getLabeledElement().addAll((Collection<? extends TLabeledElementExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				getLabeledElementReference().addAll((Collection<? extends TLabeledElementReferenceExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends TNullExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				getModelElementPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				getNavigationPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				getPropertyPath().addAll((Collection<? extends String>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends TRecordExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__URL_REF:
				getUrlRef().clear();
				getUrlRef().addAll((Collection<? extends TOneChildExpression>)newValue);
				return;
			case EdmPackage.TIF_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TIF_EXPRESSION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__GEXPRESSION:
				getGExpression().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__BINARY:
				getBinary().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__BOOL:
				getBool().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DATE:
				getDate().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DATE_TIME_OFFSET:
				getDateTimeOffset().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DECIMAL:
				getDecimal().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DURATION:
				getDuration().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__ENUM_MEMBER:
				getEnumMember().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__FLOAT:
				getFloat().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__GUID:
				getGuid().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__INT:
				getInt().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__STRING:
				getString().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__TIME_OF_DAY:
				getTimeOfDay().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__ANNOTATION_PATH:
				getAnnotationPath().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__APPLY:
				getApply().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__CAST:
				getCast().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__COLLECTION:
				getCollection().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__IF:
				getIf().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__EQ:
				getEq().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__NE:
				getNe().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__GE:
				getGe().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__GT:
				getGt().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__LE:
				getLe().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__LT:
				getLt().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__AND:
				getAnd().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__OR:
				getOr().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__NOT:
				getNot().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__HAS:
				getHas().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__IN:
				getIn().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__ADD:
				getAdd().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__SUB:
				getSub().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__NEG:
				getNeg().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__MUL:
				getMul().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DIV:
				getDiv().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__DIV_BY:
				getDivBy().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__MOD:
				getMod().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__IS_OF:
				getIsOf().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT:
				getLabeledElement().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				getLabeledElementReference().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__NULL:
				getNull().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__MODEL_ELEMENT_PATH:
				getModelElementPath().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				getNavigationPropertyPath().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__PATH:
				getPath().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__PROPERTY_PATH:
				getPropertyPath().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__RECORD:
				getRecord().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__URL_REF:
				getUrlRef().clear();
				return;
			case EdmPackage.TIF_EXPRESSION__ANNOTATION1:
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
			case EdmPackage.TIF_EXPRESSION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TIF_EXPRESSION__GEXPRESSION:
				return gExpression != null && !gExpression.isEmpty();
			case EdmPackage.TIF_EXPRESSION__BINARY:
				return !getBinary().isEmpty();
			case EdmPackage.TIF_EXPRESSION__BOOL:
				return !getBool().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DATE:
				return !getDate().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DATE_TIME_OFFSET:
				return !getDateTimeOffset().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DECIMAL:
				return !getDecimal().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DURATION:
				return !getDuration().isEmpty();
			case EdmPackage.TIF_EXPRESSION__ENUM_MEMBER:
				return !getEnumMember().isEmpty();
			case EdmPackage.TIF_EXPRESSION__FLOAT:
				return !getFloat().isEmpty();
			case EdmPackage.TIF_EXPRESSION__GUID:
				return !getGuid().isEmpty();
			case EdmPackage.TIF_EXPRESSION__INT:
				return !getInt().isEmpty();
			case EdmPackage.TIF_EXPRESSION__STRING:
				return !getString().isEmpty();
			case EdmPackage.TIF_EXPRESSION__TIME_OF_DAY:
				return !getTimeOfDay().isEmpty();
			case EdmPackage.TIF_EXPRESSION__ANNOTATION_PATH:
				return !getAnnotationPath().isEmpty();
			case EdmPackage.TIF_EXPRESSION__APPLY:
				return !getApply().isEmpty();
			case EdmPackage.TIF_EXPRESSION__CAST:
				return !getCast().isEmpty();
			case EdmPackage.TIF_EXPRESSION__COLLECTION:
				return !getCollection().isEmpty();
			case EdmPackage.TIF_EXPRESSION__IF:
				return !getIf().isEmpty();
			case EdmPackage.TIF_EXPRESSION__EQ:
				return !getEq().isEmpty();
			case EdmPackage.TIF_EXPRESSION__NE:
				return !getNe().isEmpty();
			case EdmPackage.TIF_EXPRESSION__GE:
				return !getGe().isEmpty();
			case EdmPackage.TIF_EXPRESSION__GT:
				return !getGt().isEmpty();
			case EdmPackage.TIF_EXPRESSION__LE:
				return !getLe().isEmpty();
			case EdmPackage.TIF_EXPRESSION__LT:
				return !getLt().isEmpty();
			case EdmPackage.TIF_EXPRESSION__AND:
				return !getAnd().isEmpty();
			case EdmPackage.TIF_EXPRESSION__OR:
				return !getOr().isEmpty();
			case EdmPackage.TIF_EXPRESSION__NOT:
				return !getNot().isEmpty();
			case EdmPackage.TIF_EXPRESSION__HAS:
				return !getHas().isEmpty();
			case EdmPackage.TIF_EXPRESSION__IN:
				return !getIn().isEmpty();
			case EdmPackage.TIF_EXPRESSION__ADD:
				return !getAdd().isEmpty();
			case EdmPackage.TIF_EXPRESSION__SUB:
				return !getSub().isEmpty();
			case EdmPackage.TIF_EXPRESSION__NEG:
				return !getNeg().isEmpty();
			case EdmPackage.TIF_EXPRESSION__MUL:
				return !getMul().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DIV:
				return !getDiv().isEmpty();
			case EdmPackage.TIF_EXPRESSION__DIV_BY:
				return !getDivBy().isEmpty();
			case EdmPackage.TIF_EXPRESSION__MOD:
				return !getMod().isEmpty();
			case EdmPackage.TIF_EXPRESSION__IS_OF:
				return !getIsOf().isEmpty();
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT:
				return !getLabeledElement().isEmpty();
			case EdmPackage.TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE:
				return !getLabeledElementReference().isEmpty();
			case EdmPackage.TIF_EXPRESSION__NULL:
				return !getNull().isEmpty();
			case EdmPackage.TIF_EXPRESSION__MODEL_ELEMENT_PATH:
				return !getModelElementPath().isEmpty();
			case EdmPackage.TIF_EXPRESSION__NAVIGATION_PROPERTY_PATH:
				return !getNavigationPropertyPath().isEmpty();
			case EdmPackage.TIF_EXPRESSION__PATH:
				return !getPath().isEmpty();
			case EdmPackage.TIF_EXPRESSION__PROPERTY_PATH:
				return !getPropertyPath().isEmpty();
			case EdmPackage.TIF_EXPRESSION__RECORD:
				return !getRecord().isEmpty();
			case EdmPackage.TIF_EXPRESSION__URL_REF:
				return !getUrlRef().isEmpty();
			case EdmPackage.TIF_EXPRESSION__ANNOTATION1:
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

} //TIfExpressionImpl
