/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AktenplaneinheitType;
import de.xoev.domea.domea.DomeaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aktenplaneinheit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl#getKennzeichen <em>Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl#getInhaltsangabe <em>Inhaltsangabe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl#getBetreffKurz <em>Betreff Kurz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AktenplaneinheitTypeImpl extends MinimalEObjectImpl.Container implements AktenplaneinheitType {
	/**
	 * The default value of the '{@link #getKennzeichen() <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennzeichen() <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected String kennzeichen = KENNZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInhaltsangabe() <em>Inhaltsangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaltsangabe()
	 * @generated
	 * @ordered
	 */
	protected static final String INHALTSANGABE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInhaltsangabe() <em>Inhaltsangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaltsangabe()
	 * @generated
	 * @ordered
	 */
	protected String inhaltsangabe = INHALTSANGABE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetreffKurz() <em>Betreff Kurz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreffKurz()
	 * @generated
	 * @ordered
	 */
	protected static final String BETREFF_KURZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetreffKurz() <em>Betreff Kurz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreffKurz()
	 * @generated
	 * @ordered
	 */
	protected String betreffKurz = BETREFF_KURZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AktenplaneinheitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AKTENPLANEINHEIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennzeichen() {
		return kennzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennzeichen(String newKennzeichen) {
		String oldKennzeichen = kennzeichen;
		kennzeichen = newKennzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_TYPE__KENNZEICHEN, oldKennzeichen, kennzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInhaltsangabe() {
		return inhaltsangabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInhaltsangabe(String newInhaltsangabe) {
		String oldInhaltsangabe = inhaltsangabe;
		inhaltsangabe = newInhaltsangabe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_TYPE__INHALTSANGABE, oldInhaltsangabe, inhaltsangabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetreffKurz() {
		return betreffKurz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetreffKurz(String newBetreffKurz) {
		String oldBetreffKurz = betreffKurz;
		betreffKurz = newBetreffKurz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_TYPE__BETREFF_KURZ, oldBetreffKurz, betreffKurz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__KENNZEICHEN:
				return getKennzeichen();
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__INHALTSANGABE:
				return getInhaltsangabe();
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__BETREFF_KURZ:
				return getBetreffKurz();
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
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__KENNZEICHEN:
				setKennzeichen((String)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__INHALTSANGABE:
				setInhaltsangabe((String)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__BETREFF_KURZ:
				setBetreffKurz((String)newValue);
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
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__KENNZEICHEN:
				setKennzeichen(KENNZEICHEN_EDEFAULT);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__INHALTSANGABE:
				setInhaltsangabe(INHALTSANGABE_EDEFAULT);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__BETREFF_KURZ:
				setBetreffKurz(BETREFF_KURZ_EDEFAULT);
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
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__KENNZEICHEN:
				return KENNZEICHEN_EDEFAULT == null ? kennzeichen != null : !KENNZEICHEN_EDEFAULT.equals(kennzeichen);
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__INHALTSANGABE:
				return INHALTSANGABE_EDEFAULT == null ? inhaltsangabe != null : !INHALTSANGABE_EDEFAULT.equals(inhaltsangabe);
			case DomeaPackage.AKTENPLANEINHEIT_TYPE__BETREFF_KURZ:
				return BETREFF_KURZ_EDEFAULT == null ? betreffKurz != null : !BETREFF_KURZ_EDEFAULT.equals(betreffKurz);
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
		result.append(" (kennzeichen: ");
		result.append(kennzeichen);
		result.append(", inhaltsangabe: ");
		result.append(inhaltsangabe);
		result.append(", betreffKurz: ");
		result.append(betreffKurz);
		result.append(')');
		return result.toString();
	}

} //AktenplaneinheitTypeImpl
