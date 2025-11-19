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

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath1 <em>Annotation Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary1 <em>Binary1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate1 <em>Date1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset1 <em>Date Time Offset1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal1 <em>Decimal1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration1 <em>Duration1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember1 <em>Enum Member1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1 <em>Float1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid1 <em>Guid1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath1 <em>Model Element Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath1 <em>Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath1 <em>Property Path1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getString1 <em>String1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTerm <em>Term</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay1 <em>Time Of Day1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef1 <em>Url Ref1</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType()
 * @model extendedMetaData="name='Annotation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnnotationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Binary()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TBinaryConstantExpression> getBinary();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Bool()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bool' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TBoolConstantExpression> getBool();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TDateConstantExpression> getDate();

	/**
	 * Returns the value of the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Offset</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_DateTimeOffset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTimeOffset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TDateTimeOffsetConstantExpression> getDateTimeOffset();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Decimal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TDecimalConstantExpression> getDecimal();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Duration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TDurationConstantExpression> getDuration();

	/**
	 * Returns the value of the '<em><b>Enum Member</b></em>' attribute list.
	 * The list contents are of type {@link java.util.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Member</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_EnumMember()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TEnumMemberList" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumMember' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<List> getEnumMember();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Float()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Float' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TFloatConstantExpression> getFloat();

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Guid()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TGuidConstantExpression> getGuid();

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Int()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TIntConstantExpression> getInt();

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_String()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TStringConstantExpression> getString();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_TimeOfDay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeOfDay' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTimeOfDayConstantExpression> getTimeOfDay();

	/**
	 * Returns the value of the '<em><b>Annotation Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_AnnotationPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnnotationPath' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getAnnotationPath();

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TApplyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Apply()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Apply' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TApplyExpression> getApply();

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Cast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cast' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getCast();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Collection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Collection' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TCollectionExpression> getCollection();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TIfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_If()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='If' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TIfExpression> getIf();

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Eq()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Eq' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getEq();

	/**
	 * Returns the value of the '<em><b>Ne</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ne</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Ne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ne' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getNe();

	/**
	 * Returns the value of the '<em><b>Ge</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ge</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Ge()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ge' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGe();

	/**
	 * Returns the value of the '<em><b>Gt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Gt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Gt' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getGt();

	/**
	 * Returns the value of the '<em><b>Le</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Le</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Le()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Le' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLe();

	/**
	 * Returns the value of the '<em><b>Lt</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lt</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Lt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lt' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getLt();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAnd();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Not()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getNot();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Has()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Has' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getHas();

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_In()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='In' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getIn();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Add()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Add' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getAdd();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sub' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getSub();

	/**
	 * Returns the value of the '<em><b>Neg</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Neg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Neg' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getNeg();

	/**
	 * Returns the value of the '<em><b>Mul</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mul</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Mul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mul' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMul();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Div' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDiv();

	/**
	 * Returns the value of the '<em><b>Div By</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div By</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_DivBy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DivBy' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getDivBy();

	/**
	 * Returns the value of the '<em><b>Mod</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Mod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mod' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTwoChildrenExpression> getMod();

	/**
	 * Returns the value of the '<em><b>Is Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_IsOf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IsOf' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TCastOrIsOfExpression> getIsOf();

	/**
	 * Returns the value of the '<em><b>Labeled Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_LabeledElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElement' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TLabeledElementExpression> getLabeledElement();

	/**
	 * Returns the value of the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_LabeledElementReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledElementReference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TLabeledElementReferenceExpression> getLabeledElementReference();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNullExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Null()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TNullExpression> getNull();

	/**
	 * Returns the value of the '<em><b>Model Element Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_ModelElementPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelElementPath' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getModelElementPath();

	/**
	 * Returns the value of the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_NavigationPropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationPropertyPath' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getNavigationPropertyPath();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Path()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TInstancePath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getPath();

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_PropertyPath()
	 * @model unique="false" dataType="org.open.oasis.docs.odata.ns.edm.TModelPath" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyPath' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getPropertyPath();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TRecordExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Record()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TRecordExpression> getRecord();

	/**
	 * Returns the value of the '<em><b>Url Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_UrlRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UrlRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TOneChildExpression> getUrlRef();

	/**
	 * Returns the value of the '<em><b>Annotation Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Path1</em>' attribute.
	 * @see #setAnnotationPath1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_AnnotationPath1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='attribute' name='AnnotationPath'"
	 * @generated
	 */
	String getAnnotationPath1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath1 <em>Annotation Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Path1</em>' attribute.
	 * @see #getAnnotationPath1()
	 * @generated
	 */
	void setAnnotationPath1(String value);

	/**
	 * Returns the value of the '<em><b>Binary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary1</em>' attribute.
	 * @see #setBinary1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Binary1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.Binary"
	 *        extendedMetaData="kind='attribute' name='Binary'"
	 * @generated
	 */
	String getBinary1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary1 <em>Binary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary1</em>' attribute.
	 * @see #getBinary1()
	 * @generated
	 */
	void setBinary1(String value);

	/**
	 * Returns the value of the '<em><b>Bool1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool1</em>' attribute.
	 * @see #isSetBool1()
	 * @see #unsetBool1()
	 * @see #setBool1(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Bool1()
	 * @model unsettable="true" dataType="org.open.oasis.docs.odata.ns.edm.Boolean"
	 *        extendedMetaData="kind='attribute' name='Bool'"
	 * @generated
	 */
	boolean isBool1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1 <em>Bool1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool1</em>' attribute.
	 * @see #isSetBool1()
	 * @see #unsetBool1()
	 * @see #isBool1()
	 * @generated
	 */
	void setBool1(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1 <em>Bool1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBool1()
	 * @see #isBool1()
	 * @see #setBool1(boolean)
	 * @generated
	 */
	void unsetBool1();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1 <em>Bool1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bool1</em>' attribute is set.
	 * @see #unsetBool1()
	 * @see #isBool1()
	 * @see #setBool1(boolean)
	 * @generated
	 */
	boolean isSetBool1();

	/**
	 * Returns the value of the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date1</em>' attribute.
	 * @see #setDate1(XMLGregorianCalendar)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Date1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.Date"
	 *        extendedMetaData="kind='attribute' name='Date'"
	 * @generated
	 */
	XMLGregorianCalendar getDate1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate1 <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date1</em>' attribute.
	 * @see #getDate1()
	 * @generated
	 */
	void setDate1(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Time Offset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Offset1</em>' attribute.
	 * @see #setDateTimeOffset1(XMLGregorianCalendar)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_DateTimeOffset1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.DateTimeStamp"
	 *        extendedMetaData="kind='attribute' name='DateTimeOffset'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTimeOffset1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset1 <em>Date Time Offset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Offset1</em>' attribute.
	 * @see #getDateTimeOffset1()
	 * @generated
	 */
	void setDateTimeOffset1(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Decimal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal1</em>' attribute.
	 * @see #setDecimal1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Decimal1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TDecimalLiteral"
	 *        extendedMetaData="kind='attribute' name='Decimal'"
	 * @generated
	 */
	String getDecimal1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal1 <em>Decimal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal1</em>' attribute.
	 * @see #getDecimal1()
	 * @generated
	 */
	void setDecimal1(String value);

	/**
	 * Returns the value of the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration1</em>' attribute.
	 * @see #setDuration1(Duration)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Duration1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.DayTimeDuration"
	 *        extendedMetaData="kind='attribute' name='Duration'"
	 * @generated
	 */
	Duration getDuration1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration1 <em>Duration1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration1</em>' attribute.
	 * @see #getDuration1()
	 * @generated
	 */
	void setDuration1(Duration value);

	/**
	 * Returns the value of the '<em><b>Enum Member1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Member1</em>' attribute.
	 * @see #setEnumMember1(List)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_EnumMember1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TEnumMemberList" many="false"
	 *        extendedMetaData="kind='attribute' name='EnumMember'"
	 * @generated
	 */
	List<String> getEnumMember1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember1 <em>Enum Member1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Member1</em>' attribute.
	 * @see #getEnumMember1()
	 * @generated
	 */
	void setEnumMember1(List<String> value);

	/**
	 * Returns the value of the '<em><b>Float1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float1</em>' attribute.
	 * @see #isSetFloat1()
	 * @see #unsetFloat1()
	 * @see #setFloat1(double)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Float1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='Float'"
	 * @generated
	 */
	double getFloat1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1 <em>Float1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float1</em>' attribute.
	 * @see #isSetFloat1()
	 * @see #unsetFloat1()
	 * @see #getFloat1()
	 * @generated
	 */
	void setFloat1(double value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1 <em>Float1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat1()
	 * @see #getFloat1()
	 * @see #setFloat1(double)
	 * @generated
	 */
	void unsetFloat1();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1 <em>Float1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float1</em>' attribute is set.
	 * @see #unsetFloat1()
	 * @see #getFloat1()
	 * @see #setFloat1(double)
	 * @generated
	 */
	boolean isSetFloat1();

	/**
	 * Returns the value of the '<em><b>Guid1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid1</em>' attribute.
	 * @see #setGuid1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Guid1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TGuidLiteral"
	 *        extendedMetaData="kind='attribute' name='Guid'"
	 * @generated
	 */
	String getGuid1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid1 <em>Guid1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid1</em>' attribute.
	 * @see #getGuid1()
	 * @generated
	 */
	void setGuid1(String value);

	/**
	 * Returns the value of the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int1</em>' attribute.
	 * @see #setInt1(BigInteger)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Int1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='Int'"
	 * @generated
	 */
	BigInteger getInt1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt1 <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int1</em>' attribute.
	 * @see #getInt1()
	 * @generated
	 */
	void setInt1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Model Element Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Path1</em>' attribute.
	 * @see #setModelElementPath1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_ModelElementPath1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='attribute' name='ModelElementPath'"
	 * @generated
	 */
	String getModelElementPath1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath1 <em>Model Element Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Path1</em>' attribute.
	 * @see #getModelElementPath1()
	 * @generated
	 */
	void setModelElementPath1(String value);

	/**
	 * Returns the value of the '<em><b>Navigation Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Path1</em>' attribute.
	 * @see #setNavigationPropertyPath1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_NavigationPropertyPath1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='attribute' name='NavigationPropertyPath'"
	 * @generated
	 */
	String getNavigationPropertyPath1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Property Path1</em>' attribute.
	 * @see #getNavigationPropertyPath1()
	 * @generated
	 */
	void setNavigationPropertyPath1(String value);

	/**
	 * Returns the value of the '<em><b>Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path1</em>' attribute.
	 * @see #setPath1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Path1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TInstancePath"
	 *        extendedMetaData="kind='attribute' name='Path'"
	 * @generated
	 */
	String getPath1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath1 <em>Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path1</em>' attribute.
	 * @see #getPath1()
	 * @generated
	 */
	void setPath1(String value);

	/**
	 * Returns the value of the '<em><b>Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path1</em>' attribute.
	 * @see #setPropertyPath1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_PropertyPath1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='attribute' name='PropertyPath'"
	 * @generated
	 */
	String getPropertyPath1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath1 <em>Property Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path1</em>' attribute.
	 * @see #getPropertyPath1()
	 * @generated
	 */
	void setPropertyPath1(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Qualifier()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier"
	 *        extendedMetaData="kind='attribute' name='Qualifier'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String1</em>' attribute.
	 * @see #setString1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_String1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='String'"
	 * @generated
	 */
	String getString1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getString1 <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String1</em>' attribute.
	 * @see #getString1()
	 * @generated
	 */
	void setString1(String value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_Term()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='Term'"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Time Of Day1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day1</em>' attribute.
	 * @see #setTimeOfDay1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_TimeOfDay1()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.Time"
	 *        extendedMetaData="kind='attribute' name='TimeOfDay'"
	 * @generated
	 */
	String getTimeOfDay1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay1 <em>Time Of Day1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Day1</em>' attribute.
	 * @see #getTimeOfDay1()
	 * @generated
	 */
	void setTimeOfDay1(String value);

	/**
	 * Returns the value of the '<em><b>Url Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref1</em>' attribute.
	 * @see #setUrlRef1(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getAnnotationType_UrlRef1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='UrlRef'"
	 * @generated
	 */
	String getUrlRef1();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef1 <em>Url Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Ref1</em>' attribute.
	 * @see #getUrlRef1()
	 * @generated
	 */
	void setUrlRef1(String value);

} // AnnotationType
