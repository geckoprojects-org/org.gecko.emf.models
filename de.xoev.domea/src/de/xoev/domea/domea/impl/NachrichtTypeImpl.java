/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.NachrichtType;
import de.xoev.domea.domea.NachrichtenkopfType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getNachrichtenkopf <em>Nachrichtenkopf</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NachrichtTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtTypeImpl extends MinimalEObjectImpl.Container implements NachrichtType {
	/**
	 * The cached value of the '{@link #getNachrichtenkopf() <em>Nachrichtenkopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenkopf()
	 * @generated
	 * @ordered
	 */
	protected NachrichtenkopfType nachrichtenkopf;

	/**
	 * The default value of the '{@link #getProdukt() <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukt()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdukt() <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukt()
	 * @generated
	 * @ordered
	 */
	protected String produkt = PRODUKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTHERSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected String produkthersteller = PRODUKTHERSTELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTVERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected String produktversion = PRODUKTVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_EDEFAULT = "xdomea";

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected String standard = STANDARD_EDEFAULT;

	/**
	 * This is true if the Standard attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardESet;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "4.0.0";

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
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachrichtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NACHRICHT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfType getNachrichtenkopf() {
		return nachrichtenkopf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachrichtenkopf(NachrichtenkopfType newNachrichtenkopf, NotificationChain msgs) {
		NachrichtenkopfType oldNachrichtenkopf = nachrichtenkopf;
		nachrichtenkopf = newNachrichtenkopf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, oldNachrichtenkopf, newNachrichtenkopf);
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
	public void setNachrichtenkopf(NachrichtenkopfType newNachrichtenkopf) {
		if (newNachrichtenkopf != nachrichtenkopf) {
			NotificationChain msgs = null;
			if (nachrichtenkopf != null)
				msgs = ((InternalEObject)nachrichtenkopf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, null, msgs);
			if (newNachrichtenkopf != null)
				msgs = ((InternalEObject)newNachrichtenkopf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, null, msgs);
			msgs = basicSetNachrichtenkopf(newNachrichtenkopf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, newNachrichtenkopf, newNachrichtenkopf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdukt() {
		return produkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdukt(String newProdukt) {
		String oldProdukt = produkt;
		produkt = newProdukt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__PRODUKT, oldProdukt, produkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdukthersteller() {
		return produkthersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdukthersteller(String newProdukthersteller) {
		String oldProdukthersteller = produkthersteller;
		produkthersteller = newProdukthersteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER, oldProdukthersteller, produkthersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduktversion() {
		return produktversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduktversion(String newProduktversion) {
		String oldProduktversion = produktversion;
		produktversion = newProduktversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__PRODUKTVERSION, oldProduktversion, produktversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandard(String newStandard) {
		String oldStandard = standard;
		standard = newStandard;
		boolean oldStandardESet = standardESet;
		standardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__STANDARD, oldStandard, standard, !oldStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStandard() {
		String oldStandard = standard;
		boolean oldStandardESet = standardESet;
		standard = STANDARD_EDEFAULT;
		standardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.NACHRICHT_TYPE__STANDARD, oldStandard, STANDARD_EDEFAULT, oldStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStandard() {
		return standardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__TEST, oldTest, test));
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
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NACHRICHT_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.NACHRICHT_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return basicSetNachrichtenkopf(null, msgs);
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
			case DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return getNachrichtenkopf();
			case DomeaPackage.NACHRICHT_TYPE__PRODUKT:
				return getProdukt();
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				return getProdukthersteller();
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				return getProduktversion();
			case DomeaPackage.NACHRICHT_TYPE__STANDARD:
				return getStandard();
			case DomeaPackage.NACHRICHT_TYPE__TEST:
				return getTest();
			case DomeaPackage.NACHRICHT_TYPE__VERSION:
				return getVersion();
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
			case DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				setNachrichtenkopf((NachrichtenkopfType)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKT:
				setProdukt((String)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller((String)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				setProduktversion((String)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__STANDARD:
				setStandard((String)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__TEST:
				setTest((String)newValue);
				return;
			case DomeaPackage.NACHRICHT_TYPE__VERSION:
				setVersion((String)newValue);
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
			case DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				setNachrichtenkopf((NachrichtenkopfType)null);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKT:
				setProdukt(PRODUKT_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller(PRODUKTHERSTELLER_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				setProduktversion(PRODUKTVERSION_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHT_TYPE__STANDARD:
				unsetStandard();
				return;
			case DomeaPackage.NACHRICHT_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case DomeaPackage.NACHRICHT_TYPE__VERSION:
				unsetVersion();
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
			case DomeaPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return nachrichtenkopf != null;
			case DomeaPackage.NACHRICHT_TYPE__PRODUKT:
				return PRODUKT_EDEFAULT == null ? produkt != null : !PRODUKT_EDEFAULT.equals(produkt);
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				return PRODUKTHERSTELLER_EDEFAULT == null ? produkthersteller != null : !PRODUKTHERSTELLER_EDEFAULT.equals(produkthersteller);
			case DomeaPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				return PRODUKTVERSION_EDEFAULT == null ? produktversion != null : !PRODUKTVERSION_EDEFAULT.equals(produktversion);
			case DomeaPackage.NACHRICHT_TYPE__STANDARD:
				return isSetStandard();
			case DomeaPackage.NACHRICHT_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
			case DomeaPackage.NACHRICHT_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (produkt: ");
		result.append(produkt);
		result.append(", produkthersteller: ");
		result.append(produkthersteller);
		result.append(", produktversion: ");
		result.append(produktversion);
		result.append(", standard: ");
		if (standardESet) result.append(standard); else result.append("<unset>");
		result.append(", test: ");
		result.append(test);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NachrichtTypeImpl
