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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LI Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getScaleDenominator <em>Scale Denominator</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getSourceReferenceSystem <em>Source Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getSourceCitation <em>Source Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getSourceExtent <em>Source Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.LISourceType#getSourceStep <em>Source Step</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType()
 * @model extendedMetaData="name='LI_Source_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LISourceType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.LISourceType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Scale Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Denominator</em>' containment reference.
	 * @see #setScaleDenominator(MDRepresentativeFractionPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_ScaleDenominator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	MDRepresentativeFractionPropertyType getScaleDenominator();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.LISourceType#getScaleDenominator <em>Scale Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Denominator</em>' containment reference.
	 * @see #getScaleDenominator()
	 * @generated
	 */
	void setScaleDenominator(MDRepresentativeFractionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Source Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference System</em>' containment reference.
	 * @see #setSourceReferenceSystem(MDReferenceSystemPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_SourceReferenceSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReferenceSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MDReferenceSystemPropertyType getSourceReferenceSystem();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.LISourceType#getSourceReferenceSystem <em>Source Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference System</em>' containment reference.
	 * @see #getSourceReferenceSystem()
	 * @generated
	 */
	void setSourceReferenceSystem(MDReferenceSystemPropertyType value);

	/**
	 * Returns the value of the '<em><b>Source Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Citation</em>' containment reference.
	 * @see #setSourceCitation(CICitationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_SourceCitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getSourceCitation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.LISourceType#getSourceCitation <em>Source Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Citation</em>' containment reference.
	 * @see #getSourceCitation()
	 * @generated
	 */
	void setSourceCitation(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Source Extent</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Extent</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_SourceExtent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXExtentPropertyType> getSourceExtent();

	/**
	 * Returns the value of the '<em><b>Source Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.LIProcessStepPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Step</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getLISourceType_SourceStep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceStep' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LIProcessStepPropertyType> getSourceStep();

} // LISourceType
