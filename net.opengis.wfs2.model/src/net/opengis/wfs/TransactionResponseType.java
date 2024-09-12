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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.TransactionResponseType#getTransactionSummary <em>Transaction Summary</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionResponseType#getInsertResults <em>Insert Results</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionResponseType#getUpdateResults <em>Update Results</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionResponseType#getReplaceResults <em>Replace Results</em>}</li>
 *   <li>{@link net.opengis.wfs.TransactionResponseType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType()
 * @model extendedMetaData="name='TransactionResponseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransactionResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Summary</em>' containment reference.
	 * @see #setTransactionSummary(TransactionSummaryType)
	 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType_TransactionSummary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TransactionSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionSummaryType getTransactionSummary();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionResponseType#getTransactionSummary <em>Transaction Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Summary</em>' containment reference.
	 * @see #getTransactionSummary()
	 * @generated
	 */
	void setTransactionSummary(TransactionSummaryType value);

	/**
	 * Returns the value of the '<em><b>Insert Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Results</em>' containment reference.
	 * @see #setInsertResults(ActionResultsType)
	 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType_InsertResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsertResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionResultsType getInsertResults();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionResponseType#getInsertResults <em>Insert Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Results</em>' containment reference.
	 * @see #getInsertResults()
	 * @generated
	 */
	void setInsertResults(ActionResultsType value);

	/**
	 * Returns the value of the '<em><b>Update Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Results</em>' containment reference.
	 * @see #setUpdateResults(ActionResultsType)
	 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType_UpdateResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionResultsType getUpdateResults();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionResponseType#getUpdateResults <em>Update Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Results</em>' containment reference.
	 * @see #getUpdateResults()
	 * @generated
	 */
	void setUpdateResults(ActionResultsType value);

	/**
	 * Returns the value of the '<em><b>Replace Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace Results</em>' containment reference.
	 * @see #setReplaceResults(ActionResultsType)
	 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType_ReplaceResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReplaceResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionResultsType getReplaceResults();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionResponseType#getReplaceResults <em>Replace Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace Results</em>' containment reference.
	 * @see #getReplaceResults()
	 * @generated
	 */
	void setReplaceResults(ActionResultsType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.opengis.wfs.WFSPackage#getTransactionResponseType_Version()
	 * @model dataType="net.opengis.wfs.VersionStringType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.TransactionResponseType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // TransactionResponseType
