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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entgeltdaten Arbeitgeber Dsrv Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl#getAbrufergebnisDrv <em>Abrufergebnis Drv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntgeltdatenArbeitgeberDsrvTypeImpl extends MinimalEObjectImpl.Container implements EntgeltdatenArbeitgeberDsrvType {
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
	 * The default value of the '{@link #getIfdNrArbeitgeber() <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IFD_NR_ARBEITGEBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfdNrArbeitgeber() <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ifdNrArbeitgeber = IFD_NR_ARBEITGEBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbrufergebnisDrv() <em>Abrufergebnis Drv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbrufergebnisDrv()
	 * @generated
	 * @ordered
	 */
	protected EObject abrufergebnisDrv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntgeltdatenArbeitgeberDsrvTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID, oldAbfrageID, abfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIfdNrArbeitgeber() {
		return ifdNrArbeitgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfdNrArbeitgeber(BigInteger newIfdNrArbeitgeber) {
		BigInteger oldIfdNrArbeitgeber = ifdNrArbeitgeber;
		ifdNrArbeitgeber = newIfdNrArbeitgeber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER, oldIfdNrArbeitgeber, ifdNrArbeitgeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbrufergebnisDrv() {
		return abrufergebnisDrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbrufergebnisDrv(EObject newAbrufergebnisDrv, NotificationChain msgs) {
		EObject oldAbrufergebnisDrv = abrufergebnisDrv;
		abrufergebnisDrv = newAbrufergebnisDrv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV, oldAbrufergebnisDrv, newAbrufergebnisDrv);
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
	public void setAbrufergebnisDrv(EObject newAbrufergebnisDrv) {
		if (newAbrufergebnisDrv != abrufergebnisDrv) {
			NotificationChain msgs = null;
			if (abrufergebnisDrv != null)
				msgs = ((InternalEObject)abrufergebnisDrv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV, null, msgs);
			if (newAbrufergebnisDrv != null)
				msgs = ((InternalEObject)newAbrufergebnisDrv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV, null, msgs);
			msgs = basicSetAbrufergebnisDrv(newAbrufergebnisDrv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV, newAbrufergebnisDrv, newAbrufergebnisDrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV:
				return basicSetAbrufergebnisDrv(null, msgs);
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
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID:
				return getAbfrageID();
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER:
				return getIfdNrArbeitgeber();
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV:
				return getAbrufergebnisDrv();
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
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID:
				setAbfrageID((String)newValue);
				return;
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER:
				setIfdNrArbeitgeber((BigInteger)newValue);
				return;
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV:
				setAbrufergebnisDrv((EObject)newValue);
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
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID:
				setAbfrageID(ABFRAGE_ID_EDEFAULT);
				return;
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER:
				setIfdNrArbeitgeber(IFD_NR_ARBEITGEBER_EDEFAULT);
				return;
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV:
				setAbrufergebnisDrv((EObject)null);
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
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID:
				return ABFRAGE_ID_EDEFAULT == null ? abfrageID != null : !ABFRAGE_ID_EDEFAULT.equals(abfrageID);
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER:
				return IFD_NR_ARBEITGEBER_EDEFAULT == null ? ifdNrArbeitgeber != null : !IFD_NR_ARBEITGEBER_EDEFAULT.equals(ifdNrArbeitgeber);
			case BaukastenPackage.ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV:
				return abrufergebnisDrv != null;
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
		result.append(", ifdNrArbeitgeber: ");
		result.append(ifdNrArbeitgeber);
		result.append(')');
		return result.toString();
	}

} //EntgeltdatenArbeitgeberDsrvTypeImpl
