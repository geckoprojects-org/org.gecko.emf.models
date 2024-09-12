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
package net.opengis.wfs;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Summary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             Reports the total number of features affected by some kind 
 *             of write action (i.e, insert, update, delete).
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.TransactionSummaryType#getTotalInserted <em>Total Inserted</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionSummaryType#getTotalUpdated <em>Total Updated</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionSummaryType#getTotalDeleted <em>Total Deleted</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getTransactionSummaryType()
 * @model extendedMetaData="name='TransactionSummaryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransactionSummaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Inserted</em>' attribute.
	 * @see #setTotalInserted(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getTransactionSummaryType_TotalInserted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='totalInserted' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTotalInserted();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionSummaryType#getTotalInserted <em>Total Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Inserted</em>' attribute.
	 * @see #getTotalInserted()
	 * @generated
	 */
	void setTotalInserted(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Total Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Updated</em>' attribute.
	 * @see #setTotalUpdated(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getTransactionSummaryType_TotalUpdated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='totalUpdated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTotalUpdated();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionSummaryType#getTotalUpdated <em>Total Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Updated</em>' attribute.
	 * @see #getTotalUpdated()
	 * @generated
	 */
	void setTotalUpdated(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Total Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Deleted</em>' attribute.
	 * @see #setTotalDeleted(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getTransactionSummaryType_TotalDeleted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='totalDeleted' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTotalDeleted();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionSummaryType#getTotalDeleted <em>Total Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Deleted</em>' attribute.
	 * @see #getTotalDeleted()
	 * @generated
	 */
	void setTotalDeleted(BigInteger value);

} // TransactionSummaryType
