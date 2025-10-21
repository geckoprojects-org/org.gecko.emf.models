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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType;
import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsrv Statusantwortrvbea0403 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl#getRueckmeldung <em>Rueckmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DsrvStatusantwortrvbea0403TypeImpl extends NachrichtTypeImpl implements DsrvStatusantwortrvbea0403Type {
	/**
	 * The default value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected static final String ABFRAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected String abfrageID = ABFRAGE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRueckmeldung() <em>Rueckmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckmeldung()
	 * @generated
	 * @ordered
	 */
	protected AnyTypeFamilieDSRVType rueckmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsrvStatusantwortrvbea0403TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSRVPackage.Literals.DSRV_STATUSANTWORTRVBEA0403_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbfrageID() {
		return abfrageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbfrageID(String newAbfrageID) {
		String oldAbfrageID = abfrageID;
		abfrageID = newAbfrageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID, oldAbfrageID, abfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyTypeFamilieDSRVType getRueckmeldung() {
		return rueckmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRueckmeldung(AnyTypeFamilieDSRVType newRueckmeldung, NotificationChain msgs) {
		AnyTypeFamilieDSRVType oldRueckmeldung = rueckmeldung;
		rueckmeldung = newRueckmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG, oldRueckmeldung, newRueckmeldung);
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
	public void setRueckmeldung(AnyTypeFamilieDSRVType newRueckmeldung) {
		if (newRueckmeldung != rueckmeldung) {
			NotificationChain msgs = null;
			if (rueckmeldung != null)
				msgs = ((InternalEObject)rueckmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG, null, msgs);
			if (newRueckmeldung != null)
				msgs = ((InternalEObject)newRueckmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG, null, msgs);
			msgs = basicSetRueckmeldung(newRueckmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG, newRueckmeldung, newRueckmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG:
				return basicSetRueckmeldung(null, msgs);
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
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID:
				return getAbfrageID();
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG:
				return getRueckmeldung();
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
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID:
				setAbfrageID((String)newValue);
				return;
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG:
				setRueckmeldung((AnyTypeFamilieDSRVType)newValue);
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
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID:
				setAbfrageID(ABFRAGE_ID_EDEFAULT);
				return;
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG:
				setRueckmeldung((AnyTypeFamilieDSRVType)null);
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
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID:
				return ABFRAGE_ID_EDEFAULT == null ? abfrageID != null : !ABFRAGE_ID_EDEFAULT.equals(abfrageID);
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG:
				return rueckmeldung != null;
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
		result.append(" (abfrageID: ");
		result.append(abfrageID);
		result.append(')');
		return result.toString();
	}

} //DsrvStatusantwortrvbea0403TypeImpl
