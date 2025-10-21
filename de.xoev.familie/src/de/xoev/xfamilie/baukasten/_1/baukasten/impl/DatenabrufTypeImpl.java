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
import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenabruf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getZeitstempel <em>Zeitstempel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getArtDesAbrufs <em>Art Des Abrufs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getAbgerufenFuer <em>Abgerufen Fuer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl#getStatusDatenabruf <em>Status Datenabruf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenabrufTypeImpl extends MinimalEObjectImpl.Container implements DatenabrufType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeitstempel() <em>Zeitstempel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitstempel()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITSTEMPEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitstempel() <em>Zeitstempel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitstempel()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitstempel = ZEITSTEMPEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuelle() <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String QUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuelle() <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuelle()
	 * @generated
	 * @ordered
	 */
	protected String quelle = QUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtDesAbrufs() <em>Art Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDesAbrufs()
	 * @generated
	 * @ordered
	 */
	protected static final String ART_DES_ABRUFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtDesAbrufs() <em>Art Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDesAbrufs()
	 * @generated
	 * @ordered
	 */
	protected String artDesAbrufs = ART_DES_ABRUFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbgerufenFuer() <em>Abgerufen Fuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbgerufenFuer()
	 * @generated
	 * @ordered
	 */
	protected static final String ABGERUFEN_FUER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbgerufenFuer() <em>Abgerufen Fuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbgerufenFuer()
	 * @generated
	 * @ordered
	 */
	protected String abgerufenFuer = ABGERUFEN_FUER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusDatenabruf() <em>Status Datenabruf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatenabruf()
	 * @generated
	 * @ordered
	 */
	protected StatusDatenabrufType statusDatenabruf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenabrufTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.DATENABRUF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitstempel() {
		return zeitstempel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitstempel(XMLGregorianCalendar newZeitstempel) {
		XMLGregorianCalendar oldZeitstempel = zeitstempel;
		zeitstempel = newZeitstempel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__ZEITSTEMPEL, oldZeitstempel, zeitstempel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuelle() {
		return quelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuelle(String newQuelle) {
		String oldQuelle = quelle;
		quelle = newQuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__QUELLE, oldQuelle, quelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtDesAbrufs() {
		return artDesAbrufs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtDesAbrufs(String newArtDesAbrufs) {
		String oldArtDesAbrufs = artDesAbrufs;
		artDesAbrufs = newArtDesAbrufs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__ART_DES_ABRUFS, oldArtDesAbrufs, artDesAbrufs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbgerufenFuer() {
		return abgerufenFuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbgerufenFuer(String newAbgerufenFuer) {
		String oldAbgerufenFuer = abgerufenFuer;
		abgerufenFuer = newAbgerufenFuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__ABGERUFEN_FUER, oldAbgerufenFuer, abgerufenFuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusDatenabrufType getStatusDatenabruf() {
		return statusDatenabruf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDatenabruf(StatusDatenabrufType newStatusDatenabruf, NotificationChain msgs) {
		StatusDatenabrufType oldStatusDatenabruf = statusDatenabruf;
		statusDatenabruf = newStatusDatenabruf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF, oldStatusDatenabruf, newStatusDatenabruf);
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
	public void setStatusDatenabruf(StatusDatenabrufType newStatusDatenabruf) {
		if (newStatusDatenabruf != statusDatenabruf) {
			NotificationChain msgs = null;
			if (statusDatenabruf != null)
				msgs = ((InternalEObject)statusDatenabruf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF, null, msgs);
			if (newStatusDatenabruf != null)
				msgs = ((InternalEObject)newStatusDatenabruf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF, null, msgs);
			msgs = basicSetStatusDatenabruf(newStatusDatenabruf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF, newStatusDatenabruf, newStatusDatenabruf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF:
				return basicSetStatusDatenabruf(null, msgs);
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
			case BaukastenPackage.DATENABRUF_TYPE__ID:
				return getId();
			case BaukastenPackage.DATENABRUF_TYPE__ZEITSTEMPEL:
				return getZeitstempel();
			case BaukastenPackage.DATENABRUF_TYPE__QUELLE:
				return getQuelle();
			case BaukastenPackage.DATENABRUF_TYPE__ART_DES_ABRUFS:
				return getArtDesAbrufs();
			case BaukastenPackage.DATENABRUF_TYPE__ABGERUFEN_FUER:
				return getAbgerufenFuer();
			case BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF:
				return getStatusDatenabruf();
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
			case BaukastenPackage.DATENABRUF_TYPE__ID:
				setId((String)newValue);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ZEITSTEMPEL:
				setZeitstempel((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__QUELLE:
				setQuelle((String)newValue);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ART_DES_ABRUFS:
				setArtDesAbrufs((String)newValue);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ABGERUFEN_FUER:
				setAbgerufenFuer((String)newValue);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF:
				setStatusDatenabruf((StatusDatenabrufType)newValue);
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
			case BaukastenPackage.DATENABRUF_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ZEITSTEMPEL:
				setZeitstempel(ZEITSTEMPEL_EDEFAULT);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__QUELLE:
				setQuelle(QUELLE_EDEFAULT);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ART_DES_ABRUFS:
				setArtDesAbrufs(ART_DES_ABRUFS_EDEFAULT);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__ABGERUFEN_FUER:
				setAbgerufenFuer(ABGERUFEN_FUER_EDEFAULT);
				return;
			case BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF:
				setStatusDatenabruf((StatusDatenabrufType)null);
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
			case BaukastenPackage.DATENABRUF_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BaukastenPackage.DATENABRUF_TYPE__ZEITSTEMPEL:
				return ZEITSTEMPEL_EDEFAULT == null ? zeitstempel != null : !ZEITSTEMPEL_EDEFAULT.equals(zeitstempel);
			case BaukastenPackage.DATENABRUF_TYPE__QUELLE:
				return QUELLE_EDEFAULT == null ? quelle != null : !QUELLE_EDEFAULT.equals(quelle);
			case BaukastenPackage.DATENABRUF_TYPE__ART_DES_ABRUFS:
				return ART_DES_ABRUFS_EDEFAULT == null ? artDesAbrufs != null : !ART_DES_ABRUFS_EDEFAULT.equals(artDesAbrufs);
			case BaukastenPackage.DATENABRUF_TYPE__ABGERUFEN_FUER:
				return ABGERUFEN_FUER_EDEFAULT == null ? abgerufenFuer != null : !ABGERUFEN_FUER_EDEFAULT.equals(abgerufenFuer);
			case BaukastenPackage.DATENABRUF_TYPE__STATUS_DATENABRUF:
				return statusDatenabruf != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", zeitstempel: ");
		result.append(zeitstempel);
		result.append(", quelle: ");
		result.append(quelle);
		result.append(", artDesAbrufs: ");
		result.append(artDesAbrufs);
		result.append(", abgerufenFuer: ");
		result.append(abgerufenFuer);
		result.append(')');
		return result.toString();
	}

} //DatenabrufTypeImpl
