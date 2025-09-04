/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.SchriftgutobjekttypCodeType;
import de.xoev.domea.domea.VerweisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verweis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.VerweisTypeImpl#getXdomeaUUID <em>Xdomea UUID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerweisTypeImpl#getSGOTyp <em>SGO Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerweisTypeImpl#getSGOKennzeichen <em>SGO Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerweisTypeImpl#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerweisTypeImpl extends MinimalEObjectImpl.Container implements VerweisType {
	/**
	 * The default value of the '{@link #getXdomeaUUID() <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdomeaUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String XDOMEA_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXdomeaUUID() <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdomeaUUID()
	 * @generated
	 * @ordered
	 */
	protected String xdomeaUUID = XDOMEA_UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSGOTyp() <em>SGO Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGOTyp()
	 * @generated
	 * @ordered
	 */
	protected SchriftgutobjekttypCodeType sGOTyp;

	/**
	 * The default value of the '{@link #getSGOKennzeichen() <em>SGO Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGOKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String SGO_KENNZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSGOKennzeichen() <em>SGO Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGOKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected String sGOKennzeichen = SGO_KENNZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEMERKUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected String bemerkung = BEMERKUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerweisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.VERWEIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXdomeaUUID() {
		return xdomeaUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXdomeaUUID(String newXdomeaUUID) {
		String oldXdomeaUUID = xdomeaUUID;
		xdomeaUUID = newXdomeaUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERWEIS_TYPE__XDOMEA_UUID, oldXdomeaUUID, xdomeaUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchriftgutobjekttypCodeType getSGOTyp() {
		return sGOTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGOTyp(SchriftgutobjekttypCodeType newSGOTyp, NotificationChain msgs) {
		SchriftgutobjekttypCodeType oldSGOTyp = sGOTyp;
		sGOTyp = newSGOTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.VERWEIS_TYPE__SGO_TYP, oldSGOTyp, newSGOTyp);
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
	public void setSGOTyp(SchriftgutobjekttypCodeType newSGOTyp) {
		if (newSGOTyp != sGOTyp) {
			NotificationChain msgs = null;
			if (sGOTyp != null)
				msgs = ((InternalEObject)sGOTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERWEIS_TYPE__SGO_TYP, null, msgs);
			if (newSGOTyp != null)
				msgs = ((InternalEObject)newSGOTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERWEIS_TYPE__SGO_TYP, null, msgs);
			msgs = basicSetSGOTyp(newSGOTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERWEIS_TYPE__SGO_TYP, newSGOTyp, newSGOTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSGOKennzeichen() {
		return sGOKennzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGOKennzeichen(String newSGOKennzeichen) {
		String oldSGOKennzeichen = sGOKennzeichen;
		sGOKennzeichen = newSGOKennzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERWEIS_TYPE__SGO_KENNZEICHEN, oldSGOKennzeichen, sGOKennzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBemerkung() {
		return bemerkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBemerkung(String newBemerkung) {
		String oldBemerkung = bemerkung;
		bemerkung = newBemerkung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERWEIS_TYPE__BEMERKUNG, oldBemerkung, bemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.VERWEIS_TYPE__SGO_TYP:
				return basicSetSGOTyp(null, msgs);
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
			case DomeaPackage.VERWEIS_TYPE__XDOMEA_UUID:
				return getXdomeaUUID();
			case DomeaPackage.VERWEIS_TYPE__SGO_TYP:
				return getSGOTyp();
			case DomeaPackage.VERWEIS_TYPE__SGO_KENNZEICHEN:
				return getSGOKennzeichen();
			case DomeaPackage.VERWEIS_TYPE__BEMERKUNG:
				return getBemerkung();
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
			case DomeaPackage.VERWEIS_TYPE__XDOMEA_UUID:
				setXdomeaUUID((String)newValue);
				return;
			case DomeaPackage.VERWEIS_TYPE__SGO_TYP:
				setSGOTyp((SchriftgutobjekttypCodeType)newValue);
				return;
			case DomeaPackage.VERWEIS_TYPE__SGO_KENNZEICHEN:
				setSGOKennzeichen((String)newValue);
				return;
			case DomeaPackage.VERWEIS_TYPE__BEMERKUNG:
				setBemerkung((String)newValue);
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
			case DomeaPackage.VERWEIS_TYPE__XDOMEA_UUID:
				setXdomeaUUID(XDOMEA_UUID_EDEFAULT);
				return;
			case DomeaPackage.VERWEIS_TYPE__SGO_TYP:
				setSGOTyp((SchriftgutobjekttypCodeType)null);
				return;
			case DomeaPackage.VERWEIS_TYPE__SGO_KENNZEICHEN:
				setSGOKennzeichen(SGO_KENNZEICHEN_EDEFAULT);
				return;
			case DomeaPackage.VERWEIS_TYPE__BEMERKUNG:
				setBemerkung(BEMERKUNG_EDEFAULT);
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
			case DomeaPackage.VERWEIS_TYPE__XDOMEA_UUID:
				return XDOMEA_UUID_EDEFAULT == null ? xdomeaUUID != null : !XDOMEA_UUID_EDEFAULT.equals(xdomeaUUID);
			case DomeaPackage.VERWEIS_TYPE__SGO_TYP:
				return sGOTyp != null;
			case DomeaPackage.VERWEIS_TYPE__SGO_KENNZEICHEN:
				return SGO_KENNZEICHEN_EDEFAULT == null ? sGOKennzeichen != null : !SGO_KENNZEICHEN_EDEFAULT.equals(sGOKennzeichen);
			case DomeaPackage.VERWEIS_TYPE__BEMERKUNG:
				return BEMERKUNG_EDEFAULT == null ? bemerkung != null : !BEMERKUNG_EDEFAULT.equals(bemerkung);
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
		result.append(" (xdomeaUUID: ");
		result.append(xdomeaUUID);
		result.append(", sGOKennzeichen: ");
		result.append(sGOKennzeichen);
		result.append(", bemerkung: ");
		result.append(bemerkung);
		result.append(')');
		return result.toString();
	}

} //VerweisTypeImpl
