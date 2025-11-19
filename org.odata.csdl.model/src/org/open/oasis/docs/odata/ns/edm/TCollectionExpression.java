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
 * A representation of the model object '<em><b>TCollection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGExpression <em>GExpression</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getUrlRef <em>Url Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression()
 * @model extendedMetaData="name='TCollectionExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCollectionExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>GExpression</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GExpression</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_GExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GExpression:0'"
	 * @generated
	 */
	FeatureMap getGExpression();

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Binary()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TBinaryConstantExpression> getBinary();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Bool()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bool' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TBoolConstantExpression> getBool();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TDateConstantExpression> getDate();

	/**
	 * Returns the value of the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Offset</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_DateTimeOffset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTimeOffset' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TDateTimeOffsetConstantExpression> getDateTimeOffset();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Decimal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TDecimalConstantExpression> getDecimal();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Duration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TDurationConstantExpression> getDuration();

	/**
	 * Returns the value of the '<em><b>Enum Member</b></em>' attribute list.
	 * The list contents are of type {@link java.util.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Member</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_EnumMember()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TEnumMemberList" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumMember' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<List> getEnumMember();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Float()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Float' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TFloatConstantExpression> getFloat();

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Guid()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TGuidConstantExpression> getGuid();

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Int()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TIntConstantExpression> getInt();

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_String()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TStringConstantExpression> getString();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_TimeOfDay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeOfDay' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTimeOfDayConstantExpression> getTimeOfDay();

	/**
	 * Returns the value of the '<em><b>Annotation Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_AnnotationPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnnotationPath' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<String> getAnnotationPath();

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TApplyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Apply()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Apply' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TApplyExpression> getApply();

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Cast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cast' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getCast();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Collection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Collection' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TCollectionExpression> getCollection();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_If()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='If' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TIfExpression> getIf();

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Eq()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Eq' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getEq();

	/**
	 * Returns the value of the '<em><b>Ne</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ne</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Ne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ne' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getNe();

	/**
	 * Returns the value of the '<em><b>Ge</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ge</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Ge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ge' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGe();

	/**
	 * Returns the value of the '<em><b>Gt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Gt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Gt' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGt();

	/**
	 * Returns the value of the '<em><b>Le</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Le</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Le()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Le' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLe();

	/**
	 * Returns the value of the '<em><b>Lt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Lt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lt' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLt();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAnd();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Not()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getNot();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Has()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Has' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getHas();

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_In()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='In' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getIn();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Add()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Add' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAdd();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sub' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getSub();

	/**
	 * Returns the value of the '<em><b>Neg</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Neg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Neg' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getNeg();

	/**
	 * Returns the value of the '<em><b>Mul</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mul</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Mul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mul' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMul();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Div' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDiv();

	/**
	 * Returns the value of the '<em><b>Div By</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div By</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_DivBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DivBy' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDivBy();

	/**
	 * Returns the value of the '<em><b>Mod</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Mod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mod' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMod();

	/**
	 * Returns the value of the '<em><b>Is Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_IsOf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IsOf' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getIsOf();

	/**
	 * Returns the value of the '<em><b>Labeled Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_LabeledElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElement' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TLabeledElementExpression> getLabeledElement();

	/**
	 * Returns the value of the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_LabeledElementReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElementReference' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TLabeledElementReferenceExpression> getLabeledElementReference();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNullExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Null()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TNullExpression> getNull();

	/**
	 * Returns the value of the '<em><b>Model Element Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_ModelElementPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelElementPath' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<String> getModelElementPath();

	/**
	 * Returns the value of the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_NavigationPropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationPropertyPath' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<String> getNavigationPropertyPath();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Path()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TInstancePath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<String> getPath();

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_PropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyPath' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<String> getPropertyPath();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TRecordExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_Record()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TRecordExpression> getRecord();

	/**
	 * Returns the value of the '<em><b>Url Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTCollectionExpression_UrlRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UrlRef' namespace='##targetNamespace' group='#GExpression:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getUrlRef();

} // TCollectionExpression
