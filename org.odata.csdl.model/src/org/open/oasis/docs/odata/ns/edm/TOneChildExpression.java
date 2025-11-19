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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOne Child Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBool <em>Bool</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDateTimeOffset <em>Date Time Offset</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getFloat <em>Float</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getInt <em>Int</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getString <em>String</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotationPath <em>Annotation Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getApply <em>Apply</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCast <em>Cast</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEq <em>Eq</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNe <em>Ne</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGe <em>Ge</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGt <em>Gt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLe <em>Le</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLt <em>Lt</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnd <em>And</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getOr <em>Or</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNot <em>Not</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getHas <em>Has</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIn <em>In</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAdd <em>Add</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getSub <em>Sub</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMul <em>Mul</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDiv <em>Div</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDivBy <em>Div By</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMod <em>Mod</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIsOf <em>Is Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElement <em>Labeled Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElementReference <em>Labeled Element Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNull <em>Null</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getModelElementPath <em>Model Element Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getRecord <em>Record</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation1 <em>Annotation1</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression()
 * @model extendedMetaData="name='TOneChildExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOneChildExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(TBinaryConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	TBinaryConstantExpression getBinary();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(TBinaryConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference.
	 * @see #setBool(TBoolConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Bool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bool' namespace='##targetNamespace'"
	 * @generated
	 */
	TBoolConstantExpression getBool();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBool <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' containment reference.
	 * @see #getBool()
	 * @generated
	 */
	void setBool(TBoolConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TDateConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace'"
	 * @generated
	 */
	TDateConstantExpression getDate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TDateConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Date Time Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Offset</em>' containment reference.
	 * @see #setDateTimeOffset(TDateTimeOffsetConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_DateTimeOffset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateTimeOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	TDateTimeOffsetConstantExpression getDateTimeOffset();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDateTimeOffset <em>Date Time Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Offset</em>' containment reference.
	 * @see #getDateTimeOffset()
	 * @generated
	 */
	void setDateTimeOffset(TDateTimeOffsetConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' containment reference.
	 * @see #setDecimal(TDecimalConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Decimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace'"
	 * @generated
	 */
	TDecimalConstantExpression getDecimal();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDecimal <em>Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' containment reference.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(TDecimalConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(TDurationConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	TDurationConstantExpression getDuration();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(TDurationConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Enum Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Member</em>' attribute.
	 * @see #setEnumMember(List)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_EnumMember()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TEnumMemberList" many="false"
	 *        extendedMetaData="kind='element' name='EnumMember' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getEnumMember();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEnumMember <em>Enum Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Member</em>' attribute.
	 * @see #getEnumMember()
	 * @generated
	 */
	void setEnumMember(List<String> value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference.
	 * @see #setFloat(TFloatConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Float()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Float' namespace='##targetNamespace'"
	 * @generated
	 */
	TFloatConstantExpression getFloat();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getFloat <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' containment reference.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(TFloatConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference.
	 * @see #setGuid(TGuidConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Guid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace'"
	 * @generated
	 */
	TGuidConstantExpression getGuid();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGuid <em>Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' containment reference.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(TGuidConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference.
	 * @see #setInt(TIntConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Int()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Int' namespace='##targetNamespace'"
	 * @generated
	 */
	TIntConstantExpression getInt();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getInt <em>Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' containment reference.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(TIntConstantExpression value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(TStringConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	TStringConstantExpression getString();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(TStringConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference.
	 * @see #setTimeOfDay(TTimeOfDayConstantExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_TimeOfDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimeOfDay' namespace='##targetNamespace'"
	 * @generated
	 */
	TTimeOfDayConstantExpression getTimeOfDay();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getTimeOfDay <em>Time Of Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Day</em>' containment reference.
	 * @see #getTimeOfDay()
	 * @generated
	 */
	void setTimeOfDay(TTimeOfDayConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Annotation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Path</em>' attribute.
	 * @see #setAnnotationPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_AnnotationPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='element' name='AnnotationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnnotationPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotationPath <em>Annotation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Path</em>' attribute.
	 * @see #getAnnotationPath()
	 * @generated
	 */
	void setAnnotationPath(String value);

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference.
	 * @see #setApply(TApplyExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Apply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Apply' namespace='##targetNamespace'"
	 * @generated
	 */
	TApplyExpression getApply();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getApply <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' containment reference.
	 * @see #getApply()
	 * @generated
	 */
	void setApply(TApplyExpression value);

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' containment reference.
	 * @see #setCast(TCastOrIsOfExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Cast()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cast' namespace='##targetNamespace'"
	 * @generated
	 */
	TCastOrIsOfExpression getCast();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCast <em>Cast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast</em>' containment reference.
	 * @see #getCast()
	 * @generated
	 */
	void setCast(TCastOrIsOfExpression value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(TCollectionExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Collection' namespace='##targetNamespace'"
	 * @generated
	 */
	TCollectionExpression getCollection();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(TCollectionExpression value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(TIfExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_If()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='If' namespace='##targetNamespace'"
	 * @generated
	 */
	TIfExpression getIf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(TIfExpression value);

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference.
	 * @see #setEq(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Eq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Eq' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getEq();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEq <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq</em>' containment reference.
	 * @see #getEq()
	 * @generated
	 */
	void setEq(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Ne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ne</em>' containment reference.
	 * @see #setNe(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Ne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ne' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getNe();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNe <em>Ne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ne</em>' containment reference.
	 * @see #getNe()
	 * @generated
	 */
	void setNe(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Ge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ge</em>' containment reference.
	 * @see #setGe(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Ge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ge' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getGe();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGe <em>Ge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ge</em>' containment reference.
	 * @see #getGe()
	 * @generated
	 */
	void setGe(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Gt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gt</em>' containment reference.
	 * @see #setGt(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Gt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gt' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getGt();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGt <em>Gt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gt</em>' containment reference.
	 * @see #getGt()
	 * @generated
	 */
	void setGt(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Le</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Le</em>' containment reference.
	 * @see #setLe(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Le()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Le' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getLe();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLe <em>Le</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Le</em>' containment reference.
	 * @see #getLe()
	 * @generated
	 */
	void setLe(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Lt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lt</em>' containment reference.
	 * @see #setLt(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Lt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lt' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getLt();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLt <em>Lt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lt</em>' containment reference.
	 * @see #getLt()
	 * @generated
	 */
	void setLt(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getAnd();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getOr();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(TOneChildExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace'"
	 * @generated
	 */
	TOneChildExpression getNot();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(TOneChildExpression value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference.
	 * @see #setHas(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Has()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Has' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getHas();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getHas <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has</em>' containment reference.
	 * @see #getHas()
	 * @generated
	 */
	void setHas(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_In()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='In' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getIn();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Add()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Add' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getAdd();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Sub()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sub' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getSub();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Neg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' containment reference.
	 * @see #setNeg(TOneChildExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Neg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Neg' namespace='##targetNamespace'"
	 * @generated
	 */
	TOneChildExpression getNeg();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNeg <em>Neg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neg</em>' containment reference.
	 * @see #getNeg()
	 * @generated
	 */
	void setNeg(TOneChildExpression value);

	/**
	 * Returns the value of the '<em><b>Mul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mul</em>' containment reference.
	 * @see #setMul(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Mul()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Mul' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getMul();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMul <em>Mul</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mul</em>' containment reference.
	 * @see #getMul()
	 * @generated
	 */
	void setMul(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Div()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Div' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getDiv();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Div By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div By</em>' containment reference.
	 * @see #setDivBy(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_DivBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DivBy' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getDivBy();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDivBy <em>Div By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div By</em>' containment reference.
	 * @see #getDivBy()
	 * @generated
	 */
	void setDivBy(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Mod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod</em>' containment reference.
	 * @see #setMod(TTwoChildrenExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Mod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Mod' namespace='##targetNamespace'"
	 * @generated
	 */
	TTwoChildrenExpression getMod();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMod <em>Mod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod</em>' containment reference.
	 * @see #getMod()
	 * @generated
	 */
	void setMod(TTwoChildrenExpression value);

	/**
	 * Returns the value of the '<em><b>Is Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of</em>' containment reference.
	 * @see #setIsOf(TCastOrIsOfExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_IsOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IsOf' namespace='##targetNamespace'"
	 * @generated
	 */
	TCastOrIsOfExpression getIsOf();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIsOf <em>Is Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of</em>' containment reference.
	 * @see #getIsOf()
	 * @generated
	 */
	void setIsOf(TCastOrIsOfExpression value);

	/**
	 * Returns the value of the '<em><b>Labeled Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element</em>' containment reference.
	 * @see #setLabeledElement(TLabeledElementExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_LabeledElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LabeledElement' namespace='##targetNamespace'"
	 * @generated
	 */
	TLabeledElementExpression getLabeledElement();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElement <em>Labeled Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Element</em>' containment reference.
	 * @see #getLabeledElement()
	 * @generated
	 */
	void setLabeledElement(TLabeledElementExpression value);

	/**
	 * Returns the value of the '<em><b>Labeled Element Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Element Reference</em>' containment reference.
	 * @see #setLabeledElementReference(TLabeledElementReferenceExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_LabeledElementReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LabeledElementReference' namespace='##targetNamespace'"
	 * @generated
	 */
	TLabeledElementReferenceExpression getLabeledElementReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElementReference <em>Labeled Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Element Reference</em>' containment reference.
	 * @see #getLabeledElementReference()
	 * @generated
	 */
	void setLabeledElementReference(TLabeledElementReferenceExpression value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' containment reference.
	 * @see #setNull(TNullExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Null()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace'"
	 * @generated
	 */
	TNullExpression getNull();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNull <em>Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' containment reference.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(TNullExpression value);

	/**
	 * Returns the value of the '<em><b>Model Element Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Path</em>' attribute.
	 * @see #setModelElementPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_ModelElementPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='element' name='ModelElementPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelElementPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getModelElementPath <em>Model Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Path</em>' attribute.
	 * @see #getModelElementPath()
	 * @generated
	 */
	void setModelElementPath(String value);

	/**
	 * Returns the value of the '<em><b>Navigation Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Path</em>' attribute.
	 * @see #setNavigationPropertyPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_NavigationPropertyPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='element' name='NavigationPropertyPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNavigationPropertyPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Property Path</em>' attribute.
	 * @see #getNavigationPropertyPath()
	 * @generated
	 */
	void setNavigationPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Path()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TInstancePath"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_PropertyPath()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TModelPath"
	 *        extendedMetaData="kind='element' name='PropertyPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(TRecordExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Record()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
	 * @generated
	 */
	TRecordExpression getRecord();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(TRecordExpression value);

	/**
	 * Returns the value of the '<em><b>Url Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref</em>' containment reference.
	 * @see #setUrlRef(TOneChildExpression)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_UrlRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UrlRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TOneChildExpression getUrlRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getUrlRef <em>Url Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Ref</em>' containment reference.
	 * @see #getUrlRef()
	 * @generated
	 */
	void setUrlRef(TOneChildExpression value);

	/**
	 * Returns the value of the '<em><b>Annotation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation1</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOneChildExpression_Annotation1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation1();

} // TOneChildExpression
