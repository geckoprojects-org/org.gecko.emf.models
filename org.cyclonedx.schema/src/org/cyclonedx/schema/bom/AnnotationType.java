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
package org.cyclonedx.schema.bom;

import javax.xml.datatype.XMLGregorianCalendar;

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
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getAnnotator <em>Annotator</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotationType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType()
 * @model extendedMetaData="name='annotationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnnotationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The objects in the BOM identified by their bom-ref's. This is often components or services, but may be any object type supporting bom-refs.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subjects</em>' containment reference.
	 * @see #setSubjects(SubjectsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_Subjects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjects' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectsType getSubjects();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotationType#getSubjects <em>Subjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjects</em>' containment reference.
	 * @see #getSubjects()
	 * @generated
	 */
	void setSubjects(SubjectsType value);

	/**
	 * Returns the value of the '<em><b>Annotator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization, individual, component, or service which created the textual content
	 *                         of the annotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotator</em>' containment reference.
	 * @see #setAnnotator(AnnotatorChoiceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_Annotator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='annotator' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotatorChoiceType getAnnotator();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotationType#getAnnotator <em>Annotator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotator</em>' containment reference.
	 * @see #getAnnotator()
	 * @generated
	 */
	void setAnnotator(AnnotatorChoiceType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time (timestamp) when the annotation was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotationType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The textual content of the annotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotationType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the annotation elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotationType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                     do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotationType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AnnotationType
