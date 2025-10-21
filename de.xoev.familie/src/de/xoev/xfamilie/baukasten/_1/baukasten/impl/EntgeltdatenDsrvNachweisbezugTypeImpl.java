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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType;
import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Entgeltdaten Dsrv Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl#getNachweisbezug <em>Nachweisbezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl#getZeitraumVon <em>Zeitraum Von</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl#getZeitraumBis <em>Zeitraum Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl#getEntgeltdatenArbeitgeber <em>Entgeltdaten Arbeitgeber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntgeltdatenDsrvNachweisbezugTypeImpl extends MinimalEObjectImpl.Container implements EntgeltdatenDsrvNachweisbezugType {
	/**
	 * The cached value of the '{@link #getNachweisbezug() <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisbezug()
	 * @generated
	 * @ordered
	 */
	protected NachweisbezugType nachweisbezug;

	/**
	 * The default value of the '{@link #getZeitraumVon() <em>Zeitraum Von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumVon()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraumVon() <em>Zeitraum Von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumVon()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraumVon = ZEITRAUM_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeitraumBis() <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumBis()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraumBis() <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumBis()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraumBis = ZEITRAUM_BIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntgeltdatenArbeitgeber() <em>Entgeltdaten Arbeitgeber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntgeltdatenArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected EList<EntgeltdatenArbeitgeberDsrvType> entgeltdatenArbeitgeber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntgeltdatenDsrvNachweisbezugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisbezugType getNachweisbezug() {
		return nachweisbezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisbezug(NachweisbezugType newNachweisbezug, NotificationChain msgs) {
		NachweisbezugType oldNachweisbezug = nachweisbezug;
		nachweisbezug = newNachweisbezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, oldNachweisbezug, newNachweisbezug);
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
	public void setNachweisbezug(NachweisbezugType newNachweisbezug) {
		if (newNachweisbezug != nachweisbezug) {
			NotificationChain msgs = null;
			if (nachweisbezug != null)
				msgs = ((InternalEObject)nachweisbezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			if (newNachweisbezug != null)
				msgs = ((InternalEObject)newNachweisbezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			msgs = basicSetNachweisbezug(newNachweisbezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, newNachweisbezug, newNachweisbezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraumVon() {
		return zeitraumVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraumVon(XMLGregorianCalendar newZeitraumVon) {
		XMLGregorianCalendar oldZeitraumVon = zeitraumVon;
		zeitraumVon = newZeitraumVon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON, oldZeitraumVon, zeitraumVon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraumBis() {
		return zeitraumBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraumBis(XMLGregorianCalendar newZeitraumBis) {
		XMLGregorianCalendar oldZeitraumBis = zeitraumBis;
		zeitraumBis = newZeitraumBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS, oldZeitraumBis, zeitraumBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntgeltdatenArbeitgeberDsrvType> getEntgeltdatenArbeitgeber() {
		if (entgeltdatenArbeitgeber == null) {
			entgeltdatenArbeitgeber = new EObjectContainmentEList<EntgeltdatenArbeitgeberDsrvType>(EntgeltdatenArbeitgeberDsrvType.class, this, BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER);
		}
		return entgeltdatenArbeitgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return basicSetNachweisbezug(null, msgs);
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER:
				return ((InternalEList<?>)getEntgeltdatenArbeitgeber()).basicRemove(otherEnd, msgs);
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
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return getNachweisbezug();
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON:
				return getZeitraumVon();
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS:
				return getZeitraumBis();
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER:
				return getEntgeltdatenArbeitgeber();
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
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)newValue);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON:
				setZeitraumVon((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS:
				setZeitraumBis((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER:
				getEntgeltdatenArbeitgeber().clear();
				getEntgeltdatenArbeitgeber().addAll((Collection<? extends EntgeltdatenArbeitgeberDsrvType>)newValue);
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
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)null);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON:
				setZeitraumVon(ZEITRAUM_VON_EDEFAULT);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS:
				setZeitraumBis(ZEITRAUM_BIS_EDEFAULT);
				return;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER:
				getEntgeltdatenArbeitgeber().clear();
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
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return nachweisbezug != null;
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON:
				return ZEITRAUM_VON_EDEFAULT == null ? zeitraumVon != null : !ZEITRAUM_VON_EDEFAULT.equals(zeitraumVon);
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS:
				return ZEITRAUM_BIS_EDEFAULT == null ? zeitraumBis != null : !ZEITRAUM_BIS_EDEFAULT.equals(zeitraumBis);
			case BaukastenPackage.ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER:
				return entgeltdatenArbeitgeber != null && !entgeltdatenArbeitgeber.isEmpty();
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
		result.append(" (zeitraumVon: ");
		result.append(zeitraumVon);
		result.append(", zeitraumBis: ");
		result.append(zeitraumBis);
		result.append(')');
		return result.toString();
	}

} //EntgeltdatenDsrvNachweisbezugTypeImpl
