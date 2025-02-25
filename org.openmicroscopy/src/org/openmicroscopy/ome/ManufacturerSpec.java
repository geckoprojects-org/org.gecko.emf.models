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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufacturer Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This is the base from which many microscope components are extended. E.g Objective, Filter etc.
 *         Provides attributes for recording common properties of these components such as Manufacturer name, Model etc,
 *         all of which are optional.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ManufacturerSpec#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ManufacturerSpec#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ManufacturerSpec#getModel <em>Model</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ManufacturerSpec#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getManufacturerSpec()
 * @model extendedMetaData="name='ManufacturerSpec' kind='empty'"
 * @generated
 */
@ProviderType
public interface ManufacturerSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The lot number of the component. [plain text string]
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' attribute.
	 * @see #setLotNumber(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getManufacturerSpec_LotNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LotNumber'"
	 * @generated
	 */
	String getLotNumber();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ManufacturerSpec#getLotNumber <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' attribute.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The manufacturer of the component. [plain text string]
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getManufacturerSpec_Manufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Manufacturer'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ManufacturerSpec#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The Model of the component. [plain text string]
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getManufacturerSpec_Model()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Model'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ManufacturerSpec#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The serial number of the component. [plain text string]
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getManufacturerSpec_SerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SerialNumber'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ManufacturerSpec#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

} // ManufacturerSpec
