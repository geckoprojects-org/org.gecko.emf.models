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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AktenplanType;
import de.xoev.domea.domea.AktenplaneinheitAktenplanType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.FormatType;
import de.xoev.domea.domea.ZeitraumType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aktenplan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getGueltigkeit <em>Gueltigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplanTypeImpl#getAktenplandatei <em>Aktenplandatei</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AktenplanTypeImpl extends MinimalEObjectImpl.Container implements AktenplanType {
	/**
	 * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	 * The cached value of the '{@link #getEinheit() <em>Einheit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinheit()
	 * @generated
	 * @ordered
	 */
	protected EList<AktenplaneinheitAktenplanType> einheit;

	/**
	 * The cached value of the '{@link #getGueltigkeit() <em>Gueltigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigkeit()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType gueltigkeit;

	/**
	 * The cached value of the '{@link #getAktenplandatei() <em>Aktenplandatei</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenplandatei()
	 * @generated
	 * @ordered
	 */
	protected EList<FormatType> aktenplandatei;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AktenplanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AKTENPLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezeichnung(String newBezeichnung) {
		String oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLAN_TYPE__BEZEICHNUNG, oldBezeichnung, bezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLAN_TYPE__TYP, oldTyp, typ));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLAN_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AktenplaneinheitAktenplanType> getEinheit() {
		if (einheit == null) {
			einheit = new EObjectContainmentEList<AktenplaneinheitAktenplanType>(AktenplaneinheitAktenplanType.class, this, DomeaPackage.AKTENPLAN_TYPE__EINHEIT);
		}
		return einheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getGueltigkeit() {
		return gueltigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGueltigkeit(ZeitraumType newGueltigkeit, NotificationChain msgs) {
		ZeitraumType oldGueltigkeit = gueltigkeit;
		gueltigkeit = newGueltigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT, oldGueltigkeit, newGueltigkeit);
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
	public void setGueltigkeit(ZeitraumType newGueltigkeit) {
		if (newGueltigkeit != gueltigkeit) {
			NotificationChain msgs = null;
			if (gueltigkeit != null)
				msgs = ((InternalEObject)gueltigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT, null, msgs);
			if (newGueltigkeit != null)
				msgs = ((InternalEObject)newGueltigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT, null, msgs);
			msgs = basicSetGueltigkeit(newGueltigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT, newGueltigkeit, newGueltigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormatType> getAktenplandatei() {
		if (aktenplandatei == null) {
			aktenplandatei = new EObjectContainmentEList<FormatType>(FormatType.class, this, DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI);
		}
		return aktenplandatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AKTENPLAN_TYPE__EINHEIT:
				return ((InternalEList<?>)getEinheit()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT:
				return basicSetGueltigkeit(null, msgs);
			case DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI:
				return ((InternalEList<?>)getAktenplandatei()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.AKTENPLAN_TYPE__BEZEICHNUNG:
				return getBezeichnung();
			case DomeaPackage.AKTENPLAN_TYPE__TYP:
				return getTyp();
			case DomeaPackage.AKTENPLAN_TYPE__VERSION:
				return getVersion();
			case DomeaPackage.AKTENPLAN_TYPE__EINHEIT:
				return getEinheit();
			case DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT:
				return getGueltigkeit();
			case DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI:
				return getAktenplandatei();
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
			case DomeaPackage.AKTENPLAN_TYPE__BEZEICHNUNG:
				setBezeichnung((String)newValue);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__TYP:
				setTyp((String)newValue);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__EINHEIT:
				getEinheit().clear();
				getEinheit().addAll((Collection<? extends AktenplaneinheitAktenplanType>)newValue);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT:
				setGueltigkeit((ZeitraumType)newValue);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI:
				getAktenplandatei().clear();
				getAktenplandatei().addAll((Collection<? extends FormatType>)newValue);
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
			case DomeaPackage.AKTENPLAN_TYPE__BEZEICHNUNG:
				setBezeichnung(BEZEICHNUNG_EDEFAULT);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__EINHEIT:
				getEinheit().clear();
				return;
			case DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT:
				setGueltigkeit((ZeitraumType)null);
				return;
			case DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI:
				getAktenplandatei().clear();
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
			case DomeaPackage.AKTENPLAN_TYPE__BEZEICHNUNG:
				return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
			case DomeaPackage.AKTENPLAN_TYPE__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case DomeaPackage.AKTENPLAN_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DomeaPackage.AKTENPLAN_TYPE__EINHEIT:
				return einheit != null && !einheit.isEmpty();
			case DomeaPackage.AKTENPLAN_TYPE__GUELTIGKEIT:
				return gueltigkeit != null;
			case DomeaPackage.AKTENPLAN_TYPE__AKTENPLANDATEI:
				return aktenplandatei != null && !aktenplandatei.isEmpty();
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
		result.append(" (bezeichnung: ");
		result.append(bezeichnung);
		result.append(", typ: ");
		result.append(typ);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AktenplanTypeImpl
