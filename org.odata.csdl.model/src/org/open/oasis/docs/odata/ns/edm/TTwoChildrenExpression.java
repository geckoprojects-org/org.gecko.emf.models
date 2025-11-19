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
package org.open.oasis.docs.odata.ns.edm;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTwo Children Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGExpression <em>GExpression</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation1 <em>Annotation1</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression()
 * @model extendedMetaData="name='TTwoChildrenExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTwoChildrenExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>GExpression</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GExpression</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_GExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GExpression:1'"
	 * @generated
	 */
	FeatureMap getGExpression();

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Binary()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TBinaryConstantExpression> getBinary();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Bool()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bool' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TBoolConstantExpression> getBool();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Date()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TDateConstantExpression> getDate();

	/**
	 * Returns the value of the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Offset</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_DateTimeOffset()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTimeOffset' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TDateTimeOffsetConstantExpression> getDateTimeOffset();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Decimal()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TDecimalConstantExpression> getDecimal();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Duration()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TDurationConstantExpression> getDuration();

	/**
	 * Returns the value of the '<em><b>Enum Member</b></em>' attribute list.
	 * The list contents are of type {@link java.util.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Member</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_EnumMember()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TEnumMemberList" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumMember' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<List> getEnumMember();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Float()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Float' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TFloatConstantExpression> getFloat();

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Guid()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TGuidConstantExpression> getGuid();

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Int()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TIntConstantExpression> getInt();

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_String()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TStringConstantExpression> getString();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_TimeOfDay()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeOfDay' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTimeOfDayConstantExpression> getTimeOfDay();

	/**
	 * Returns the value of the '<em><b>Annotation Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_AnnotationPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnnotationPath' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<String> getAnnotationPath();

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TApplyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Apply()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Apply' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TApplyExpression> getApply();

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Cast()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cast' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getCast();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Collection()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Collection' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TCollectionExpression> getCollection();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_If()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='If' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TIfExpression> getIf();

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Eq()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Eq' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getEq();

	/**
	 * Returns the value of the '<em><b>Ne</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ne</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Ne()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ne' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getNe();

	/**
	 * Returns the value of the '<em><b>Ge</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ge</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Ge()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ge' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGe();

	/**
	 * Returns the value of the '<em><b>Gt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Gt()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Gt' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGt();

	/**
	 * Returns the value of the '<em><b>Le</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Le</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Le()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Le' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLe();

	/**
	 * Returns the value of the '<em><b>Lt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Lt()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lt' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLt();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_And()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAnd();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Or()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Not()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TOneChildExpression> getNot();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Has()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Has' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getHas();

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_In()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='In' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getIn();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Add()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Add' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAdd();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Sub()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sub' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getSub();

	/**
	 * Returns the value of the '<em><b>Neg</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Neg()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Neg' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TOneChildExpression> getNeg();

	/**
	 * Returns the value of the '<em><b>Mul</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mul</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Mul()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mul' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMul();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Div()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Div' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDiv();

	/**
	 * Returns the value of the '<em><b>Div By</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div By</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_DivBy()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DivBy' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDivBy();

	/**
	 * Returns the value of the '<em><b>Mod</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Mod()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mod' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMod();

	/**
	 * Returns the value of the '<em><b>Is Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_IsOf()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IsOf' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getIsOf();

	/**
	 * Returns the value of the '<em><b>Labeled Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_LabeledElement()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElement' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TLabeledElementExpression> getLabeledElement();

	/**
	 * Returns the value of the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_LabeledElementReference()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElementReference' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TLabeledElementReferenceExpression> getLabeledElementReference();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNullExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Null()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TNullExpression> getNull();

	/**
	 * Returns the value of the '<em><b>Model Element Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_ModelElementPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelElementPath' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<String> getModelElementPath();

	/**
	 * Returns the value of the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_NavigationPropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationPropertyPath' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<String> getNavigationPropertyPath();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Path()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TInstancePath" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<String> getPath();

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_PropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyPath' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<String> getPropertyPath();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TRecordExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Record()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TRecordExpression> getRecord();

	/**
	 * Returns the value of the '<em><b>Url Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_UrlRef()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UrlRef' namespace='##targetNamespace' group='#GExpression:1'"
	 * @generated
	 */
	EList<TOneChildExpression> getUrlRef();

	/**
	 * Returns the value of the '<em><b>Annotation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation1</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTTwoChildrenExpression_Annotation1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation1();

} // TTwoChildrenExpression
