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

import net.opengis.gml.AbstractFeatureType;

import net.opengis.wfs.IdentifierGenerationOptionType;
import net.opengis.wfs.InsertElementType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getIdgen <em>Idgen</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.InsertElementTypeImpl#getSrsName <em>Srs Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertElementTypeImpl extends MinimalEObjectImpl.Container implements InsertElementType {
	/**
	 * The cached value of the '{@link #getFeatureGroup() <em>Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap featureGroup;

	/**
	 * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected String handle = HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdgen() <em>Idgen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdgen()
	 * @generated
	 * @ordered
	 */
	protected static final IdentifierGenerationOptionType IDGEN_EDEFAULT = IdentifierGenerationOptionType.GENERATE_NEW;

	/**
	 * The cached value of the '{@link #getIdgen() <em>Idgen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdgen()
	 * @generated
	 * @ordered
	 */
	protected IdentifierGenerationOptionType idgen = IDGEN_EDEFAULT;

	/**
	 * This is true if the Idgen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idgenESet;

	/**
	 * The default value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FORMAT_EDEFAULT = "text/xml; subtype=gml/3.1.1";

	/**
	 * The cached value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected String inputFormat = INPUT_FORMAT_EDEFAULT;

	/**
	 * This is true if the Input Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputFormatESet;

	/**
	 * The default value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected static final String SRS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected String srsName = SRS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.INSERT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFeatureGroup() {
		if (featureGroup == null) {
			featureGroup = new BasicFeatureMap(this, WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP);
		}
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getFeature() {
		return getFeatureGroup().list(WFSPackage.Literals.INSERT_ELEMENT_TYPE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandle(String newHandle) {
		String oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.INSERT_ELEMENT_TYPE__HANDLE, oldHandle, handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierGenerationOptionType getIdgen() {
		return idgen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdgen(IdentifierGenerationOptionType newIdgen) {
		IdentifierGenerationOptionType oldIdgen = idgen;
		idgen = newIdgen == null ? IDGEN_EDEFAULT : newIdgen;
		boolean oldIdgenESet = idgenESet;
		idgenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.INSERT_ELEMENT_TYPE__IDGEN, oldIdgen, idgen, !oldIdgenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIdgen() {
		IdentifierGenerationOptionType oldIdgen = idgen;
		boolean oldIdgenESet = idgenESet;
		idgen = IDGEN_EDEFAULT;
		idgenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.INSERT_ELEMENT_TYPE__IDGEN, oldIdgen, IDGEN_EDEFAULT, oldIdgenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIdgen() {
		return idgenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputFormat() {
		return inputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputFormat(String newInputFormat) {
		String oldInputFormat = inputFormat;
		inputFormat = newInputFormat;
		boolean oldInputFormatESet = inputFormatESet;
		inputFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT, oldInputFormat, inputFormat, !oldInputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInputFormat() {
		String oldInputFormat = inputFormat;
		boolean oldInputFormatESet = inputFormatESet;
		inputFormat = INPUT_FORMAT_EDEFAULT;
		inputFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT, oldInputFormat, INPUT_FORMAT_EDEFAULT, oldInputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputFormat() {
		return inputFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrsName() {
		return srsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrsName(String newSrsName) {
		String oldSrsName = srsName;
		srsName = newSrsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.INSERT_ELEMENT_TYPE__SRS_NAME, oldSrsName, srsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP:
				return ((InternalEList<?>)getFeatureGroup()).basicRemove(otherEnd, msgs);
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP:
				if (coreType) return getFeatureGroup();
				return ((FeatureMap.Internal)getFeatureGroup()).getWrapper();
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE:
				return getFeature();
			case WFSPackage.INSERT_ELEMENT_TYPE__HANDLE:
				return getHandle();
			case WFSPackage.INSERT_ELEMENT_TYPE__IDGEN:
				return getIdgen();
			case WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT:
				return getInputFormat();
			case WFSPackage.INSERT_ELEMENT_TYPE__SRS_NAME:
				return getSrsName();
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
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP:
				((FeatureMap.Internal)getFeatureGroup()).set(newValue);
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__HANDLE:
				setHandle((String)newValue);
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__IDGEN:
				setIdgen((IdentifierGenerationOptionType)newValue);
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT:
				setInputFormat((String)newValue);
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__SRS_NAME:
				setSrsName((String)newValue);
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
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP:
				getFeatureGroup().clear();
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__IDGEN:
				unsetIdgen();
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT:
				unsetInputFormat();
				return;
			case WFSPackage.INSERT_ELEMENT_TYPE__SRS_NAME:
				setSrsName(SRS_NAME_EDEFAULT);
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
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE_GROUP:
				return featureGroup != null && !featureGroup.isEmpty();
			case WFSPackage.INSERT_ELEMENT_TYPE__FEATURE:
				return !getFeature().isEmpty();
			case WFSPackage.INSERT_ELEMENT_TYPE__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case WFSPackage.INSERT_ELEMENT_TYPE__IDGEN:
				return isSetIdgen();
			case WFSPackage.INSERT_ELEMENT_TYPE__INPUT_FORMAT:
				return isSetInputFormat();
			case WFSPackage.INSERT_ELEMENT_TYPE__SRS_NAME:
				return SRS_NAME_EDEFAULT == null ? srsName != null : !SRS_NAME_EDEFAULT.equals(srsName);
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
		result.append(" (featureGroup: ");
		result.append(featureGroup);
		result.append(", handle: ");
		result.append(handle);
		result.append(", idgen: ");
		if (idgenESet) result.append(idgen); else result.append("<unset>");
		result.append(", inputFormat: ");
		if (inputFormatESet) result.append(inputFormat); else result.append("<unset>");
		result.append(", srsName: ");
		result.append(srsName);
		result.append(')');
		return result.toString();
	}

} //InsertElementTypeImpl
