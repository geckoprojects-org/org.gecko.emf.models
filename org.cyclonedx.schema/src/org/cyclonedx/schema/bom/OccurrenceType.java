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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getLine <em>Line</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getAdditionalContext <em>Additional Context</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OccurrenceType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType()
 * @model extendedMetaData="name='occurrence_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OccurrenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location or path to where the component was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The line number where the component was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_Line()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLine();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The offset where the component was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOffset();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The symbol name that was found associated with the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_Symbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Additional Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional context of the detected component (e.g. a code snippet).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Context</em>' attribute.
	 * @see #setAdditionalContext(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_AdditionalContext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='additionalContext' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAdditionalContext();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getAdditionalContext <em>Additional Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Context</em>' attribute.
	 * @see #getAdditionalContext()
	 * @generated
	 */
	void setAdditionalContext(String value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             An optional identifier which can be used to reference the occurrence elsewhere
	 *                                             in the BOM. Every bom-ref must be unique within the BOM.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOccurrenceType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OccurrenceType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // OccurrenceType
