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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Report Inventory Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A report of inventory or stock items.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InventoryReportInventoryListing#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryReportInventoryListing#getItemStatus <em>Item Status</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryReportInventoryListing#getCountingDateTime <em>Counting Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryReportInventoryListing#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getInventoryReportInventoryListing()
 * @model extendedMetaData="name='InventoryReport.InventoryListing' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InventoryReportInventoryListing extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location of the inventory items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryReportInventoryListing_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryReportInventoryListing#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Item Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Status</em>' containment reference.
	 * @see #setItemStatus(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryReportInventoryListing_ItemStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryReportInventoryListing#getItemStatus <em>Item Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Status</em>' containment reference.
	 * @see #getItemStatus()
	 * @generated
	 */
	void setItemStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Counting Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the items were counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counting Date Time</em>' containment reference.
	 * @see #setCountingDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryReportInventoryListing_CountingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCountingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryReportInventoryListing#getCountingDateTime <em>Counting Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counting Date Time</em>' containment reference.
	 * @see #getCountingDateTime()
	 * @generated
	 */
	void setCountingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InventoryReportItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item or items in this listing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInventoryReportInventoryListing_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InventoryReportItem> getItem();

} // InventoryReportInventoryListing
