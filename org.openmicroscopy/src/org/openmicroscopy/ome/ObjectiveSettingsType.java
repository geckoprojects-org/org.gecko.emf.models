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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar <em>Correction Collar</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveSettingsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveSettingsType#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex <em>Refractive Index</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveSettingsType()
 * @model extendedMetaData="name='ObjectiveSettings_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface ObjectiveSettingsType extends Settings {
	/**
	 * Returns the value of the '<em><b>Correction Collar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The CorrectionCollar is normally an adjustable ring on the
	 *                 objective. Each has an arbitrary scale on it so the values
	 *                 is unit-less. [units:none]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correction Collar</em>' attribute.
	 * @see #isSetCorrectionCollar()
	 * @see #unsetCorrectionCollar()
	 * @see #setCorrectionCollar(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveSettingsType_CorrectionCollar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='CorrectionCollar'"
	 * @generated
	 */
	float getCorrectionCollar();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar <em>Correction Collar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction Collar</em>' attribute.
	 * @see #isSetCorrectionCollar()
	 * @see #unsetCorrectionCollar()
	 * @see #getCorrectionCollar()
	 * @generated
	 */
	void setCorrectionCollar(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar <em>Correction Collar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorrectionCollar()
	 * @see #getCorrectionCollar()
	 * @see #setCorrectionCollar(float)
	 * @generated
	 */
	void unsetCorrectionCollar();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar <em>Correction Collar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Correction Collar</em>' attribute is set.
	 * @see #unsetCorrectionCollar()
	 * @see #getCorrectionCollar()
	 * @see #setCorrectionCollar(float)
	 * @generated
	 */
	boolean isSetCorrectionCollar();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveSettingsType_ID()
	 * @model dataType="org.openmicroscopy.ome.ObjectiveID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.MediumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' attribute.
	 * @see org.openmicroscopy.ome.MediumType
	 * @see #isSetMedium()
	 * @see #unsetMedium()
	 * @see #setMedium(MediumType)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveSettingsType_Medium()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Medium'"
	 * @generated
	 */
	MediumType getMedium();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getMedium <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium</em>' attribute.
	 * @see org.openmicroscopy.ome.MediumType
	 * @see #isSetMedium()
	 * @see #unsetMedium()
	 * @see #getMedium()
	 * @generated
	 */
	void setMedium(MediumType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getMedium <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMedium()
	 * @see #getMedium()
	 * @see #setMedium(MediumType)
	 * @generated
	 */
	void unsetMedium();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getMedium <em>Medium</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Medium</em>' attribute is set.
	 * @see #unsetMedium()
	 * @see #getMedium()
	 * @see #setMedium(MediumType)
	 * @generated
	 */
	boolean isSetMedium();

	/**
	 * Returns the value of the '<em><b>Refractive Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The RefractiveIndex is that of the immersion medium. This is
	 *                 a ratio so it also unit-less. [units:none]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refractive Index</em>' attribute.
	 * @see #isSetRefractiveIndex()
	 * @see #unsetRefractiveIndex()
	 * @see #setRefractiveIndex(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getObjectiveSettingsType_RefractiveIndex()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='RefractiveIndex'"
	 * @generated
	 */
	float getRefractiveIndex();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex <em>Refractive Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refractive Index</em>' attribute.
	 * @see #isSetRefractiveIndex()
	 * @see #unsetRefractiveIndex()
	 * @see #getRefractiveIndex()
	 * @generated
	 */
	void setRefractiveIndex(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex <em>Refractive Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefractiveIndex()
	 * @see #getRefractiveIndex()
	 * @see #setRefractiveIndex(float)
	 * @generated
	 */
	void unsetRefractiveIndex();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex <em>Refractive Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refractive Index</em>' attribute is set.
	 * @see #unsetRefractiveIndex()
	 * @see #getRefractiveIndex()
	 * @see #setRefractiveIndex(float)
	 * @generated
	 */
	boolean isSetRefractiveIndex();

} // ObjectiveSettingsType
