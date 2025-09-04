/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AnschriftType;
import de.xoev.domea.domea.AnschriftstypCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.StaatType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getStaat <em>Staat</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getOrt <em>Ort</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getZusatz <em>Zusatz</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnschriftTypeImpl#getTyp <em>Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnschriftTypeImpl extends MinimalEObjectImpl.Container implements AnschriftType {
	/**
	 * The cached value of the '{@link #getStaat() <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaat()
	 * @generated
	 * @ordered
	 */
	protected StaatType staat;

	/**
	 * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected String strasse = STRASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected String hausnummer = HAUSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostfach() <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfach()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTFACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostfach() <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfach()
	 * @generated
	 * @ordered
	 */
	protected String postfach = POSTFACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahl = POSTLEITZAHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected String ort = ORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected String zusatz = ZUSATZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected AnschriftstypCodeType typ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.ANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatType getStaat() {
		return staat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaat(StaatType newStaat, NotificationChain msgs) {
		StaatType oldStaat = staat;
		staat = newStaat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__STAAT, oldStaat, newStaat);
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
	public void setStaat(StaatType newStaat) {
		if (newStaat != staat) {
			NotificationChain msgs = null;
			if (staat != null)
				msgs = ((InternalEObject)staat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ANSCHRIFT_TYPE__STAAT, null, msgs);
			if (newStaat != null)
				msgs = ((InternalEObject)newStaat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ANSCHRIFT_TYPE__STAAT, null, msgs);
			msgs = basicSetStaat(newStaat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__STAAT, newStaat, newStaat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrasse() {
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrasse(String newStrasse) {
		String oldStrasse = strasse;
		strasse = newStrasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__STRASSE, oldStrasse, strasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummer() {
		return hausnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummer(String newHausnummer) {
		String oldHausnummer = hausnummer;
		hausnummer = newHausnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__HAUSNUMMER, oldHausnummer, hausnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostfach() {
		return postfach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostfach(String newPostfach) {
		String oldPostfach = postfach;
		postfach = newPostfach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__POSTFACH, oldPostfach, postfach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostleitzahl() {
		return postleitzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostleitzahl(String newPostleitzahl) {
		String oldPostleitzahl = postleitzahl;
		postleitzahl = newPostleitzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__POSTLEITZAHL, oldPostleitzahl, postleitzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrt() {
		return ort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrt(String newOrt) {
		String oldOrt = ort;
		ort = newOrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__ORT, oldOrt, ort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatz() {
		return zusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatz(String newZusatz) {
		String oldZusatz = zusatz;
		zusatz = newZusatz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__ZUSATZ, oldZusatz, zusatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftstypCodeType getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTyp(AnschriftstypCodeType newTyp, NotificationChain msgs) {
		AnschriftstypCodeType oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__TYP, oldTyp, newTyp);
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
	public void setTyp(AnschriftstypCodeType newTyp) {
		if (newTyp != typ) {
			NotificationChain msgs = null;
			if (typ != null)
				msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ANSCHRIFT_TYPE__TYP, null, msgs);
			if (newTyp != null)
				msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ANSCHRIFT_TYPE__TYP, null, msgs);
			msgs = basicSetTyp(newTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANSCHRIFT_TYPE__TYP, newTyp, newTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.ANSCHRIFT_TYPE__STAAT:
				return basicSetStaat(null, msgs);
			case DomeaPackage.ANSCHRIFT_TYPE__TYP:
				return basicSetTyp(null, msgs);
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
			case DomeaPackage.ANSCHRIFT_TYPE__STAAT:
				return getStaat();
			case DomeaPackage.ANSCHRIFT_TYPE__STRASSE:
				return getStrasse();
			case DomeaPackage.ANSCHRIFT_TYPE__HAUSNUMMER:
				return getHausnummer();
			case DomeaPackage.ANSCHRIFT_TYPE__POSTFACH:
				return getPostfach();
			case DomeaPackage.ANSCHRIFT_TYPE__POSTLEITZAHL:
				return getPostleitzahl();
			case DomeaPackage.ANSCHRIFT_TYPE__ORT:
				return getOrt();
			case DomeaPackage.ANSCHRIFT_TYPE__ZUSATZ:
				return getZusatz();
			case DomeaPackage.ANSCHRIFT_TYPE__TYP:
				return getTyp();
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
			case DomeaPackage.ANSCHRIFT_TYPE__STAAT:
				setStaat((StaatType)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__STRASSE:
				setStrasse((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__HAUSNUMMER:
				setHausnummer((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__POSTFACH:
				setPostfach((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__POSTLEITZAHL:
				setPostleitzahl((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__ORT:
				setOrt((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__ZUSATZ:
				setZusatz((String)newValue);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__TYP:
				setTyp((AnschriftstypCodeType)newValue);
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
			case DomeaPackage.ANSCHRIFT_TYPE__STAAT:
				setStaat((StaatType)null);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__STRASSE:
				setStrasse(STRASSE_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__HAUSNUMMER:
				setHausnummer(HAUSNUMMER_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__POSTFACH:
				setPostfach(POSTFACH_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__POSTLEITZAHL:
				setPostleitzahl(POSTLEITZAHL_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__ORT:
				setOrt(ORT_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__ZUSATZ:
				setZusatz(ZUSATZ_EDEFAULT);
				return;
			case DomeaPackage.ANSCHRIFT_TYPE__TYP:
				setTyp((AnschriftstypCodeType)null);
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
			case DomeaPackage.ANSCHRIFT_TYPE__STAAT:
				return staat != null;
			case DomeaPackage.ANSCHRIFT_TYPE__STRASSE:
				return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
			case DomeaPackage.ANSCHRIFT_TYPE__HAUSNUMMER:
				return HAUSNUMMER_EDEFAULT == null ? hausnummer != null : !HAUSNUMMER_EDEFAULT.equals(hausnummer);
			case DomeaPackage.ANSCHRIFT_TYPE__POSTFACH:
				return POSTFACH_EDEFAULT == null ? postfach != null : !POSTFACH_EDEFAULT.equals(postfach);
			case DomeaPackage.ANSCHRIFT_TYPE__POSTLEITZAHL:
				return POSTLEITZAHL_EDEFAULT == null ? postleitzahl != null : !POSTLEITZAHL_EDEFAULT.equals(postleitzahl);
			case DomeaPackage.ANSCHRIFT_TYPE__ORT:
				return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
			case DomeaPackage.ANSCHRIFT_TYPE__ZUSATZ:
				return ZUSATZ_EDEFAULT == null ? zusatz != null : !ZUSATZ_EDEFAULT.equals(zusatz);
			case DomeaPackage.ANSCHRIFT_TYPE__TYP:
				return typ != null;
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
		result.append(" (strasse: ");
		result.append(strasse);
		result.append(", hausnummer: ");
		result.append(hausnummer);
		result.append(", postfach: ");
		result.append(postfach);
		result.append(", postleitzahl: ");
		result.append(postleitzahl);
		result.append(", ort: ");
		result.append(ort);
		result.append(", zusatz: ");
		result.append(zusatz);
		result.append(')');
		return result.toString();
	}

} //AnschriftTypeImpl
