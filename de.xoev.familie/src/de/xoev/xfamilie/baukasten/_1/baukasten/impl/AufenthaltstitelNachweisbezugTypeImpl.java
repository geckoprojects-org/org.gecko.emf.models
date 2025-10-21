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

import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
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

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aufenthaltstitel Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl#getDokumenttyp <em>Dokumenttyp</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl#getNebenbestimmungen <em>Nebenbestimmungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl#getAblaufdatum <em>Ablaufdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AufenthaltstitelNachweisbezugTypeImpl extends MinimalEObjectImpl.Container implements AufenthaltstitelNachweisbezugType {
	/**
	 * The default value of the '{@link #getDokumenttyp() <em>Dokumenttyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumenttyp()
	 * @generated
	 * @ordered
	 */
	protected static final String DOKUMENTTYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDokumenttyp() <em>Dokumenttyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumenttyp()
	 * @generated
	 * @ordered
	 */
	protected String dokumenttyp = DOKUMENTTYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNebenbestimmungen() <em>Nebenbestimmungen</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNebenbestimmungen()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nebenbestimmungen;

	/**
	 * The default value of the '{@link #getAblaufdatum() <em>Ablaufdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAblaufdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ABLAUFDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAblaufdatum() <em>Ablaufdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAblaufdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar ablaufdatum = ABLAUFDATUM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AufenthaltstitelNachweisbezugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDokumenttyp() {
		return dokumenttyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDokumenttyp(String newDokumenttyp) {
		String oldDokumenttyp = dokumenttyp;
		dokumenttyp = newDokumenttyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP, oldDokumenttyp, dokumenttyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNebenbestimmungen() {
		if (nebenbestimmungen == null) {
			nebenbestimmungen = new EDataTypeEList<String>(String.class, this, BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN);
		}
		return nebenbestimmungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAblaufdatum() {
		return ablaufdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAblaufdatum(XMLGregorianCalendar newAblaufdatum) {
		XMLGregorianCalendar oldAblaufdatum = ablaufdatum;
		ablaufdatum = newAblaufdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM, oldAblaufdatum, ablaufdatum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, oldNachweisbezug, newNachweisbezug);
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
				msgs = ((InternalEObject)nachweisbezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			if (newNachweisbezug != null)
				msgs = ((InternalEObject)newNachweisbezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			msgs = basicSetNachweisbezug(newNachweisbezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, newNachweisbezug, newNachweisbezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return basicSetNachweisbezug(null, msgs);
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
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP:
				return getDokumenttyp();
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN:
				return getNebenbestimmungen();
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM:
				return getAblaufdatum();
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return getNachweisbezug();
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
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP:
				setDokumenttyp((String)newValue);
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN:
				getNebenbestimmungen().clear();
				getNebenbestimmungen().addAll((Collection<? extends String>)newValue);
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM:
				setAblaufdatum((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)newValue);
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
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP:
				setDokumenttyp(DOKUMENTTYP_EDEFAULT);
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN:
				getNebenbestimmungen().clear();
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM:
				setAblaufdatum(ABLAUFDATUM_EDEFAULT);
				return;
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)null);
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
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP:
				return DOKUMENTTYP_EDEFAULT == null ? dokumenttyp != null : !DOKUMENTTYP_EDEFAULT.equals(dokumenttyp);
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN:
				return nebenbestimmungen != null && !nebenbestimmungen.isEmpty();
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM:
				return ABLAUFDATUM_EDEFAULT == null ? ablaufdatum != null : !ABLAUFDATUM_EDEFAULT.equals(ablaufdatum);
			case BaukastenPackage.AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return nachweisbezug != null;
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
		result.append(" (dokumenttyp: ");
		result.append(dokumenttyp);
		result.append(", nebenbestimmungen: ");
		result.append(nebenbestimmungen);
		result.append(", ablaufdatum: ");
		result.append(ablaufdatum);
		result.append(')');
		return result.toString();
	}

} //AufenthaltstitelNachweisbezugTypeImpl
