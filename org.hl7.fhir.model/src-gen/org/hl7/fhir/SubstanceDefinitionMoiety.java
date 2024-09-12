/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Moiety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinitionMoiety#getMeasurementType <em>Measurement Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety()
 * @model extendedMetaData="name='SubstanceDefinition.Moiety' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstanceDefinitionMoiety extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role that the moiety is playing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this moiety substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual name for this moiety substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereochemistry type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #setStereochemistry(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_Stereochemistry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stereochemistry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getStereochemistry <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #getStereochemistry()
	 * @generated
	 */
	void setStereochemistry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optical activity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optical Activity</em>' containment reference.
	 * @see #setOpticalActivity(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_OpticalActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='opticalActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getOpticalActivity <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optical Activity</em>' containment reference.
	 * @see #getOpticalActivity()
	 * @generated
	 */
	void setOpticalActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Molecular formula for this moiety of this substance, typically using the Hill system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #setMolecularFormula(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_MolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Measurement Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measurement type of the quantitative value. In capturing the actual relative amounts of substances or molecular fragments it may be necessary to indicate whether the amount refers to, for example, a mole ratio or weight ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Type</em>' containment reference.
	 * @see #setMeasurementType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceDefinitionMoiety_MeasurementType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasurementType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinitionMoiety#getMeasurementType <em>Measurement Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Type</em>' containment reference.
	 * @see #getMeasurementType()
	 * @generated
	 */
	void setMeasurementType(CodeableConcept value);

} // SubstanceDefinitionMoiety
