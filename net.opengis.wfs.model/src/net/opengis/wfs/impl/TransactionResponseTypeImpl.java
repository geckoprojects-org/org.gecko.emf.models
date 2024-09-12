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
package net.opengis.wfs.impl;

import net.opengis.wfs.InsertResultsType;
import net.opengis.wfs.TransactionResponseType;
import net.opengis.wfs.TransactionResultsType;
import net.opengis.wfs.TransactionSummaryType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.TransactionResponseTypeImpl#getTransactionSummary <em>Transaction Summary</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.TransactionResponseTypeImpl#getTransactionResults <em>Transaction Results</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.TransactionResponseTypeImpl#getInsertResults <em>Insert Results</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.TransactionResponseTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionResponseTypeImpl extends MinimalEObjectImpl.Container implements TransactionResponseType {
	/**
	 * The cached value of the '{@link #getTransactionSummary() <em>Transaction Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionSummary()
	 * @generated
	 * @ordered
	 */
	protected TransactionSummaryType transactionSummary;

	/**
	 * The cached value of the '{@link #getTransactionResults() <em>Transaction Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionResults()
	 * @generated
	 * @ordered
	 */
	protected TransactionResultsType transactionResults;

	/**
	 * The cached value of the '{@link #getInsertResults() <em>Insert Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertResults()
	 * @generated
	 * @ordered
	 */
	protected InsertResultsType insertResults;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.TRANSACTION_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionSummaryType getTransactionSummary() {
		return transactionSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionSummary(TransactionSummaryType newTransactionSummary, NotificationChain msgs) {
		TransactionSummaryType oldTransactionSummary = transactionSummary;
		transactionSummary = newTransactionSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY, oldTransactionSummary, newTransactionSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionSummary(TransactionSummaryType newTransactionSummary) {
		if (newTransactionSummary != transactionSummary) {
			NotificationChain msgs = null;
			if (transactionSummary != null)
				msgs = ((InternalEObject)transactionSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY, null, msgs);
			if (newTransactionSummary != null)
				msgs = ((InternalEObject)newTransactionSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY, null, msgs);
			msgs = basicSetTransactionSummary(newTransactionSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY, newTransactionSummary, newTransactionSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionResultsType getTransactionResults() {
		return transactionResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionResults(TransactionResultsType newTransactionResults, NotificationChain msgs) {
		TransactionResultsType oldTransactionResults = transactionResults;
		transactionResults = newTransactionResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS, oldTransactionResults, newTransactionResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionResults(TransactionResultsType newTransactionResults) {
		if (newTransactionResults != transactionResults) {
			NotificationChain msgs = null;
			if (transactionResults != null)
				msgs = ((InternalEObject)transactionResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS, null, msgs);
			if (newTransactionResults != null)
				msgs = ((InternalEObject)newTransactionResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS, null, msgs);
			msgs = basicSetTransactionResults(newTransactionResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS, newTransactionResults, newTransactionResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertResultsType getInsertResults() {
		return insertResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertResults(InsertResultsType newInsertResults, NotificationChain msgs) {
		InsertResultsType oldInsertResults = insertResults;
		insertResults = newInsertResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS, oldInsertResults, newInsertResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsertResults(InsertResultsType newInsertResults) {
		if (newInsertResults != insertResults) {
			NotificationChain msgs = null;
			if (insertResults != null)
				msgs = ((InternalEObject)insertResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS, null, msgs);
			if (newInsertResults != null)
				msgs = ((InternalEObject)newInsertResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS, null, msgs);
			msgs = basicSetInsertResults(newInsertResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS, newInsertResults, newInsertResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY:
				return basicSetTransactionSummary(null, msgs);
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS:
				return basicSetTransactionResults(null, msgs);
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS:
				return basicSetInsertResults(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY:
				return getTransactionSummary();
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS:
				return getTransactionResults();
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS:
				return getInsertResults();
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY:
				setTransactionSummary((TransactionSummaryType)newValue);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS:
				setTransactionResults((TransactionResultsType)newValue);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS:
				setInsertResults((InsertResultsType)newValue);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY:
				setTransactionSummary((TransactionSummaryType)null);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS:
				setTransactionResults((TransactionResultsType)null);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS:
				setInsertResults((InsertResultsType)null);
				return;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION:
				unsetVersion();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY:
				return transactionSummary != null;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS:
				return transactionResults != null;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS:
				return insertResults != null;
			case WFSPackage.TRANSACTION_RESPONSE_TYPE__VERSION:
				return isSetVersion();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransactionResponseTypeImpl
