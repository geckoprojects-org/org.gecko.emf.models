/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeheimhaltungType;
import de.xoev.domea.domea.GeheimhaltungsgradCodeType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geheimhaltung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getGeheimhaltungsgrad <em>Geheimhaltungsgrad</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getEinstufungsfrist <em>Einstufungsfrist</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getEingestuftAm <em>Eingestuft Am</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getHerausgeber <em>Herausgeber</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getEinstufungEndetAm <em>Einstufung Endet Am</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeheimhaltungTypeImpl extends MinimalEObjectImpl.Container implements GeheimhaltungType {
	/**
	 * The cached value of the '{@link #getGeheimhaltungsgrad() <em>Geheimhaltungsgrad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeheimhaltungsgrad()
	 * @generated
	 * @ordered
	 */
	protected GeheimhaltungsgradCodeType geheimhaltungsgrad;

	/**
	 * The default value of the '{@link #getEinstufungsfrist() <em>Einstufungsfrist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstufungsfrist()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EINSTUFUNGSFRIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinstufungsfrist() <em>Einstufungsfrist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstufungsfrist()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar einstufungsfrist = EINSTUFUNGSFRIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEingestuftAm() <em>Eingestuft Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEingestuftAm()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EINGESTUFT_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEingestuftAm() <em>Eingestuft Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEingestuftAm()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar eingestuftAm = EINGESTUFT_AM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHerausgeber() <em>Herausgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerausgeber()
	 * @generated
	 * @ordered
	 */
	protected static final String HERAUSGEBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHerausgeber() <em>Herausgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerausgeber()
	 * @generated
	 * @ordered
	 */
	protected String herausgeber = HERAUSGEBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEinstufungEndetAm() <em>Einstufung Endet Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstufungEndetAm()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EINSTUFUNG_ENDET_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinstufungEndetAm() <em>Einstufung Endet Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstufungEndetAm()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar einstufungEndetAm = EINSTUFUNG_ENDET_AM_EDEFAULT;

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
	protected GeheimhaltungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.GEHEIMHALTUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeheimhaltungsgradCodeType getGeheimhaltungsgrad() {
		return geheimhaltungsgrad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeheimhaltungsgrad(GeheimhaltungsgradCodeType newGeheimhaltungsgrad, NotificationChain msgs) {
		GeheimhaltungsgradCodeType oldGeheimhaltungsgrad = geheimhaltungsgrad;
		geheimhaltungsgrad = newGeheimhaltungsgrad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD, oldGeheimhaltungsgrad, newGeheimhaltungsgrad);
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
	public void setGeheimhaltungsgrad(GeheimhaltungsgradCodeType newGeheimhaltungsgrad) {
		if (newGeheimhaltungsgrad != geheimhaltungsgrad) {
			NotificationChain msgs = null;
			if (geheimhaltungsgrad != null)
				msgs = ((InternalEObject)geheimhaltungsgrad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD, null, msgs);
			if (newGeheimhaltungsgrad != null)
				msgs = ((InternalEObject)newGeheimhaltungsgrad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD, null, msgs);
			msgs = basicSetGeheimhaltungsgrad(newGeheimhaltungsgrad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD, newGeheimhaltungsgrad, newGeheimhaltungsgrad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEinstufungsfrist() {
		return einstufungsfrist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinstufungsfrist(XMLGregorianCalendar newEinstufungsfrist) {
		XMLGregorianCalendar oldEinstufungsfrist = einstufungsfrist;
		einstufungsfrist = newEinstufungsfrist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST, oldEinstufungsfrist, einstufungsfrist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEingestuftAm() {
		return eingestuftAm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEingestuftAm(XMLGregorianCalendar newEingestuftAm) {
		XMLGregorianCalendar oldEingestuftAm = eingestuftAm;
		eingestuftAm = newEingestuftAm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__EINGESTUFT_AM, oldEingestuftAm, eingestuftAm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHerausgeber() {
		return herausgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHerausgeber(String newHerausgeber) {
		String oldHerausgeber = herausgeber;
		herausgeber = newHerausgeber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__HERAUSGEBER, oldHerausgeber, herausgeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEinstufungEndetAm() {
		return einstufungEndetAm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinstufungEndetAm(XMLGregorianCalendar newEinstufungEndetAm) {
		XMLGregorianCalendar oldEinstufungEndetAm = einstufungEndetAm;
		einstufungEndetAm = newEinstufungEndetAm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM, oldEinstufungEndetAm, einstufungEndetAm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GEHEIMHALTUNG_TYPE__BEMERKUNG, oldBemerkung, bemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD:
				return basicSetGeheimhaltungsgrad(null, msgs);
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
			case DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD:
				return getGeheimhaltungsgrad();
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST:
				return getEinstufungsfrist();
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINGESTUFT_AM:
				return getEingestuftAm();
			case DomeaPackage.GEHEIMHALTUNG_TYPE__HERAUSGEBER:
				return getHerausgeber();
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM:
				return getEinstufungEndetAm();
			case DomeaPackage.GEHEIMHALTUNG_TYPE__BEMERKUNG:
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
			case DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD:
				setGeheimhaltungsgrad((GeheimhaltungsgradCodeType)newValue);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST:
				setEinstufungsfrist((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINGESTUFT_AM:
				setEingestuftAm((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__HERAUSGEBER:
				setHerausgeber((String)newValue);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM:
				setEinstufungEndetAm((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__BEMERKUNG:
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
			case DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD:
				setGeheimhaltungsgrad((GeheimhaltungsgradCodeType)null);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST:
				setEinstufungsfrist(EINSTUFUNGSFRIST_EDEFAULT);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINGESTUFT_AM:
				setEingestuftAm(EINGESTUFT_AM_EDEFAULT);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__HERAUSGEBER:
				setHerausgeber(HERAUSGEBER_EDEFAULT);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM:
				setEinstufungEndetAm(EINSTUFUNG_ENDET_AM_EDEFAULT);
				return;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__BEMERKUNG:
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
			case DomeaPackage.GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD:
				return geheimhaltungsgrad != null;
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST:
				return EINSTUFUNGSFRIST_EDEFAULT == null ? einstufungsfrist != null : !EINSTUFUNGSFRIST_EDEFAULT.equals(einstufungsfrist);
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINGESTUFT_AM:
				return EINGESTUFT_AM_EDEFAULT == null ? eingestuftAm != null : !EINGESTUFT_AM_EDEFAULT.equals(eingestuftAm);
			case DomeaPackage.GEHEIMHALTUNG_TYPE__HERAUSGEBER:
				return HERAUSGEBER_EDEFAULT == null ? herausgeber != null : !HERAUSGEBER_EDEFAULT.equals(herausgeber);
			case DomeaPackage.GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM:
				return EINSTUFUNG_ENDET_AM_EDEFAULT == null ? einstufungEndetAm != null : !EINSTUFUNG_ENDET_AM_EDEFAULT.equals(einstufungEndetAm);
			case DomeaPackage.GEHEIMHALTUNG_TYPE__BEMERKUNG:
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
		result.append(" (einstufungsfrist: ");
		result.append(einstufungsfrist);
		result.append(", eingestuftAm: ");
		result.append(eingestuftAm);
		result.append(", herausgeber: ");
		result.append(herausgeber);
		result.append(", einstufungEndetAm: ");
		result.append(einstufungEndetAm);
		result.append(", bemerkung: ");
		result.append(bemerkung);
		result.append(')');
		return result.toString();
	}

} //GeheimhaltungTypeImpl
