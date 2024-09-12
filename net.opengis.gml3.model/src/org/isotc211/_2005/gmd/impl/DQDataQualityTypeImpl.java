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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.DQDataQualityType;
import org.isotc211._2005.gmd.DQElementPropertyType;
import org.isotc211._2005.gmd.DQScopePropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LILineagePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DQ Data Quality Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQDataQualityTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQDataQualityTypeImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQDataQualityTypeImpl#getLineage <em>Lineage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DQDataQualityTypeImpl extends AbstractObjectTypeImpl implements DQDataQualityType {
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected DQScopePropertyType scope;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<DQElementPropertyType> report;

	/**
	 * The cached value of the '{@link #getLineage() <em>Lineage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineage()
	 * @generated
	 * @ordered
	 */
	protected LILineagePropertyType lineage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DQDataQualityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDQDataQualityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQScopePropertyType getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(DQScopePropertyType newScope, NotificationChain msgs) {
		DQScopePropertyType oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE, oldScope, newScope);
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
	public void setScope(DQScopePropertyType newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DQElementPropertyType> getReport() {
		if (report == null) {
			report = new EObjectContainmentEList<DQElementPropertyType>(DQElementPropertyType.class, this, GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LILineagePropertyType getLineage() {
		return lineage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineage(LILineagePropertyType newLineage, NotificationChain msgs) {
		LILineagePropertyType oldLineage = lineage;
		lineage = newLineage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE, oldLineage, newLineage);
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
	public void setLineage(LILineagePropertyType newLineage) {
		if (newLineage != lineage) {
			NotificationChain msgs = null;
			if (lineage != null)
				msgs = ((InternalEObject)lineage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE, null, msgs);
			if (newLineage != null)
				msgs = ((InternalEObject)newLineage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE, null, msgs);
			msgs = basicSetLineage(newLineage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE, newLineage, newLineage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE:
				return basicSetScope(null, msgs);
			case GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE:
				return basicSetLineage(null, msgs);
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
			case GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE:
				return getScope();
			case GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT:
				return getReport();
			case GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE:
				return getLineage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE:
				setScope((DQScopePropertyType)newValue);
				return;
			case GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends DQElementPropertyType>)newValue);
				return;
			case GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE:
				setLineage((LILineagePropertyType)newValue);
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
			case GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE:
				setScope((DQScopePropertyType)null);
				return;
			case GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT:
				getReport().clear();
				return;
			case GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE:
				setLineage((LILineagePropertyType)null);
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
			case GMDPackage.DQ_DATA_QUALITY_TYPE__SCOPE:
				return scope != null;
			case GMDPackage.DQ_DATA_QUALITY_TYPE__REPORT:
				return report != null && !report.isEmpty();
			case GMDPackage.DQ_DATA_QUALITY_TYPE__LINEAGE:
				return lineage != null;
		}
		return super.eIsSet(featureID);
	}

} //DQDataQualityTypeImpl
