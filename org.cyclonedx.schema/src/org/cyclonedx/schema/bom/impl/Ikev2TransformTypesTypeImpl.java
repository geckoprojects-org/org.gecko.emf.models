/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.Ikev2TransformTypesType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ikev2 Transform Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#getEncr <em>Encr</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#getPrf <em>Prf</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#getInteg <em>Integ</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#isEsn <em>Esn</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl#getAuth <em>Auth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ikev2TransformTypesTypeImpl extends MinimalEObjectImpl.Container implements Ikev2TransformTypesType {
	/**
	 * The cached value of the '{@link #getEncr() <em>Encr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> encr;

	/**
	 * The cached value of the '{@link #getPrf() <em>Prf</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrf()
	 * @generated
	 * @ordered
	 */
	protected EList<String> prf;

	/**
	 * The cached value of the '{@link #getInteg() <em>Integ</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteg()
	 * @generated
	 * @ordered
	 */
	protected EList<String> integ;

	/**
	 * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKe()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ke;

	/**
	 * The default value of the '{@link #isEsn() <em>Esn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsn() <em>Esn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsn()
	 * @generated
	 * @ordered
	 */
	protected boolean esn = ESN_EDEFAULT;

	/**
	 * This is true if the Esn attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean esnESet;

	/**
	 * The cached value of the '{@link #getAuth() <em>Auth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected EList<String> auth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ikev2TransformTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getIkev2TransformTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEncr() {
		if (encr == null) {
			encr = new EDataTypeEList<String>(String.class, this, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ENCR);
		}
		return encr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPrf() {
		if (prf == null) {
			prf = new EDataTypeEList<String>(String.class, this, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__PRF);
		}
		return prf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInteg() {
		if (integ == null) {
			integ = new EDataTypeEList<String>(String.class, this, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__INTEG);
		}
		return integ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKe() {
		if (ke == null) {
			ke = new EDataTypeEList<String>(String.class, this, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__KE);
		}
		return ke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsn() {
		return esn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsn(boolean newEsn) {
		boolean oldEsn = esn;
		esn = newEsn;
		boolean oldEsnESet = esnESet;
		esnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN, oldEsn, esn, !oldEsnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEsn() {
		boolean oldEsn = esn;
		boolean oldEsnESet = esnESet;
		esn = ESN_EDEFAULT;
		esnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN, oldEsn, ESN_EDEFAULT, oldEsnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEsn() {
		return esnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAuth() {
		if (auth == null) {
			auth = new EDataTypeEList<String>(String.class, this, BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__AUTH);
		}
		return auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ENCR:
				return getEncr();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__PRF:
				return getPrf();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__INTEG:
				return getInteg();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__KE:
				return getKe();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN:
				return isEsn();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__AUTH:
				return getAuth();
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
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ENCR:
				getEncr().clear();
				getEncr().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__PRF:
				getPrf().clear();
				getPrf().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__INTEG:
				getInteg().clear();
				getInteg().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__KE:
				getKe().clear();
				getKe().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN:
				setEsn((Boolean)newValue);
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__AUTH:
				getAuth().clear();
				getAuth().addAll((Collection<? extends String>)newValue);
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
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ENCR:
				getEncr().clear();
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__PRF:
				getPrf().clear();
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__INTEG:
				getInteg().clear();
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__KE:
				getKe().clear();
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN:
				unsetEsn();
				return;
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__AUTH:
				getAuth().clear();
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
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ENCR:
				return encr != null && !encr.isEmpty();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__PRF:
				return prf != null && !prf.isEmpty();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__INTEG:
				return integ != null && !integ.isEmpty();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__KE:
				return ke != null && !ke.isEmpty();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__ESN:
				return isSetEsn();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE__AUTH:
				return auth != null && !auth.isEmpty();
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
		result.append(" (encr: ");
		result.append(encr);
		result.append(", prf: ");
		result.append(prf);
		result.append(", integ: ");
		result.append(integ);
		result.append(", ke: ");
		result.append(ke);
		result.append(", esn: ");
		if (esnESet) result.append(esn); else result.append("<unset>");
		result.append(", auth: ");
		result.append(auth);
		result.append(')');
		return result.toString();
	}

} //Ikev2TransformTypesTypeImpl
