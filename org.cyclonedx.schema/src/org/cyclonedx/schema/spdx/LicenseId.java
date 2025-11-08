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
package org.cyclonedx.schema.spdx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>License Id</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.spdx.SpdxPackage#getLicenseId()
 * @model extendedMetaData="name='licenseId'"
 * @generated
 */
@ProviderType
public enum LicenseId implements Enumerator {
	/**
	 * The '<em><b>0BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Zero Clause License
	 * <!-- end-model-doc -->
	 * @see #_0BSD_VALUE
	 * @generated
	 * @ordered
	 */
	_0BSD(0, "_0BSD", "0BSD"),

	/**
	 * The '<em><b>3D Slicer10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3D Slicer License v1.0
	 * <!-- end-model-doc -->
	 * @see #_3D_SLICER10_VALUE
	 * @generated
	 * @ordered
	 */
	_3D_SLICER10(1, "_3DSlicer10", "3D-Slicer-1.0"),

	/**
	 * The '<em><b>AAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribution Assurance License
	 * <!-- end-model-doc -->
	 * @see #AAL_VALUE
	 * @generated
	 * @ordered
	 */
	AAL(2, "AAL", "AAL"),

	/**
	 * The '<em><b>Abstyles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstyles License
	 * <!-- end-model-doc -->
	 * @see #ABSTYLES_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTYLES(3, "Abstyles", "Abstyles"),

	/**
	 * The '<em><b>Ada Core Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdaCore Doc License
	 * <!-- end-model-doc -->
	 * @see #ADA_CORE_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	ADA_CORE_DOC(4, "AdaCoreDoc", "AdaCore-doc"),

	/**
	 * The '<em><b>Adobe2006</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Systems Incorporated Source Code License Agreement
	 * <!-- end-model-doc -->
	 * @see #ADOBE2006_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE2006(5, "Adobe2006", "Adobe-2006"),

	/**
	 * The '<em><b>Adobe Display Post Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Display PostScript License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_DISPLAY_POST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE_DISPLAY_POST_SCRIPT(6, "AdobeDisplayPostScript", "Adobe-Display-PostScript"),

	/**
	 * The '<em><b>Adobe Glyph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Glyph List License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_GLYPH_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE_GLYPH(7, "AdobeGlyph", "Adobe-Glyph"),

	/**
	 * The '<em><b>Adobe Utopia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Utopia Font License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_UTOPIA_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE_UTOPIA(8, "AdobeUtopia", "Adobe-Utopia"),

	/**
	 * The '<em><b>ADSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amazon Digital Services License
	 * <!-- end-model-doc -->
	 * @see #ADSL_VALUE
	 * @generated
	 * @ordered
	 */
	ADSL(9, "ADSL", "ADSL"),

	/**
	 * The '<em><b>AFL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.1
	 * <!-- end-model-doc -->
	 * @see #AFL11_VALUE
	 * @generated
	 * @ordered
	 */
	AFL11(10, "AFL11", "AFL-1.1"),

	/**
	 * The '<em><b>AFL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.2
	 * <!-- end-model-doc -->
	 * @see #AFL12_VALUE
	 * @generated
	 * @ordered
	 */
	AFL12(11, "AFL12", "AFL-1.2"),

	/**
	 * The '<em><b>AFL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.0
	 * <!-- end-model-doc -->
	 * @see #AFL20_VALUE
	 * @generated
	 * @ordered
	 */
	AFL20(12, "AFL20", "AFL-2.0"),

	/**
	 * The '<em><b>AFL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.1
	 * <!-- end-model-doc -->
	 * @see #AFL21_VALUE
	 * @generated
	 * @ordered
	 */
	AFL21(13, "AFL21", "AFL-2.1"),

	/**
	 * The '<em><b>AFL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v3.0
	 * <!-- end-model-doc -->
	 * @see #AFL30_VALUE
	 * @generated
	 * @ordered
	 */
	AFL30(14, "AFL30", "AFL-3.0"),

	/**
	 * The '<em><b>Afmparse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afmparse License
	 * <!-- end-model-doc -->
	 * @see #AFMPARSE_VALUE
	 * @generated
	 * @ordered
	 */
	AFMPARSE(15, "Afmparse", "Afmparse"),

	/**
	 * The '<em><b>AGPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #AGPL10_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL10(16, "AGPL10", "AGPL-1.0"),

	/**
	 * The '<em><b>AGPL10 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL10_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL10_ONLY(17, "AGPL10Only", "AGPL-1.0-only"),

	/**
	 * The '<em><b>AGPL10 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL10_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL10_OR_LATER(18, "AGPL10OrLater", "AGPL-1.0-or-later"),

	/**
	 * The '<em><b>AGPL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0
	 * <!-- end-model-doc -->
	 * @see #AGPL30_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL30(19, "AGPL30", "AGPL-3.0"),

	/**
	 * The '<em><b>AGPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL30_ONLY(20, "AGPL30Only", "AGPL-3.0-only"),

	/**
	 * The '<em><b>AGPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL30_OR_LATER(21, "AGPL30OrLater", "AGPL-3.0-or-later"),

	/**
	 * The '<em><b>Aladdin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aladdin Free Public License
	 * <!-- end-model-doc -->
	 * @see #ALADDIN_VALUE
	 * @generated
	 * @ordered
	 */
	ALADDIN(22, "Aladdin", "Aladdin"),

	/**
	 * The '<em><b>AMD Newlib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD newlib License
	 * <!-- end-model-doc -->
	 * @see #AMD_NEWLIB_VALUE
	 * @generated
	 * @ordered
	 */
	AMD_NEWLIB(23, "AMDNewlib", "AMD-newlib"),

	/**
	 * The '<em><b>AMDPLPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD's plpa_map.c License
	 * <!-- end-model-doc -->
	 * @see #AMDPLPA_VALUE
	 * @generated
	 * @ordered
	 */
	AMDPLPA(24, "AMDPLPA", "AMDPLPA"),

	/**
	 * The '<em><b>AML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple MIT License
	 * <!-- end-model-doc -->
	 * @see #AML_VALUE
	 * @generated
	 * @ordered
	 */
	AML(25, "AML", "AML"),

	/**
	 * The '<em><b>AML Glslang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AML glslang variant License
	 * <!-- end-model-doc -->
	 * @see #AML_GLSLANG_VALUE
	 * @generated
	 * @ordered
	 */
	AML_GLSLANG(26, "AMLGlslang", "AML-glslang"),

	/**
	 * The '<em><b>AMPAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academy of Motion Picture Arts and Sciences BSD
	 * <!-- end-model-doc -->
	 * @see #AMPAS_VALUE
	 * @generated
	 * @ordered
	 */
	AMPAS(27, "AMPAS", "AMPAS"),

	/**
	 * The '<em><b>ANTLRPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD_VALUE
	 * @generated
	 * @ordered
	 */
	ANTLRPD(28, "ANTLRPD", "ANTLR-PD"),

	/**
	 * The '<em><b>ANTLRPD Fallback</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice with license fallback
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD_FALLBACK_VALUE
	 * @generated
	 * @ordered
	 */
	ANTLRPD_FALLBACK(29, "ANTLRPDFallback", "ANTLR-PD-fallback"),

	/**
	 * The '<em><b>Any OSI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any OSI License
	 * <!-- end-model-doc -->
	 * @see #ANY_OSI_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OSI(30, "anyOSI", "any-OSI"),

	/**
	 * The '<em><b>Any OSI Perl Modules</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any OSI License - Perl Modules
	 * <!-- end-model-doc -->
	 * @see #ANY_OSI_PERL_MODULES_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OSI_PERL_MODULES(31, "anyOSIPerlModules", "any-OSI-perl-modules"),

	/**
	 * The '<em><b>Apache10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.0
	 * <!-- end-model-doc -->
	 * @see #APACHE10_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE10(32, "Apache10", "Apache-1.0"),

	/**
	 * The '<em><b>Apache11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.1
	 * <!-- end-model-doc -->
	 * @see #APACHE11_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE11(33, "Apache11", "Apache-1.1"),

	/**
	 * The '<em><b>Apache20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 2.0
	 * <!-- end-model-doc -->
	 * @see #APACHE20_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE20(34, "Apache20", "Apache-2.0"),

	/**
	 * The '<em><b>APAFML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Postscript AFM License
	 * <!-- end-model-doc -->
	 * @see #APAFML_VALUE
	 * @generated
	 * @ordered
	 */
	APAFML(35, "APAFML", "APAFML"),

	/**
	 * The '<em><b>APL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adaptive Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #APL10_VALUE
	 * @generated
	 * @ordered
	 */
	APL10(36, "APL10", "APL-1.0"),

	/**
	 * The '<em><b>App S2p</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App::s2p License
	 * <!-- end-model-doc -->
	 * @see #APP_S2P_VALUE
	 * @generated
	 * @ordered
	 */
	APP_S2P(37, "AppS2p", "App-s2p"),

	/**
	 * The '<em><b>APSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.0
	 * <!-- end-model-doc -->
	 * @see #APSL10_VALUE
	 * @generated
	 * @ordered
	 */
	APSL10(38, "APSL10", "APSL-1.0"),

	/**
	 * The '<em><b>APSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #APSL11_VALUE
	 * @generated
	 * @ordered
	 */
	APSL11(39, "APSL11", "APSL-1.1"),

	/**
	 * The '<em><b>APSL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.2
	 * <!-- end-model-doc -->
	 * @see #APSL12_VALUE
	 * @generated
	 * @ordered
	 */
	APSL12(40, "APSL12", "APSL-1.2"),

	/**
	 * The '<em><b>APSL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 2.0
	 * <!-- end-model-doc -->
	 * @see #APSL20_VALUE
	 * @generated
	 * @ordered
	 */
	APSL20(41, "APSL20", "APSL-2.0"),

	/**
	 * The '<em><b>Arphic1999</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arphic Public License
	 * <!-- end-model-doc -->
	 * @see #ARPHIC1999_VALUE
	 * @generated
	 * @ordered
	 */
	ARPHIC1999(42, "Arphic1999", "Arphic-1999"),

	/**
	 * The '<em><b>Artistic10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10(43, "Artistic10", "Artistic-1.0"),

	/**
	 * The '<em><b>Artistic10 Cl8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 w/clause 8
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_CL8_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10_CL8(44, "Artistic10Cl8", "Artistic-1.0-cl8"),

	/**
	 * The '<em><b>Artistic10 Perl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (Perl)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_PERL_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10_PERL(45, "Artistic10Perl", "Artistic-1.0-Perl"),

	/**
	 * The '<em><b>Artistic20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC20_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC20(46, "Artistic20", "Artistic-2.0"),

	/**
	 * The '<em><b>Artistic Dist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (dist)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC_DIST_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC_DIST(47, "ArtisticDist", "Artistic-dist"),

	/**
	 * The '<em><b>Aspell RU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aspell Russian License
	 * <!-- end-model-doc -->
	 * @see #ASPELL_RU_VALUE
	 * @generated
	 * @ordered
	 */
	ASPELL_RU(48, "AspellRU", "Aspell-RU"),

	/**
	 * The '<em><b>ASWF Digital Assets10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASWF Digital Assets License version 1.0
	 * <!-- end-model-doc -->
	 * @see #ASWF_DIGITAL_ASSETS10_VALUE
	 * @generated
	 * @ordered
	 */
	ASWF_DIGITAL_ASSETS10(49, "ASWFDigitalAssets10", "ASWF-Digital-Assets-1.0"),

	/**
	 * The '<em><b>ASWF Digital Assets11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASWF Digital Assets License 1.1
	 * <!-- end-model-doc -->
	 * @see #ASWF_DIGITAL_ASSETS11_VALUE
	 * @generated
	 * @ordered
	 */
	ASWF_DIGITAL_ASSETS11(50, "ASWFDigitalAssets11", "ASWF-Digital-Assets-1.1"),

	/**
	 * The '<em><b>Baekmuk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Baekmuk License
	 * <!-- end-model-doc -->
	 * @see #BAEKMUK_VALUE
	 * @generated
	 * @ordered
	 */
	BAEKMUK(51, "Baekmuk", "Baekmuk"),

	/**
	 * The '<em><b>Bahyph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahyph License
	 * <!-- end-model-doc -->
	 * @see #BAHYPH_VALUE
	 * @generated
	 * @ordered
	 */
	BAHYPH(52, "Bahyph", "Bahyph"),

	/**
	 * The '<em><b>Barr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barr License
	 * <!-- end-model-doc -->
	 * @see #BARR_VALUE
	 * @generated
	 * @ordered
	 */
	BARR(53, "Barr", "Barr"),

	/**
	 * The '<em><b>Bcrypt Solar Designer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bcrypt Solar Designer License
	 * <!-- end-model-doc -->
	 * @see #BCRYPT_SOLAR_DESIGNER_VALUE
	 * @generated
	 * @ordered
	 */
	BCRYPT_SOLAR_DESIGNER(54, "bcryptSolarDesigner", "bcrypt-Solar-Designer"),

	/**
	 * The '<em><b>Beerware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beerware License
	 * <!-- end-model-doc -->
	 * @see #BEERWARE_VALUE
	 * @generated
	 * @ordered
	 */
	BEERWARE(55, "Beerware", "Beerware"),

	/**
	 * The '<em><b>Bitstream Charter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitstream Charter Font License
	 * <!-- end-model-doc -->
	 * @see #BITSTREAM_CHARTER_VALUE
	 * @generated
	 * @ordered
	 */
	BITSTREAM_CHARTER(56, "BitstreamCharter", "Bitstream-Charter"),

	/**
	 * The '<em><b>Bitstream Vera</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitstream Vera Font License
	 * <!-- end-model-doc -->
	 * @see #BITSTREAM_VERA_VALUE
	 * @generated
	 * @ordered
	 */
	BITSTREAM_VERA(57, "BitstreamVera", "Bitstream-Vera"),

	/**
	 * The '<em><b>Bit Torrent10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT10_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_TORRENT10(58, "BitTorrent10", "BitTorrent-1.0"),

	/**
	 * The '<em><b>Bit Torrent11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT11_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_TORRENT11(59, "BitTorrent11", "BitTorrent-1.1"),

	/**
	 * The '<em><b>Blessing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SQLite Blessing
	 * <!-- end-model-doc -->
	 * @see #BLESSING_VALUE
	 * @generated
	 * @ordered
	 */
	BLESSING(60, "blessing", "blessing"),

	/**
	 * The '<em><b>Blue Oak100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blue Oak Model License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #BLUE_OAK100_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE_OAK100(61, "BlueOak100", "BlueOak-1.0.0"),

	/**
	 * The '<em><b>Boehm GC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boehm-Demers-Weiser GC License
	 * <!-- end-model-doc -->
	 * @see #BOEHM_GC_VALUE
	 * @generated
	 * @ordered
	 */
	BOEHM_GC(62, "BoehmGC", "Boehm-GC"),

	/**
	 * The '<em><b>Boehm GC Without Fee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boehm-Demers-Weiser GC License (without fee)
	 * <!-- end-model-doc -->
	 * @see #BOEHM_GC_WITHOUT_FEE_VALUE
	 * @generated
	 * @ordered
	 */
	BOEHM_GC_WITHOUT_FEE(63, "BoehmGCWithoutFee", "Boehm-GC-without-fee"),

	/**
	 * The '<em><b>Borceux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Borceux license
	 * <!-- end-model-doc -->
	 * @see #BORCEUX_VALUE
	 * @generated
	 * @ordered
	 */
	BORCEUX(64, "Borceux", "Borceux"),

	/**
	 * The '<em><b>Brian Gladman2 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brian Gladman 2-Clause License
	 * <!-- end-model-doc -->
	 * @see #BRIAN_GLADMAN2_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BRIAN_GLADMAN2_CLAUSE(65, "BrianGladman2Clause", "Brian-Gladman-2-Clause"),

	/**
	 * The '<em><b>Brian Gladman3 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brian Gladman 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #BRIAN_GLADMAN3_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BRIAN_GLADMAN3_CLAUSE(66, "BrianGladman3Clause", "Brian-Gladman-3-Clause"),

	/**
	 * The '<em><b>BSD1 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 1-Clause License
	 * <!-- end-model-doc -->
	 * @see #BSD1_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD1_CLAUSE(67, "BSD1Clause", "BSD-1-Clause"),

	/**
	 * The '<em><b>BSD2 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause "Simplified" License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE(68, "BSD2Clause", "BSD-2-Clause"),

	/**
	 * The '<em><b>BSD2 Clause Darwin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause - Ian Darwin variant
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_DARWIN_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_DARWIN(69, "BSD2ClauseDarwin", "BSD-2-Clause-Darwin"),

	/**
	 * The '<em><b>BSD2 Clause First Lines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause - first lines requirement
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FIRST_LINES_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_FIRST_LINES(70, "BSD2ClauseFirstLines", "BSD-2-Clause-first-lines"),

	/**
	 * The '<em><b>BSD2 Clause Free BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause FreeBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FREE_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_FREE_BSD(71, "BSD2ClauseFreeBSD", "BSD-2-Clause-FreeBSD"),

	/**
	 * The '<em><b>BSD2 Clause Net BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause NetBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_NET_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_NET_BSD(72, "BSD2ClauseNetBSD", "BSD-2-Clause-NetBSD"),

	/**
	 * The '<em><b>BSD2 Clause Patent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-2-Clause Plus Patent License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PATENT_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_PATENT(73, "BSD2ClausePatent", "BSD-2-Clause-Patent"),

	/**
	 * The '<em><b>BSD2 Clause Pkgconf Disclaimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause pkgconf disclaimer variant
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PKGCONF_DISCLAIMER_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_PKGCONF_DISCLAIMER(74, "BSD2ClausePkgconfDisclaimer", "BSD-2-Clause-pkgconf-disclaimer"),

	/**
	 * The '<em><b>BSD2 Clause Views</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause with views sentence
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_VIEWS_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_VIEWS(75, "BSD2ClauseViews", "BSD-2-Clause-Views"),

	/**
	 * The '<em><b>BSD3 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause "New" or "Revised" License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE(76, "BSD3Clause", "BSD-3-Clause"),

	/**
	 * The '<em><b>BSD3 Clause Acpica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause acpica variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ACPICA_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_ACPICA(77, "BSD3ClauseAcpica", "BSD-3-Clause-acpica"),

	/**
	 * The '<em><b>BSD3 Clause Attribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with attribution
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ATTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_ATTRIBUTION(78, "BSD3ClauseAttribution", "BSD-3-Clause-Attribution"),

	/**
	 * The '<em><b>BSD3 Clause Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Clear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_CLEAR(79, "BSD3ClauseClear", "BSD-3-Clause-Clear"),

	/**
	 * The '<em><b>BSD3 Clause Flex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Flex variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_FLEX_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_FLEX(80, "BSD3ClauseFlex", "BSD-3-Clause-flex"),

	/**
	 * The '<em><b>BSD3 Clause HP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_HP_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_HP(81, "BSD3ClauseHP", "BSD-3-Clause-HP"),

	/**
	 * The '<em><b>BSD3 Clause LBNL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawrence Berkeley National Labs BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_LBNL_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_LBNL(82, "BSD3ClauseLBNL", "BSD-3-Clause-LBNL"),

	/**
	 * The '<em><b>BSD3 Clause Modification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Modification
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_MODIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_MODIFICATION(83, "BSD3ClauseModification", "BSD-3-Clause-Modification"),

	/**
	 * The '<em><b>BSD3 Clause No Military License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Military License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_MILITARY_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_MILITARY_LICENSE(84, "BSD3ClauseNoMilitaryLicense", "BSD-3-Clause-No-Military-License"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_LICENSE(85, "BSD3ClauseNoNuclearLicense", "BSD-3-Clause-No-Nuclear-License"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License2014</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License 2014
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014(86, "BSD3ClauseNoNuclearLicense2014", "BSD-3-Clause-No-Nuclear-License-2014"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear Warranty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear Warranty
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_WARRANTY(87, "BSD3ClauseNoNuclearWarranty", "BSD-3-Clause-No-Nuclear-Warranty"),

	/**
	 * The '<em><b>BSD3 Clause Open MPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Open MPI variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_OPEN_MPI_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_OPEN_MPI(88, "BSD3ClauseOpenMPI", "BSD-3-Clause-Open-MPI"),

	/**
	 * The '<em><b>BSD3 Clause Sun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Sun Microsystems
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_SUN_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_SUN(89, "BSD3ClauseSun", "BSD-3-Clause-Sun"),

	/**
	 * The '<em><b>BSD4 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4-Clause "Original" or "Old" License
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD4_CLAUSE(90, "BSD4Clause", "BSD-4-Clause"),

	/**
	 * The '<em><b>BSD4 Clause Shortened</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4 Clause Shortened
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_SHORTENED_VALUE
	 * @generated
	 * @ordered
	 */
	BSD4_CLAUSE_SHORTENED(91, "BSD4ClauseShortened", "BSD-4-Clause-Shortened"),

	/**
	 * The '<em><b>BSD4 Clause UC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-4-Clause (University of California-Specific)
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_UC_VALUE
	 * @generated
	 * @ordered
	 */
	BSD4_CLAUSE_UC(92, "BSD4ClauseUC", "BSD-4-Clause-UC"),

	/**
	 * The '<em><b>BSD43RENO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4.3 RENO License
	 * <!-- end-model-doc -->
	 * @see #BSD43RENO_VALUE
	 * @generated
	 * @ordered
	 */
	BSD43RENO(93, "BSD43RENO", "BSD-4.3RENO"),

	/**
	 * The '<em><b>BSD43TAHOE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4.3 TAHOE License
	 * <!-- end-model-doc -->
	 * @see #BSD43TAHOE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD43TAHOE(94, "BSD43TAHOE", "BSD-4.3TAHOE"),

	/**
	 * The '<em><b>BSD Advertising Acknowledgement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Advertising Acknowledgement License
	 * <!-- end-model-doc -->
	 * @see #BSD_ADVERTISING_ACKNOWLEDGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_ADVERTISING_ACKNOWLEDGEMENT(95, "BSDAdvertisingAcknowledgement", "BSD-Advertising-Acknowledgement"),

	/**
	 * The '<em><b>BSD Attribution HPND Disclaimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with Attribution and HPND disclaimer
	 * <!-- end-model-doc -->
	 * @see #BSD_ATTRIBUTION_HPND_DISCLAIMER_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_ATTRIBUTION_HPND_DISCLAIMER(96, "BSDAttributionHPNDDisclaimer", "BSD-Attribution-HPND-disclaimer"),

	/**
	 * The '<em><b>BSD Inferno Nettverk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-Inferno-Nettverk
	 * <!-- end-model-doc -->
	 * @see #BSD_INFERNO_NETTVERK_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_INFERNO_NETTVERK(97, "BSDInfernoNettverk", "BSD-Inferno-Nettverk"),

	/**
	 * The '<em><b>BSD Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Protection License
	 * <!-- end-model-doc -->
	 * @see #BSD_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_PROTECTION(98, "BSDProtection", "BSD-Protection"),

	/**
	 * The '<em><b>BSD Source Beginning File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution - beginning of file variant
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_BEGINNING_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_SOURCE_BEGINNING_FILE(99, "BSDSourceBeginningFile", "BSD-Source-beginning-file"),

	/**
	 * The '<em><b>BSD Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_SOURCE_CODE(100, "BSDSourceCode", "BSD-Source-Code"),

	/**
	 * The '<em><b>BSD Systemics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Systemics BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD_SYSTEMICS_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_SYSTEMICS(101, "BSDSystemics", "BSD-Systemics"),

	/**
	 * The '<em><b>BSD Systemics W3 Works</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Systemics W3Works BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD_SYSTEMICS_W3_WORKS_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_SYSTEMICS_W3_WORKS(102, "BSDSystemicsW3Works", "BSD-Systemics-W3Works"),

	/**
	 * The '<em><b>BSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boost Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #BSL10_VALUE
	 * @generated
	 * @ordered
	 */
	BSL10(103, "BSL10", "BSL-1.0"),

	/**
	 * The '<em><b>BUSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #BUSL11_VALUE
	 * @generated
	 * @ordered
	 */
	BUSL11(104, "BUSL11", "BUSL-1.1"),

	/**
	 * The '<em><b>Bzip2105</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.5
	 * <!-- end-model-doc -->
	 * @see #BZIP2105_VALUE
	 * @generated
	 * @ordered
	 */
	BZIP2105(105, "bzip2105", "bzip2-1.0.5"),

	/**
	 * The '<em><b>Bzip2106</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.6
	 * <!-- end-model-doc -->
	 * @see #BZIP2106_VALUE
	 * @generated
	 * @ordered
	 */
	BZIP2106(106, "bzip2106", "bzip2-1.0.6"),

	/**
	 * The '<em><b>CUDA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computational Use of Data Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CUDA10_VALUE
	 * @generated
	 * @ordered
	 */
	CUDA10(107, "CUDA10", "C-UDA-1.0"),

	/**
	 * The '<em><b>CAL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptographic Autonomy License 1.0
	 * <!-- end-model-doc -->
	 * @see #CAL10_VALUE
	 * @generated
	 * @ordered
	 */
	CAL10(108, "CAL10", "CAL-1.0"),

	/**
	 * The '<em><b>CAL10 Combined Work Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptographic Autonomy License 1.0 (Combined Work Exception)
	 * <!-- end-model-doc -->
	 * @see #CAL10_COMBINED_WORK_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CAL10_COMBINED_WORK_EXCEPTION(109, "CAL10CombinedWorkException", "CAL-1.0-Combined-Work-Exception"),

	/**
	 * The '<em><b>Caldera</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License
	 * <!-- end-model-doc -->
	 * @see #CALDERA_VALUE
	 * @generated
	 * @ordered
	 */
	CALDERA(110, "Caldera", "Caldera"),

	/**
	 * The '<em><b>Caldera No Preamble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License (without preamble)
	 * <!-- end-model-doc -->
	 * @see #CALDERA_NO_PREAMBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CALDERA_NO_PREAMBLE(111, "CalderaNoPreamble", "Caldera-no-preamble"),

	/**
	 * The '<em><b>Catharon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Catharon License
	 * <!-- end-model-doc -->
	 * @see #CATHARON_VALUE
	 * @generated
	 * @ordered
	 */
	CATHARON(112, "Catharon", "Catharon"),

	/**
	 * The '<em><b>CATOSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computer Associates Trusted Open Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #CATOSL11_VALUE
	 * @generated
	 * @ordered
	 */
	CATOSL11(113, "CATOSL11", "CATOSL-1.1"),

	/**
	 * The '<em><b>CCBY10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY10(114, "CCBY10", "CC-BY-1.0"),

	/**
	 * The '<em><b>CCBY20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY20(115, "CCBY20", "CC-BY-2.0"),

	/**
	 * The '<em><b>CCBY25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY25(116, "CCBY25", "CC-BY-2.5"),

	/**
	 * The '<em><b>CCBY25AU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Australia
	 * <!-- end-model-doc -->
	 * @see #CCBY25AU_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY25AU(117, "CCBY25AU", "CC-BY-2.5-AU"),

	/**
	 * The '<em><b>CCBY30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBY30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30(118, "CCBY30", "CC-BY-3.0"),

	/**
	 * The '<em><b>CCBY30AT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Austria
	 * <!-- end-model-doc -->
	 * @see #CCBY30AT_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30AT(119, "CCBY30AT", "CC-BY-3.0-AT"),

	/**
	 * The '<em><b>CCBY30AU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Australia
	 * <!-- end-model-doc -->
	 * @see #CCBY30AU_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30AU(120, "CCBY30AU", "CC-BY-3.0-AU"),

	/**
	 * The '<em><b>CCBY30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBY30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30DE(121, "CCBY30DE", "CC-BY-3.0-DE"),

	/**
	 * The '<em><b>CCBY30IGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBY30IGO_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30IGO(122, "CCBY30IGO", "CC-BY-3.0-IGO"),

	/**
	 * The '<em><b>CCBY30NL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Netherlands
	 * <!-- end-model-doc -->
	 * @see #CCBY30NL_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30NL(123, "CCBY30NL", "CC-BY-3.0-NL"),

	/**
	 * The '<em><b>CCBY30US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 United States
	 * <!-- end-model-doc -->
	 * @see #CCBY30US_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30US(124, "CCBY30US", "CC-BY-3.0-US"),

	/**
	 * The '<em><b>CCBY40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBY40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY40(125, "CCBY40", "CC-BY-4.0"),

	/**
	 * The '<em><b>CCBYNC10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC10(126, "CCBYNC10", "CC-BY-NC-1.0"),

	/**
	 * The '<em><b>CCBYNC20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC20(127, "CCBYNC20", "CC-BY-NC-2.0"),

	/**
	 * The '<em><b>CCBYNC25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC25(128, "CCBYNC25", "CC-BY-NC-2.5"),

	/**
	 * The '<em><b>CCBYNC30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC30(129, "CCBYNC30", "CC-BY-NC-3.0"),

	/**
	 * The '<em><b>CCBYNC30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC30DE(130, "CCBYNC30DE", "CC-BY-NC-3.0-DE"),

	/**
	 * The '<em><b>CCBYNC40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNC40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC40(131, "CCBYNC40", "CC-BY-NC-4.0"),

	/**
	 * The '<em><b>CCBYNCND10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND10(132, "CCBYNCND10", "CC-BY-NC-ND-1.0"),

	/**
	 * The '<em><b>CCBYNCND20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND20(133, "CCBYNCND20", "CC-BY-NC-ND-2.0"),

	/**
	 * The '<em><b>CCBYNCND25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND25(134, "CCBYNCND25", "CC-BY-NC-ND-2.5"),

	/**
	 * The '<em><b>CCBYNCND30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND30(135, "CCBYNCND30", "CC-BY-NC-ND-3.0"),

	/**
	 * The '<em><b>CCBYNCND30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND30DE(136, "CCBYNCND30DE", "CC-BY-NC-ND-3.0-DE"),

	/**
	 * The '<em><b>CCBYNCND30IGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30IGO_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND30IGO(137, "CCBYNCND30IGO", "CC-BY-NC-ND-3.0-IGO"),

	/**
	 * The '<em><b>CCBYNCND40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND40(138, "CCBYNCND40", "CC-BY-NC-ND-4.0"),

	/**
	 * The '<em><b>CCBYNCSA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA10(139, "CCBYNCSA10", "CC-BY-NC-SA-1.0"),

	/**
	 * The '<em><b>CCBYNCSA20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA20(140, "CCBYNCSA20", "CC-BY-NC-SA-2.0"),

	/**
	 * The '<em><b>CCBYNCSA20DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA20DE(141, "CCBYNCSA20DE", "CC-BY-NC-SA-2.0-DE"),

	/**
	 * The '<em><b>CCBYNCSA20FR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution-NonCommercial-ShareAlike 2.0 France
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20FR_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA20FR(142, "CCBYNCSA20FR", "CC-BY-NC-SA-2.0-FR"),

	/**
	 * The '<em><b>CCBYNCSA20UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 England and Wales
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20UK_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA20UK(143, "CCBYNCSA20UK", "CC-BY-NC-SA-2.0-UK"),

	/**
	 * The '<em><b>CCBYNCSA25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA25(144, "CCBYNCSA25", "CC-BY-NC-SA-2.5"),

	/**
	 * The '<em><b>CCBYNCSA30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA30(145, "CCBYNCSA30", "CC-BY-NC-SA-3.0"),

	/**
	 * The '<em><b>CCBYNCSA30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA30DE(146, "CCBYNCSA30DE", "CC-BY-NC-SA-3.0-DE"),

	/**
	 * The '<em><b>CCBYNCSA30IGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30IGO_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA30IGO(147, "CCBYNCSA30IGO", "CC-BY-NC-SA-3.0-IGO"),

	/**
	 * The '<em><b>CCBYNCSA40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA40(148, "CCBYNCSA40", "CC-BY-NC-SA-4.0"),

	/**
	 * The '<em><b>CCBYND10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND10(149, "CCBYND10", "CC-BY-ND-1.0"),

	/**
	 * The '<em><b>CCBYND20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND20(150, "CCBYND20", "CC-BY-ND-2.0"),

	/**
	 * The '<em><b>CCBYND25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND25(151, "CCBYND25", "CC-BY-ND-2.5"),

	/**
	 * The '<em><b>CCBYND30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYND30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND30(152, "CCBYND30", "CC-BY-ND-3.0"),

	/**
	 * The '<em><b>CCBYND30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYND30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND30DE(153, "CCBYND30DE", "CC-BY-ND-3.0-DE"),

	/**
	 * The '<em><b>CCBYND40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYND40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND40(154, "CCBYND40", "CC-BY-ND-4.0"),

	/**
	 * The '<em><b>CCBYSA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA10(155, "CCBYSA10", "CC-BY-SA-1.0"),

	/**
	 * The '<em><b>CCBYSA20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA20(156, "CCBYSA20", "CC-BY-SA-2.0"),

	/**
	 * The '<em><b>CCBYSA20UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 England and Wales
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20UK_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA20UK(157, "CCBYSA20UK", "CC-BY-SA-2.0-UK"),

	/**
	 * The '<em><b>CCBYSA21JP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.1 Japan
	 * <!-- end-model-doc -->
	 * @see #CCBYSA21JP_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA21JP(158, "CCBYSA21JP", "CC-BY-SA-2.1-JP"),

	/**
	 * The '<em><b>CCBYSA25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA25(159, "CCBYSA25", "CC-BY-SA-2.5"),

	/**
	 * The '<em><b>CCBYSA30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA30(160, "CCBYSA30", "CC-BY-SA-3.0"),

	/**
	 * The '<em><b>CCBYSA30AT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Austria
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30AT_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA30AT(161, "CCBYSA30AT", "CC-BY-SA-3.0-AT"),

	/**
	 * The '<em><b>CCBYSA30DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30DE_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA30DE(162, "CCBYSA30DE", "CC-BY-SA-3.0-DE"),

	/**
	 * The '<em><b>CCBYSA30IGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution-ShareAlike 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30IGO_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA30IGO(163, "CCBYSA30IGO", "CC-BY-SA-3.0-IGO"),

	/**
	 * The '<em><b>CCBYSA40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYSA40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA40(164, "CCBYSA40", "CC-BY-SA-4.0"),

	/**
	 * The '<em><b>CCPDDC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Public Domain Dedication and Certification
	 * <!-- end-model-doc -->
	 * @see #CCPDDC_VALUE
	 * @generated
	 * @ordered
	 */
	CCPDDC(165, "CCPDDC", "CC-PDDC"),

	/**
	 * The '<em><b>CCPDM10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative    Commons Public Domain Mark 1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CCPDM10_VALUE
	 * @generated
	 * @ordered
	 */
	CCPDM10(166, "CCPDM10", "CC-PDM-1.0"),

	/**
	 * The '<em><b>CCSA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCSA10_VALUE
	 * @generated
	 * @ordered
	 */
	CCSA10(167, "CCSA10", "CC-SA-1.0"),

	/**
	 * The '<em><b>CC010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Zero v1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CC010_VALUE
	 * @generated
	 * @ordered
	 */
	CC010(168, "CC010", "CC0-1.0"),

	/**
	 * The '<em><b>CDDL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDDL10_VALUE
	 * @generated
	 * @ordered
	 */
	CDDL10(169, "CDDL10", "CDDL-1.0"),

	/**
	 * The '<em><b>CDDL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.1
	 * <!-- end-model-doc -->
	 * @see #CDDL11_VALUE
	 * @generated
	 * @ordered
	 */
	CDDL11(170, "CDDL11", "CDDL-1.1"),

	/**
	 * The '<em><b>CDL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Documentation License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDL10_VALUE
	 * @generated
	 * @ordered
	 */
	CDL10(171, "CDL10", "CDL-1.0"),

	/**
	 * The '<em><b>CDLA Permissive10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE10_VALUE
	 * @generated
	 * @ordered
	 */
	CDLA_PERMISSIVE10(172, "CDLAPermissive10", "CDLA-Permissive-1.0"),

	/**
	 * The '<em><b>CDLA Permissive20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 2.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE20_VALUE
	 * @generated
	 * @ordered
	 */
	CDLA_PERMISSIVE20(173, "CDLAPermissive20", "CDLA-Permissive-2.0"),

	/**
	 * The '<em><b>CDLA Sharing10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Sharing 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_SHARING10_VALUE
	 * @generated
	 * @ordered
	 */
	CDLA_SHARING10(174, "CDLASharing10", "CDLA-Sharing-1.0"),

	/**
	 * The '<em><b>CECILL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CECILL10_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL10(175, "CECILL10", "CECILL-1.0"),

	/**
	 * The '<em><b>CECILL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.1
	 * <!-- end-model-doc -->
	 * @see #CECILL11_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL11(176, "CECILL11", "CECILL-1.1"),

	/**
	 * The '<em><b>CECILL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.0
	 * <!-- end-model-doc -->
	 * @see #CECILL20_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL20(177, "CECILL20", "CECILL-2.0"),

	/**
	 * The '<em><b>CECILL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.1
	 * <!-- end-model-doc -->
	 * @see #CECILL21_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL21(178, "CECILL21", "CECILL-2.1"),

	/**
	 * The '<em><b>CECILLB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-B Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLB_VALUE
	 * @generated
	 * @ordered
	 */
	CECILLB(179, "CECILLB", "CECILL-B"),

	/**
	 * The '<em><b>CECILLC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-C Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLC_VALUE
	 * @generated
	 * @ordered
	 */
	CECILLC(180, "CECILLC", "CECILL-C"),

	/**
	 * The '<em><b>CERNOHL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence v1.1
	 * <!-- end-model-doc -->
	 * @see #CERNOHL11_VALUE
	 * @generated
	 * @ordered
	 */
	CERNOHL11(181, "CERNOHL11", "CERN-OHL-1.1"),

	/**
	 * The '<em><b>CERNOHL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence v1.2
	 * <!-- end-model-doc -->
	 * @see #CERNOHL12_VALUE
	 * @generated
	 * @ordered
	 */
	CERNOHL12(182, "CERNOHL12", "CERN-OHL-1.2"),

	/**
	 * The '<em><b>CERNOHLP20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Permissive
	 * <!-- end-model-doc -->
	 * @see #CERNOHLP20_VALUE
	 * @generated
	 * @ordered
	 */
	CERNOHLP20(183, "CERNOHLP20", "CERN-OHL-P-2.0"),

	/**
	 * The '<em><b>CERNOHLS20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Strongly Reciprocal
	 * <!-- end-model-doc -->
	 * @see #CERNOHLS20_VALUE
	 * @generated
	 * @ordered
	 */
	CERNOHLS20(184, "CERNOHLS20", "CERN-OHL-S-2.0"),

	/**
	 * The '<em><b>CERNOHLW20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Weakly Reciprocal
	 * <!-- end-model-doc -->
	 * @see #CERNOHLW20_VALUE
	 * @generated
	 * @ordered
	 */
	CERNOHLW20(185, "CERNOHLW20", "CERN-OHL-W-2.0"),

	/**
	 * The '<em><b>CFITSIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CFITSIO License
	 * <!-- end-model-doc -->
	 * @see #CFITSIO_VALUE
	 * @generated
	 * @ordered
	 */
	CFITSIO(186, "CFITSIO", "CFITSIO"),

	/**
	 * The '<em><b>Check Cvs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * check-cvs License
	 * <!-- end-model-doc -->
	 * @see #CHECK_CVS_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_CVS(187, "checkCvs", "check-cvs"),

	/**
	 * The '<em><b>Checkmk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checkmk License
	 * <!-- end-model-doc -->
	 * @see #CHECKMK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKMK(188, "checkmk", "checkmk"),

	/**
	 * The '<em><b>Cl Artistic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clarified Artistic License
	 * <!-- end-model-doc -->
	 * @see #CL_ARTISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	CL_ARTISTIC(189, "ClArtistic", "ClArtistic"),

	/**
	 * The '<em><b>Clips</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clips License
	 * <!-- end-model-doc -->
	 * @see #CLIPS_VALUE
	 * @generated
	 * @ordered
	 */
	CLIPS(190, "Clips", "Clips"),

	/**
	 * The '<em><b>CMU Mach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU Mach License
	 * <!-- end-model-doc -->
	 * @see #CMU_MACH_VALUE
	 * @generated
	 * @ordered
	 */
	CMU_MACH(191, "CMUMach", "CMU-Mach"),

	/**
	 * The '<em><b>CMU Mach Nodoc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU    Mach - no notices-in-documentation variant
	 * <!-- end-model-doc -->
	 * @see #CMU_MACH_NODOC_VALUE
	 * @generated
	 * @ordered
	 */
	CMU_MACH_NODOC(192, "CMUMachNodoc", "CMU-Mach-nodoc"),

	/**
	 * The '<em><b>CNRI Jython</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Jython License
	 * <!-- end-model-doc -->
	 * @see #CNRI_JYTHON_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_JYTHON(193, "CNRIJython", "CNRI-Jython"),

	/**
	 * The '<em><b>CNRI Python</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python License
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_PYTHON(194, "CNRIPython", "CNRI-Python"),

	/**
	 * The '<em><b>CNRI Python GPL Compatible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python Open Source GPL Compatible License Agreement
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_GPL_COMPATIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_PYTHON_GPL_COMPATIBLE(195, "CNRIPythonGPLCompatible", "CNRI-Python-GPL-Compatible"),

	/**
	 * The '<em><b>COIL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copyfree Open Innovation License
	 * <!-- end-model-doc -->
	 * @see #COIL10_VALUE
	 * @generated
	 * @ordered
	 */
	COIL10(196, "COIL10", "COIL-1.0"),

	/**
	 * The '<em><b>Community Spec10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Specification License 1.0
	 * <!-- end-model-doc -->
	 * @see #COMMUNITY_SPEC10_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNITY_SPEC10(197, "CommunitySpec10", "Community-Spec-1.0"),

	/**
	 * The '<em><b>Condor11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condor Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #CONDOR11_VALUE
	 * @generated
	 * @ordered
	 */
	CONDOR11(198, "Condor11", "Condor-1.1"),

	/**
	 * The '<em><b>Copyleft Next030</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copyleft-next 0.3.0
	 * <!-- end-model-doc -->
	 * @see #COPYLEFT_NEXT030_VALUE
	 * @generated
	 * @ordered
	 */
	COPYLEFT_NEXT030(199, "copyleftNext030", "copyleft-next-0.3.0"),

	/**
	 * The '<em><b>Copyleft Next031</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copyleft-next 0.3.1
	 * <!-- end-model-doc -->
	 * @see #COPYLEFT_NEXT031_VALUE
	 * @generated
	 * @ordered
	 */
	COPYLEFT_NEXT031(200, "copyleftNext031", "copyleft-next-0.3.1"),

	/**
	 * The '<em><b>Cornell Lossless JPEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cornell Lossless JPEG License
	 * <!-- end-model-doc -->
	 * @see #CORNELL_LOSSLESS_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	CORNELL_LOSSLESS_JPEG(201, "CornellLosslessJPEG", "Cornell-Lossless-JPEG"),

	/**
	 * The '<em><b>CPAL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public Attribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPAL10_VALUE
	 * @generated
	 * @ordered
	 */
	CPAL10(202, "CPAL10", "CPAL-1.0"),

	/**
	 * The '<em><b>CPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPL10_VALUE
	 * @generated
	 * @ordered
	 */
	CPL10(203, "CPL10", "CPL-1.0"),

	/**
	 * The '<em><b>CPOL102</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code Project Open License 1.02
	 * <!-- end-model-doc -->
	 * @see #CPOL102_VALUE
	 * @generated
	 * @ordered
	 */
	CPOL102(204, "CPOL102", "CPOL-1.02"),

	/**
	 * The '<em><b>Cronyx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cronyx License
	 * <!-- end-model-doc -->
	 * @see #CRONYX_VALUE
	 * @generated
	 * @ordered
	 */
	CRONYX(205, "Cronyx", "Cronyx"),

	/**
	 * The '<em><b>Crossword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Crossword License
	 * <!-- end-model-doc -->
	 * @see #CROSSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	CROSSWORD(206, "Crossword", "Crossword"),

	/**
	 * The '<em><b>Crypto Swift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CryptoSwift License
	 * <!-- end-model-doc -->
	 * @see #CRYPTO_SWIFT_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTO_SWIFT(207, "CryptoSwift", "CryptoSwift"),

	/**
	 * The '<em><b>Crystal Stacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CrystalStacker License
	 * <!-- end-model-doc -->
	 * @see #CRYSTAL_STACKER_VALUE
	 * @generated
	 * @ordered
	 */
	CRYSTAL_STACKER(208, "CrystalStacker", "CrystalStacker"),

	/**
	 * The '<em><b>CUAOPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CUA Office Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #CUAOPL10_VALUE
	 * @generated
	 * @ordered
	 */
	CUAOPL10(209, "CUAOPL10", "CUA-OPL-1.0"),

	/**
	 * The '<em><b>Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cube License
	 * <!-- end-model-doc -->
	 * @see #CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE(210, "Cube", "Cube"),

	/**
	 * The '<em><b>Curl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * curl License
	 * <!-- end-model-doc -->
	 * @see #CURL_VALUE
	 * @generated
	 * @ordered
	 */
	CURL(211, "curl", "curl"),

	/**
	 * The '<em><b>Cve Tou</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Vulnerability Enumeration ToU License
	 * <!-- end-model-doc -->
	 * @see #CVE_TOU_VALUE
	 * @generated
	 * @ordered
	 */
	CVE_TOU(212, "cveTou", "cve-tou"),

	/**
	 * The '<em><b>DFSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deutsche Freie Software Lizenz
	 * <!-- end-model-doc -->
	 * @see #DFSL10_VALUE
	 * @generated
	 * @ordered
	 */
	DFSL10(213, "DFSL10", "D-FSL-1.0"),

	/**
	 * The '<em><b>DEC3 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEC 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #DEC3_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	DEC3_CLAUSE(214, "DEC3Clause", "DEC-3-Clause"),

	/**
	 * The '<em><b>Diffmark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * diffmark license
	 * <!-- end-model-doc -->
	 * @see #DIFFMARK_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFMARK(215, "diffmark", "diffmark"),

	/**
	 * The '<em><b>DLDEBY20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data licence Germany – attribution – version 2.0
	 * <!-- end-model-doc -->
	 * @see #DLDEBY20_VALUE
	 * @generated
	 * @ordered
	 */
	DLDEBY20(216, "DLDEBY20", "DL-DE-BY-2.0"),

	/**
	 * The '<em><b>DLDEZERO20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data licence Germany – zero – version 2.0
	 * <!-- end-model-doc -->
	 * @see #DLDEZERO20_VALUE
	 * @generated
	 * @ordered
	 */
	DLDEZERO20(217, "DLDEZERO20", "DL-DE-ZERO-2.0"),

	/**
	 * The '<em><b>DOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOC License
	 * <!-- end-model-doc -->
	 * @see #DOC_VALUE
	 * @generated
	 * @ordered
	 */
	DOC(218, "DOC", "DOC"),

	/**
	 * The '<em><b>Doc Book DTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook DTD License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_DTD_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_BOOK_DTD(219, "DocBookDTD", "DocBook-DTD"),

	/**
	 * The '<em><b>Doc Book Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook Schema License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_BOOK_SCHEMA(220, "DocBookSchema", "DocBook-Schema"),

	/**
	 * The '<em><b>Doc Book Stylesheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook Stylesheet License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_STYLESHEET_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_BOOK_STYLESHEET(221, "DocBookStylesheet", "DocBook-Stylesheet"),

	/**
	 * The '<em><b>Doc Book XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook XML License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_XML_VALUE
	 * @generated
	 * @ordered
	 */
	DOC_BOOK_XML(222, "DocBookXML", "DocBook-XML"),

	/**
	 * The '<em><b>Dotseqn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dotseqn License
	 * <!-- end-model-doc -->
	 * @see #DOTSEQN_VALUE
	 * @generated
	 * @ordered
	 */
	DOTSEQN(223, "Dotseqn", "Dotseqn"),

	/**
	 * The '<em><b>DRL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detection Rule License 1.0
	 * <!-- end-model-doc -->
	 * @see #DRL10_VALUE
	 * @generated
	 * @ordered
	 */
	DRL10(224, "DRL10", "DRL-1.0"),

	/**
	 * The '<em><b>DRL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detection Rule License 1.1
	 * <!-- end-model-doc -->
	 * @see #DRL11_VALUE
	 * @generated
	 * @ordered
	 */
	DRL11(225, "DRL11", "DRL-1.1"),

	/**
	 * The '<em><b>DSDP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSDP License
	 * <!-- end-model-doc -->
	 * @see #DSDP_VALUE
	 * @generated
	 * @ordered
	 */
	DSDP(226, "DSDP", "DSDP"),

	/**
	 * The '<em><b>Dtoa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * David M. Gay dtoa License
	 * <!-- end-model-doc -->
	 * @see #DTOA_VALUE
	 * @generated
	 * @ordered
	 */
	DTOA(227, "dtoa", "dtoa"),

	/**
	 * The '<em><b>Dvipdfm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dvipdfm License
	 * <!-- end-model-doc -->
	 * @see #DVIPDFM_VALUE
	 * @generated
	 * @ordered
	 */
	DVIPDFM(228, "dvipdfm", "dvipdfm"),

	/**
	 * The '<em><b>ECL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v1.0
	 * <!-- end-model-doc -->
	 * @see #ECL10_VALUE
	 * @generated
	 * @ordered
	 */
	ECL10(229, "ECL10", "ECL-1.0"),

	/**
	 * The '<em><b>ECL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v2.0
	 * <!-- end-model-doc -->
	 * @see #ECL20_VALUE
	 * @generated
	 * @ordered
	 */
	ECL20(230, "ECL20", "ECL-2.0"),

	/**
	 * The '<em><b>ECos20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eCos license version 2.0
	 * <!-- end-model-doc -->
	 * @see #ECOS20_VALUE
	 * @generated
	 * @ordered
	 */
	ECOS20(231, "eCos20", "eCos-2.0"),

	/**
	 * The '<em><b>EFL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v1.0
	 * <!-- end-model-doc -->
	 * @see #EFL10_VALUE
	 * @generated
	 * @ordered
	 */
	EFL10(232, "EFL10", "EFL-1.0"),

	/**
	 * The '<em><b>EFL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v2.0
	 * <!-- end-model-doc -->
	 * @see #EFL20_VALUE
	 * @generated
	 * @ordered
	 */
	EFL20(233, "EFL20", "EFL-2.0"),

	/**
	 * The '<em><b>EGenix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eGenix.com Public License 1.1.0
	 * <!-- end-model-doc -->
	 * @see #EGENIX_VALUE
	 * @generated
	 * @ordered
	 */
	EGENIX(234, "eGenix", "eGenix"),

	/**
	 * The '<em><b>Elastic20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elastic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ELASTIC20_VALUE
	 * @generated
	 * @ordered
	 */
	ELASTIC20(235, "Elastic20", "Elastic-2.0"),

	/**
	 * The '<em><b>Entessa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entessa Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #ENTESSA_VALUE
	 * @generated
	 * @ordered
	 */
	ENTESSA(236, "Entessa", "Entessa"),

	/**
	 * The '<em><b>EPICS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EPICS Open License
	 * <!-- end-model-doc -->
	 * @see #EPICS_VALUE
	 * @generated
	 * @ordered
	 */
	EPICS(237, "EPICS", "EPICS"),

	/**
	 * The '<em><b>EPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EPL10_VALUE
	 * @generated
	 * @ordered
	 */
	EPL10(238, "EPL10", "EPL-1.0"),

	/**
	 * The '<em><b>EPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #EPL20_VALUE
	 * @generated
	 * @ordered
	 */
	EPL20(239, "EPL20", "EPL-2.0"),

	/**
	 * The '<em><b>Erl PL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #ERL_PL11_VALUE
	 * @generated
	 * @ordered
	 */
	ERL_PL11(240, "ErlPL11", "ErlPL-1.1"),

	/**
	 * The '<em><b>Etalab20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Etalab Open License 2.0
	 * <!-- end-model-doc -->
	 * @see #ETALAB20_VALUE
	 * @generated
	 * @ordered
	 */
	ETALAB20(241, "etalab20", "etalab-2.0"),

	/**
	 * The '<em><b>EU Datagrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EU DataGrid Software License
	 * <!-- end-model-doc -->
	 * @see #EU_DATAGRID_VALUE
	 * @generated
	 * @ordered
	 */
	EU_DATAGRID(242, "EUDatagrid", "EUDatagrid"),

	/**
	 * The '<em><b>EUPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EUPL10_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL10(243, "EUPL10", "EUPL-1.0"),

	/**
	 * The '<em><b>EUPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #EUPL11_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL11(244, "EUPL11", "EUPL-1.1"),

	/**
	 * The '<em><b>EUPL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.2
	 * <!-- end-model-doc -->
	 * @see #EUPL12_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL12(245, "EUPL12", "EUPL-1.2"),

	/**
	 * The '<em><b>Eurosym</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eurosym License
	 * <!-- end-model-doc -->
	 * @see #EUROSYM_VALUE
	 * @generated
	 * @ordered
	 */
	EUROSYM(246, "Eurosym", "Eurosym"),

	/**
	 * The '<em><b>Fair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fair License
	 * <!-- end-model-doc -->
	 * @see #FAIR_VALUE
	 * @generated
	 * @ordered
	 */
	FAIR(247, "Fair", "Fair"),

	/**
	 * The '<em><b>FBM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuzzy Bitmap License
	 * <!-- end-model-doc -->
	 * @see #FBM_VALUE
	 * @generated
	 * @ordered
	 */
	FBM(248, "FBM", "FBM"),

	/**
	 * The '<em><b>FDKAAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fraunhofer FDK AAC Codec Library
	 * <!-- end-model-doc -->
	 * @see #FDKAAC_VALUE
	 * @generated
	 * @ordered
	 */
	FDKAAC(249, "FDKAAC", "FDK-AAC"),

	/**
	 * The '<em><b>Ferguson Twofish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ferguson Twofish License
	 * <!-- end-model-doc -->
	 * @see #FERGUSON_TWOFISH_VALUE
	 * @generated
	 * @ordered
	 */
	FERGUSON_TWOFISH(250, "FergusonTwofish", "Ferguson-Twofish"),

	/**
	 * The '<em><b>Frameworx10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frameworx Open License 1.0
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORX10_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORX10(251, "Frameworx10", "Frameworx-1.0"),

	/**
	 * The '<em><b>Free BSDDOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeBSD Documentation License
	 * <!-- end-model-doc -->
	 * @see #FREE_BSDDOC_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_BSDDOC(252, "FreeBSDDOC", "FreeBSD-DOC"),

	/**
	 * The '<em><b>Free Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeImage Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #FREE_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_IMAGE(253, "FreeImage", "FreeImage"),

	/**
	 * The '<em><b>FSFAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License
	 * <!-- end-model-doc -->
	 * @see #FSFAP_VALUE
	 * @generated
	 * @ordered
	 */
	FSFAP(254, "FSFAP", "FSFAP"),

	/**
	 * The '<em><b>FSFAP No Warranty Disclaimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License (without Warranty)
	 * <!-- end-model-doc -->
	 * @see #FSFAP_NO_WARRANTY_DISCLAIMER_VALUE
	 * @generated
	 * @ordered
	 */
	FSFAP_NO_WARRANTY_DISCLAIMER(255, "FSFAPNoWarrantyDisclaimer", "FSFAP-no-warranty-disclaimer"),

	/**
	 * The '<em><b>FSFUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License
	 * <!-- end-model-doc -->
	 * @see #FSFUL_VALUE
	 * @generated
	 * @ordered
	 */
	FSFUL(256, "FSFUL", "FSFUL"),

	/**
	 * The '<em><b>FSFULLR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention)
	 * <!-- end-model-doc -->
	 * @see #FSFULLR_VALUE
	 * @generated
	 * @ordered
	 */
	FSFULLR(257, "FSFULLR", "FSFULLR"),

	/**
	 * The '<em><b>FSFULLRSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention and Short Disclaimer)
	 * <!-- end-model-doc -->
	 * @see #FSFULLRSD_VALUE
	 * @generated
	 * @ordered
	 */
	FSFULLRSD(258, "FSFULLRSD", "FSFULLRSD"),

	/**
	 * The '<em><b>FSFULLRWD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (With License Retention and Warranty Disclaimer)
	 * <!-- end-model-doc -->
	 * @see #FSFULLRWD_VALUE
	 * @generated
	 * @ordered
	 */
	FSFULLRWD(259, "FSFULLRWD", "FSFULLRWD"),

	/**
	 * The '<em><b>FSL11A Lv2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Functional Source License, Version 1.1, ALv2 Future License
	 * <!-- end-model-doc -->
	 * @see #FSL11A_LV2_VALUE
	 * @generated
	 * @ordered
	 */
	FSL11A_LV2(260, "FSL11ALv2", "FSL-1.1-ALv2"),

	/**
	 * The '<em><b>FSL11MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Functional Source License, Version 1.1, MIT Future License
	 * <!-- end-model-doc -->
	 * @see #FSL11MIT_VALUE
	 * @generated
	 * @ordered
	 */
	FSL11MIT(261, "FSL11MIT", "FSL-1.1-MIT"),

	/**
	 * The '<em><b>FTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freetype Project License
	 * <!-- end-model-doc -->
	 * @see #FTL_VALUE
	 * @generated
	 * @ordered
	 */
	FTL(262, "FTL", "FTL"),

	/**
	 * The '<em><b>Furuseth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Furuseth License
	 * <!-- end-model-doc -->
	 * @see #FURUSETH_VALUE
	 * @generated
	 * @ordered
	 */
	FURUSETH(263, "Furuseth", "Furuseth"),

	/**
	 * The '<em><b>Fwlw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fwlw License
	 * <!-- end-model-doc -->
	 * @see #FWLW_VALUE
	 * @generated
	 * @ordered
	 */
	FWLW(264, "fwlw", "fwlw"),

	/**
	 * The '<em><b>Game Programming Gems</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Game Programming Gems License
	 * <!-- end-model-doc -->
	 * @see #GAME_PROGRAMMING_GEMS_VALUE
	 * @generated
	 * @ordered
	 */
	GAME_PROGRAMMING_GEMS(265, "GameProgrammingGems", "Game-Programming-Gems"),

	/**
	 * The '<em><b>GCR Docs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gnome GCR Documentation License
	 * <!-- end-model-doc -->
	 * @see #GCR_DOCS_VALUE
	 * @generated
	 * @ordered
	 */
	GCR_DOCS(266, "GCRDocs", "GCR-docs"),

	/**
	 * The '<em><b>GD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GD License
	 * <!-- end-model-doc -->
	 * @see #GD_VALUE
	 * @generated
	 * @ordered
	 */
	GD(267, "GD", "GD"),

	/**
	 * The '<em><b>Generic Xts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic XTS License
	 * <!-- end-model-doc -->
	 * @see #GENERIC_XTS_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_XTS(268, "genericXts", "generic-xts"),

	/**
	 * The '<em><b>GFDL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1
	 * <!-- end-model-doc -->
	 * @see #GFDL11_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11(269, "GFDL11", "GFDL-1.1"),

	/**
	 * The '<em><b>GFDL11 Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_INVARIANTS_ONLY(270, "GFDL11InvariantsOnly", "GFDL-1.1-invariants-only"),

	/**
	 * The '<em><b>GFDL11 Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_INVARIANTS_OR_LATER(271, "GFDL11InvariantsOrLater", "GFDL-1.1-invariants-or-later"),

	/**
	 * The '<em><b>GFDL11 No Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_NO_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_NO_INVARIANTS_ONLY(272, "GFDL11NoInvariantsOnly", "GFDL-1.1-no-invariants-only"),

	/**
	 * The '<em><b>GFDL11 No Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_NO_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_NO_INVARIANTS_OR_LATER(273, "GFDL11NoInvariantsOrLater", "GFDL-1.1-no-invariants-or-later"),

	/**
	 * The '<em><b>GFDL11 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only
	 * <!-- end-model-doc -->
	 * @see #GFDL11_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_ONLY(274, "GFDL11Only", "GFDL-1.1-only"),

	/**
	 * The '<em><b>GFDL11 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL11_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_OR_LATER(275, "GFDL11OrLater", "GFDL-1.1-or-later"),

	/**
	 * The '<em><b>GFDL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2
	 * <!-- end-model-doc -->
	 * @see #GFDL12_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12(276, "GFDL12", "GFDL-1.2"),

	/**
	 * The '<em><b>GFDL12 Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_INVARIANTS_ONLY(277, "GFDL12InvariantsOnly", "GFDL-1.2-invariants-only"),

	/**
	 * The '<em><b>GFDL12 Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_INVARIANTS_OR_LATER(278, "GFDL12InvariantsOrLater", "GFDL-1.2-invariants-or-later"),

	/**
	 * The '<em><b>GFDL12 No Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_NO_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_NO_INVARIANTS_ONLY(279, "GFDL12NoInvariantsOnly", "GFDL-1.2-no-invariants-only"),

	/**
	 * The '<em><b>GFDL12 No Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_NO_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_NO_INVARIANTS_OR_LATER(280, "GFDL12NoInvariantsOrLater", "GFDL-1.2-no-invariants-or-later"),

	/**
	 * The '<em><b>GFDL12 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only
	 * <!-- end-model-doc -->
	 * @see #GFDL12_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_ONLY(281, "GFDL12Only", "GFDL-1.2-only"),

	/**
	 * The '<em><b>GFDL12 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL12_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_OR_LATER(282, "GFDL12OrLater", "GFDL-1.2-or-later"),

	/**
	 * The '<em><b>GFDL13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3
	 * <!-- end-model-doc -->
	 * @see #GFDL13_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13(283, "GFDL13", "GFDL-1.3"),

	/**
	 * The '<em><b>GFDL13 Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_INVARIANTS_ONLY(284, "GFDL13InvariantsOnly", "GFDL-1.3-invariants-only"),

	/**
	 * The '<em><b>GFDL13 Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_INVARIANTS_OR_LATER(285, "GFDL13InvariantsOrLater", "GFDL-1.3-invariants-or-later"),

	/**
	 * The '<em><b>GFDL13 No Invariants Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_NO_INVARIANTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_NO_INVARIANTS_ONLY(286, "GFDL13NoInvariantsOnly", "GFDL-1.3-no-invariants-only"),

	/**
	 * The '<em><b>GFDL13 No Invariants Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_NO_INVARIANTS_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_NO_INVARIANTS_OR_LATER(287, "GFDL13NoInvariantsOrLater", "GFDL-1.3-no-invariants-or-later"),

	/**
	 * The '<em><b>GFDL13 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only
	 * <!-- end-model-doc -->
	 * @see #GFDL13_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_ONLY(288, "GFDL13Only", "GFDL-1.3-only"),

	/**
	 * The '<em><b>GFDL13 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL13_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_OR_LATER(289, "GFDL13OrLater", "GFDL-1.3-or-later"),

	/**
	 * The '<em><b>Giftware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Giftware License
	 * <!-- end-model-doc -->
	 * @see #GIFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	GIFTWARE(290, "Giftware", "Giftware"),

	/**
	 * The '<em><b>GL2PS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GL2PS License
	 * <!-- end-model-doc -->
	 * @see #GL2PS_VALUE
	 * @generated
	 * @ordered
	 */
	GL2PS(291, "GL2PS", "GL2PS"),

	/**
	 * The '<em><b>Glide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3dfx Glide License
	 * <!-- end-model-doc -->
	 * @see #GLIDE_VALUE
	 * @generated
	 * @ordered
	 */
	GLIDE(292, "Glide", "Glide"),

	/**
	 * The '<em><b>Glulxe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Glulxe License
	 * <!-- end-model-doc -->
	 * @see #GLULXE_VALUE
	 * @generated
	 * @ordered
	 */
	GLULXE(293, "Glulxe", "Glulxe"),

	/**
	 * The '<em><b>GLWTPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good Luck With That Public License
	 * <!-- end-model-doc -->
	 * @see #GLWTPL_VALUE
	 * @generated
	 * @ordered
	 */
	GLWTPL(294, "GLWTPL", "GLWTPL"),

	/**
	 * The '<em><b>Gnuplot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gnuplot License
	 * <!-- end-model-doc -->
	 * @see #GNUPLOT_VALUE
	 * @generated
	 * @ordered
	 */
	GNUPLOT(295, "gnuplot", "gnuplot"),

	/**
	 * The '<em><b>GPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10_VALUE
	 * @generated
	 * @ordered
	 */
	GPL10(296, "GPL10", "GPL-1.0"),

	/**
	 * The '<em><b>GPL101</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL101_VALUE
	 * @generated
	 * @ordered
	 */
	GPL101(297, "GPL101", "GPL-1.0+"),

	/**
	 * The '<em><b>GPL10 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL10_ONLY(298, "GPL10Only", "GPL-1.0-only"),

	/**
	 * The '<em><b>GPL10 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL10_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL10_OR_LATER(299, "GPL10OrLater", "GPL-1.0-or-later"),

	/**
	 * The '<em><b>GPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20(300, "GPL20", "GPL-2.0"),

	/**
	 * The '<em><b>GPL201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL201_VALUE
	 * @generated
	 * @ordered
	 */
	GPL201(301, "GPL201", "GPL-2.0+"),

	/**
	 * The '<em><b>GPL20 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_ONLY(302, "GPL20Only", "GPL-2.0-only"),

	/**
	 * The '<em><b>GPL20 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL20_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_OR_LATER(303, "GPL20OrLater", "GPL-2.0-or-later"),

	/**
	 * The '<em><b>GPL20 With Autoconf Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Autoconf exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_AUTOCONF_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_WITH_AUTOCONF_EXCEPTION(304, "GPL20WithAutoconfException", "GPL-2.0-with-autoconf-exception"),

	/**
	 * The '<em><b>GPL20 With Bison Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Bison exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_BISON_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_WITH_BISON_EXCEPTION(305, "GPL20WithBisonException", "GPL-2.0-with-bison-exception"),

	/**
	 * The '<em><b>GPL20 With Classpath Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Classpath exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_CLASSPATH_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_WITH_CLASSPATH_EXCEPTION(306, "GPL20WithClasspathException", "GPL-2.0-with-classpath-exception"),

	/**
	 * The '<em><b>GPL20 With Font Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Font exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_FONT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_WITH_FONT_EXCEPTION(307, "GPL20WithFontException", "GPL-2.0-with-font-exception"),

	/**
	 * The '<em><b>GPL20 With GCC Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/GCC Runtime Library exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_GCC_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_WITH_GCC_EXCEPTION(308, "GPL20WithGCCException", "GPL-2.0-with-GCC-exception"),

	/**
	 * The '<em><b>GPL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30(309, "GPL30", "GPL-3.0"),

	/**
	 * The '<em><b>GPL301</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL301_VALUE
	 * @generated
	 * @ordered
	 */
	GPL301(310, "GPL301", "GPL-3.0+"),

	/**
	 * The '<em><b>GPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_ONLY(311, "GPL30Only", "GPL-3.0-only"),

	/**
	 * The '<em><b>GPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_OR_LATER(312, "GPL30OrLater", "GPL-3.0-or-later"),

	/**
	 * The '<em><b>GPL30 With Autoconf Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 w/Autoconf exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_WITH_AUTOCONF_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_WITH_AUTOCONF_EXCEPTION(313, "GPL30WithAutoconfException", "GPL-3.0-with-autoconf-exception"),

	/**
	 * The '<em><b>GPL30 With GCC Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 w/GCC Runtime Library exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_WITH_GCC_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_WITH_GCC_EXCEPTION(314, "GPL30WithGCCException", "GPL-3.0-with-GCC-exception"),

	/**
	 * The '<em><b>Graphics Gems</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphics Gems License
	 * <!-- end-model-doc -->
	 * @see #GRAPHICS_GEMS_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICS_GEMS(315, "GraphicsGems", "Graphics-Gems"),

	/**
	 * The '<em><b>GSOAP1 3b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gSOAP Public License v1.3b
	 * <!-- end-model-doc -->
	 * @see #GSOAP1_3B_VALUE
	 * @generated
	 * @ordered
	 */
	GSOAP1_3B(316, "gSOAP13b", "gSOAP-1.3b"),

	/**
	 * The '<em><b>Gtkbook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gtkbook License
	 * <!-- end-model-doc -->
	 * @see #GTKBOOK_VALUE
	 * @generated
	 * @ordered
	 */
	GTKBOOK(317, "gtkbook", "gtkbook"),

	/**
	 * The '<em><b>Gutmann</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gutmann License
	 * <!-- end-model-doc -->
	 * @see #GUTMANN_VALUE
	 * @generated
	 * @ordered
	 */
	GUTMANN(318, "Gutmann", "Gutmann"),

	/**
	 * The '<em><b>Haskell Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haskell Language Report License
	 * <!-- end-model-doc -->
	 * @see #HASKELL_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	HASKELL_REPORT(319, "HaskellReport", "HaskellReport"),

	/**
	 * The '<em><b>HDF5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HDF5 License
	 * <!-- end-model-doc -->
	 * @see #HDF5_VALUE
	 * @generated
	 * @ordered
	 */
	HDF5(320, "HDF5", "HDF5"),

	/**
	 * The '<em><b>Hdparm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hdparm License
	 * <!-- end-model-doc -->
	 * @see #HDPARM_VALUE
	 * @generated
	 * @ordered
	 */
	HDPARM(321, "hdparm", "hdparm"),

	/**
	 * The '<em><b>HIDAPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIDAPI License
	 * <!-- end-model-doc -->
	 * @see #HIDAPI_VALUE
	 * @generated
	 * @ordered
	 */
	HIDAPI(322, "HIDAPI", "HIDAPI"),

	/**
	 * The '<em><b>Hippocratic21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hippocratic License 2.1
	 * <!-- end-model-doc -->
	 * @see #HIPPOCRATIC21_VALUE
	 * @generated
	 * @ordered
	 */
	HIPPOCRATIC21(323, "Hippocratic21", "Hippocratic-2.1"),

	/**
	 * The '<em><b>HP1986</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard 1986 License
	 * <!-- end-model-doc -->
	 * @see #HP1986_VALUE
	 * @generated
	 * @ordered
	 */
	HP1986(324, "HP1986", "HP-1986"),

	/**
	 * The '<em><b>HP1989</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard 1989 License
	 * <!-- end-model-doc -->
	 * @see #HP1989_VALUE
	 * @generated
	 * @ordered
	 */
	HP1989(325, "HP1989", "HP-1989"),

	/**
	 * The '<em><b>HPND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_VALUE
	 * @generated
	 * @ordered
	 */
	HPND(326, "HPND", "HPND"),

	/**
	 * The '<em><b>HPNDDEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - DEC variant
	 * <!-- end-model-doc -->
	 * @see #HPNDDEC_VALUE
	 * @generated
	 * @ordered
	 */
	HPNDDEC(327, "HPNDDEC", "HPND-DEC"),

	/**
	 * The '<em><b>HPND Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - documentation variant
	 * <!-- end-model-doc -->
	 * @see #HPND_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_DOC(328, "HPNDDoc", "HPND-doc"),

	/**
	 * The '<em><b>HPND Doc Sell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - documentation sell variant
	 * <!-- end-model-doc -->
	 * @see #HPND_DOC_SELL_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_DOC_SELL(329, "HPNDDocSell", "HPND-doc-sell"),

	/**
	 * The '<em><b>HPND Export US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_EXPORT_US(330, "HPNDExportUS", "HPND-export-US"),

	/**
	 * The '<em><b>HPND Export US Acknowledgement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning and acknowledgment
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US_ACKNOWLEDGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_EXPORT_US_ACKNOWLEDGEMENT(331, "HPNDExportUSAcknowledgement", "HPND-export-US-acknowledgement"),

	/**
	 * The '<em><b>HPND Export US Modify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning and modification rqmt
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US_MODIFY_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_EXPORT_US_MODIFY(332, "HPNDExportUSModify", "HPND-export-US-modify"),

	/**
	 * The '<em><b>HPND Export2 US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control and 2 disclaimers
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT2_US_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_EXPORT2_US(333, "HPNDExport2US", "HPND-export2-US"),

	/**
	 * The '<em><b>HPND Fenneberg Livingston</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Fenneberg-Livingston variant
	 * <!-- end-model-doc -->
	 * @see #HPND_FENNEBERG_LIVINGSTON_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_FENNEBERG_LIVINGSTON(334, "HPNDFennebergLivingston", "HPND-Fenneberg-Livingston"),

	/**
	 * The '<em><b>HPNDINRIAIMAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer    - INRIA-IMAG variant
	 * <!-- end-model-doc -->
	 * @see #HPNDINRIAIMAG_VALUE
	 * @generated
	 * @ordered
	 */
	HPNDINRIAIMAG(335, "HPNDINRIAIMAG", "HPND-INRIA-IMAG"),

	/**
	 * The '<em><b>HPND Intel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Intel variant
	 * <!-- end-model-doc -->
	 * @see #HPND_INTEL_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_INTEL(336, "HPNDIntel", "HPND-Intel"),

	/**
	 * The '<em><b>HPND Kevlin Henney</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Kevlin Henney variant
	 * <!-- end-model-doc -->
	 * @see #HPND_KEVLIN_HENNEY_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_KEVLIN_HENNEY(337, "HPNDKevlinHenney", "HPND-Kevlin-Henney"),

	/**
	 * The '<em><b>HPND Markus Kuhn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Markus Kuhn variant
	 * <!-- end-model-doc -->
	 * @see #HPND_MARKUS_KUHN_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_MARKUS_KUHN(338, "HPNDMarkusKuhn", "HPND-Markus-Kuhn"),

	/**
	 * The '<em><b>HPND Merchantability Variant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - merchantability variant
	 * <!-- end-model-doc -->
	 * @see #HPND_MERCHANTABILITY_VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_MERCHANTABILITY_VARIANT(339, "HPNDMerchantabilityVariant", "HPND-merchantability-variant"),

	/**
	 * The '<em><b>HPNDMIT Disclaimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPNDMIT_DISCLAIMER_VALUE
	 * @generated
	 * @ordered
	 */
	HPNDMIT_DISCLAIMER(340, "HPNDMITDisclaimer", "HPND-MIT-disclaimer"),

	/**
	 * The '<em><b>HPND Netrek</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Netrek variant
	 * <!-- end-model-doc -->
	 * @see #HPND_NETREK_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_NETREK(341, "HPNDNetrek", "HPND-Netrek"),

	/**
	 * The '<em><b>HPND Pbmplus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Pbmplus variant
	 * <!-- end-model-doc -->
	 * @see #HPND_PBMPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_PBMPLUS(342, "HPNDPbmplus", "HPND-Pbmplus"),

	/**
	 * The '<em><b>HPND Sell MIT Disclaimer Xserver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell xserver variant with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_MIT_DISCLAIMER_XSERVER_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_SELL_MIT_DISCLAIMER_XSERVER(343, "HPNDSellMITDisclaimerXserver", "HPND-sell-MIT-disclaimer-xserver"),

	/**
	 * The '<em><b>HPND Sell Regexpr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell regexpr variant
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_REGEXPR_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_SELL_REGEXPR(344, "HPNDSellRegexpr", "HPND-sell-regexpr"),

	/**
	 * The '<em><b>HPND Sell Variant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell variant
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_SELL_VARIANT(345, "HPNDSellVariant", "HPND-sell-variant"),

	/**
	 * The '<em><b>HPND Sell Variant MIT Disclaimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND sell variant with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT_MIT_DISCLAIMER_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_SELL_VARIANT_MIT_DISCLAIMER(346, "HPNDSellVariantMITDisclaimer", "HPND-sell-variant-MIT-disclaimer"),

	/**
	 * The '<em><b>HPND Sell Variant MIT Disclaimer Rev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND sell variant with MIT disclaimer - reverse
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT_MIT_DISCLAIMER_REV_VALUE
	 * @generated
	 * @ordered
	 */
	HPND_SELL_VARIANT_MIT_DISCLAIMER_REV(347, "HPNDSellVariantMITDisclaimerRev", "HPND-sell-variant-MIT-disclaimer-rev"),

	/**
	 * The '<em><b>HPNDUC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - University of California variant
	 * <!-- end-model-doc -->
	 * @see #HPNDUC_VALUE
	 * @generated
	 * @ordered
	 */
	HPNDUC(348, "HPNDUC", "HPND-UC"),

	/**
	 * The '<em><b>HPNDUC Export US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - University of California, US export warning
	 * <!-- end-model-doc -->
	 * @see #HPNDUC_EXPORT_US_VALUE
	 * @generated
	 * @ordered
	 */
	HPNDUC_EXPORT_US(349, "HPNDUCExportUS", "HPND-UC-export-US"),

	/**
	 * The '<em><b>HTMLTIDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML Tidy License
	 * <!-- end-model-doc -->
	 * @see #HTMLTIDY_VALUE
	 * @generated
	 * @ordered
	 */
	HTMLTIDY(350, "HTMLTIDY", "HTMLTIDY"),

	/**
	 * The '<em><b>IBM Pibs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM PowerPC Initialization and Boot Software
	 * <!-- end-model-doc -->
	 * @see #IBM_PIBS_VALUE
	 * @generated
	 * @ordered
	 */
	IBM_PIBS(351, "IBMPibs", "IBM-pibs"),

	/**
	 * The '<em><b>ICU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICU License
	 * <!-- end-model-doc -->
	 * @see #ICU_VALUE
	 * @generated
	 * @ordered
	 */
	ICU(352, "ICU", "ICU"),

	/**
	 * The '<em><b>IEC Code Components EULA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IEC    Code Components End-user licence agreement
	 * <!-- end-model-doc -->
	 * @see #IEC_CODE_COMPONENTS_EULA_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_CODE_COMPONENTS_EULA(353, "IECCodeComponentsEULA", "IEC-Code-Components-EULA"),

	/**
	 * The '<em><b>IJG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License
	 * <!-- end-model-doc -->
	 * @see #IJG_VALUE
	 * @generated
	 * @ordered
	 */
	IJG(354, "IJG", "IJG"),

	/**
	 * The '<em><b>IJG Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License - short
	 * <!-- end-model-doc -->
	 * @see #IJG_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	IJG_SHORT(355, "IJGShort", "IJG-short"),

	/**
	 * The '<em><b>Image Magick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImageMagick License
	 * <!-- end-model-doc -->
	 * @see #IMAGE_MAGICK_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_MAGICK(356, "ImageMagick", "ImageMagick"),

	/**
	 * The '<em><b>IMatix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iMatix Standard Function Library Agreement
	 * <!-- end-model-doc -->
	 * @see #IMATIX_VALUE
	 * @generated
	 * @ordered
	 */
	IMATIX(357, "iMatix", "iMatix"),

	/**
	 * The '<em><b>Imlib2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imlib2 License
	 * <!-- end-model-doc -->
	 * @see #IMLIB2_VALUE
	 * @generated
	 * @ordered
	 */
	IMLIB2(358, "Imlib2", "Imlib2"),

	/**
	 * The '<em><b>Info ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Info-ZIP License
	 * <!-- end-model-doc -->
	 * @see #INFO_ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_ZIP(359, "InfoZIP", "Info-ZIP"),

	/**
	 * The '<em><b>Inner Net20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner Net License v2.0
	 * <!-- end-model-doc -->
	 * @see #INNER_NET20_VALUE
	 * @generated
	 * @ordered
	 */
	INNER_NET20(360, "InnerNet20", "Inner-Net-2.0"),

	/**
	 * The '<em><b>Inno Setup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inno Setup License
	 * <!-- end-model-doc -->
	 * @see #INNO_SETUP_VALUE
	 * @generated
	 * @ordered
	 */
	INNO_SETUP(361, "InnoSetup", "InnoSetup"),

	/**
	 * The '<em><b>Intel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel Open Source License
	 * <!-- end-model-doc -->
	 * @see #INTEL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL(362, "Intel", "Intel"),

	/**
	 * The '<em><b>Intel ACPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel ACPI Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #INTEL_ACPI_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL_ACPI(363, "IntelACPI", "Intel-ACPI"),

	/**
	 * The '<em><b>Interbase10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interbase Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #INTERBASE10_VALUE
	 * @generated
	 * @ordered
	 */
	INTERBASE10(364, "Interbase10", "Interbase-1.0"),

	/**
	 * The '<em><b>IPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPA Font License
	 * <!-- end-model-doc -->
	 * @see #IPA_VALUE
	 * @generated
	 * @ordered
	 */
	IPA(365, "IPA", "IPA"),

	/**
	 * The '<em><b>IPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #IPL10_VALUE
	 * @generated
	 * @ordered
	 */
	IPL10(366, "IPL10", "IPL-1.0"),

	/**
	 * The '<em><b>ISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC License
	 * <!-- end-model-doc -->
	 * @see #ISC_VALUE
	 * @generated
	 * @ordered
	 */
	ISC(367, "ISC", "ISC"),

	/**
	 * The '<em><b>ISC Veillard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC Veillard variant
	 * <!-- end-model-doc -->
	 * @see #ISC_VEILLARD_VALUE
	 * @generated
	 * @ordered
	 */
	ISC_VEILLARD(368, "ISCVeillard", "ISC-Veillard"),

	/**
	 * The '<em><b>Jam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jam License
	 * <!-- end-model-doc -->
	 * @see #JAM_VALUE
	 * @generated
	 * @ordered
	 */
	JAM(369, "Jam", "Jam"),

	/**
	 * The '<em><b>Jas Per20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JasPer License
	 * <!-- end-model-doc -->
	 * @see #JAS_PER20_VALUE
	 * @generated
	 * @ordered
	 */
	JAS_PER20(370, "JasPer20", "JasPer-2.0"),

	/**
	 * The '<em><b>Jove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jove License
	 * <!-- end-model-doc -->
	 * @see #JOVE_VALUE
	 * @generated
	 * @ordered
	 */
	JOVE(371, "jove", "jove"),

	/**
	 * The '<em><b>JPL Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JPL Image Use Policy
	 * <!-- end-model-doc -->
	 * @see #JPL_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	JPL_IMAGE(372, "JPLImage", "JPL-image"),

	/**
	 * The '<em><b>JPNIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Japan Network Information Center License
	 * <!-- end-model-doc -->
	 * @see #JPNIC_VALUE
	 * @generated
	 * @ordered
	 */
	JPNIC(373, "JPNIC", "JPNIC"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON License
	 * <!-- end-model-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(374, "JSON", "JSON"),

	/**
	 * The '<em><b>Kastrup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kastrup License
	 * <!-- end-model-doc -->
	 * @see #KASTRUP_VALUE
	 * @generated
	 * @ordered
	 */
	KASTRUP(375, "Kastrup", "Kastrup"),

	/**
	 * The '<em><b>Kazlib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kazlib License
	 * <!-- end-model-doc -->
	 * @see #KAZLIB_VALUE
	 * @generated
	 * @ordered
	 */
	KAZLIB(376, "Kazlib", "Kazlib"),

	/**
	 * The '<em><b>Knuth CTAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Knuth CTAN License
	 * <!-- end-model-doc -->
	 * @see #KNUTH_CTAN_VALUE
	 * @generated
	 * @ordered
	 */
	KNUTH_CTAN(377, "KnuthCTAN", "Knuth-CTAN"),

	/**
	 * The '<em><b>LAL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.2
	 * <!-- end-model-doc -->
	 * @see #LAL12_VALUE
	 * @generated
	 * @ordered
	 */
	LAL12(378, "LAL12", "LAL-1.2"),

	/**
	 * The '<em><b>LAL13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.3
	 * <!-- end-model-doc -->
	 * @see #LAL13_VALUE
	 * @generated
	 * @ordered
	 */
	LAL13(379, "LAL13", "LAL-1.3"),

	/**
	 * The '<em><b>Latex2e</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e License
	 * <!-- end-model-doc -->
	 * @see #LATEX2E_VALUE
	 * @generated
	 * @ordered
	 */
	LATEX2E(380, "Latex2e", "Latex2e"),

	/**
	 * The '<em><b>Latex2e Translated Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e with translated notice permission
	 * <!-- end-model-doc -->
	 * @see #LATEX2E_TRANSLATED_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	LATEX2E_TRANSLATED_NOTICE(381, "Latex2eTranslatedNotice", "Latex2e-translated-notice"),

	/**
	 * The '<em><b>Leptonica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leptonica License
	 * <!-- end-model-doc -->
	 * @see #LEPTONICA_VALUE
	 * @generated
	 * @ordered
	 */
	LEPTONICA(382, "Leptonica", "Leptonica"),

	/**
	 * The '<em><b>LGPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL20(383, "LGPL20", "LGPL-2.0"),

	/**
	 * The '<em><b>LGPL201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL201_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL201(384, "LGPL201", "LGPL-2.0+"),

	/**
	 * The '<em><b>LGPL20 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL20_ONLY(385, "LGPL20Only", "LGPL-2.0-only"),

	/**
	 * The '<em><b>LGPL20 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL20_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL20_OR_LATER(386, "LGPL20OrLater", "LGPL-2.0-or-later"),

	/**
	 * The '<em><b>LGPL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL21(387, "LGPL21", "LGPL-2.1"),

	/**
	 * The '<em><b>LGPL211</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL211_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL211(388, "LGPL211", "LGPL-2.1+"),

	/**
	 * The '<em><b>LGPL21 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL21_ONLY(389, "LGPL21Only", "LGPL-2.1-only"),

	/**
	 * The '<em><b>LGPL21 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL21_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL21_OR_LATER(390, "LGPL21OrLater", "LGPL-2.1-or-later"),

	/**
	 * The '<em><b>LGPL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30(391, "LGPL30", "LGPL-3.0"),

	/**
	 * The '<em><b>LGPL301</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL301_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL301(392, "LGPL301", "LGPL-3.0+"),

	/**
	 * The '<em><b>LGPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30_ONLY(393, "LGPL30Only", "LGPL-3.0-only"),

	/**
	 * The '<em><b>LGPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30_OR_LATER(394, "LGPL30OrLater", "LGPL-3.0-or-later"),

	/**
	 * The '<em><b>LGPLLR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lesser General Public License For Linguistic Resources
	 * <!-- end-model-doc -->
	 * @see #LGPLLR_VALUE
	 * @generated
	 * @ordered
	 */
	LGPLLR(395, "LGPLLR", "LGPLLR"),

	/**
	 * The '<em><b>Libpng</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpng License
	 * <!-- end-model-doc -->
	 * @see #LIBPNG_VALUE
	 * @generated
	 * @ordered
	 */
	LIBPNG(396, "Libpng", "Libpng"),

	/**
	 * The '<em><b>Libpng1635</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PNG Reference Library License v1 (for libpng 0.5 through 1.6.35)
	 * <!-- end-model-doc -->
	 * @see #LIBPNG1635_VALUE
	 * @generated
	 * @ordered
	 */
	LIBPNG1635(397, "libpng1635", "libpng-1.6.35"),

	/**
	 * The '<em><b>Libpng20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PNG Reference Library version 2
	 * <!-- end-model-doc -->
	 * @see #LIBPNG20_VALUE
	 * @generated
	 * @ordered
	 */
	LIBPNG20(398, "libpng20", "libpng-2.0"),

	/**
	 * The '<em><b>Libselinux10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libselinux public domain notice
	 * <!-- end-model-doc -->
	 * @see #LIBSELINUX10_VALUE
	 * @generated
	 * @ordered
	 */
	LIBSELINUX10(399, "libselinux10", "libselinux-1.0"),

	/**
	 * The '<em><b>Libtiff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libtiff License
	 * <!-- end-model-doc -->
	 * @see #LIBTIFF_VALUE
	 * @generated
	 * @ordered
	 */
	LIBTIFF(400, "libtiff", "libtiff"),

	/**
	 * The '<em><b>Libutil David Nugent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libutil David Nugent License
	 * <!-- end-model-doc -->
	 * @see #LIBUTIL_DAVID_NUGENT_VALUE
	 * @generated
	 * @ordered
	 */
	LIBUTIL_DAVID_NUGENT(401, "libutilDavidNugent", "libutil-David-Nugent"),

	/**
	 * The '<em><b>Li Li QP11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Permissive version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QP11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QP11(402, "LiLiQP11", "LiLiQ-P-1.1"),

	/**
	 * The '<em><b>Li Li QR11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QR11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QR11(403, "LiLiQR11", "LiLiQ-R-1.1"),

	/**
	 * The '<em><b>Li Li QRplus11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité forte version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QRPLUS11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QRPLUS11(404, "LiLiQRplus11", "LiLiQ-Rplus-1.1"),

	/**
	 * The '<em><b>Linux Man Pages1 Para</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages - 1 paragraph
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES1_PARA_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_MAN_PAGES1_PARA(405, "LinuxManPages1Para", "Linux-man-pages-1-para"),

	/**
	 * The '<em><b>Linux Man Pages Copyleft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_MAN_PAGES_COPYLEFT(406, "LinuxManPagesCopyleft", "Linux-man-pages-copyleft"),

	/**
	 * The '<em><b>Linux Man Pages Copyleft2 Para</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft - 2 paragraphs
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT2_PARA_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_MAN_PAGES_COPYLEFT2_PARA(407, "LinuxManPagesCopyleft2Para", "Linux-man-pages-copyleft-2-para"),

	/**
	 * The '<em><b>Linux Man Pages Copyleft Var</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft Variant
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT_VAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_MAN_PAGES_COPYLEFT_VAR(408, "LinuxManPagesCopyleftVar", "Linux-man-pages-copyleft-var"),

	/**
	 * The '<em><b>Linux Open IB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Kernel Variant of OpenIB.org license
	 * <!-- end-model-doc -->
	 * @see #LINUX_OPEN_IB_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_OPEN_IB(409, "LinuxOpenIB", "Linux-OpenIB"),

	/**
	 * The '<em><b>LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Lisp LOOP License
	 * <!-- end-model-doc -->
	 * @see #LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP(410, "LOOP", "LOOP"),

	/**
	 * The '<em><b>LPD Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LPD Documentation License
	 * <!-- end-model-doc -->
	 * @see #LPD_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LPD_DOCUMENT(411, "LPDDocument", "LPD-document"),

	/**
	 * The '<em><b>LPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License Version 1.0
	 * <!-- end-model-doc -->
	 * @see #LPL10_VALUE
	 * @generated
	 * @ordered
	 */
	LPL10(412, "LPL10", "LPL-1.0"),

	/**
	 * The '<em><b>LPL102</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License v1.02
	 * <!-- end-model-doc -->
	 * @see #LPL102_VALUE
	 * @generated
	 * @ordered
	 */
	LPL102(413, "LPL102", "LPL-1.02"),

	/**
	 * The '<em><b>LPPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #LPPL10_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL10(414, "LPPL10", "LPPL-1.0"),

	/**
	 * The '<em><b>LPPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #LPPL11_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL11(415, "LPPL11", "LPPL-1.1"),

	/**
	 * The '<em><b>LPPL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #LPPL12_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL12(416, "LPPL12", "LPPL-1.2"),

	/**
	 * The '<em><b>LPPL1 3a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3a
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3A_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL1_3A(417, "LPPL13a", "LPPL-1.3a"),

	/**
	 * The '<em><b>LPPL1 3c</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3c
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3C_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL1_3C(418, "LPPL13c", "LPPL-1.3c"),

	/**
	 * The '<em><b>Lsof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lsof License
	 * <!-- end-model-doc -->
	 * @see #LSOF_VALUE
	 * @generated
	 * @ordered
	 */
	LSOF(419, "lsof", "lsof"),

	/**
	 * The '<em><b>Lucida Bitmap Fonts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucida Bitmap Fonts License
	 * <!-- end-model-doc -->
	 * @see #LUCIDA_BITMAP_FONTS_VALUE
	 * @generated
	 * @ordered
	 */
	LUCIDA_BITMAP_FONTS(420, "LucidaBitmapFonts", "Lucida-Bitmap-Fonts"),

	/**
	 * The '<em><b>LZMASDK911 To920</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA SDK License (versions 9.11 to 9.20)
	 * <!-- end-model-doc -->
	 * @see #LZMASDK911_TO920_VALUE
	 * @generated
	 * @ordered
	 */
	LZMASDK911_TO920(421, "LZMASDK911To920", "LZMA-SDK-9.11-to-9.20"),

	/**
	 * The '<em><b>LZMASDK922</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA SDK License (versions 9.22 and beyond)
	 * <!-- end-model-doc -->
	 * @see #LZMASDK922_VALUE
	 * @generated
	 * @ordered
	 */
	LZMASDK922(422, "LZMASDK922", "LZMA-SDK-9.22"),

	/**
	 * The '<em><b>Mackerras3 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mackerras 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #MACKERRAS3_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	MACKERRAS3_CLAUSE(423, "Mackerras3Clause", "Mackerras-3-Clause"),

	/**
	 * The '<em><b>Mackerras3 Clause Acknowledgment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mackerras 3-Clause - acknowledgment variant
	 * <!-- end-model-doc -->
	 * @see #MACKERRAS3_CLAUSE_ACKNOWLEDGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MACKERRAS3_CLAUSE_ACKNOWLEDGMENT(424, "Mackerras3ClauseAcknowledgment", "Mackerras-3-Clause-acknowledgment"),

	/**
	 * The '<em><b>Magaz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * magaz License
	 * <!-- end-model-doc -->
	 * @see #MAGAZ_VALUE
	 * @generated
	 * @ordered
	 */
	MAGAZ(425, "magaz", "magaz"),

	/**
	 * The '<em><b>Mailprio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mailprio License
	 * <!-- end-model-doc -->
	 * @see #MAILPRIO_VALUE
	 * @generated
	 * @ordered
	 */
	MAILPRIO(426, "mailprio", "mailprio"),

	/**
	 * The '<em><b>Make Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MakeIndex License
	 * <!-- end-model-doc -->
	 * @see #MAKE_INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE_INDEX(427, "MakeIndex", "MakeIndex"),

	/**
	 * The '<em><b>Man2html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * man2html License
	 * <!-- end-model-doc -->
	 * @see #MAN2HTML_VALUE
	 * @generated
	 * @ordered
	 */
	MAN2HTML(428, "man2html", "man2html"),

	/**
	 * The '<em><b>Martin Birgmeier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Martin Birgmeier License
	 * <!-- end-model-doc -->
	 * @see #MARTIN_BIRGMEIER_VALUE
	 * @generated
	 * @ordered
	 */
	MARTIN_BIRGMEIER(429, "MartinBirgmeier", "Martin-Birgmeier"),

	/**
	 * The '<em><b>Mc Phee Slideshow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * McPhee Slideshow License
	 * <!-- end-model-doc -->
	 * @see #MC_PHEE_SLIDESHOW_VALUE
	 * @generated
	 * @ordered
	 */
	MC_PHEE_SLIDESHOW(430, "McPheeSlideshow", "McPhee-slideshow"),

	/**
	 * The '<em><b>Metamail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * metamail License
	 * <!-- end-model-doc -->
	 * @see #METAMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	METAMAIL(431, "metamail", "metamail"),

	/**
	 * The '<em><b>Minpack</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minpack License
	 * <!-- end-model-doc -->
	 * @see #MINPACK_VALUE
	 * @generated
	 * @ordered
	 */
	MINPACK(432, "Minpack", "Minpack"),

	/**
	 * The '<em><b>MIPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIPS License
	 * <!-- end-model-doc -->
	 * @see #MIPS_VALUE
	 * @generated
	 * @ordered
	 */
	MIPS(433, "MIPS", "MIPS"),

	/**
	 * The '<em><b>Mir OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MirOS Licence
	 * <!-- end-model-doc -->
	 * @see #MIR_OS_VALUE
	 * @generated
	 * @ordered
	 */
	MIR_OS(434, "MirOS", "MirOS"),

	/**
	 * The '<em><b>MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License
	 * <!-- end-model-doc -->
	 * @see #MIT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT(435, "MIT", "MIT"),

	/**
	 * The '<em><b>MIT0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT No Attribution
	 * <!-- end-model-doc -->
	 * @see #MIT0_VALUE
	 * @generated
	 * @ordered
	 */
	MIT0(436, "MIT0", "MIT-0"),

	/**
	 * The '<em><b>MIT Advertising</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enlightenment License (e16)
	 * <!-- end-model-doc -->
	 * @see #MIT_ADVERTISING_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_ADVERTISING(437, "MITAdvertising", "MIT-advertising"),

	/**
	 * The '<em><b>MIT Click</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Click License
	 * <!-- end-model-doc -->
	 * @see #MIT_CLICK_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_CLICK(438, "MITClick", "MIT-Click"),

	/**
	 * The '<em><b>MITCMU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU License
	 * <!-- end-model-doc -->
	 * @see #MITCMU_VALUE
	 * @generated
	 * @ordered
	 */
	MITCMU(439, "MITCMU", "MIT-CMU"),

	/**
	 * The '<em><b>MIT Enna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enna License
	 * <!-- end-model-doc -->
	 * @see #MIT_ENNA_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_ENNA(440, "MITEnna", "MIT-enna"),

	/**
	 * The '<em><b>MIT Feh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * feh License
	 * <!-- end-model-doc -->
	 * @see #MIT_FEH_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_FEH(441, "MITFeh", "MIT-feh"),

	/**
	 * The '<em><b>MIT Festival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Festival Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_FESTIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_FESTIVAL(442, "MITFestival", "MIT-Festival"),

	/**
	 * The '<em><b>MIT Khronos Old</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Khronos - old variant
	 * <!-- end-model-doc -->
	 * @see #MIT_KHRONOS_OLD_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_KHRONOS_OLD(443, "MITKhronosOld", "MIT-Khronos-old"),

	/**
	 * The '<em><b>MIT Modern Variant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License Modern Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_MODERN_VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_MODERN_VARIANT(444, "MITModernVariant", "MIT-Modern-Variant"),

	/**
	 * The '<em><b>MIT Open Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Open Group variant
	 * <!-- end-model-doc -->
	 * @see #MIT_OPEN_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_OPEN_GROUP(445, "MITOpenGroup", "MIT-open-group"),

	/**
	 * The '<em><b>MIT Testregex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT testregex Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_TESTREGEX_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_TESTREGEX(446, "MITTestregex", "MIT-testregex"),

	/**
	 * The '<em><b>MIT Wu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Tom Wu Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_WU_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_WU(447, "MITWu", "MIT-Wu"),

	/**
	 * The '<em><b>MITNFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT +no-false-attribs license
	 * <!-- end-model-doc -->
	 * @see #MITNFA_VALUE
	 * @generated
	 * @ordered
	 */
	MITNFA(448, "MITNFA", "MITNFA"),

	/**
	 * The '<em><b>MMI Xware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MMIXware License
	 * <!-- end-model-doc -->
	 * @see #MMI_XWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MMI_XWARE(449, "MMIXware", "MMIXware"),

	/**
	 * The '<em><b>Motosoto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Motosoto License
	 * <!-- end-model-doc -->
	 * @see #MOTOSOTO_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOSOTO(450, "Motosoto", "Motosoto"),

	/**
	 * The '<em><b>MPEGSSG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MPEG Software Simulation
	 * <!-- end-model-doc -->
	 * @see #MPEGSSG_VALUE
	 * @generated
	 * @ordered
	 */
	MPEGSSG(451, "MPEGSSG", "MPEG-SSG"),

	/**
	 * The '<em><b>Mpi Permissive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpi Permissive License
	 * <!-- end-model-doc -->
	 * @see #MPI_PERMISSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MPI_PERMISSIVE(452, "mpiPermissive", "mpi-permissive"),

	/**
	 * The '<em><b>Mpich2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpich2 License
	 * <!-- end-model-doc -->
	 * @see #MPICH2_VALUE
	 * @generated
	 * @ordered
	 */
	MPICH2(453, "mpich2", "mpich2"),

	/**
	 * The '<em><b>MPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #MPL10_VALUE
	 * @generated
	 * @ordered
	 */
	MPL10(454, "MPL10", "MPL-1.0"),

	/**
	 * The '<em><b>MPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #MPL11_VALUE
	 * @generated
	 * @ordered
	 */
	MPL11(455, "MPL11", "MPL-1.1"),

	/**
	 * The '<em><b>MPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #MPL20_VALUE
	 * @generated
	 * @ordered
	 */
	MPL20(456, "MPL20", "MPL-2.0"),

	/**
	 * The '<em><b>MPL20 No Copyleft Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0 (no copyleft exception)
	 * <!-- end-model-doc -->
	 * @see #MPL20_NO_COPYLEFT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	MPL20_NO_COPYLEFT_EXCEPTION(457, "MPL20NoCopyleftException", "MPL-2.0-no-copyleft-exception"),

	/**
	 * The '<em><b>Mplus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mplus Font License
	 * <!-- end-model-doc -->
	 * @see #MPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	MPLUS(458, "mplus", "mplus"),

	/**
	 * The '<em><b>MSLPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Limited Public License
	 * <!-- end-model-doc -->
	 * @see #MSLPL_VALUE
	 * @generated
	 * @ordered
	 */
	MSLPL(459, "MSLPL", "MS-LPL"),

	/**
	 * The '<em><b>MSPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Public License
	 * <!-- end-model-doc -->
	 * @see #MSPL_VALUE
	 * @generated
	 * @ordered
	 */
	MSPL(460, "MSPL", "MS-PL"),

	/**
	 * The '<em><b>MSRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Reciprocal License
	 * <!-- end-model-doc -->
	 * @see #MSRL_VALUE
	 * @generated
	 * @ordered
	 */
	MSRL(461, "MSRL", "MS-RL"),

	/**
	 * The '<em><b>MTLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Matrix Template Library License
	 * <!-- end-model-doc -->
	 * @see #MTLL_VALUE
	 * @generated
	 * @ordered
	 */
	MTLL(462, "MTLL", "MTLL"),

	/**
	 * The '<em><b>Mulan PSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mulan Permissive Software License, Version 1
	 * <!-- end-model-doc -->
	 * @see #MULAN_PSL10_VALUE
	 * @generated
	 * @ordered
	 */
	MULAN_PSL10(463, "MulanPSL10", "MulanPSL-1.0"),

	/**
	 * The '<em><b>Mulan PSL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mulan Permissive Software License, Version 2
	 * <!-- end-model-doc -->
	 * @see #MULAN_PSL20_VALUE
	 * @generated
	 * @ordered
	 */
	MULAN_PSL20(464, "MulanPSL20", "MulanPSL-2.0"),

	/**
	 * The '<em><b>Multics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multics License
	 * <!-- end-model-doc -->
	 * @see #MULTICS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTICS(465, "Multics", "Multics"),

	/**
	 * The '<em><b>Mup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mup License
	 * <!-- end-model-doc -->
	 * @see #MUP_VALUE
	 * @generated
	 * @ordered
	 */
	MUP(466, "Mup", "Mup"),

	/**
	 * The '<em><b>NAIST2003</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nara Institute of Science and Technology License (2003)
	 * <!-- end-model-doc -->
	 * @see #NAIST2003_VALUE
	 * @generated
	 * @ordered
	 */
	NAIST2003(467, "NAIST2003", "NAIST-2003"),

	/**
	 * The '<em><b>NASA13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NASA Open Source Agreement 1.3
	 * <!-- end-model-doc -->
	 * @see #NASA13_VALUE
	 * @generated
	 * @ordered
	 */
	NASA13(468, "NASA13", "NASA-1.3"),

	/**
	 * The '<em><b>Naumen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Naumen Public License
	 * <!-- end-model-doc -->
	 * @see #NAUMEN_VALUE
	 * @generated
	 * @ordered
	 */
	NAUMEN(469, "Naumen", "Naumen"),

	/**
	 * The '<em><b>NBPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net Boolean Public License v1
	 * <!-- end-model-doc -->
	 * @see #NBPL10_VALUE
	 * @generated
	 * @ordered
	 */
	NBPL10(470, "NBPL10", "NBPL-1.0"),

	/**
	 * The '<em><b>NCBIPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NCBI Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NCBIPD_VALUE
	 * @generated
	 * @ordered
	 */
	NCBIPD(471, "NCBIPD", "NCBI-PD"),

	/**
	 * The '<em><b>NCGLUK20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Commercial Government Licence
	 * <!-- end-model-doc -->
	 * @see #NCGLUK20_VALUE
	 * @generated
	 * @ordered
	 */
	NCGLUK20(472, "NCGLUK20", "NCGL-UK-2.0"),

	/**
	 * The '<em><b>NCL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NCL Source Code License
	 * <!-- end-model-doc -->
	 * @see #NCL_VALUE
	 * @generated
	 * @ordered
	 */
	NCL(473, "NCL", "NCL"),

	/**
	 * The '<em><b>NCSA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * University of Illinois/NCSA Open Source License
	 * <!-- end-model-doc -->
	 * @see #NCSA_VALUE
	 * @generated
	 * @ordered
	 */
	NCSA(474, "NCSA", "NCSA"),

	/**
	 * The '<em><b>Net SNMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net-SNMP License
	 * <!-- end-model-doc -->
	 * @see #NET_SNMP_VALUE
	 * @generated
	 * @ordered
	 */
	NET_SNMP(475, "NetSNMP", "Net-SNMP"),

	/**
	 * The '<em><b>Net CDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NetCDF license
	 * <!-- end-model-doc -->
	 * @see #NET_CDF_VALUE
	 * @generated
	 * @ordered
	 */
	NET_CDF(476, "NetCDF", "NetCDF"),

	/**
	 * The '<em><b>Newsletr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Newsletr License
	 * <!-- end-model-doc -->
	 * @see #NEWSLETR_VALUE
	 * @generated
	 * @ordered
	 */
	NEWSLETR(477, "Newsletr", "Newsletr"),

	/**
	 * The '<em><b>NGPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nethack General Public License
	 * <!-- end-model-doc -->
	 * @see #NGPL_VALUE
	 * @generated
	 * @ordered
	 */
	NGPL(478, "NGPL", "NGPL"),

	/**
	 * The '<em><b>Ngrep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ngrep License
	 * <!-- end-model-doc -->
	 * @see #NGREP_VALUE
	 * @generated
	 * @ordered
	 */
	NGREP(479, "ngrep", "ngrep"),

	/**
	 * The '<em><b>NICTA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NICTA Public Software License, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #NICTA10_VALUE
	 * @generated
	 * @ordered
	 */
	NICTA10(480, "NICTA10", "NICTA-1.0"),

	/**
	 * The '<em><b>NISTPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NISTPD_VALUE
	 * @generated
	 * @ordered
	 */
	NISTPD(481, "NISTPD", "NIST-PD"),

	/**
	 * The '<em><b>NISTPD Fallback</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Public Domain Notice with license fallback
	 * <!-- end-model-doc -->
	 * @see #NISTPD_FALLBACK_VALUE
	 * @generated
	 * @ordered
	 */
	NISTPD_FALLBACK(482, "NISTPDFallback", "NIST-PD-fallback"),

	/**
	 * The '<em><b>NIST Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Software License
	 * <!-- end-model-doc -->
	 * @see #NIST_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	NIST_SOFTWARE(483, "NISTSoftware", "NIST-Software"),

	/**
	 * The '<em><b>NLOD10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data (NLOD) 1.0
	 * <!-- end-model-doc -->
	 * @see #NLOD10_VALUE
	 * @generated
	 * @ordered
	 */
	NLOD10(484, "NLOD10", "NLOD-1.0"),

	/**
	 * The '<em><b>NLOD20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data (NLOD) 2.0
	 * <!-- end-model-doc -->
	 * @see #NLOD20_VALUE
	 * @generated
	 * @ordered
	 */
	NLOD20(485, "NLOD20", "NLOD-2.0"),

	/**
	 * The '<em><b>NLPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Limit Public License
	 * <!-- end-model-doc -->
	 * @see #NLPL_VALUE
	 * @generated
	 * @ordered
	 */
	NLPL(486, "NLPL", "NLPL"),

	/**
	 * The '<em><b>Nokia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOKIA_VALUE
	 * @generated
	 * @ordered
	 */
	NOKIA(487, "Nokia", "Nokia"),

	/**
	 * The '<em><b>NOSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netizen Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOSL_VALUE
	 * @generated
	 * @ordered
	 */
	NOSL(488, "NOSL", "NOSL"),

	/**
	 * The '<em><b>Noweb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noweb License
	 * <!-- end-model-doc -->
	 * @see #NOWEB_VALUE
	 * @generated
	 * @ordered
	 */
	NOWEB(489, "Noweb", "Noweb"),

	/**
	 * The '<em><b>NPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #NPL10_VALUE
	 * @generated
	 * @ordered
	 */
	NPL10(490, "NPL10", "NPL-1.0"),

	/**
	 * The '<em><b>NPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #NPL11_VALUE
	 * @generated
	 * @ordered
	 */
	NPL11(491, "NPL11", "NPL-1.1"),

	/**
	 * The '<em><b>NPOSL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Profit Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #NPOSL30_VALUE
	 * @generated
	 * @ordered
	 */
	NPOSL30(492, "NPOSL30", "NPOSL-3.0"),

	/**
	 * The '<em><b>NRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NRL License
	 * <!-- end-model-doc -->
	 * @see #NRL_VALUE
	 * @generated
	 * @ordered
	 */
	NRL(493, "NRL", "NRL"),

	/**
	 * The '<em><b>NTIAPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTIA Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NTIAPD_VALUE
	 * @generated
	 * @ordered
	 */
	NTIAPD(494, "NTIAPD", "NTIA-PD"),

	/**
	 * The '<em><b>NTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP License
	 * <!-- end-model-doc -->
	 * @see #NTP_VALUE
	 * @generated
	 * @ordered
	 */
	NTP(495, "NTP", "NTP"),

	/**
	 * The '<em><b>NTP0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP No Attribution
	 * <!-- end-model-doc -->
	 * @see #NTP0_VALUE
	 * @generated
	 * @ordered
	 */
	NTP0(496, "NTP0", "NTP-0"),

	/**
	 * The '<em><b>Nunit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nunit License
	 * <!-- end-model-doc -->
	 * @see #NUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	NUNIT(497, "Nunit", "Nunit"),

	/**
	 * The '<em><b>OUDA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Use of Data Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #OUDA10_VALUE
	 * @generated
	 * @ordered
	 */
	OUDA10(498, "OUDA10", "O-UDA-1.0"),

	/**
	 * The '<em><b>OAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAR License
	 * <!-- end-model-doc -->
	 * @see #OAR_VALUE
	 * @generated
	 * @ordered
	 */
	OAR(499, "OAR", "OAR"),

	/**
	 * The '<em><b>OCCTPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Technology Public License
	 * <!-- end-model-doc -->
	 * @see #OCCTPL_VALUE
	 * @generated
	 * @ordered
	 */
	OCCTPL(500, "OCCTPL", "OCCT-PL"),

	/**
	 * The '<em><b>OCLC20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCLC Research Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #OCLC20_VALUE
	 * @generated
	 * @ordered
	 */
	OCLC20(501, "OCLC20", "OCLC-2.0"),

	/**
	 * The '<em><b>ODb L10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Open Database License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODB_L10_VALUE
	 * @generated
	 * @ordered
	 */
	ODB_L10(502, "ODbL10", "ODbL-1.0"),

	/**
	 * The '<em><b>ODC By10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Attribution License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODC_BY10_VALUE
	 * @generated
	 * @ordered
	 */
	ODC_BY10(503, "ODCBy10", "ODC-By-1.0"),

	/**
	 * The '<em><b>OFFIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OFFIS License
	 * <!-- end-model-doc -->
	 * @see #OFFIS_VALUE
	 * @generated
	 * @ordered
	 */
	OFFIS(504, "OFFIS", "OFFIS"),

	/**
	 * The '<em><b>OFL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0
	 * <!-- end-model-doc -->
	 * @see #OFL10_VALUE
	 * @generated
	 * @ordered
	 */
	OFL10(505, "OFL10", "OFL-1.0"),

	/**
	 * The '<em><b>OFL10 No RFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0 with no Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL10_NO_RFN_VALUE
	 * @generated
	 * @ordered
	 */
	OFL10_NO_RFN(506, "OFL10NoRFN", "OFL-1.0-no-RFN"),

	/**
	 * The '<em><b>OFL10RFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0 with Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL10RFN_VALUE
	 * @generated
	 * @ordered
	 */
	OFL10RFN(507, "OFL10RFN", "OFL-1.0-RFN"),

	/**
	 * The '<em><b>OFL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1
	 * <!-- end-model-doc -->
	 * @see #OFL11_VALUE
	 * @generated
	 * @ordered
	 */
	OFL11(508, "OFL11", "OFL-1.1"),

	/**
	 * The '<em><b>OFL11 No RFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1 with no Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL11_NO_RFN_VALUE
	 * @generated
	 * @ordered
	 */
	OFL11_NO_RFN(509, "OFL11NoRFN", "OFL-1.1-no-RFN"),

	/**
	 * The '<em><b>OFL11RFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1 with Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL11RFN_VALUE
	 * @generated
	 * @ordered
	 */
	OFL11RFN(510, "OFL11RFN", "OFL-1.1-RFN"),

	/**
	 * The '<em><b>OGC10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OGC Software License, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #OGC10_VALUE
	 * @generated
	 * @ordered
	 */
	OGC10(511, "OGC10", "OGC-1.0"),

	/**
	 * The '<em><b>OGDL Taiwan10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Taiwan Open Government Data License, version 1.0
	 * <!-- end-model-doc -->
	 * @see #OGDL_TAIWAN10_VALUE
	 * @generated
	 * @ordered
	 */
	OGDL_TAIWAN10(512, "OGDLTaiwan10", "OGDL-Taiwan-1.0"),

	/**
	 * The '<em><b>OGL Canada20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence - Canada
	 * <!-- end-model-doc -->
	 * @see #OGL_CANADA20_VALUE
	 * @generated
	 * @ordered
	 */
	OGL_CANADA20(513, "OGLCanada20", "OGL-Canada-2.0"),

	/**
	 * The '<em><b>OGLUK10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v1.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK10_VALUE
	 * @generated
	 * @ordered
	 */
	OGLUK10(514, "OGLUK10", "OGL-UK-1.0"),

	/**
	 * The '<em><b>OGLUK20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v2.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK20_VALUE
	 * @generated
	 * @ordered
	 */
	OGLUK20(515, "OGLUK20", "OGL-UK-2.0"),

	/**
	 * The '<em><b>OGLUK30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v3.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK30_VALUE
	 * @generated
	 * @ordered
	 */
	OGLUK30(516, "OGLUK30", "OGL-UK-3.0"),

	/**
	 * The '<em><b>OGTSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Group Test Suite License
	 * <!-- end-model-doc -->
	 * @see #OGTSL_VALUE
	 * @generated
	 * @ordered
	 */
	OGTSL(517, "OGTSL", "OGTSL"),

	/**
	 * The '<em><b>OLDAP11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP11_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP11(518, "OLDAP11", "OLDAP-1.1"),

	/**
	 * The '<em><b>OLDAP12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP12_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP12(519, "OLDAP12", "OLDAP-1.2"),

	/**
	 * The '<em><b>OLDAP13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP13_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP13(520, "OLDAP13", "OLDAP-1.3"),

	/**
	 * The '<em><b>OLDAP14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP14_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP14(521, "OLDAP14", "OLDAP-1.4"),

	/**
	 * The '<em><b>OLDAP20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)
	 * <!-- end-model-doc -->
	 * @see #OLDAP20_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP20(522, "OLDAP20", "OLDAP-2.0"),

	/**
	 * The '<em><b>OLDAP201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP201_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP201(523, "OLDAP201", "OLDAP-2.0.1"),

	/**
	 * The '<em><b>OLDAP21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP21_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP21(524, "OLDAP21", "OLDAP-2.1"),

	/**
	 * The '<em><b>OLDAP22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP22_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP22(525, "OLDAP22", "OLDAP-2.2"),

	/**
	 * The '<em><b>OLDAP221</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP221_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP221(526, "OLDAP221", "OLDAP-2.2.1"),

	/**
	 * The '<em><b>OLDAP222</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License 2.2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP222_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP222(527, "OLDAP222", "OLDAP-2.2.2"),

	/**
	 * The '<em><b>OLDAP23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP23_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP23(528, "OLDAP23", "OLDAP-2.3"),

	/**
	 * The '<em><b>OLDAP24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP24_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP24(529, "OLDAP24", "OLDAP-2.4"),

	/**
	 * The '<em><b>OLDAP25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.5
	 * <!-- end-model-doc -->
	 * @see #OLDAP25_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP25(530, "OLDAP25", "OLDAP-2.5"),

	/**
	 * The '<em><b>OLDAP26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.6
	 * <!-- end-model-doc -->
	 * @see #OLDAP26_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP26(531, "OLDAP26", "OLDAP-2.6"),

	/**
	 * The '<em><b>OLDAP27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.7
	 * <!-- end-model-doc -->
	 * @see #OLDAP27_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP27(532, "OLDAP27", "OLDAP-2.7"),

	/**
	 * The '<em><b>OLDAP28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.8
	 * <!-- end-model-doc -->
	 * @see #OLDAP28_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP28(533, "OLDAP28", "OLDAP-2.8"),

	/**
	 * The '<em><b>OLFL13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Logistics Foundation License Version 1.3
	 * <!-- end-model-doc -->
	 * @see #OLFL13_VALUE
	 * @generated
	 * @ordered
	 */
	OLFL13(534, "OLFL13", "OLFL-1.3"),

	/**
	 * The '<em><b>OML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Market License
	 * <!-- end-model-doc -->
	 * @see #OML_VALUE
	 * @generated
	 * @ordered
	 */
	OML(535, "OML", "OML"),

	/**
	 * The '<em><b>Open PBS23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenPBS v2.3 Software License
	 * <!-- end-model-doc -->
	 * @see #OPEN_PBS23_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_PBS23(536, "OpenPBS23", "OpenPBS-2.3"),

	/**
	 * The '<em><b>Open SSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SSL(537, "OpenSSL", "OpenSSL"),

	/**
	 * The '<em><b>Open SSL Standalone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License - standalone
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL_STANDALONE_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SSL_STANDALONE(538, "OpenSSLStandalone", "OpenSSL-standalone"),

	/**
	 * The '<em><b>Open Vision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenVision License
	 * <!-- end-model-doc -->
	 * @see #OPEN_VISION_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_VISION(539, "OpenVision", "OpenVision"),

	/**
	 * The '<em><b>OPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPL10_VALUE
	 * @generated
	 * @ordered
	 */
	OPL10(540, "OPL10", "OPL-1.0"),

	/**
	 * The '<em><b>OPLUK30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * United    Kingdom Open Parliament Licence v3.0
	 * <!-- end-model-doc -->
	 * @see #OPLUK30_VALUE
	 * @generated
	 * @ordered
	 */
	OPLUK30(541, "OPLUK30", "OPL-UK-3.0"),

	/**
	 * The '<em><b>OPUBL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Publication License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPUBL10_VALUE
	 * @generated
	 * @ordered
	 */
	OPUBL10(542, "OPUBL10", "OPUBL-1.0"),

	/**
	 * The '<em><b>OSETPL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OSET Public License version 2.1
	 * <!-- end-model-doc -->
	 * @see #OSETPL21_VALUE
	 * @generated
	 * @ordered
	 */
	OSETPL21(543, "OSETPL21", "OSET-PL-2.1"),

	/**
	 * The '<em><b>OSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #OSL10_VALUE
	 * @generated
	 * @ordered
	 */
	OSL10(544, "OSL10", "OSL-1.0"),

	/**
	 * The '<em><b>OSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.1
	 * <!-- end-model-doc -->
	 * @see #OSL11_VALUE
	 * @generated
	 * @ordered
	 */
	OSL11(545, "OSL11", "OSL-1.1"),

	/**
	 * The '<em><b>OSL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.0
	 * <!-- end-model-doc -->
	 * @see #OSL20_VALUE
	 * @generated
	 * @ordered
	 */
	OSL20(546, "OSL20", "OSL-2.0"),

	/**
	 * The '<em><b>OSL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.1
	 * <!-- end-model-doc -->
	 * @see #OSL21_VALUE
	 * @generated
	 * @ordered
	 */
	OSL21(547, "OSL21", "OSL-2.1"),

	/**
	 * The '<em><b>OSL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #OSL30_VALUE
	 * @generated
	 * @ordered
	 */
	OSL30(548, "OSL30", "OSL-3.0"),

	/**
	 * The '<em><b>PADL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PADL License
	 * <!-- end-model-doc -->
	 * @see #PADL_VALUE
	 * @generated
	 * @ordered
	 */
	PADL(549, "PADL", "PADL"),

	/**
	 * The '<em><b>Parity600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parity Public License 6.0.0
	 * <!-- end-model-doc -->
	 * @see #PARITY600_VALUE
	 * @generated
	 * @ordered
	 */
	PARITY600(550, "Parity600", "Parity-6.0.0"),

	/**
	 * The '<em><b>Parity700</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parity Public License 7.0.0
	 * <!-- end-model-doc -->
	 * @see #PARITY700_VALUE
	 * @generated
	 * @ordered
	 */
	PARITY700(551, "Parity700", "Parity-7.0.0"),

	/**
	 * The '<em><b>PDDL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Public Domain Dedication & License 1.0
	 * <!-- end-model-doc -->
	 * @see #PDDL10_VALUE
	 * @generated
	 * @ordered
	 */
	PDDL10(552, "PDDL10", "PDDL-1.0"),

	/**
	 * The '<em><b>PHP30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.0
	 * <!-- end-model-doc -->
	 * @see #PHP30_VALUE
	 * @generated
	 * @ordered
	 */
	PHP30(553, "PHP30", "PHP-3.0"),

	/**
	 * The '<em><b>PHP301</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.01
	 * <!-- end-model-doc -->
	 * @see #PHP301_VALUE
	 * @generated
	 * @ordered
	 */
	PHP301(554, "PHP301", "PHP-3.01"),

	/**
	 * The '<em><b>Pixar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pixar License
	 * <!-- end-model-doc -->
	 * @see #PIXAR_VALUE
	 * @generated
	 * @ordered
	 */
	PIXAR(555, "Pixar", "Pixar"),

	/**
	 * The '<em><b>Pkgconf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pkgconf License
	 * <!-- end-model-doc -->
	 * @see #PKGCONF_VALUE
	 * @generated
	 * @ordered
	 */
	PKGCONF(556, "pkgconf", "pkgconf"),

	/**
	 * The '<em><b>Plexus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plexus Classworlds License
	 * <!-- end-model-doc -->
	 * @see #PLEXUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLEXUS(557, "Plexus", "Plexus"),

	/**
	 * The '<em><b>Pnmstitch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pnmstitch License
	 * <!-- end-model-doc -->
	 * @see #PNMSTITCH_VALUE
	 * @generated
	 * @ordered
	 */
	PNMSTITCH(558, "pnmstitch", "pnmstitch"),

	/**
	 * The '<em><b>Poly Form Noncommercial100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolyForm Noncommercial License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #POLY_FORM_NONCOMMERCIAL100_VALUE
	 * @generated
	 * @ordered
	 */
	POLY_FORM_NONCOMMERCIAL100(559, "PolyFormNoncommercial100", "PolyForm-Noncommercial-1.0.0"),

	/**
	 * The '<em><b>Poly Form Small Business100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolyForm Small Business License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #POLY_FORM_SMALL_BUSINESS100_VALUE
	 * @generated
	 * @ordered
	 */
	POLY_FORM_SMALL_BUSINESS100(560, "PolyFormSmallBusiness100", "PolyForm-Small-Business-1.0.0"),

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostgreSQL License
	 * <!-- end-model-doc -->
	 * @see #POSTGRE_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRE_SQL(561, "PostgreSQL", "PostgreSQL"),

	/**
	 * The '<em><b>PPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peer Production License
	 * <!-- end-model-doc -->
	 * @see #PPL_VALUE
	 * @generated
	 * @ordered
	 */
	PPL(562, "PPL", "PPL"),

	/**
	 * The '<em><b>PSF20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python Software Foundation License 2.0
	 * <!-- end-model-doc -->
	 * @see #PSF20_VALUE
	 * @generated
	 * @ordered
	 */
	PSF20(563, "PSF20", "PSF-2.0"),

	/**
	 * The '<em><b>Psfrag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psfrag License
	 * <!-- end-model-doc -->
	 * @see #PSFRAG_VALUE
	 * @generated
	 * @ordered
	 */
	PSFRAG(564, "psfrag", "psfrag"),

	/**
	 * The '<em><b>Psutils</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psutils License
	 * <!-- end-model-doc -->
	 * @see #PSUTILS_VALUE
	 * @generated
	 * @ordered
	 */
	PSUTILS(565, "psutils", "psutils"),

	/**
	 * The '<em><b>Python20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0
	 * <!-- end-model-doc -->
	 * @see #PYTHON20_VALUE
	 * @generated
	 * @ordered
	 */
	PYTHON20(566, "Python20", "Python-2.0"),

	/**
	 * The '<em><b>Python201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0.1
	 * <!-- end-model-doc -->
	 * @see #PYTHON201_VALUE
	 * @generated
	 * @ordered
	 */
	PYTHON201(567, "Python201", "Python-2.0.1"),

	/**
	 * The '<em><b>Python Ldap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python ldap License
	 * <!-- end-model-doc -->
	 * @see #PYTHON_LDAP_VALUE
	 * @generated
	 * @ordered
	 */
	PYTHON_LDAP(568, "pythonLdap", "python-ldap"),

	/**
	 * The '<em><b>Qhull</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qhull License
	 * <!-- end-model-doc -->
	 * @see #QHULL_VALUE
	 * @generated
	 * @ordered
	 */
	QHULL(569, "Qhull", "Qhull"),

	/**
	 * The '<em><b>QPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #QPL10_VALUE
	 * @generated
	 * @ordered
	 */
	QPL10(570, "QPL10", "QPL-1.0"),

	/**
	 * The '<em><b>QPL10INRIA2004</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0 - INRIA 2004 variant
	 * <!-- end-model-doc -->
	 * @see #QPL10INRIA2004_VALUE
	 * @generated
	 * @ordered
	 */
	QPL10INRIA2004(571, "QPL10INRIA2004", "QPL-1.0-INRIA-2004"),

	/**
	 * The '<em><b>Radvd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * radvd License
	 * <!-- end-model-doc -->
	 * @see #RADVD_VALUE
	 * @generated
	 * @ordered
	 */
	RADVD(572, "radvd", "radvd"),

	/**
	 * The '<em><b>Rdisc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rdisc License
	 * <!-- end-model-doc -->
	 * @see #RDISC_VALUE
	 * @generated
	 * @ordered
	 */
	RDISC(573, "Rdisc", "Rdisc"),

	/**
	 * The '<em><b>RHe Cos11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Red Hat eCos Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #RHE_COS11_VALUE
	 * @generated
	 * @ordered
	 */
	RHE_COS11(574, "RHeCos11", "RHeCos-1.1"),

	/**
	 * The '<em><b>RPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #RPL11_VALUE
	 * @generated
	 * @ordered
	 */
	RPL11(575, "RPL11", "RPL-1.1"),

	/**
	 * The '<em><b>RPL15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.5
	 * <!-- end-model-doc -->
	 * @see #RPL15_VALUE
	 * @generated
	 * @ordered
	 */
	RPL15(576, "RPL15", "RPL-1.5"),

	/**
	 * The '<em><b>RPSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RealNetworks Public Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #RPSL10_VALUE
	 * @generated
	 * @ordered
	 */
	RPSL10(577, "RPSL10", "RPSL-1.0"),

	/**
	 * The '<em><b>RSAMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RSA Message-Digest License
	 * <!-- end-model-doc -->
	 * @see #RSAMD_VALUE
	 * @generated
	 * @ordered
	 */
	RSAMD(578, "RSAMD", "RSA-MD"),

	/**
	 * The '<em><b>RSCPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ricoh Source Code Public License
	 * <!-- end-model-doc -->
	 * @see #RSCPL_VALUE
	 * @generated
	 * @ordered
	 */
	RSCPL(579, "RSCPL", "RSCPL"),

	/**
	 * The '<em><b>Ruby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby License
	 * <!-- end-model-doc -->
	 * @see #RUBY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY(580, "Ruby", "Ruby"),

	/**
	 * The '<em><b>Ruby Pty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby pty extension license
	 * <!-- end-model-doc -->
	 * @see #RUBY_PTY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY_PTY(581, "RubyPty", "Ruby-pty"),

	/**
	 * The '<em><b>SAXPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #SAXPD_VALUE
	 * @generated
	 * @ordered
	 */
	SAXPD(582, "SAXPD", "SAX-PD"),

	/**
	 * The '<em><b>SAXPD20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice 2.0
	 * <!-- end-model-doc -->
	 * @see #SAXPD20_VALUE
	 * @generated
	 * @ordered
	 */
	SAXPD20(583, "SAXPD20", "SAX-PD-2.0"),

	/**
	 * The '<em><b>Saxpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saxpath License
	 * <!-- end-model-doc -->
	 * @see #SAXPATH_VALUE
	 * @generated
	 * @ordered
	 */
	SAXPATH(584, "Saxpath", "Saxpath"),

	/**
	 * The '<em><b>SCEA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SCEA Shared Source License
	 * <!-- end-model-doc -->
	 * @see #SCEA_VALUE
	 * @generated
	 * @ordered
	 */
	SCEA(585, "SCEA", "SCEA"),

	/**
	 * The '<em><b>Scheme Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Language Report License
	 * <!-- end-model-doc -->
	 * @see #SCHEME_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEME_REPORT(586, "SchemeReport", "SchemeReport"),

	/**
	 * The '<em><b>Sendmail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	SENDMAIL(587, "Sendmail", "Sendmail"),

	/**
	 * The '<em><b>Sendmail823</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License 8.23
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL823_VALUE
	 * @generated
	 * @ordered
	 */
	SENDMAIL823(588, "Sendmail823", "Sendmail-8.23"),

	/**
	 * The '<em><b>Sendmail Open Source11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL_OPEN_SOURCE11_VALUE
	 * @generated
	 * @ordered
	 */
	SENDMAIL_OPEN_SOURCE11(589, "SendmailOpenSource11", "Sendmail-Open-Source-1.1"),

	/**
	 * The '<em><b>SGIB10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.0
	 * <!-- end-model-doc -->
	 * @see #SGIB10_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB10(590, "SGIB10", "SGI-B-1.0"),

	/**
	 * The '<em><b>SGIB11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.1
	 * <!-- end-model-doc -->
	 * @see #SGIB11_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB11(591, "SGIB11", "SGI-B-1.1"),

	/**
	 * The '<em><b>SGIB20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v2.0
	 * <!-- end-model-doc -->
	 * @see #SGIB20_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB20(592, "SGIB20", "SGI-B-2.0"),

	/**
	 * The '<em><b>SGI Open GL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI OpenGL License
	 * <!-- end-model-doc -->
	 * @see #SGI_OPEN_GL_VALUE
	 * @generated
	 * @ordered
	 */
	SGI_OPEN_GL(593, "SGIOpenGL", "SGI-OpenGL"),

	/**
	 * The '<em><b>SGP4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGP4 Permission Notice
	 * <!-- end-model-doc -->
	 * @see #SGP4_VALUE
	 * @generated
	 * @ordered
	 */
	SGP4(594, "SGP4", "SGP4"),

	/**
	 * The '<em><b>SHL05</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v0.5
	 * <!-- end-model-doc -->
	 * @see #SHL05_VALUE
	 * @generated
	 * @ordered
	 */
	SHL05(595, "SHL05", "SHL-0.5"),

	/**
	 * The '<em><b>SHL051</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License, Version 0.51
	 * <!-- end-model-doc -->
	 * @see #SHL051_VALUE
	 * @generated
	 * @ordered
	 */
	SHL051(596, "SHL051", "SHL-0.51"),

	/**
	 * The '<em><b>Sim PL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #SIM_PL20_VALUE
	 * @generated
	 * @ordered
	 */
	SIM_PL20(597, "SimPL20", "SimPL-2.0"),

	/**
	 * The '<em><b>SISSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SISSL_VALUE
	 * @generated
	 * @ordered
	 */
	SISSL(598, "SISSL", "SISSL"),

	/**
	 * The '<em><b>SISSL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.2
	 * <!-- end-model-doc -->
	 * @see #SISSL12_VALUE
	 * @generated
	 * @ordered
	 */
	SISSL12(599, "SISSL12", "SISSL-1.2"),

	/**
	 * The '<em><b>SL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SL License
	 * <!-- end-model-doc -->
	 * @see #SL_VALUE
	 * @generated
	 * @ordered
	 */
	SL(600, "SL", "SL"),

	/**
	 * The '<em><b>Sleepycat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sleepycat License
	 * <!-- end-model-doc -->
	 * @see #SLEEPYCAT_VALUE
	 * @generated
	 * @ordered
	 */
	SLEEPYCAT(601, "Sleepycat", "Sleepycat"),

	/**
	 * The '<em><b>SMAILGPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMAIL General Public License
	 * <!-- end-model-doc -->
	 * @see #SMAILGPL_VALUE
	 * @generated
	 * @ordered
	 */
	SMAILGPL(602, "SMAILGPL", "SMAIL-GPL"),

	/**
	 * The '<em><b>SMLNJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #SMLNJ_VALUE
	 * @generated
	 * @ordered
	 */
	SMLNJ(603, "SMLNJ", "SMLNJ"),

	/**
	 * The '<em><b>SMPPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Messaging Protocol Public License
	 * <!-- end-model-doc -->
	 * @see #SMPPL_VALUE
	 * @generated
	 * @ordered
	 */
	SMPPL(604, "SMPPL", "SMPPL"),

	/**
	 * The '<em><b>SNIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SNIA Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #SNIA_VALUE
	 * @generated
	 * @ordered
	 */
	SNIA(605, "SNIA", "SNIA"),

	/**
	 * The '<em><b>Snprintf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * snprintf License
	 * <!-- end-model-doc -->
	 * @see #SNPRINTF_VALUE
	 * @generated
	 * @ordered
	 */
	SNPRINTF(606, "snprintf", "snprintf"),

	/**
	 * The '<em><b>SOFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOFA Software License
	 * <!-- end-model-doc -->
	 * @see #SOFA_VALUE
	 * @generated
	 * @ordered
	 */
	SOFA(607, "SOFA", "SOFA"),

	/**
	 * The '<em><b>Soft Surfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * softSurfer License
	 * <!-- end-model-doc -->
	 * @see #SOFT_SURFER_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_SURFER(608, "softSurfer", "softSurfer"),

	/**
	 * The '<em><b>Soundex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soundex License
	 * <!-- end-model-doc -->
	 * @see #SOUNDEX_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDEX(609, "Soundex", "Soundex"),

	/**
	 * The '<em><b>Spencer86</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 86
	 * <!-- end-model-doc -->
	 * @see #SPENCER86_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER86(610, "Spencer86", "Spencer-86"),

	/**
	 * The '<em><b>Spencer94</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 94
	 * <!-- end-model-doc -->
	 * @see #SPENCER94_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER94(611, "Spencer94", "Spencer-94"),

	/**
	 * The '<em><b>Spencer99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 99
	 * <!-- end-model-doc -->
	 * @see #SPENCER99_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER99(612, "Spencer99", "Spencer-99"),

	/**
	 * The '<em><b>SPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #SPL10_VALUE
	 * @generated
	 * @ordered
	 */
	SPL10(613, "SPL10", "SPL-1.0"),

	/**
	 * The '<em><b>Ssh Keyscan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ssh-keyscan License
	 * <!-- end-model-doc -->
	 * @see #SSH_KEYSCAN_VALUE
	 * @generated
	 * @ordered
	 */
	SSH_KEYSCAN(614, "sshKeyscan", "ssh-keyscan"),

	/**
	 * The '<em><b>SSH Open SSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSH OpenSSH license
	 * <!-- end-model-doc -->
	 * @see #SSH_OPEN_SSH_VALUE
	 * @generated
	 * @ordered
	 */
	SSH_OPEN_SSH(615, "SSHOpenSSH", "SSH-OpenSSH"),

	/**
	 * The '<em><b>SSH Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSH short notice
	 * <!-- end-model-doc -->
	 * @see #SSH_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SSH_SHORT(616, "SSHShort", "SSH-short"),

	/**
	 * The '<em><b>SS Leay Standalone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSLeay License - standalone
	 * <!-- end-model-doc -->
	 * @see #SS_LEAY_STANDALONE_VALUE
	 * @generated
	 * @ordered
	 */
	SS_LEAY_STANDALONE(617, "SSLeayStandalone", "SSLeay-standalone"),

	/**
	 * The '<em><b>SSPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Server Side Public License, v 1
	 * <!-- end-model-doc -->
	 * @see #SSPL10_VALUE
	 * @generated
	 * @ordered
	 */
	SSPL10(618, "SSPL10", "SSPL-1.0"),

	/**
	 * The '<em><b>Standard MLNJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #STANDARD_MLNJ_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_MLNJ(619, "StandardMLNJ", "StandardML-NJ"),

	/**
	 * The '<em><b>Sugar CRM113</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SugarCRM Public License v1.1.3
	 * <!-- end-model-doc -->
	 * @see #SUGAR_CRM113_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR_CRM113(620, "SugarCRM113", "SugarCRM-1.1.3"),

	/**
	 * The '<em><b>SUL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sustainable Use License v1.0
	 * <!-- end-model-doc -->
	 * @see #SUL10_VALUE
	 * @generated
	 * @ordered
	 */
	SUL10(621, "SUL10", "SUL-1.0"),

	/**
	 * The '<em><b>Sun PPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun PPP License
	 * <!-- end-model-doc -->
	 * @see #SUN_PPP_VALUE
	 * @generated
	 * @ordered
	 */
	SUN_PPP(622, "SunPPP", "Sun-PPP"),

	/**
	 * The '<em><b>Sun PPP2000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun PPP License (2000)
	 * <!-- end-model-doc -->
	 * @see #SUN_PPP2000_VALUE
	 * @generated
	 * @ordered
	 */
	SUN_PPP2000(623, "SunPPP2000", "Sun-PPP-2000"),

	/**
	 * The '<em><b>Sun Pro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SunPro License
	 * <!-- end-model-doc -->
	 * @see #SUN_PRO_VALUE
	 * @generated
	 * @ordered
	 */
	SUN_PRO(624, "SunPro", "SunPro"),

	/**
	 * The '<em><b>SWL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Widget Library (SWL) Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #SWL_VALUE
	 * @generated
	 * @ordered
	 */
	SWL(625, "SWL", "SWL"),

	/**
	 * The '<em><b>Swrule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * swrule License
	 * <!-- end-model-doc -->
	 * @see #SWRULE_VALUE
	 * @generated
	 * @ordered
	 */
	SWRULE(626, "swrule", "swrule"),

	/**
	 * The '<em><b>Symlinks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symlinks License
	 * <!-- end-model-doc -->
	 * @see #SYMLINKS_VALUE
	 * @generated
	 * @ordered
	 */
	SYMLINKS(627, "Symlinks", "Symlinks"),

	/**
	 * The '<em><b>TAPROHL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TAPR Open Hardware License v1.0
	 * <!-- end-model-doc -->
	 * @see #TAPROHL10_VALUE
	 * @generated
	 * @ordered
	 */
	TAPROHL10(628, "TAPROHL10", "TAPR-OHL-1.0"),

	/**
	 * The '<em><b>TCL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCL/TK License
	 * <!-- end-model-doc -->
	 * @see #TCL_VALUE
	 * @generated
	 * @ordered
	 */
	TCL(629, "TCL", "TCL"),

	/**
	 * The '<em><b>TCP Wrappers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCP Wrappers License
	 * <!-- end-model-doc -->
	 * @see #TCP_WRAPPERS_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_WRAPPERS(630, "TCPWrappers", "TCP-wrappers"),

	/**
	 * The '<em><b>Term Read Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TermReadKey License
	 * <!-- end-model-doc -->
	 * @see #TERM_READ_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	TERM_READ_KEY(631, "TermReadKey", "TermReadKey"),

	/**
	 * The '<em><b>TGPPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive Grace Period Public Licence 1.0
	 * <!-- end-model-doc -->
	 * @see #TGPPL10_VALUE
	 * @generated
	 * @ordered
	 */
	TGPPL10(632, "TGPPL10", "TGPPL-1.0"),

	/**
	 * The '<em><b>Third Eye</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ThirdEye License
	 * <!-- end-model-doc -->
	 * @see #THIRD_EYE_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_EYE(633, "ThirdEye", "ThirdEye"),

	/**
	 * The '<em><b>Threeparttable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * threeparttable License
	 * <!-- end-model-doc -->
	 * @see #THREEPARTTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	THREEPARTTABLE(634, "threeparttable", "threeparttable"),

	/**
	 * The '<em><b>TMate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TMate Open Source License
	 * <!-- end-model-doc -->
	 * @see #TMATE_VALUE
	 * @generated
	 * @ordered
	 */
	TMATE(635, "TMate", "TMate"),

	/**
	 * The '<em><b>TORQUE11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TORQUE v2.5+ Software License v1.1
	 * <!-- end-model-doc -->
	 * @see #TORQUE11_VALUE
	 * @generated
	 * @ordered
	 */
	TORQUE11(636, "TORQUE11", "TORQUE-1.1"),

	/**
	 * The '<em><b>TOSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trusster Open Source License
	 * <!-- end-model-doc -->
	 * @see #TOSL_VALUE
	 * @generated
	 * @ordered
	 */
	TOSL(637, "TOSL", "TOSL"),

	/**
	 * The '<em><b>TPDL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time::ParseDate License
	 * <!-- end-model-doc -->
	 * @see #TPDL_VALUE
	 * @generated
	 * @ordered
	 */
	TPDL(638, "TPDL", "TPDL"),

	/**
	 * The '<em><b>TPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * THOR Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #TPL10_VALUE
	 * @generated
	 * @ordered
	 */
	TPL10(639, "TPL10", "TPL-1.0"),

	/**
	 * The '<em><b>Trusted QSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TrustedQSL License
	 * <!-- end-model-doc -->
	 * @see #TRUSTED_QSL_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_QSL(640, "TrustedQSL", "TrustedQSL"),

	/**
	 * The '<em><b>TTWL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text-Tabs+Wrap License
	 * <!-- end-model-doc -->
	 * @see #TTWL_VALUE
	 * @generated
	 * @ordered
	 */
	TTWL(641, "TTWL", "TTWL"),

	/**
	 * The '<em><b>TTYP0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TTYP0 License
	 * <!-- end-model-doc -->
	 * @see #TTYP0_VALUE
	 * @generated
	 * @ordered
	 */
	TTYP0(642, "TTYP0", "TTYP0"),

	/**
	 * The '<em><b>TU Berlin10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Universitaet Berlin License 1.0
	 * <!-- end-model-doc -->
	 * @see #TU_BERLIN10_VALUE
	 * @generated
	 * @ordered
	 */
	TU_BERLIN10(643, "TUBerlin10", "TU-Berlin-1.0"),

	/**
	 * The '<em><b>TU Berlin20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Universitaet Berlin License 2.0
	 * <!-- end-model-doc -->
	 * @see #TU_BERLIN20_VALUE
	 * @generated
	 * @ordered
	 */
	TU_BERLIN20(644, "TUBerlin20", "TU-Berlin-2.0"),

	/**
	 * The '<em><b>Ubuntu Font10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ubuntu Font Licence v1.0
	 * <!-- end-model-doc -->
	 * @see #UBUNTU_FONT10_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_FONT10(645, "UbuntuFont10", "Ubuntu-font-1.0"),

	/**
	 * The '<em><b>UCAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UCAR License
	 * <!-- end-model-doc -->
	 * @see #UCAR_VALUE
	 * @generated
	 * @ordered
	 */
	UCAR(646, "UCAR", "UCAR"),

	/**
	 * The '<em><b>UCL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upstream Compatibility License v1.0
	 * <!-- end-model-doc -->
	 * @see #UCL10_VALUE
	 * @generated
	 * @ordered
	 */
	UCL10(647, "UCL10", "UCL-1.0"),

	/**
	 * The '<em><b>Ulem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ulem License
	 * <!-- end-model-doc -->
	 * @see #ULEM_VALUE
	 * @generated
	 * @ordered
	 */
	ULEM(648, "ulem", "ulem"),

	/**
	 * The '<em><b>UMich Merit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Michigan/Merit Networks License
	 * <!-- end-model-doc -->
	 * @see #UMICH_MERIT_VALUE
	 * @generated
	 * @ordered
	 */
	UMICH_MERIT(649, "UMichMerit", "UMich-Merit"),

	/**
	 * The '<em><b>Unicode30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License v3
	 * <!-- end-model-doc -->
	 * @see #UNICODE30_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE30(650, "Unicode30", "Unicode-3.0"),

	/**
	 * The '<em><b>Unicode DFS2015</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2015)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2015_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_DFS2015(651, "UnicodeDFS2015", "Unicode-DFS-2015"),

	/**
	 * The '<em><b>Unicode DFS2016</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2016)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2016_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_DFS2016(652, "UnicodeDFS2016", "Unicode-DFS-2016"),

	/**
	 * The '<em><b>Unicode TOU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode Terms of Use
	 * <!-- end-model-doc -->
	 * @see #UNICODE_TOU_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_TOU(653, "UnicodeTOU", "Unicode-TOU"),

	/**
	 * The '<em><b>Unix Crypt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UnixCrypt License
	 * <!-- end-model-doc -->
	 * @see #UNIX_CRYPT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIX_CRYPT(654, "UnixCrypt", "UnixCrypt"),

	/**
	 * The '<em><b>Unlicense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Unlicense
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	UNLICENSE(655, "Unlicense", "Unlicense"),

	/**
	 * The '<em><b>Unlicense Libtelnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unlicense - libtelnet variant
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_LIBTELNET_VALUE
	 * @generated
	 * @ordered
	 */
	UNLICENSE_LIBTELNET(656, "UnlicenseLibtelnet", "Unlicense-libtelnet"),

	/**
	 * The '<em><b>Unlicense Libwhirlpool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unlicense - libwhirlpool variant
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_LIBWHIRLPOOL_VALUE
	 * @generated
	 * @ordered
	 */
	UNLICENSE_LIBWHIRLPOOL(657, "UnlicenseLibwhirlpool", "Unlicense-libwhirlpool"),

	/**
	 * The '<em><b>UPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal Permissive License v1.0
	 * <!-- end-model-doc -->
	 * @see #UPL10_VALUE
	 * @generated
	 * @ordered
	 */
	UPL10(658, "UPL10", "UPL-1.0"),

	/**
	 * The '<em><b>URTRLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utah Raster Toolkit Run Length Encoded License
	 * <!-- end-model-doc -->
	 * @see #URTRLE_VALUE
	 * @generated
	 * @ordered
	 */
	URTRLE(659, "URTRLE", "URT-RLE"),

	/**
	 * The '<em><b>Vim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vim License
	 * <!-- end-model-doc -->
	 * @see #VIM_VALUE
	 * @generated
	 * @ordered
	 */
	VIM(660, "Vim", "Vim"),

	/**
	 * The '<em><b>VOSTROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VOSTROM Public License for Open Source
	 * <!-- end-model-doc -->
	 * @see #VOSTROM_VALUE
	 * @generated
	 * @ordered
	 */
	VOSTROM(661, "VOSTROM", "VOSTROM"),

	/**
	 * The '<em><b>VSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vovida Software License v1.0
	 * <!-- end-model-doc -->
	 * @see #VSL10_VALUE
	 * @generated
	 * @ordered
	 */
	VSL10(662, "VSL10", "VSL-1.0"),

	/**
	 * The '<em><b>W3C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (2002-12-31)
	 * <!-- end-model-doc -->
	 * @see #W3C_VALUE
	 * @generated
	 * @ordered
	 */
	W3C(663, "W3C", "W3C"),

	/**
	 * The '<em><b>W3C19980720</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (1998-07-20)
	 * <!-- end-model-doc -->
	 * @see #W3C19980720_VALUE
	 * @generated
	 * @ordered
	 */
	W3C19980720(664, "W3C19980720", "W3C-19980720"),

	/**
	 * The '<em><b>W3C20150513</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and Document License (2015-05-13)
	 * <!-- end-model-doc -->
	 * @see #W3C20150513_VALUE
	 * @generated
	 * @ordered
	 */
	W3C20150513(665, "W3C20150513", "W3C-20150513"),

	/**
	 * The '<em><b>W3m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * w3m License
	 * <!-- end-model-doc -->
	 * @see #W3M_VALUE
	 * @generated
	 * @ordered
	 */
	W3M(666, "w3m", "w3m"),

	/**
	 * The '<em><b>Watcom10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sybase Open Watcom Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #WATCOM10_VALUE
	 * @generated
	 * @ordered
	 */
	WATCOM10(667, "Watcom10", "Watcom-1.0"),

	/**
	 * The '<em><b>Widget Workshop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Widget Workshop License
	 * <!-- end-model-doc -->
	 * @see #WIDGET_WORKSHOP_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_WORKSHOP(668, "WidgetWorkshop", "Widget-Workshop"),

	/**
	 * The '<em><b>Wsuipa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wsuipa License
	 * <!-- end-model-doc -->
	 * @see #WSUIPA_VALUE
	 * @generated
	 * @ordered
	 */
	WSUIPA(669, "Wsuipa", "Wsuipa"),

	/**
	 * The '<em><b>WTFPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do What The F*ck You Want To Public License
	 * <!-- end-model-doc -->
	 * @see #WTFPL_VALUE
	 * @generated
	 * @ordered
	 */
	WTFPL(670, "WTFPL", "WTFPL"),

	/**
	 * The '<em><b>Wwl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WWL License
	 * <!-- end-model-doc -->
	 * @see #WWL_VALUE
	 * @generated
	 * @ordered
	 */
	WWL(671, "wwl", "wwl"),

	/**
	 * The '<em><b>Wx Windows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * wxWindows Library License
	 * <!-- end-model-doc -->
	 * @see #WX_WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WX_WINDOWS(672, "wxWindows", "wxWindows"),

	/**
	 * The '<em><b>X11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License
	 * <!-- end-model-doc -->
	 * @see #X11_VALUE
	 * @generated
	 * @ordered
	 */
	X11(673, "X11", "X11"),

	/**
	 * The '<em><b>X11 Distribute Modifications Variant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License Distribution Modification Variant
	 * <!-- end-model-doc -->
	 * @see #X11_DISTRIBUTE_MODIFICATIONS_VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	X11_DISTRIBUTE_MODIFICATIONS_VARIANT(674, "X11DistributeModificationsVariant", "X11-distribute-modifications-variant"),

	/**
	 * The '<em><b>X11 Swapped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 swapped final paragraphs
	 * <!-- end-model-doc -->
	 * @see #X11_SWAPPED_VALUE
	 * @generated
	 * @ordered
	 */
	X11_SWAPPED(675, "X11Swapped", "X11-swapped"),

	/**
	 * The '<em><b>Xdebug103</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xdebug License v 1.03
	 * <!-- end-model-doc -->
	 * @see #XDEBUG103_VALUE
	 * @generated
	 * @ordered
	 */
	XDEBUG103(676, "Xdebug103", "Xdebug-1.03"),

	/**
	 * The '<em><b>Xerox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xerox License
	 * <!-- end-model-doc -->
	 * @see #XEROX_VALUE
	 * @generated
	 * @ordered
	 */
	XEROX(677, "Xerox", "Xerox"),

	/**
	 * The '<em><b>Xfig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xfig License
	 * <!-- end-model-doc -->
	 * @see #XFIG_VALUE
	 * @generated
	 * @ordered
	 */
	XFIG(678, "Xfig", "Xfig"),

	/**
	 * The '<em><b>XFree8611</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XFree86 License 1.1
	 * <!-- end-model-doc -->
	 * @see #XFREE8611_VALUE
	 * @generated
	 * @ordered
	 */
	XFREE8611(679, "XFree8611", "XFree86-1.1"),

	/**
	 * The '<em><b>Xinetd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xinetd License
	 * <!-- end-model-doc -->
	 * @see #XINETD_VALUE
	 * @generated
	 * @ordered
	 */
	XINETD(680, "xinetd", "xinetd"),

	/**
	 * The '<em><b>Xkeyboard Config Zinoviev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xkeyboard-config Zinoviev License
	 * <!-- end-model-doc -->
	 * @see #XKEYBOARD_CONFIG_ZINOVIEV_VALUE
	 * @generated
	 * @ordered
	 */
	XKEYBOARD_CONFIG_ZINOVIEV(681, "xkeyboardConfigZinoviev", "xkeyboard-config-Zinoviev"),

	/**
	 * The '<em><b>Xlock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xlock License
	 * <!-- end-model-doc -->
	 * @see #XLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	XLOCK(682, "xlock", "xlock"),

	/**
	 * The '<em><b>Xnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X.Net License
	 * <!-- end-model-doc -->
	 * @see #XNET_VALUE
	 * @generated
	 * @ordered
	 */
	XNET(683, "Xnet", "Xnet"),

	/**
	 * The '<em><b>Xpp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPP License
	 * <!-- end-model-doc -->
	 * @see #XPP_VALUE
	 * @generated
	 * @ordered
	 */
	XPP(684, "xpp", "xpp"),

	/**
	 * The '<em><b>XSkat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XSkat License
	 * <!-- end-model-doc -->
	 * @see #XSKAT_VALUE
	 * @generated
	 * @ordered
	 */
	XSKAT(685, "XSkat", "XSkat"),

	/**
	 * The '<em><b>Xzoom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xzoom License
	 * <!-- end-model-doc -->
	 * @see #XZOOM_VALUE
	 * @generated
	 * @ordered
	 */
	XZOOM(686, "xzoom", "xzoom"),

	/**
	 * The '<em><b>YPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #YPL10_VALUE
	 * @generated
	 * @ordered
	 */
	YPL10(687, "YPL10", "YPL-1.0"),

	/**
	 * The '<em><b>YPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #YPL11_VALUE
	 * @generated
	 * @ordered
	 */
	YPL11(688, "YPL11", "YPL-1.1"),

	/**
	 * The '<em><b>Zed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zed License
	 * <!-- end-model-doc -->
	 * @see #ZED_VALUE
	 * @generated
	 * @ordered
	 */
	ZED(689, "Zed", "Zed"),

	/**
	 * The '<em><b>Zeeff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeeff License
	 * <!-- end-model-doc -->
	 * @see #ZEEFF_VALUE
	 * @generated
	 * @ordered
	 */
	ZEEFF(690, "Zeeff", "Zeeff"),

	/**
	 * The '<em><b>Zend20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zend License v2.0
	 * <!-- end-model-doc -->
	 * @see #ZEND20_VALUE
	 * @generated
	 * @ordered
	 */
	ZEND20(691, "Zend20", "Zend-2.0"),

	/**
	 * The '<em><b>Zimbra13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA13_VALUE
	 * @generated
	 * @ordered
	 */
	ZIMBRA13(692, "Zimbra13", "Zimbra-1.3"),

	/**
	 * The '<em><b>Zimbra14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA14_VALUE
	 * @generated
	 * @ordered
	 */
	ZIMBRA14(693, "Zimbra14", "Zimbra-1.4"),

	/**
	 * The '<em><b>Zlib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib License
	 * <!-- end-model-doc -->
	 * @see #ZLIB_VALUE
	 * @generated
	 * @ordered
	 */
	ZLIB(694, "Zlib", "Zlib"),

	/**
	 * The '<em><b>Zlib Acknowledgement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib/libpng License with Acknowledgement
	 * <!-- end-model-doc -->
	 * @see #ZLIB_ACKNOWLEDGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ZLIB_ACKNOWLEDGEMENT(695, "zlibAcknowledgement", "zlib-acknowledgement"),

	/**
	 * The '<em><b>ZPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #ZPL11_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL11(696, "ZPL11", "ZPL-1.1"),

	/**
	 * The '<em><b>ZPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #ZPL20_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL20(697, "ZPL20", "ZPL-2.0"),

	/**
	 * The '<em><b>ZPL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.1
	 * <!-- end-model-doc -->
	 * @see #ZPL21_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL21(698, "ZPL21", "ZPL-2.1"),

	/**
	 * The '<em><b>389 Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 389 Directory Server Exception
	 * <!-- end-model-doc -->
	 * @see #_389_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	_389_EXCEPTION(699, "_389Exception", "389-exception"),

	/**
	 * The '<em><b>Asterisk Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asterisk exception
	 * <!-- end-model-doc -->
	 * @see #ASTERISK_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASTERISK_EXCEPTION(700, "AsteriskException", "Asterisk-exception"),

	/**
	 * The '<em><b>Asterisk Linking Protocols Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asterisk linking protocols exception
	 * <!-- end-model-doc -->
	 * @see #ASTERISK_LINKING_PROTOCOLS_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASTERISK_LINKING_PROTOCOLS_EXCEPTION(701, "AsteriskLinkingProtocolsException", "Asterisk-linking-protocols-exception"),

	/**
	 * The '<em><b>Autoconf Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf exception 2.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONF_EXCEPTION20(702, "AutoconfException20", "Autoconf-exception-2.0"),

	/**
	 * The '<em><b>Autoconf Exception30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf exception 3.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION30_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONF_EXCEPTION30(703, "AutoconfException30", "Autoconf-exception-3.0"),

	/**
	 * The '<em><b>Autoconf Exception Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf generic exception
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONF_EXCEPTION_GENERIC(704, "AutoconfExceptionGeneric", "Autoconf-exception-generic"),

	/**
	 * The '<em><b>Autoconf Exception Generic30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf generic exception for GPL-3.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_GENERIC30_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONF_EXCEPTION_GENERIC30(705, "AutoconfExceptionGeneric30", "Autoconf-exception-generic-3.0"),

	/**
	 * The '<em><b>Autoconf Exception Macro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf macro exception
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_MACRO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONF_EXCEPTION_MACRO(706, "AutoconfExceptionMacro", "Autoconf-exception-macro"),

	/**
	 * The '<em><b>Bison Exception124</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bison exception 1.24
	 * <!-- end-model-doc -->
	 * @see #BISON_EXCEPTION124_VALUE
	 * @generated
	 * @ordered
	 */
	BISON_EXCEPTION124(707, "BisonException124", "Bison-exception-1.24"),

	/**
	 * The '<em><b>Bison Exception22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bison exception 2.2
	 * <!-- end-model-doc -->
	 * @see #BISON_EXCEPTION22_VALUE
	 * @generated
	 * @ordered
	 */
	BISON_EXCEPTION22(708, "BisonException22", "Bison-exception-2.2"),

	/**
	 * The '<em><b>Bootloader Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bootloader Distribution Exception
	 * <!-- end-model-doc -->
	 * @see #BOOTLOADER_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	BOOTLOADER_EXCEPTION(709, "BootloaderException", "Bootloader-exception"),

	/**
	 * The '<em><b>CGAL Linking Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CGAL Linking Exception
	 * <!-- end-model-doc -->
	 * @see #CGAL_LINKING_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CGAL_LINKING_EXCEPTION(710, "CGALLinkingException", "CGAL-linking-exception"),

	/**
	 * The '<em><b>Classpath Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classpath exception 2.0
	 * <!-- end-model-doc -->
	 * @see #CLASSPATH_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSPATH_EXCEPTION20(711, "ClasspathException20", "Classpath-exception-2.0"),

	/**
	 * The '<em><b>CLISP Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CLISP exception 2.0
	 * <!-- end-model-doc -->
	 * @see #CLISP_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	CLISP_EXCEPTION20(712, "CLISPException20", "CLISP-exception-2.0"),

	/**
	 * The '<em><b>Cryptsetup Open SSL Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cryptsetup OpenSSL exception
	 * <!-- end-model-doc -->
	 * @see #CRYPTSETUP_OPEN_SSL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTSETUP_OPEN_SSL_EXCEPTION(713, "cryptsetupOpenSSLException", "cryptsetup-OpenSSL-exception"),

	/**
	 * The '<em><b>Digia Qt LGPL Exception11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Digia Qt LGPL Exception version 1.1
	 * <!-- end-model-doc -->
	 * @see #DIGIA_QT_LGPL_EXCEPTION11_VALUE
	 * @generated
	 * @ordered
	 */
	DIGIA_QT_LGPL_EXCEPTION11(714, "DigiaQtLGPLException11", "Digia-Qt-LGPL-exception-1.1"),

	/**
	 * The '<em><b>Digi Rule FOSS Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DigiRule FOSS License Exception
	 * <!-- end-model-doc -->
	 * @see #DIGI_RULE_FOSS_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DIGI_RULE_FOSS_EXCEPTION(715, "DigiRuleFOSSException", "DigiRule-FOSS-exception"),

	/**
	 * The '<em><b>ECos Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eCos exception 2.0
	 * <!-- end-model-doc -->
	 * @see #ECOS_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	ECOS_EXCEPTION20(716, "eCosException20", "eCos-exception-2.0"),

	/**
	 * The '<em><b>Erlang Otp Linking Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang/OTP Linking Exception
	 * <!-- end-model-doc -->
	 * @see #ERLANG_OTP_LINKING_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ERLANG_OTP_LINKING_EXCEPTION(717, "erlangOtpLinkingException", "erlang-otp-linking-exception"),

	/**
	 * The '<em><b>Fawkes Runtime Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fawkes Runtime Exception
	 * <!-- end-model-doc -->
	 * @see #FAWKES_RUNTIME_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	FAWKES_RUNTIME_EXCEPTION(718, "FawkesRuntimeException", "Fawkes-Runtime-exception"),

	/**
	 * The '<em><b>FLTK Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FLTK exception
	 * <!-- end-model-doc -->
	 * @see #FLTK_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	FLTK_EXCEPTION(719, "FLTKException", "FLTK-exception"),

	/**
	 * The '<em><b>Fmt Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fmt exception
	 * <!-- end-model-doc -->
	 * @see #FMT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	FMT_EXCEPTION(720, "fmtException", "fmt-exception"),

	/**
	 * The '<em><b>Font Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font exception 2.0
	 * <!-- end-model-doc -->
	 * @see #FONT_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	FONT_EXCEPTION20(721, "FontException20", "Font-exception-2.0"),

	/**
	 * The '<em><b>Freertos Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeRTOS Exception 2.0
	 * <!-- end-model-doc -->
	 * @see #FREERTOS_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	FREERTOS_EXCEPTION20(722, "freertosException20", "freertos-exception-2.0"),

	/**
	 * The '<em><b>GCC Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC Runtime Library exception 2.0
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	GCC_EXCEPTION20(723, "GCCException20", "GCC-exception-2.0"),

	/**
	 * The '<em><b>GCC Exception20 Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC    Runtime Library exception 2.0 - note variant
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION20_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	GCC_EXCEPTION20_NOTE(724, "GCCException20Note", "GCC-exception-2.0-note"),

	/**
	 * The '<em><b>GCC Exception31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC Runtime Library exception 3.1
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION31_VALUE
	 * @generated
	 * @ordered
	 */
	GCC_EXCEPTION31(725, "GCCException31", "GCC-exception-3.1"),

	/**
	 * The '<em><b>Gmsh Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gmsh exception
	 * <!-- end-model-doc -->
	 * @see #GMSH_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GMSH_EXCEPTION(726, "GmshException", "Gmsh-exception"),

	/**
	 * The '<em><b>GNAT Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNAT exception
	 * <!-- end-model-doc -->
	 * @see #GNAT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GNAT_EXCEPTION(727, "GNATException", "GNAT-exception"),

	/**
	 * The '<em><b>GNOME Examples Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNOME examples exception
	 * <!-- end-model-doc -->
	 * @see #GNOME_EXAMPLES_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GNOME_EXAMPLES_EXCEPTION(728, "GNOMEExamplesException", "GNOME-examples-exception"),

	/**
	 * The '<em><b>GNU Compiler Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Compiler Exception
	 * <!-- end-model-doc -->
	 * @see #GNU_COMPILER_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GNU_COMPILER_EXCEPTION(729, "GNUCompilerException", "GNU-compiler-exception"),

	/**
	 * The '<em><b>Gnu Javamail Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU JavaMail exception
	 * <!-- end-model-doc -->
	 * @see #GNU_JAVAMAIL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GNU_JAVAMAIL_EXCEPTION(730, "gnuJavamailException", "gnu-javamail-exception"),

	/**
	 * The '<em><b>GPL30389 Ds Base Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 389 DS Base Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30389_DS_BASE_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30389_DS_BASE_EXCEPTION(731, "GPL30389DsBaseException", "GPL-3.0-389-ds-base-exception"),

	/**
	 * The '<em><b>GPL30 Interface Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Interface Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_INTERFACE_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_INTERFACE_EXCEPTION(732, "GPL30InterfaceException", "GPL-3.0-interface-exception"),

	/**
	 * The '<em><b>GPL30 Linking Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Linking Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_LINKING_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_LINKING_EXCEPTION(733, "GPL30LinkingException", "GPL-3.0-linking-exception"),

	/**
	 * The '<em><b>GPL30 Linking Source Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Linking Exception (with Corresponding Source)
	 * <!-- end-model-doc -->
	 * @see #GPL30_LINKING_SOURCE_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_LINKING_SOURCE_EXCEPTION(734, "GPL30LinkingSourceException", "GPL-3.0-linking-source-exception"),

	/**
	 * The '<em><b>GPLCC10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL Cooperation Commitment 1.0
	 * <!-- end-model-doc -->
	 * @see #GPLCC10_VALUE
	 * @generated
	 * @ordered
	 */
	GPLCC10(735, "GPLCC10", "GPL-CC-1.0"),

	/**
	 * The '<em><b>GStreamer Exception2005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GStreamer Exception (2005)
	 * <!-- end-model-doc -->
	 * @see #GSTREAMER_EXCEPTION2005_VALUE
	 * @generated
	 * @ordered
	 */
	GSTREAMER_EXCEPTION2005(736, "GStreamerException2005", "GStreamer-exception-2005"),

	/**
	 * The '<em><b>GStreamer Exception2008</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GStreamer Exception (2008)
	 * <!-- end-model-doc -->
	 * @see #GSTREAMER_EXCEPTION2008_VALUE
	 * @generated
	 * @ordered
	 */
	GSTREAMER_EXCEPTION2008(737, "GStreamerException2008", "GStreamer-exception-2008"),

	/**
	 * The '<em><b>Harbour Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * harbour exception
	 * <!-- end-model-doc -->
	 * @see #HARBOUR_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	HARBOUR_EXCEPTION(738, "harbourException", "harbour-exception"),

	/**
	 * The '<em><b>I2p Gpl Java Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * i2p GPL+Java Exception
	 * <!-- end-model-doc -->
	 * @see #I2P_GPL_JAVA_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	I2P_GPL_JAVA_EXCEPTION(739, "i2pGplJavaException", "i2p-gpl-java-exception"),

	/**
	 * The '<em><b>Independent Modules Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent Module Linking exception
	 * <!-- end-model-doc -->
	 * @see #INDEPENDENT_MODULES_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	INDEPENDENT_MODULES_EXCEPTION(740, "IndependentModulesException", "Independent-modules-exception"),

	/**
	 * The '<em><b>Ki Cad Libraries Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KiCad Libraries Exception
	 * <!-- end-model-doc -->
	 * @see #KI_CAD_LIBRARIES_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	KI_CAD_LIBRARIES_EXCEPTION(741, "KiCadLibrariesException", "KiCad-libraries-exception"),

	/**
	 * The '<em><b>LGPL30 Linking Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LGPL-3.0 Linking Exception
	 * <!-- end-model-doc -->
	 * @see #LGPL30_LINKING_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30_LINKING_EXCEPTION(742, "LGPL30LinkingException", "LGPL-3.0-linking-exception"),

	/**
	 * The '<em><b>Libpri Open H323 Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpri OpenH323 exception
	 * <!-- end-model-doc -->
	 * @see #LIBPRI_OPEN_H323_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	LIBPRI_OPEN_H323_EXCEPTION(743, "libpriOpenH323Exception", "libpri-OpenH323-exception"),

	/**
	 * The '<em><b>Libtool Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libtool Exception
	 * <!-- end-model-doc -->
	 * @see #LIBTOOL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	LIBTOOL_EXCEPTION(744, "LibtoolException", "Libtool-exception"),

	/**
	 * The '<em><b>Linux Syscall Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Syscall Note
	 * <!-- end-model-doc -->
	 * @see #LINUX_SYSCALL_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_SYSCALL_NOTE(745, "LinuxSyscallNote", "Linux-syscall-note"),

	/**
	 * The '<em><b>LLGPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LLGPL Preamble
	 * <!-- end-model-doc -->
	 * @see #LLGPL_VALUE
	 * @generated
	 * @ordered
	 */
	LLGPL(746, "LLGPL", "LLGPL"),

	/**
	 * The '<em><b>LLVM Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LLVM Exception
	 * <!-- end-model-doc -->
	 * @see #LLVM_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	LLVM_EXCEPTION(747, "LLVMException", "LLVM-exception"),

	/**
	 * The '<em><b>LZMA Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA exception
	 * <!-- end-model-doc -->
	 * @see #LZMA_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	LZMA_EXCEPTION(748, "LZMAException", "LZMA-exception"),

	/**
	 * The '<em><b>Mif Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Macros and Inline Functions Exception
	 * <!-- end-model-doc -->
	 * @see #MIF_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	MIF_EXCEPTION(749, "mifException", "mif-exception"),

	/**
	 * The '<em><b>Mxml Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mxml Exception
	 * <!-- end-model-doc -->
	 * @see #MXML_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	MXML_EXCEPTION(750, "mxmlException", "mxml-exception"),

	/**
	 * The '<em><b>Nokia Qt Exception11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Qt LGPL exception 1.1
	 * <!-- end-model-doc -->
	 * @see #NOKIA_QT_EXCEPTION11_VALUE
	 * @generated
	 * @ordered
	 */
	NOKIA_QT_EXCEPTION11(751, "NokiaQtException11", "Nokia-Qt-exception-1.1"),

	/**
	 * The '<em><b>OCaml LGPL Linking Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCaml LGPL Linking Exception
	 * <!-- end-model-doc -->
	 * @see #OCAML_LGPL_LINKING_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	OCAML_LGPL_LINKING_EXCEPTION(752, "OCamlLGPLLinkingException", "OCaml-LGPL-linking-exception"),

	/**
	 * The '<em><b>OCCT Exception10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Exception 1.0
	 * <!-- end-model-doc -->
	 * @see #OCCT_EXCEPTION10_VALUE
	 * @generated
	 * @ordered
	 */
	OCCT_EXCEPTION10(753, "OCCTException10", "OCCT-exception-1.0"),

	/**
	 * The '<em><b>Open JDK Assembly Exception10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenJDK Assembly exception 1.0
	 * <!-- end-model-doc -->
	 * @see #OPEN_JDK_ASSEMBLY_EXCEPTION10_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_JDK_ASSEMBLY_EXCEPTION10(754, "OpenJDKAssemblyException10", "OpenJDK-assembly-exception-1.0"),

	/**
	 * The '<em><b>Openvpn Openssl Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenVPN OpenSSL Exception
	 * <!-- end-model-doc -->
	 * @see #OPENVPN_OPENSSL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	OPENVPN_OPENSSL_EXCEPTION(755, "openvpnOpensslException", "openvpn-openssl-exception"),

	/**
	 * The '<em><b>PCRE2 Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCRE2 exception
	 * <!-- end-model-doc -->
	 * @see #PCRE2_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PCRE2_EXCEPTION(756, "PCRE2Exception", "PCRE2-exception"),

	/**
	 * The '<em><b>Polyparse Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polyparse Exception
	 * <!-- end-model-doc -->
	 * @see #POLYPARSE_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	POLYPARSE_EXCEPTION(757, "polyparseException", "polyparse-exception"),

	/**
	 * The '<em><b>PS Or PDF Font Exception20170817</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PS/PDF font exception (2017-08-17)
	 * <!-- end-model-doc -->
	 * @see #PS_OR_PDF_FONT_EXCEPTION20170817_VALUE
	 * @generated
	 * @ordered
	 */
	PS_OR_PDF_FONT_EXCEPTION20170817(758, "PSOrPDFFontException20170817", "PS-or-PDF-font-exception-20170817"),

	/**
	 * The '<em><b>QPL10INRIA2004 Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * INRIA QPL 1.0 2004 variant exception
	 * <!-- end-model-doc -->
	 * @see #QPL10INRIA2004_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	QPL10INRIA2004_EXCEPTION(759, "QPL10INRIA2004Exception", "QPL-1.0-INRIA-2004-exception"),

	/**
	 * The '<em><b>Qt GPL Exception10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qt GPL exception 1.0
	 * <!-- end-model-doc -->
	 * @see #QT_GPL_EXCEPTION10_VALUE
	 * @generated
	 * @ordered
	 */
	QT_GPL_EXCEPTION10(760, "QtGPLException10", "Qt-GPL-exception-1.0"),

	/**
	 * The '<em><b>Qt LGPL Exception11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qt LGPL exception 1.1
	 * <!-- end-model-doc -->
	 * @see #QT_LGPL_EXCEPTION11_VALUE
	 * @generated
	 * @ordered
	 */
	QT_LGPL_EXCEPTION11(761, "QtLGPLException11", "Qt-LGPL-exception-1.1"),

	/**
	 * The '<em><b>Qwt Exception10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qwt exception 1.0
	 * <!-- end-model-doc -->
	 * @see #QWT_EXCEPTION10_VALUE
	 * @generated
	 * @ordered
	 */
	QWT_EXCEPTION10(762, "QwtException10", "Qwt-exception-1.0"),

	/**
	 * The '<em><b>Romic Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Romic Exception
	 * <!-- end-model-doc -->
	 * @see #ROMIC_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ROMIC_EXCEPTION(763, "romicException", "romic-exception"),

	/**
	 * The '<em><b>RR Dtool FLOSS Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RRDtool FLOSS exception 2.0
	 * <!-- end-model-doc -->
	 * @see #RR_DTOOL_FLOSS_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	RR_DTOOL_FLOSS_EXCEPTION20(764, "RRDtoolFLOSSException20", "RRDtool-FLOSS-exception-2.0"),

	/**
	 * The '<em><b>SANE Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SANE Exception
	 * <!-- end-model-doc -->
	 * @see #SANE_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SANE_EXCEPTION(765, "SANEException", "SANE-exception"),

	/**
	 * The '<em><b>SHL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v2.0
	 * <!-- end-model-doc -->
	 * @see #SHL20_VALUE
	 * @generated
	 * @ordered
	 */
	SHL20(766, "SHL20", "SHL-2.0"),

	/**
	 * The '<em><b>SHL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v2.1
	 * <!-- end-model-doc -->
	 * @see #SHL21_VALUE
	 * @generated
	 * @ordered
	 */
	SHL21(767, "SHL21", "SHL-2.1"),

	/**
	 * The '<em><b>Stunnel Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * stunnel Exception
	 * <!-- end-model-doc -->
	 * @see #STUNNEL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	STUNNEL_EXCEPTION(768, "stunnelException", "stunnel-exception"),

	/**
	 * The '<em><b>SWI Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SWI exception
	 * <!-- end-model-doc -->
	 * @see #SWI_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SWI_EXCEPTION(769, "SWIException", "SWI-exception"),

	/**
	 * The '<em><b>Swift Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Swift Exception
	 * <!-- end-model-doc -->
	 * @see #SWIFT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SWIFT_EXCEPTION(770, "SwiftException", "Swift-exception"),

	/**
	 * The '<em><b>Texinfo Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Texinfo exception
	 * <!-- end-model-doc -->
	 * @see #TEXINFO_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	TEXINFO_EXCEPTION(771, "TexinfoException", "Texinfo-exception"),

	/**
	 * The '<em><b>UBoot Exception20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * U-Boot exception 2.0
	 * <!-- end-model-doc -->
	 * @see #UBOOT_EXCEPTION20_VALUE
	 * @generated
	 * @ordered
	 */
	UBOOT_EXCEPTION20(772, "uBootException20", "u-boot-exception-2.0"),

	/**
	 * The '<em><b>UBDL Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unmodified Binary Distribution exception
	 * <!-- end-model-doc -->
	 * @see #UBDL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	UBDL_EXCEPTION(773, "UBDLException", "UBDL-exception"),

	/**
	 * The '<em><b>Universal FOSS Exception10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal FOSS Exception, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #UNIVERSAL_FOSS_EXCEPTION10_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERSAL_FOSS_EXCEPTION10(774, "UniversalFOSSException10", "Universal-FOSS-exception-1.0"),

	/**
	 * The '<em><b>Vsftpd Openssl Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * vsftpd OpenSSL exception
	 * <!-- end-model-doc -->
	 * @see #VSFTPD_OPENSSL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VSFTPD_OPENSSL_EXCEPTION(775, "vsftpdOpensslException", "vsftpd-openssl-exception"),

	/**
	 * The '<em><b>Wx Windows Exception31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WxWindows Library Exception 3.1
	 * <!-- end-model-doc -->
	 * @see #WX_WINDOWS_EXCEPTION31_VALUE
	 * @generated
	 * @ordered
	 */
	WX_WINDOWS_EXCEPTION31(776, "WxWindowsException31", "WxWindows-exception-3.1"),

	/**
	 * The '<em><b>X1 1vnc Openssl Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x11vnc OpenSSL Exception
	 * <!-- end-model-doc -->
	 * @see #X11VNC_OPENSSL_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	X11VNC_OPENSSL_EXCEPTION(777, "x11vncOpensslException", "x11vnc-openssl-exception");

	/**
	 * The '<em><b>0BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Zero Clause License
	 * <!-- end-model-doc -->
	 * @see #_0BSD
	 * @model literal="0BSD"
	 * @generated
	 * @ordered
	 */
	public static final int _0BSD_VALUE = 0;

	/**
	 * The '<em><b>3D Slicer10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3D Slicer License v1.0
	 * <!-- end-model-doc -->
	 * @see #_3D_SLICER10
	 * @model name="_3DSlicer10" literal="3D-Slicer-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int _3D_SLICER10_VALUE = 1;

	/**
	 * The '<em><b>AAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribution Assurance License
	 * <!-- end-model-doc -->
	 * @see #AAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AAL_VALUE = 2;

	/**
	 * The '<em><b>Abstyles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstyles License
	 * <!-- end-model-doc -->
	 * @see #ABSTYLES
	 * @model name="Abstyles"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTYLES_VALUE = 3;

	/**
	 * The '<em><b>Ada Core Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdaCore Doc License
	 * <!-- end-model-doc -->
	 * @see #ADA_CORE_DOC
	 * @model name="AdaCoreDoc" literal="AdaCore-doc"
	 * @generated
	 * @ordered
	 */
	public static final int ADA_CORE_DOC_VALUE = 4;

	/**
	 * The '<em><b>Adobe2006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Systems Incorporated Source Code License Agreement
	 * <!-- end-model-doc -->
	 * @see #ADOBE2006
	 * @model name="Adobe2006" literal="Adobe-2006"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE2006_VALUE = 5;

	/**
	 * The '<em><b>Adobe Display Post Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Display PostScript License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_DISPLAY_POST_SCRIPT
	 * @model name="AdobeDisplayPostScript" literal="Adobe-Display-PostScript"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE_DISPLAY_POST_SCRIPT_VALUE = 6;

	/**
	 * The '<em><b>Adobe Glyph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Glyph List License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_GLYPH
	 * @model name="AdobeGlyph" literal="Adobe-Glyph"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE_GLYPH_VALUE = 7;

	/**
	 * The '<em><b>Adobe Utopia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Utopia Font License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_UTOPIA
	 * @model name="AdobeUtopia" literal="Adobe-Utopia"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE_UTOPIA_VALUE = 8;

	/**
	 * The '<em><b>ADSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amazon Digital Services License
	 * <!-- end-model-doc -->
	 * @see #ADSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADSL_VALUE = 9;

	/**
	 * The '<em><b>AFL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.1
	 * <!-- end-model-doc -->
	 * @see #AFL11
	 * @model literal="AFL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int AFL11_VALUE = 10;

	/**
	 * The '<em><b>AFL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.2
	 * <!-- end-model-doc -->
	 * @see #AFL12
	 * @model literal="AFL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int AFL12_VALUE = 11;

	/**
	 * The '<em><b>AFL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.0
	 * <!-- end-model-doc -->
	 * @see #AFL20
	 * @model literal="AFL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int AFL20_VALUE = 12;

	/**
	 * The '<em><b>AFL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.1
	 * <!-- end-model-doc -->
	 * @see #AFL21
	 * @model literal="AFL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int AFL21_VALUE = 13;

	/**
	 * The '<em><b>AFL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v3.0
	 * <!-- end-model-doc -->
	 * @see #AFL30
	 * @model literal="AFL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int AFL30_VALUE = 14;

	/**
	 * The '<em><b>Afmparse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afmparse License
	 * <!-- end-model-doc -->
	 * @see #AFMPARSE
	 * @model name="Afmparse"
	 * @generated
	 * @ordered
	 */
	public static final int AFMPARSE_VALUE = 15;

	/**
	 * The '<em><b>AGPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #AGPL10
	 * @model literal="AGPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL10_VALUE = 16;

	/**
	 * The '<em><b>AGPL10 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL10_ONLY
	 * @model name="AGPL10Only" literal="AGPL-1.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL10_ONLY_VALUE = 17;

	/**
	 * The '<em><b>AGPL10 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL10_OR_LATER
	 * @model name="AGPL10OrLater" literal="AGPL-1.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL10_OR_LATER_VALUE = 18;

	/**
	 * The '<em><b>AGPL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0
	 * <!-- end-model-doc -->
	 * @see #AGPL30
	 * @model literal="AGPL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL30_VALUE = 19;

	/**
	 * The '<em><b>AGPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL30_ONLY
	 * @model name="AGPL30Only" literal="AGPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL30_ONLY_VALUE = 20;

	/**
	 * The '<em><b>AGPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL30_OR_LATER
	 * @model name="AGPL30OrLater" literal="AGPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL30_OR_LATER_VALUE = 21;

	/**
	 * The '<em><b>Aladdin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aladdin Free Public License
	 * <!-- end-model-doc -->
	 * @see #ALADDIN
	 * @model name="Aladdin"
	 * @generated
	 * @ordered
	 */
	public static final int ALADDIN_VALUE = 22;

	/**
	 * The '<em><b>AMD Newlib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD newlib License
	 * <!-- end-model-doc -->
	 * @see #AMD_NEWLIB
	 * @model name="AMDNewlib" literal="AMD-newlib"
	 * @generated
	 * @ordered
	 */
	public static final int AMD_NEWLIB_VALUE = 23;

	/**
	 * The '<em><b>AMDPLPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD's plpa_map.c License
	 * <!-- end-model-doc -->
	 * @see #AMDPLPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMDPLPA_VALUE = 24;

	/**
	 * The '<em><b>AML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple MIT License
	 * <!-- end-model-doc -->
	 * @see #AML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AML_VALUE = 25;

	/**
	 * The '<em><b>AML Glslang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AML glslang variant License
	 * <!-- end-model-doc -->
	 * @see #AML_GLSLANG
	 * @model name="AMLGlslang" literal="AML-glslang"
	 * @generated
	 * @ordered
	 */
	public static final int AML_GLSLANG_VALUE = 26;

	/**
	 * The '<em><b>AMPAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academy of Motion Picture Arts and Sciences BSD
	 * <!-- end-model-doc -->
	 * @see #AMPAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMPAS_VALUE = 27;

	/**
	 * The '<em><b>ANTLRPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD
	 * @model literal="ANTLR-PD"
	 * @generated
	 * @ordered
	 */
	public static final int ANTLRPD_VALUE = 28;

	/**
	 * The '<em><b>ANTLRPD Fallback</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice with license fallback
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD_FALLBACK
	 * @model name="ANTLRPDFallback" literal="ANTLR-PD-fallback"
	 * @generated
	 * @ordered
	 */
	public static final int ANTLRPD_FALLBACK_VALUE = 29;

	/**
	 * The '<em><b>Any OSI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any OSI License
	 * <!-- end-model-doc -->
	 * @see #ANY_OSI
	 * @model name="anyOSI" literal="any-OSI"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OSI_VALUE = 30;

	/**
	 * The '<em><b>Any OSI Perl Modules</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any OSI License - Perl Modules
	 * <!-- end-model-doc -->
	 * @see #ANY_OSI_PERL_MODULES
	 * @model name="anyOSIPerlModules" literal="any-OSI-perl-modules"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OSI_PERL_MODULES_VALUE = 31;

	/**
	 * The '<em><b>Apache10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.0
	 * <!-- end-model-doc -->
	 * @see #APACHE10
	 * @model name="Apache10" literal="Apache-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE10_VALUE = 32;

	/**
	 * The '<em><b>Apache11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.1
	 * <!-- end-model-doc -->
	 * @see #APACHE11
	 * @model name="Apache11" literal="Apache-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE11_VALUE = 33;

	/**
	 * The '<em><b>Apache20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 2.0
	 * <!-- end-model-doc -->
	 * @see #APACHE20
	 * @model name="Apache20" literal="Apache-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE20_VALUE = 34;

	/**
	 * The '<em><b>APAFML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Postscript AFM License
	 * <!-- end-model-doc -->
	 * @see #APAFML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APAFML_VALUE = 35;

	/**
	 * The '<em><b>APL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adaptive Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #APL10
	 * @model literal="APL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APL10_VALUE = 36;

	/**
	 * The '<em><b>App S2p</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App::s2p License
	 * <!-- end-model-doc -->
	 * @see #APP_S2P
	 * @model name="AppS2p" literal="App-s2p"
	 * @generated
	 * @ordered
	 */
	public static final int APP_S2P_VALUE = 37;

	/**
	 * The '<em><b>APSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.0
	 * <!-- end-model-doc -->
	 * @see #APSL10
	 * @model literal="APSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APSL10_VALUE = 38;

	/**
	 * The '<em><b>APSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #APSL11
	 * @model literal="APSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int APSL11_VALUE = 39;

	/**
	 * The '<em><b>APSL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.2
	 * <!-- end-model-doc -->
	 * @see #APSL12
	 * @model literal="APSL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int APSL12_VALUE = 40;

	/**
	 * The '<em><b>APSL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 2.0
	 * <!-- end-model-doc -->
	 * @see #APSL20
	 * @model literal="APSL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int APSL20_VALUE = 41;

	/**
	 * The '<em><b>Arphic1999</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arphic Public License
	 * <!-- end-model-doc -->
	 * @see #ARPHIC1999
	 * @model name="Arphic1999" literal="Arphic-1999"
	 * @generated
	 * @ordered
	 */
	public static final int ARPHIC1999_VALUE = 42;

	/**
	 * The '<em><b>Artistic10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10
	 * @model name="Artistic10" literal="Artistic-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_VALUE = 43;

	/**
	 * The '<em><b>Artistic10 Cl8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 w/clause 8
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_CL8
	 * @model name="Artistic10Cl8" literal="Artistic-1.0-cl8"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_CL8_VALUE = 44;

	/**
	 * The '<em><b>Artistic10 Perl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (Perl)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_PERL
	 * @model name="Artistic10Perl" literal="Artistic-1.0-Perl"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_PERL_VALUE = 45;

	/**
	 * The '<em><b>Artistic20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC20
	 * @model name="Artistic20" literal="Artistic-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC20_VALUE = 46;

	/**
	 * The '<em><b>Artistic Dist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (dist)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC_DIST
	 * @model name="ArtisticDist" literal="Artistic-dist"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC_DIST_VALUE = 47;

	/**
	 * The '<em><b>Aspell RU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aspell Russian License
	 * <!-- end-model-doc -->
	 * @see #ASPELL_RU
	 * @model name="AspellRU" literal="Aspell-RU"
	 * @generated
	 * @ordered
	 */
	public static final int ASPELL_RU_VALUE = 48;

	/**
	 * The '<em><b>ASWF Digital Assets10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASWF Digital Assets License version 1.0
	 * <!-- end-model-doc -->
	 * @see #ASWF_DIGITAL_ASSETS10
	 * @model name="ASWFDigitalAssets10" literal="ASWF-Digital-Assets-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ASWF_DIGITAL_ASSETS10_VALUE = 49;

	/**
	 * The '<em><b>ASWF Digital Assets11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASWF Digital Assets License 1.1
	 * <!-- end-model-doc -->
	 * @see #ASWF_DIGITAL_ASSETS11
	 * @model name="ASWFDigitalAssets11" literal="ASWF-Digital-Assets-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int ASWF_DIGITAL_ASSETS11_VALUE = 50;

	/**
	 * The '<em><b>Baekmuk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Baekmuk License
	 * <!-- end-model-doc -->
	 * @see #BAEKMUK
	 * @model name="Baekmuk"
	 * @generated
	 * @ordered
	 */
	public static final int BAEKMUK_VALUE = 51;

	/**
	 * The '<em><b>Bahyph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahyph License
	 * <!-- end-model-doc -->
	 * @see #BAHYPH
	 * @model name="Bahyph"
	 * @generated
	 * @ordered
	 */
	public static final int BAHYPH_VALUE = 52;

	/**
	 * The '<em><b>Barr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barr License
	 * <!-- end-model-doc -->
	 * @see #BARR
	 * @model name="Barr"
	 * @generated
	 * @ordered
	 */
	public static final int BARR_VALUE = 53;

	/**
	 * The '<em><b>Bcrypt Solar Designer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bcrypt Solar Designer License
	 * <!-- end-model-doc -->
	 * @see #BCRYPT_SOLAR_DESIGNER
	 * @model name="bcryptSolarDesigner" literal="bcrypt-Solar-Designer"
	 * @generated
	 * @ordered
	 */
	public static final int BCRYPT_SOLAR_DESIGNER_VALUE = 54;

	/**
	 * The '<em><b>Beerware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beerware License
	 * <!-- end-model-doc -->
	 * @see #BEERWARE
	 * @model name="Beerware"
	 * @generated
	 * @ordered
	 */
	public static final int BEERWARE_VALUE = 55;

	/**
	 * The '<em><b>Bitstream Charter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitstream Charter Font License
	 * <!-- end-model-doc -->
	 * @see #BITSTREAM_CHARTER
	 * @model name="BitstreamCharter" literal="Bitstream-Charter"
	 * @generated
	 * @ordered
	 */
	public static final int BITSTREAM_CHARTER_VALUE = 56;

	/**
	 * The '<em><b>Bitstream Vera</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bitstream Vera Font License
	 * <!-- end-model-doc -->
	 * @see #BITSTREAM_VERA
	 * @model name="BitstreamVera" literal="Bitstream-Vera"
	 * @generated
	 * @ordered
	 */
	public static final int BITSTREAM_VERA_VALUE = 57;

	/**
	 * The '<em><b>Bit Torrent10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT10
	 * @model name="BitTorrent10" literal="BitTorrent-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_TORRENT10_VALUE = 58;

	/**
	 * The '<em><b>Bit Torrent11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT11
	 * @model name="BitTorrent11" literal="BitTorrent-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_TORRENT11_VALUE = 59;

	/**
	 * The '<em><b>Blessing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SQLite Blessing
	 * <!-- end-model-doc -->
	 * @see #BLESSING
	 * @model name="blessing"
	 * @generated
	 * @ordered
	 */
	public static final int BLESSING_VALUE = 60;

	/**
	 * The '<em><b>Blue Oak100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blue Oak Model License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #BLUE_OAK100
	 * @model name="BlueOak100" literal="BlueOak-1.0.0"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_OAK100_VALUE = 61;

	/**
	 * The '<em><b>Boehm GC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boehm-Demers-Weiser GC License
	 * <!-- end-model-doc -->
	 * @see #BOEHM_GC
	 * @model name="BoehmGC" literal="Boehm-GC"
	 * @generated
	 * @ordered
	 */
	public static final int BOEHM_GC_VALUE = 62;

	/**
	 * The '<em><b>Boehm GC Without Fee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boehm-Demers-Weiser GC License (without fee)
	 * <!-- end-model-doc -->
	 * @see #BOEHM_GC_WITHOUT_FEE
	 * @model name="BoehmGCWithoutFee" literal="Boehm-GC-without-fee"
	 * @generated
	 * @ordered
	 */
	public static final int BOEHM_GC_WITHOUT_FEE_VALUE = 63;

	/**
	 * The '<em><b>Borceux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Borceux license
	 * <!-- end-model-doc -->
	 * @see #BORCEUX
	 * @model name="Borceux"
	 * @generated
	 * @ordered
	 */
	public static final int BORCEUX_VALUE = 64;

	/**
	 * The '<em><b>Brian Gladman2 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brian Gladman 2-Clause License
	 * <!-- end-model-doc -->
	 * @see #BRIAN_GLADMAN2_CLAUSE
	 * @model name="BrianGladman2Clause" literal="Brian-Gladman-2-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BRIAN_GLADMAN2_CLAUSE_VALUE = 65;

	/**
	 * The '<em><b>Brian Gladman3 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brian Gladman 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #BRIAN_GLADMAN3_CLAUSE
	 * @model name="BrianGladman3Clause" literal="Brian-Gladman-3-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BRIAN_GLADMAN3_CLAUSE_VALUE = 66;

	/**
	 * The '<em><b>BSD1 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 1-Clause License
	 * <!-- end-model-doc -->
	 * @see #BSD1_CLAUSE
	 * @model name="BSD1Clause" literal="BSD-1-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD1_CLAUSE_VALUE = 67;

	/**
	 * The '<em><b>BSD2 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause "Simplified" License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE
	 * @model name="BSD2Clause" literal="BSD-2-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_VALUE = 68;

	/**
	 * The '<em><b>BSD2 Clause Darwin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause - Ian Darwin variant
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_DARWIN
	 * @model name="BSD2ClauseDarwin" literal="BSD-2-Clause-Darwin"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_DARWIN_VALUE = 69;

	/**
	 * The '<em><b>BSD2 Clause First Lines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause - first lines requirement
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FIRST_LINES
	 * @model name="BSD2ClauseFirstLines" literal="BSD-2-Clause-first-lines"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_FIRST_LINES_VALUE = 70;

	/**
	 * The '<em><b>BSD2 Clause Free BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause FreeBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FREE_BSD
	 * @model name="BSD2ClauseFreeBSD" literal="BSD-2-Clause-FreeBSD"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_FREE_BSD_VALUE = 71;

	/**
	 * The '<em><b>BSD2 Clause Net BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause NetBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_NET_BSD
	 * @model name="BSD2ClauseNetBSD" literal="BSD-2-Clause-NetBSD"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_NET_BSD_VALUE = 72;

	/**
	 * The '<em><b>BSD2 Clause Patent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-2-Clause Plus Patent License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PATENT
	 * @model name="BSD2ClausePatent" literal="BSD-2-Clause-Patent"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_PATENT_VALUE = 73;

	/**
	 * The '<em><b>BSD2 Clause Pkgconf Disclaimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause pkgconf disclaimer variant
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PKGCONF_DISCLAIMER
	 * @model name="BSD2ClausePkgconfDisclaimer" literal="BSD-2-Clause-pkgconf-disclaimer"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_PKGCONF_DISCLAIMER_VALUE = 74;

	/**
	 * The '<em><b>BSD2 Clause Views</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause with views sentence
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_VIEWS
	 * @model name="BSD2ClauseViews" literal="BSD-2-Clause-Views"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_VIEWS_VALUE = 75;

	/**
	 * The '<em><b>BSD3 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause "New" or "Revised" License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE
	 * @model name="BSD3Clause" literal="BSD-3-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_VALUE = 76;

	/**
	 * The '<em><b>BSD3 Clause Acpica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause acpica variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ACPICA
	 * @model name="BSD3ClauseAcpica" literal="BSD-3-Clause-acpica"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_ACPICA_VALUE = 77;

	/**
	 * The '<em><b>BSD3 Clause Attribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with attribution
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ATTRIBUTION
	 * @model name="BSD3ClauseAttribution" literal="BSD-3-Clause-Attribution"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_ATTRIBUTION_VALUE = 78;

	/**
	 * The '<em><b>BSD3 Clause Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Clear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_CLEAR
	 * @model name="BSD3ClauseClear" literal="BSD-3-Clause-Clear"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_CLEAR_VALUE = 79;

	/**
	 * The '<em><b>BSD3 Clause Flex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Flex variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_FLEX
	 * @model name="BSD3ClauseFlex" literal="BSD-3-Clause-flex"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_FLEX_VALUE = 80;

	/**
	 * The '<em><b>BSD3 Clause HP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_HP
	 * @model name="BSD3ClauseHP" literal="BSD-3-Clause-HP"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_HP_VALUE = 81;

	/**
	 * The '<em><b>BSD3 Clause LBNL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawrence Berkeley National Labs BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_LBNL
	 * @model name="BSD3ClauseLBNL" literal="BSD-3-Clause-LBNL"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_LBNL_VALUE = 82;

	/**
	 * The '<em><b>BSD3 Clause Modification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Modification
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_MODIFICATION
	 * @model name="BSD3ClauseModification" literal="BSD-3-Clause-Modification"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_MODIFICATION_VALUE = 83;

	/**
	 * The '<em><b>BSD3 Clause No Military License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Military License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_MILITARY_LICENSE
	 * @model name="BSD3ClauseNoMilitaryLicense" literal="BSD-3-Clause-No-Military-License"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_MILITARY_LICENSE_VALUE = 84;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE
	 * @model name="BSD3ClauseNoNuclearLicense" literal="BSD-3-Clause-No-Nuclear-License"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE = 85;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License2014</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License 2014
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014
	 * @model name="BSD3ClauseNoNuclearLicense2014" literal="BSD-3-Clause-No-Nuclear-License-2014"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE = 86;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear Warranty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear Warranty
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_WARRANTY
	 * @model name="BSD3ClauseNoNuclearWarranty" literal="BSD-3-Clause-No-Nuclear-Warranty"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE = 87;

	/**
	 * The '<em><b>BSD3 Clause Open MPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Open MPI variant
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_OPEN_MPI
	 * @model name="BSD3ClauseOpenMPI" literal="BSD-3-Clause-Open-MPI"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_OPEN_MPI_VALUE = 88;

	/**
	 * The '<em><b>BSD3 Clause Sun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Sun Microsystems
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_SUN
	 * @model name="BSD3ClauseSun" literal="BSD-3-Clause-Sun"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_SUN_VALUE = 89;

	/**
	 * The '<em><b>BSD4 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4-Clause "Original" or "Old" License
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE
	 * @model name="BSD4Clause" literal="BSD-4-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD4_CLAUSE_VALUE = 90;

	/**
	 * The '<em><b>BSD4 Clause Shortened</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4 Clause Shortened
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_SHORTENED
	 * @model name="BSD4ClauseShortened" literal="BSD-4-Clause-Shortened"
	 * @generated
	 * @ordered
	 */
	public static final int BSD4_CLAUSE_SHORTENED_VALUE = 91;

	/**
	 * The '<em><b>BSD4 Clause UC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-4-Clause (University of California-Specific)
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_UC
	 * @model name="BSD4ClauseUC" literal="BSD-4-Clause-UC"
	 * @generated
	 * @ordered
	 */
	public static final int BSD4_CLAUSE_UC_VALUE = 92;

	/**
	 * The '<em><b>BSD43RENO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4.3 RENO License
	 * <!-- end-model-doc -->
	 * @see #BSD43RENO
	 * @model literal="BSD-4.3RENO"
	 * @generated
	 * @ordered
	 */
	public static final int BSD43RENO_VALUE = 93;

	/**
	 * The '<em><b>BSD43TAHOE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4.3 TAHOE License
	 * <!-- end-model-doc -->
	 * @see #BSD43TAHOE
	 * @model literal="BSD-4.3TAHOE"
	 * @generated
	 * @ordered
	 */
	public static final int BSD43TAHOE_VALUE = 94;

	/**
	 * The '<em><b>BSD Advertising Acknowledgement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Advertising Acknowledgement License
	 * <!-- end-model-doc -->
	 * @see #BSD_ADVERTISING_ACKNOWLEDGEMENT
	 * @model name="BSDAdvertisingAcknowledgement" literal="BSD-Advertising-Acknowledgement"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_ADVERTISING_ACKNOWLEDGEMENT_VALUE = 95;

	/**
	 * The '<em><b>BSD Attribution HPND Disclaimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with Attribution and HPND disclaimer
	 * <!-- end-model-doc -->
	 * @see #BSD_ATTRIBUTION_HPND_DISCLAIMER
	 * @model name="BSDAttributionHPNDDisclaimer" literal="BSD-Attribution-HPND-disclaimer"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_ATTRIBUTION_HPND_DISCLAIMER_VALUE = 96;

	/**
	 * The '<em><b>BSD Inferno Nettverk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-Inferno-Nettverk
	 * <!-- end-model-doc -->
	 * @see #BSD_INFERNO_NETTVERK
	 * @model name="BSDInfernoNettverk" literal="BSD-Inferno-Nettverk"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_INFERNO_NETTVERK_VALUE = 97;

	/**
	 * The '<em><b>BSD Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Protection License
	 * <!-- end-model-doc -->
	 * @see #BSD_PROTECTION
	 * @model name="BSDProtection" literal="BSD-Protection"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_PROTECTION_VALUE = 98;

	/**
	 * The '<em><b>BSD Source Beginning File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution - beginning of file variant
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_BEGINNING_FILE
	 * @model name="BSDSourceBeginningFile" literal="BSD-Source-beginning-file"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_SOURCE_BEGINNING_FILE_VALUE = 99;

	/**
	 * The '<em><b>BSD Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_CODE
	 * @model name="BSDSourceCode" literal="BSD-Source-Code"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_SOURCE_CODE_VALUE = 100;

	/**
	 * The '<em><b>BSD Systemics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Systemics BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD_SYSTEMICS
	 * @model name="BSDSystemics" literal="BSD-Systemics"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_SYSTEMICS_VALUE = 101;

	/**
	 * The '<em><b>BSD Systemics W3 Works</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Systemics W3Works BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD_SYSTEMICS_W3_WORKS
	 * @model name="BSDSystemicsW3Works" literal="BSD-Systemics-W3Works"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_SYSTEMICS_W3_WORKS_VALUE = 102;

	/**
	 * The '<em><b>BSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boost Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #BSL10
	 * @model literal="BSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int BSL10_VALUE = 103;

	/**
	 * The '<em><b>BUSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #BUSL11
	 * @model literal="BUSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int BUSL11_VALUE = 104;

	/**
	 * The '<em><b>Bzip2105</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.5
	 * <!-- end-model-doc -->
	 * @see #BZIP2105
	 * @model name="bzip2105" literal="bzip2-1.0.5"
	 * @generated
	 * @ordered
	 */
	public static final int BZIP2105_VALUE = 105;

	/**
	 * The '<em><b>Bzip2106</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.6
	 * <!-- end-model-doc -->
	 * @see #BZIP2106
	 * @model name="bzip2106" literal="bzip2-1.0.6"
	 * @generated
	 * @ordered
	 */
	public static final int BZIP2106_VALUE = 106;

	/**
	 * The '<em><b>CUDA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computational Use of Data Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CUDA10
	 * @model literal="C-UDA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CUDA10_VALUE = 107;

	/**
	 * The '<em><b>CAL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptographic Autonomy License 1.0
	 * <!-- end-model-doc -->
	 * @see #CAL10
	 * @model literal="CAL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CAL10_VALUE = 108;

	/**
	 * The '<em><b>CAL10 Combined Work Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptographic Autonomy License 1.0 (Combined Work Exception)
	 * <!-- end-model-doc -->
	 * @see #CAL10_COMBINED_WORK_EXCEPTION
	 * @model name="CAL10CombinedWorkException" literal="CAL-1.0-Combined-Work-Exception"
	 * @generated
	 * @ordered
	 */
	public static final int CAL10_COMBINED_WORK_EXCEPTION_VALUE = 109;

	/**
	 * The '<em><b>Caldera</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License
	 * <!-- end-model-doc -->
	 * @see #CALDERA
	 * @model name="Caldera"
	 * @generated
	 * @ordered
	 */
	public static final int CALDERA_VALUE = 110;

	/**
	 * The '<em><b>Caldera No Preamble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License (without preamble)
	 * <!-- end-model-doc -->
	 * @see #CALDERA_NO_PREAMBLE
	 * @model name="CalderaNoPreamble" literal="Caldera-no-preamble"
	 * @generated
	 * @ordered
	 */
	public static final int CALDERA_NO_PREAMBLE_VALUE = 111;

	/**
	 * The '<em><b>Catharon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Catharon License
	 * <!-- end-model-doc -->
	 * @see #CATHARON
	 * @model name="Catharon"
	 * @generated
	 * @ordered
	 */
	public static final int CATHARON_VALUE = 112;

	/**
	 * The '<em><b>CATOSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computer Associates Trusted Open Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #CATOSL11
	 * @model literal="CATOSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CATOSL11_VALUE = 113;

	/**
	 * The '<em><b>CCBY10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY10
	 * @model literal="CC-BY-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY10_VALUE = 114;

	/**
	 * The '<em><b>CCBY20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY20
	 * @model literal="CC-BY-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY20_VALUE = 115;

	/**
	 * The '<em><b>CCBY25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY25
	 * @model literal="CC-BY-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY25_VALUE = 116;

	/**
	 * The '<em><b>CCBY25AU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Australia
	 * <!-- end-model-doc -->
	 * @see #CCBY25AU
	 * @model literal="CC-BY-2.5-AU"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY25AU_VALUE = 117;

	/**
	 * The '<em><b>CCBY30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBY30
	 * @model literal="CC-BY-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30_VALUE = 118;

	/**
	 * The '<em><b>CCBY30AT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Austria
	 * <!-- end-model-doc -->
	 * @see #CCBY30AT
	 * @model literal="CC-BY-3.0-AT"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30AT_VALUE = 119;

	/**
	 * The '<em><b>CCBY30AU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Australia
	 * <!-- end-model-doc -->
	 * @see #CCBY30AU
	 * @model literal="CC-BY-3.0-AU"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30AU_VALUE = 120;

	/**
	 * The '<em><b>CCBY30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBY30DE
	 * @model literal="CC-BY-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30DE_VALUE = 121;

	/**
	 * The '<em><b>CCBY30IGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBY30IGO
	 * @model literal="CC-BY-3.0-IGO"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30IGO_VALUE = 122;

	/**
	 * The '<em><b>CCBY30NL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Netherlands
	 * <!-- end-model-doc -->
	 * @see #CCBY30NL
	 * @model literal="CC-BY-3.0-NL"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30NL_VALUE = 123;

	/**
	 * The '<em><b>CCBY30US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 United States
	 * <!-- end-model-doc -->
	 * @see #CCBY30US
	 * @model literal="CC-BY-3.0-US"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30US_VALUE = 124;

	/**
	 * The '<em><b>CCBY40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBY40
	 * @model literal="CC-BY-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY40_VALUE = 125;

	/**
	 * The '<em><b>CCBYNC10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC10
	 * @model literal="CC-BY-NC-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC10_VALUE = 126;

	/**
	 * The '<em><b>CCBYNC20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC20
	 * @model literal="CC-BY-NC-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC20_VALUE = 127;

	/**
	 * The '<em><b>CCBYNC25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC25
	 * @model literal="CC-BY-NC-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC25_VALUE = 128;

	/**
	 * The '<em><b>CCBYNC30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30
	 * @model literal="CC-BY-NC-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC30_VALUE = 129;

	/**
	 * The '<em><b>CCBYNC30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30DE
	 * @model literal="CC-BY-NC-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC30DE_VALUE = 130;

	/**
	 * The '<em><b>CCBYNC40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNC40
	 * @model literal="CC-BY-NC-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC40_VALUE = 131;

	/**
	 * The '<em><b>CCBYNCND10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND10
	 * @model literal="CC-BY-NC-ND-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND10_VALUE = 132;

	/**
	 * The '<em><b>CCBYNCND20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND20
	 * @model literal="CC-BY-NC-ND-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND20_VALUE = 133;

	/**
	 * The '<em><b>CCBYNCND25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND25
	 * @model literal="CC-BY-NC-ND-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND25_VALUE = 134;

	/**
	 * The '<em><b>CCBYNCND30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30
	 * @model literal="CC-BY-NC-ND-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND30_VALUE = 135;

	/**
	 * The '<em><b>CCBYNCND30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30DE
	 * @model literal="CC-BY-NC-ND-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND30DE_VALUE = 136;

	/**
	 * The '<em><b>CCBYNCND30IGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30IGO
	 * @model literal="CC-BY-NC-ND-3.0-IGO"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND30IGO_VALUE = 137;

	/**
	 * The '<em><b>CCBYNCND40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND40
	 * @model literal="CC-BY-NC-ND-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND40_VALUE = 138;

	/**
	 * The '<em><b>CCBYNCSA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA10
	 * @model literal="CC-BY-NC-SA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA10_VALUE = 139;

	/**
	 * The '<em><b>CCBYNCSA20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20
	 * @model literal="CC-BY-NC-SA-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA20_VALUE = 140;

	/**
	 * The '<em><b>CCBYNCSA20DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20DE
	 * @model literal="CC-BY-NC-SA-2.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA20DE_VALUE = 141;

	/**
	 * The '<em><b>CCBYNCSA20FR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution-NonCommercial-ShareAlike 2.0 France
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20FR
	 * @model literal="CC-BY-NC-SA-2.0-FR"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA20FR_VALUE = 142;

	/**
	 * The '<em><b>CCBYNCSA20UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 England and Wales
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20UK
	 * @model literal="CC-BY-NC-SA-2.0-UK"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA20UK_VALUE = 143;

	/**
	 * The '<em><b>CCBYNCSA25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA25
	 * @model literal="CC-BY-NC-SA-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA25_VALUE = 144;

	/**
	 * The '<em><b>CCBYNCSA30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30
	 * @model literal="CC-BY-NC-SA-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA30_VALUE = 145;

	/**
	 * The '<em><b>CCBYNCSA30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30DE
	 * @model literal="CC-BY-NC-SA-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA30DE_VALUE = 146;

	/**
	 * The '<em><b>CCBYNCSA30IGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30IGO
	 * @model literal="CC-BY-NC-SA-3.0-IGO"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA30IGO_VALUE = 147;

	/**
	 * The '<em><b>CCBYNCSA40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA40
	 * @model literal="CC-BY-NC-SA-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA40_VALUE = 148;

	/**
	 * The '<em><b>CCBYND10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND10
	 * @model literal="CC-BY-ND-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND10_VALUE = 149;

	/**
	 * The '<em><b>CCBYND20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND20
	 * @model literal="CC-BY-ND-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND20_VALUE = 150;

	/**
	 * The '<em><b>CCBYND25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND25
	 * @model literal="CC-BY-ND-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND25_VALUE = 151;

	/**
	 * The '<em><b>CCBYND30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYND30
	 * @model literal="CC-BY-ND-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND30_VALUE = 152;

	/**
	 * The '<em><b>CCBYND30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYND30DE
	 * @model literal="CC-BY-ND-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND30DE_VALUE = 153;

	/**
	 * The '<em><b>CCBYND40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYND40
	 * @model literal="CC-BY-ND-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND40_VALUE = 154;

	/**
	 * The '<em><b>CCBYSA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA10
	 * @model literal="CC-BY-SA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA10_VALUE = 155;

	/**
	 * The '<em><b>CCBYSA20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20
	 * @model literal="CC-BY-SA-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA20_VALUE = 156;

	/**
	 * The '<em><b>CCBYSA20UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 England and Wales
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20UK
	 * @model literal="CC-BY-SA-2.0-UK"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA20UK_VALUE = 157;

	/**
	 * The '<em><b>CCBYSA21JP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.1 Japan
	 * <!-- end-model-doc -->
	 * @see #CCBYSA21JP
	 * @model literal="CC-BY-SA-2.1-JP"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA21JP_VALUE = 158;

	/**
	 * The '<em><b>CCBYSA25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA25
	 * @model literal="CC-BY-SA-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA25_VALUE = 159;

	/**
	 * The '<em><b>CCBYSA30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30
	 * @model literal="CC-BY-SA-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA30_VALUE = 160;

	/**
	 * The '<em><b>CCBYSA30AT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Austria
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30AT
	 * @model literal="CC-BY-SA-3.0-AT"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA30AT_VALUE = 161;

	/**
	 * The '<em><b>CCBYSA30DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Germany
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30DE
	 * @model literal="CC-BY-SA-3.0-DE"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA30DE_VALUE = 162;

	/**
	 * The '<em><b>CCBYSA30IGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution-ShareAlike 3.0 IGO
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30IGO
	 * @model literal="CC-BY-SA-3.0-IGO"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA30IGO_VALUE = 163;

	/**
	 * The '<em><b>CCBYSA40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYSA40
	 * @model literal="CC-BY-SA-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA40_VALUE = 164;

	/**
	 * The '<em><b>CCPDDC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Public Domain Dedication and Certification
	 * <!-- end-model-doc -->
	 * @see #CCPDDC
	 * @model literal="CC-PDDC"
	 * @generated
	 * @ordered
	 */
	public static final int CCPDDC_VALUE = 165;

	/**
	 * The '<em><b>CCPDM10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative    Commons Public Domain Mark 1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CCPDM10
	 * @model literal="CC-PDM-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCPDM10_VALUE = 166;

	/**
	 * The '<em><b>CCSA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCSA10
	 * @model literal="CC-SA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCSA10_VALUE = 167;

	/**
	 * The '<em><b>CC010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Zero v1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CC010
	 * @model literal="CC0-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CC010_VALUE = 168;

	/**
	 * The '<em><b>CDDL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDDL10
	 * @model literal="CDDL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDDL10_VALUE = 169;

	/**
	 * The '<em><b>CDDL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.1
	 * <!-- end-model-doc -->
	 * @see #CDDL11
	 * @model literal="CDDL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CDDL11_VALUE = 170;

	/**
	 * The '<em><b>CDL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Documentation License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDL10
	 * @model literal="CDL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDL10_VALUE = 171;

	/**
	 * The '<em><b>CDLA Permissive10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE10
	 * @model name="CDLAPermissive10" literal="CDLA-Permissive-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDLA_PERMISSIVE10_VALUE = 172;

	/**
	 * The '<em><b>CDLA Permissive20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 2.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE20
	 * @model name="CDLAPermissive20" literal="CDLA-Permissive-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDLA_PERMISSIVE20_VALUE = 173;

	/**
	 * The '<em><b>CDLA Sharing10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Sharing 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_SHARING10
	 * @model name="CDLASharing10" literal="CDLA-Sharing-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDLA_SHARING10_VALUE = 174;

	/**
	 * The '<em><b>CECILL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CECILL10
	 * @model literal="CECILL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL10_VALUE = 175;

	/**
	 * The '<em><b>CECILL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.1
	 * <!-- end-model-doc -->
	 * @see #CECILL11
	 * @model literal="CECILL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL11_VALUE = 176;

	/**
	 * The '<em><b>CECILL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.0
	 * <!-- end-model-doc -->
	 * @see #CECILL20
	 * @model literal="CECILL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL20_VALUE = 177;

	/**
	 * The '<em><b>CECILL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.1
	 * <!-- end-model-doc -->
	 * @see #CECILL21
	 * @model literal="CECILL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL21_VALUE = 178;

	/**
	 * The '<em><b>CECILLB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-B Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLB
	 * @model literal="CECILL-B"
	 * @generated
	 * @ordered
	 */
	public static final int CECILLB_VALUE = 179;

	/**
	 * The '<em><b>CECILLC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-C Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLC
	 * @model literal="CECILL-C"
	 * @generated
	 * @ordered
	 */
	public static final int CECILLC_VALUE = 180;

	/**
	 * The '<em><b>CERNOHL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence v1.1
	 * <!-- end-model-doc -->
	 * @see #CERNOHL11
	 * @model literal="CERN-OHL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CERNOHL11_VALUE = 181;

	/**
	 * The '<em><b>CERNOHL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence v1.2
	 * <!-- end-model-doc -->
	 * @see #CERNOHL12
	 * @model literal="CERN-OHL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int CERNOHL12_VALUE = 182;

	/**
	 * The '<em><b>CERNOHLP20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Permissive
	 * <!-- end-model-doc -->
	 * @see #CERNOHLP20
	 * @model literal="CERN-OHL-P-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CERNOHLP20_VALUE = 183;

	/**
	 * The '<em><b>CERNOHLS20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Strongly Reciprocal
	 * <!-- end-model-doc -->
	 * @see #CERNOHLS20
	 * @model literal="CERN-OHL-S-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CERNOHLS20_VALUE = 184;

	/**
	 * The '<em><b>CERNOHLW20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CERN Open Hardware Licence Version 2 - Weakly Reciprocal
	 * <!-- end-model-doc -->
	 * @see #CERNOHLW20
	 * @model literal="CERN-OHL-W-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CERNOHLW20_VALUE = 185;

	/**
	 * The '<em><b>CFITSIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CFITSIO License
	 * <!-- end-model-doc -->
	 * @see #CFITSIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CFITSIO_VALUE = 186;

	/**
	 * The '<em><b>Check Cvs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * check-cvs License
	 * <!-- end-model-doc -->
	 * @see #CHECK_CVS
	 * @model name="checkCvs" literal="check-cvs"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_CVS_VALUE = 187;

	/**
	 * The '<em><b>Checkmk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checkmk License
	 * <!-- end-model-doc -->
	 * @see #CHECKMK
	 * @model name="checkmk"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKMK_VALUE = 188;

	/**
	 * The '<em><b>Cl Artistic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clarified Artistic License
	 * <!-- end-model-doc -->
	 * @see #CL_ARTISTIC
	 * @model name="ClArtistic"
	 * @generated
	 * @ordered
	 */
	public static final int CL_ARTISTIC_VALUE = 189;

	/**
	 * The '<em><b>Clips</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clips License
	 * <!-- end-model-doc -->
	 * @see #CLIPS
	 * @model name="Clips"
	 * @generated
	 * @ordered
	 */
	public static final int CLIPS_VALUE = 190;

	/**
	 * The '<em><b>CMU Mach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU Mach License
	 * <!-- end-model-doc -->
	 * @see #CMU_MACH
	 * @model name="CMUMach" literal="CMU-Mach"
	 * @generated
	 * @ordered
	 */
	public static final int CMU_MACH_VALUE = 191;

	/**
	 * The '<em><b>CMU Mach Nodoc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU    Mach - no notices-in-documentation variant
	 * <!-- end-model-doc -->
	 * @see #CMU_MACH_NODOC
	 * @model name="CMUMachNodoc" literal="CMU-Mach-nodoc"
	 * @generated
	 * @ordered
	 */
	public static final int CMU_MACH_NODOC_VALUE = 192;

	/**
	 * The '<em><b>CNRI Jython</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Jython License
	 * <!-- end-model-doc -->
	 * @see #CNRI_JYTHON
	 * @model name="CNRIJython" literal="CNRI-Jython"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_JYTHON_VALUE = 193;

	/**
	 * The '<em><b>CNRI Python</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python License
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON
	 * @model name="CNRIPython" literal="CNRI-Python"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_PYTHON_VALUE = 194;

	/**
	 * The '<em><b>CNRI Python GPL Compatible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python Open Source GPL Compatible License Agreement
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_GPL_COMPATIBLE
	 * @model name="CNRIPythonGPLCompatible" literal="CNRI-Python-GPL-Compatible"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_PYTHON_GPL_COMPATIBLE_VALUE = 195;

	/**
	 * The '<em><b>COIL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copyfree Open Innovation License
	 * <!-- end-model-doc -->
	 * @see #COIL10
	 * @model literal="COIL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int COIL10_VALUE = 196;

	/**
	 * The '<em><b>Community Spec10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Specification License 1.0
	 * <!-- end-model-doc -->
	 * @see #COMMUNITY_SPEC10
	 * @model name="CommunitySpec10" literal="Community-Spec-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNITY_SPEC10_VALUE = 197;

	/**
	 * The '<em><b>Condor11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condor Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #CONDOR11
	 * @model name="Condor11" literal="Condor-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CONDOR11_VALUE = 198;

	/**
	 * The '<em><b>Copyleft Next030</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copyleft-next 0.3.0
	 * <!-- end-model-doc -->
	 * @see #COPYLEFT_NEXT030
	 * @model name="copyleftNext030" literal="copyleft-next-0.3.0"
	 * @generated
	 * @ordered
	 */
	public static final int COPYLEFT_NEXT030_VALUE = 199;

	/**
	 * The '<em><b>Copyleft Next031</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copyleft-next 0.3.1
	 * <!-- end-model-doc -->
	 * @see #COPYLEFT_NEXT031
	 * @model name="copyleftNext031" literal="copyleft-next-0.3.1"
	 * @generated
	 * @ordered
	 */
	public static final int COPYLEFT_NEXT031_VALUE = 200;

	/**
	 * The '<em><b>Cornell Lossless JPEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cornell Lossless JPEG License
	 * <!-- end-model-doc -->
	 * @see #CORNELL_LOSSLESS_JPEG
	 * @model name="CornellLosslessJPEG" literal="Cornell-Lossless-JPEG"
	 * @generated
	 * @ordered
	 */
	public static final int CORNELL_LOSSLESS_JPEG_VALUE = 201;

	/**
	 * The '<em><b>CPAL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public Attribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPAL10
	 * @model literal="CPAL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CPAL10_VALUE = 202;

	/**
	 * The '<em><b>CPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPL10
	 * @model literal="CPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CPL10_VALUE = 203;

	/**
	 * The '<em><b>CPOL102</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code Project Open License 1.02
	 * <!-- end-model-doc -->
	 * @see #CPOL102
	 * @model literal="CPOL-1.02"
	 * @generated
	 * @ordered
	 */
	public static final int CPOL102_VALUE = 204;

	/**
	 * The '<em><b>Cronyx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cronyx License
	 * <!-- end-model-doc -->
	 * @see #CRONYX
	 * @model name="Cronyx"
	 * @generated
	 * @ordered
	 */
	public static final int CRONYX_VALUE = 205;

	/**
	 * The '<em><b>Crossword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Crossword License
	 * <!-- end-model-doc -->
	 * @see #CROSSWORD
	 * @model name="Crossword"
	 * @generated
	 * @ordered
	 */
	public static final int CROSSWORD_VALUE = 206;

	/**
	 * The '<em><b>Crypto Swift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CryptoSwift License
	 * <!-- end-model-doc -->
	 * @see #CRYPTO_SWIFT
	 * @model name="CryptoSwift"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTO_SWIFT_VALUE = 207;

	/**
	 * The '<em><b>Crystal Stacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CrystalStacker License
	 * <!-- end-model-doc -->
	 * @see #CRYSTAL_STACKER
	 * @model name="CrystalStacker"
	 * @generated
	 * @ordered
	 */
	public static final int CRYSTAL_STACKER_VALUE = 208;

	/**
	 * The '<em><b>CUAOPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CUA Office Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #CUAOPL10
	 * @model literal="CUA-OPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CUAOPL10_VALUE = 209;

	/**
	 * The '<em><b>Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cube License
	 * <!-- end-model-doc -->
	 * @see #CUBE
	 * @model name="Cube"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_VALUE = 210;

	/**
	 * The '<em><b>Curl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * curl License
	 * <!-- end-model-doc -->
	 * @see #CURL
	 * @model name="curl"
	 * @generated
	 * @ordered
	 */
	public static final int CURL_VALUE = 211;

	/**
	 * The '<em><b>Cve Tou</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Vulnerability Enumeration ToU License
	 * <!-- end-model-doc -->
	 * @see #CVE_TOU
	 * @model name="cveTou" literal="cve-tou"
	 * @generated
	 * @ordered
	 */
	public static final int CVE_TOU_VALUE = 212;

	/**
	 * The '<em><b>DFSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deutsche Freie Software Lizenz
	 * <!-- end-model-doc -->
	 * @see #DFSL10
	 * @model literal="D-FSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int DFSL10_VALUE = 213;

	/**
	 * The '<em><b>DEC3 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEC 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #DEC3_CLAUSE
	 * @model name="DEC3Clause" literal="DEC-3-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int DEC3_CLAUSE_VALUE = 214;

	/**
	 * The '<em><b>Diffmark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * diffmark license
	 * <!-- end-model-doc -->
	 * @see #DIFFMARK
	 * @model name="diffmark"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFMARK_VALUE = 215;

	/**
	 * The '<em><b>DLDEBY20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data licence Germany – attribution – version 2.0
	 * <!-- end-model-doc -->
	 * @see #DLDEBY20
	 * @model literal="DL-DE-BY-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int DLDEBY20_VALUE = 216;

	/**
	 * The '<em><b>DLDEZERO20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data licence Germany – zero – version 2.0
	 * <!-- end-model-doc -->
	 * @see #DLDEZERO20
	 * @model literal="DL-DE-ZERO-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int DLDEZERO20_VALUE = 217;

	/**
	 * The '<em><b>DOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOC License
	 * <!-- end-model-doc -->
	 * @see #DOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_VALUE = 218;

	/**
	 * The '<em><b>Doc Book DTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook DTD License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_DTD
	 * @model name="DocBookDTD" literal="DocBook-DTD"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_BOOK_DTD_VALUE = 219;

	/**
	 * The '<em><b>Doc Book Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook Schema License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_SCHEMA
	 * @model name="DocBookSchema" literal="DocBook-Schema"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_BOOK_SCHEMA_VALUE = 220;

	/**
	 * The '<em><b>Doc Book Stylesheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook Stylesheet License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_STYLESHEET
	 * @model name="DocBookStylesheet" literal="DocBook-Stylesheet"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_BOOK_STYLESHEET_VALUE = 221;

	/**
	 * The '<em><b>Doc Book XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocBook XML License
	 * <!-- end-model-doc -->
	 * @see #DOC_BOOK_XML
	 * @model name="DocBookXML" literal="DocBook-XML"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_BOOK_XML_VALUE = 222;

	/**
	 * The '<em><b>Dotseqn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dotseqn License
	 * <!-- end-model-doc -->
	 * @see #DOTSEQN
	 * @model name="Dotseqn"
	 * @generated
	 * @ordered
	 */
	public static final int DOTSEQN_VALUE = 223;

	/**
	 * The '<em><b>DRL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detection Rule License 1.0
	 * <!-- end-model-doc -->
	 * @see #DRL10
	 * @model literal="DRL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int DRL10_VALUE = 224;

	/**
	 * The '<em><b>DRL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detection Rule License 1.1
	 * <!-- end-model-doc -->
	 * @see #DRL11
	 * @model literal="DRL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int DRL11_VALUE = 225;

	/**
	 * The '<em><b>DSDP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSDP License
	 * <!-- end-model-doc -->
	 * @see #DSDP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSDP_VALUE = 226;

	/**
	 * The '<em><b>Dtoa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * David M. Gay dtoa License
	 * <!-- end-model-doc -->
	 * @see #DTOA
	 * @model name="dtoa"
	 * @generated
	 * @ordered
	 */
	public static final int DTOA_VALUE = 227;

	/**
	 * The '<em><b>Dvipdfm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dvipdfm License
	 * <!-- end-model-doc -->
	 * @see #DVIPDFM
	 * @model name="dvipdfm"
	 * @generated
	 * @ordered
	 */
	public static final int DVIPDFM_VALUE = 228;

	/**
	 * The '<em><b>ECL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v1.0
	 * <!-- end-model-doc -->
	 * @see #ECL10
	 * @model literal="ECL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECL10_VALUE = 229;

	/**
	 * The '<em><b>ECL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v2.0
	 * <!-- end-model-doc -->
	 * @see #ECL20
	 * @model literal="ECL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECL20_VALUE = 230;

	/**
	 * The '<em><b>ECos20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eCos license version 2.0
	 * <!-- end-model-doc -->
	 * @see #ECOS20
	 * @model name="eCos20" literal="eCos-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECOS20_VALUE = 231;

	/**
	 * The '<em><b>EFL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v1.0
	 * <!-- end-model-doc -->
	 * @see #EFL10
	 * @model literal="EFL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EFL10_VALUE = 232;

	/**
	 * The '<em><b>EFL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v2.0
	 * <!-- end-model-doc -->
	 * @see #EFL20
	 * @model literal="EFL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int EFL20_VALUE = 233;

	/**
	 * The '<em><b>EGenix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eGenix.com Public License 1.1.0
	 * <!-- end-model-doc -->
	 * @see #EGENIX
	 * @model name="eGenix"
	 * @generated
	 * @ordered
	 */
	public static final int EGENIX_VALUE = 234;

	/**
	 * The '<em><b>Elastic20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elastic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ELASTIC20
	 * @model name="Elastic20" literal="Elastic-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ELASTIC20_VALUE = 235;

	/**
	 * The '<em><b>Entessa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entessa Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #ENTESSA
	 * @model name="Entessa"
	 * @generated
	 * @ordered
	 */
	public static final int ENTESSA_VALUE = 236;

	/**
	 * The '<em><b>EPICS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EPICS Open License
	 * <!-- end-model-doc -->
	 * @see #EPICS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EPICS_VALUE = 237;

	/**
	 * The '<em><b>EPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EPL10
	 * @model literal="EPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EPL10_VALUE = 238;

	/**
	 * The '<em><b>EPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #EPL20
	 * @model literal="EPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int EPL20_VALUE = 239;

	/**
	 * The '<em><b>Erl PL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #ERL_PL11
	 * @model name="ErlPL11" literal="ErlPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int ERL_PL11_VALUE = 240;

	/**
	 * The '<em><b>Etalab20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Etalab Open License 2.0
	 * <!-- end-model-doc -->
	 * @see #ETALAB20
	 * @model name="etalab20" literal="etalab-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ETALAB20_VALUE = 241;

	/**
	 * The '<em><b>EU Datagrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EU DataGrid Software License
	 * <!-- end-model-doc -->
	 * @see #EU_DATAGRID
	 * @model name="EUDatagrid"
	 * @generated
	 * @ordered
	 */
	public static final int EU_DATAGRID_VALUE = 242;

	/**
	 * The '<em><b>EUPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EUPL10
	 * @model literal="EUPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL10_VALUE = 243;

	/**
	 * The '<em><b>EUPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #EUPL11
	 * @model literal="EUPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL11_VALUE = 244;

	/**
	 * The '<em><b>EUPL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.2
	 * <!-- end-model-doc -->
	 * @see #EUPL12
	 * @model literal="EUPL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL12_VALUE = 245;

	/**
	 * The '<em><b>Eurosym</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eurosym License
	 * <!-- end-model-doc -->
	 * @see #EUROSYM
	 * @model name="Eurosym"
	 * @generated
	 * @ordered
	 */
	public static final int EUROSYM_VALUE = 246;

	/**
	 * The '<em><b>Fair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fair License
	 * <!-- end-model-doc -->
	 * @see #FAIR
	 * @model name="Fair"
	 * @generated
	 * @ordered
	 */
	public static final int FAIR_VALUE = 247;

	/**
	 * The '<em><b>FBM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuzzy Bitmap License
	 * <!-- end-model-doc -->
	 * @see #FBM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FBM_VALUE = 248;

	/**
	 * The '<em><b>FDKAAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fraunhofer FDK AAC Codec Library
	 * <!-- end-model-doc -->
	 * @see #FDKAAC
	 * @model literal="FDK-AAC"
	 * @generated
	 * @ordered
	 */
	public static final int FDKAAC_VALUE = 249;

	/**
	 * The '<em><b>Ferguson Twofish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ferguson Twofish License
	 * <!-- end-model-doc -->
	 * @see #FERGUSON_TWOFISH
	 * @model name="FergusonTwofish" literal="Ferguson-Twofish"
	 * @generated
	 * @ordered
	 */
	public static final int FERGUSON_TWOFISH_VALUE = 250;

	/**
	 * The '<em><b>Frameworx10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frameworx Open License 1.0
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORX10
	 * @model name="Frameworx10" literal="Frameworx-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORX10_VALUE = 251;

	/**
	 * The '<em><b>Free BSDDOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeBSD Documentation License
	 * <!-- end-model-doc -->
	 * @see #FREE_BSDDOC
	 * @model name="FreeBSDDOC" literal="FreeBSD-DOC"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_BSDDOC_VALUE = 252;

	/**
	 * The '<em><b>Free Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeImage Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #FREE_IMAGE
	 * @model name="FreeImage"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_IMAGE_VALUE = 253;

	/**
	 * The '<em><b>FSFAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License
	 * <!-- end-model-doc -->
	 * @see #FSFAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFAP_VALUE = 254;

	/**
	 * The '<em><b>FSFAP No Warranty Disclaimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License (without Warranty)
	 * <!-- end-model-doc -->
	 * @see #FSFAP_NO_WARRANTY_DISCLAIMER
	 * @model name="FSFAPNoWarrantyDisclaimer" literal="FSFAP-no-warranty-disclaimer"
	 * @generated
	 * @ordered
	 */
	public static final int FSFAP_NO_WARRANTY_DISCLAIMER_VALUE = 255;

	/**
	 * The '<em><b>FSFUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License
	 * <!-- end-model-doc -->
	 * @see #FSFUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFUL_VALUE = 256;

	/**
	 * The '<em><b>FSFULLR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention)
	 * <!-- end-model-doc -->
	 * @see #FSFULLR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFULLR_VALUE = 257;

	/**
	 * The '<em><b>FSFULLRSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention and Short Disclaimer)
	 * <!-- end-model-doc -->
	 * @see #FSFULLRSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFULLRSD_VALUE = 258;

	/**
	 * The '<em><b>FSFULLRWD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (With License Retention and Warranty Disclaimer)
	 * <!-- end-model-doc -->
	 * @see #FSFULLRWD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFULLRWD_VALUE = 259;

	/**
	 * The '<em><b>FSL11A Lv2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Functional Source License, Version 1.1, ALv2 Future License
	 * <!-- end-model-doc -->
	 * @see #FSL11A_LV2
	 * @model name="FSL11ALv2" literal="FSL-1.1-ALv2"
	 * @generated
	 * @ordered
	 */
	public static final int FSL11A_LV2_VALUE = 260;

	/**
	 * The '<em><b>FSL11MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Functional Source License, Version 1.1, MIT Future License
	 * <!-- end-model-doc -->
	 * @see #FSL11MIT
	 * @model literal="FSL-1.1-MIT"
	 * @generated
	 * @ordered
	 */
	public static final int FSL11MIT_VALUE = 261;

	/**
	 * The '<em><b>FTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freetype Project License
	 * <!-- end-model-doc -->
	 * @see #FTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTL_VALUE = 262;

	/**
	 * The '<em><b>Furuseth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Furuseth License
	 * <!-- end-model-doc -->
	 * @see #FURUSETH
	 * @model name="Furuseth"
	 * @generated
	 * @ordered
	 */
	public static final int FURUSETH_VALUE = 263;

	/**
	 * The '<em><b>Fwlw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fwlw License
	 * <!-- end-model-doc -->
	 * @see #FWLW
	 * @model name="fwlw"
	 * @generated
	 * @ordered
	 */
	public static final int FWLW_VALUE = 264;

	/**
	 * The '<em><b>Game Programming Gems</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Game Programming Gems License
	 * <!-- end-model-doc -->
	 * @see #GAME_PROGRAMMING_GEMS
	 * @model name="GameProgrammingGems" literal="Game-Programming-Gems"
	 * @generated
	 * @ordered
	 */
	public static final int GAME_PROGRAMMING_GEMS_VALUE = 265;

	/**
	 * The '<em><b>GCR Docs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gnome GCR Documentation License
	 * <!-- end-model-doc -->
	 * @see #GCR_DOCS
	 * @model name="GCRDocs" literal="GCR-docs"
	 * @generated
	 * @ordered
	 */
	public static final int GCR_DOCS_VALUE = 266;

	/**
	 * The '<em><b>GD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GD License
	 * <!-- end-model-doc -->
	 * @see #GD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GD_VALUE = 267;

	/**
	 * The '<em><b>Generic Xts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic XTS License
	 * <!-- end-model-doc -->
	 * @see #GENERIC_XTS
	 * @model name="genericXts" literal="generic-xts"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_XTS_VALUE = 268;

	/**
	 * The '<em><b>GFDL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1
	 * <!-- end-model-doc -->
	 * @see #GFDL11
	 * @model literal="GFDL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_VALUE = 269;

	/**
	 * The '<em><b>GFDL11 Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_INVARIANTS_ONLY
	 * @model name="GFDL11InvariantsOnly" literal="GFDL-1.1-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_INVARIANTS_ONLY_VALUE = 270;

	/**
	 * The '<em><b>GFDL11 Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_INVARIANTS_OR_LATER
	 * @model name="GFDL11InvariantsOrLater" literal="GFDL-1.1-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_INVARIANTS_OR_LATER_VALUE = 271;

	/**
	 * The '<em><b>GFDL11 No Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_NO_INVARIANTS_ONLY
	 * @model name="GFDL11NoInvariantsOnly" literal="GFDL-1.1-no-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_NO_INVARIANTS_ONLY_VALUE = 272;

	/**
	 * The '<em><b>GFDL11 No Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL11_NO_INVARIANTS_OR_LATER
	 * @model name="GFDL11NoInvariantsOrLater" literal="GFDL-1.1-no-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_NO_INVARIANTS_OR_LATER_VALUE = 273;

	/**
	 * The '<em><b>GFDL11 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only
	 * <!-- end-model-doc -->
	 * @see #GFDL11_ONLY
	 * @model name="GFDL11Only" literal="GFDL-1.1-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_ONLY_VALUE = 274;

	/**
	 * The '<em><b>GFDL11 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL11_OR_LATER
	 * @model name="GFDL11OrLater" literal="GFDL-1.1-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_OR_LATER_VALUE = 275;

	/**
	 * The '<em><b>GFDL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2
	 * <!-- end-model-doc -->
	 * @see #GFDL12
	 * @model literal="GFDL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_VALUE = 276;

	/**
	 * The '<em><b>GFDL12 Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_INVARIANTS_ONLY
	 * @model name="GFDL12InvariantsOnly" literal="GFDL-1.2-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_INVARIANTS_ONLY_VALUE = 277;

	/**
	 * The '<em><b>GFDL12 Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_INVARIANTS_OR_LATER
	 * @model name="GFDL12InvariantsOrLater" literal="GFDL-1.2-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_INVARIANTS_OR_LATER_VALUE = 278;

	/**
	 * The '<em><b>GFDL12 No Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_NO_INVARIANTS_ONLY
	 * @model name="GFDL12NoInvariantsOnly" literal="GFDL-1.2-no-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_NO_INVARIANTS_ONLY_VALUE = 279;

	/**
	 * The '<em><b>GFDL12 No Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL12_NO_INVARIANTS_OR_LATER
	 * @model name="GFDL12NoInvariantsOrLater" literal="GFDL-1.2-no-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_NO_INVARIANTS_OR_LATER_VALUE = 280;

	/**
	 * The '<em><b>GFDL12 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only
	 * <!-- end-model-doc -->
	 * @see #GFDL12_ONLY
	 * @model name="GFDL12Only" literal="GFDL-1.2-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_ONLY_VALUE = 281;

	/**
	 * The '<em><b>GFDL12 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL12_OR_LATER
	 * @model name="GFDL12OrLater" literal="GFDL-1.2-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_OR_LATER_VALUE = 282;

	/**
	 * The '<em><b>GFDL13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3
	 * <!-- end-model-doc -->
	 * @see #GFDL13
	 * @model literal="GFDL-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_VALUE = 283;

	/**
	 * The '<em><b>GFDL13 Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_INVARIANTS_ONLY
	 * @model name="GFDL13InvariantsOnly" literal="GFDL-1.3-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_INVARIANTS_ONLY_VALUE = 284;

	/**
	 * The '<em><b>GFDL13 Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later - invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_INVARIANTS_OR_LATER
	 * @model name="GFDL13InvariantsOrLater" literal="GFDL-1.3-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_INVARIANTS_OR_LATER_VALUE = 285;

	/**
	 * The '<em><b>GFDL13 No Invariants Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_NO_INVARIANTS_ONLY
	 * @model name="GFDL13NoInvariantsOnly" literal="GFDL-1.3-no-invariants-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_NO_INVARIANTS_ONLY_VALUE = 286;

	/**
	 * The '<em><b>GFDL13 No Invariants Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later - no invariants
	 * <!-- end-model-doc -->
	 * @see #GFDL13_NO_INVARIANTS_OR_LATER
	 * @model name="GFDL13NoInvariantsOrLater" literal="GFDL-1.3-no-invariants-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_NO_INVARIANTS_OR_LATER_VALUE = 287;

	/**
	 * The '<em><b>GFDL13 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only
	 * <!-- end-model-doc -->
	 * @see #GFDL13_ONLY
	 * @model name="GFDL13Only" literal="GFDL-1.3-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_ONLY_VALUE = 288;

	/**
	 * The '<em><b>GFDL13 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL13_OR_LATER
	 * @model name="GFDL13OrLater" literal="GFDL-1.3-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_OR_LATER_VALUE = 289;

	/**
	 * The '<em><b>Giftware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Giftware License
	 * <!-- end-model-doc -->
	 * @see #GIFTWARE
	 * @model name="Giftware"
	 * @generated
	 * @ordered
	 */
	public static final int GIFTWARE_VALUE = 290;

	/**
	 * The '<em><b>GL2PS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GL2PS License
	 * <!-- end-model-doc -->
	 * @see #GL2PS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GL2PS_VALUE = 291;

	/**
	 * The '<em><b>Glide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3dfx Glide License
	 * <!-- end-model-doc -->
	 * @see #GLIDE
	 * @model name="Glide"
	 * @generated
	 * @ordered
	 */
	public static final int GLIDE_VALUE = 292;

	/**
	 * The '<em><b>Glulxe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Glulxe License
	 * <!-- end-model-doc -->
	 * @see #GLULXE
	 * @model name="Glulxe"
	 * @generated
	 * @ordered
	 */
	public static final int GLULXE_VALUE = 293;

	/**
	 * The '<em><b>GLWTPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good Luck With That Public License
	 * <!-- end-model-doc -->
	 * @see #GLWTPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLWTPL_VALUE = 294;

	/**
	 * The '<em><b>Gnuplot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gnuplot License
	 * <!-- end-model-doc -->
	 * @see #GNUPLOT
	 * @model name="gnuplot"
	 * @generated
	 * @ordered
	 */
	public static final int GNUPLOT_VALUE = 295;

	/**
	 * The '<em><b>GPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10
	 * @model literal="GPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int GPL10_VALUE = 296;

	/**
	 * The '<em><b>GPL101</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL101
	 * @model literal="GPL-1.0+"
	 * @generated
	 * @ordered
	 */
	public static final int GPL101_VALUE = 297;

	/**
	 * The '<em><b>GPL10 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10_ONLY
	 * @model name="GPL10Only" literal="GPL-1.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL10_ONLY_VALUE = 298;

	/**
	 * The '<em><b>GPL10 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL10_OR_LATER
	 * @model name="GPL10OrLater" literal="GPL-1.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL10_OR_LATER_VALUE = 299;

	/**
	 * The '<em><b>GPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20
	 * @model literal="GPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_VALUE = 300;

	/**
	 * The '<em><b>GPL201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL201
	 * @model literal="GPL-2.0+"
	 * @generated
	 * @ordered
	 */
	public static final int GPL201_VALUE = 301;

	/**
	 * The '<em><b>GPL20 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20_ONLY
	 * @model name="GPL20Only" literal="GPL-2.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_ONLY_VALUE = 302;

	/**
	 * The '<em><b>GPL20 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL20_OR_LATER
	 * @model name="GPL20OrLater" literal="GPL-2.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_OR_LATER_VALUE = 303;

	/**
	 * The '<em><b>GPL20 With Autoconf Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Autoconf exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_AUTOCONF_EXCEPTION
	 * @model name="GPL20WithAutoconfException" literal="GPL-2.0-with-autoconf-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_WITH_AUTOCONF_EXCEPTION_VALUE = 304;

	/**
	 * The '<em><b>GPL20 With Bison Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Bison exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_BISON_EXCEPTION
	 * @model name="GPL20WithBisonException" literal="GPL-2.0-with-bison-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_WITH_BISON_EXCEPTION_VALUE = 305;

	/**
	 * The '<em><b>GPL20 With Classpath Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Classpath exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_CLASSPATH_EXCEPTION
	 * @model name="GPL20WithClasspathException" literal="GPL-2.0-with-classpath-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_WITH_CLASSPATH_EXCEPTION_VALUE = 306;

	/**
	 * The '<em><b>GPL20 With Font Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/Font exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_FONT_EXCEPTION
	 * @model name="GPL20WithFontException" literal="GPL-2.0-with-font-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_WITH_FONT_EXCEPTION_VALUE = 307;

	/**
	 * The '<em><b>GPL20 With GCC Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 w/GCC Runtime Library exception
	 * <!-- end-model-doc -->
	 * @see #GPL20_WITH_GCC_EXCEPTION
	 * @model name="GPL20WithGCCException" literal="GPL-2.0-with-GCC-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_WITH_GCC_EXCEPTION_VALUE = 308;

	/**
	 * The '<em><b>GPL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30
	 * @model literal="GPL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_VALUE = 309;

	/**
	 * The '<em><b>GPL301</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL301
	 * @model literal="GPL-3.0+"
	 * @generated
	 * @ordered
	 */
	public static final int GPL301_VALUE = 310;

	/**
	 * The '<em><b>GPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30_ONLY
	 * @model name="GPL30Only" literal="GPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_ONLY_VALUE = 311;

	/**
	 * The '<em><b>GPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL30_OR_LATER
	 * @model name="GPL30OrLater" literal="GPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_OR_LATER_VALUE = 312;

	/**
	 * The '<em><b>GPL30 With Autoconf Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 w/Autoconf exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_WITH_AUTOCONF_EXCEPTION
	 * @model name="GPL30WithAutoconfException" literal="GPL-3.0-with-autoconf-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_WITH_AUTOCONF_EXCEPTION_VALUE = 313;

	/**
	 * The '<em><b>GPL30 With GCC Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 w/GCC Runtime Library exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_WITH_GCC_EXCEPTION
	 * @model name="GPL30WithGCCException" literal="GPL-3.0-with-GCC-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_WITH_GCC_EXCEPTION_VALUE = 314;

	/**
	 * The '<em><b>Graphics Gems</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphics Gems License
	 * <!-- end-model-doc -->
	 * @see #GRAPHICS_GEMS
	 * @model name="GraphicsGems" literal="Graphics-Gems"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICS_GEMS_VALUE = 315;

	/**
	 * The '<em><b>GSOAP1 3b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gSOAP Public License v1.3b
	 * <!-- end-model-doc -->
	 * @see #GSOAP1_3B
	 * @model name="gSOAP13b" literal="gSOAP-1.3b"
	 * @generated
	 * @ordered
	 */
	public static final int GSOAP1_3B_VALUE = 316;

	/**
	 * The '<em><b>Gtkbook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gtkbook License
	 * <!-- end-model-doc -->
	 * @see #GTKBOOK
	 * @model name="gtkbook"
	 * @generated
	 * @ordered
	 */
	public static final int GTKBOOK_VALUE = 317;

	/**
	 * The '<em><b>Gutmann</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gutmann License
	 * <!-- end-model-doc -->
	 * @see #GUTMANN
	 * @model name="Gutmann"
	 * @generated
	 * @ordered
	 */
	public static final int GUTMANN_VALUE = 318;

	/**
	 * The '<em><b>Haskell Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haskell Language Report License
	 * <!-- end-model-doc -->
	 * @see #HASKELL_REPORT
	 * @model name="HaskellReport"
	 * @generated
	 * @ordered
	 */
	public static final int HASKELL_REPORT_VALUE = 319;

	/**
	 * The '<em><b>HDF5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HDF5 License
	 * <!-- end-model-doc -->
	 * @see #HDF5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDF5_VALUE = 320;

	/**
	 * The '<em><b>Hdparm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hdparm License
	 * <!-- end-model-doc -->
	 * @see #HDPARM
	 * @model name="hdparm"
	 * @generated
	 * @ordered
	 */
	public static final int HDPARM_VALUE = 321;

	/**
	 * The '<em><b>HIDAPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIDAPI License
	 * <!-- end-model-doc -->
	 * @see #HIDAPI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDAPI_VALUE = 322;

	/**
	 * The '<em><b>Hippocratic21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hippocratic License 2.1
	 * <!-- end-model-doc -->
	 * @see #HIPPOCRATIC21
	 * @model name="Hippocratic21" literal="Hippocratic-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int HIPPOCRATIC21_VALUE = 323;

	/**
	 * The '<em><b>HP1986</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard 1986 License
	 * <!-- end-model-doc -->
	 * @see #HP1986
	 * @model literal="HP-1986"
	 * @generated
	 * @ordered
	 */
	public static final int HP1986_VALUE = 324;

	/**
	 * The '<em><b>HP1989</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hewlett-Packard 1989 License
	 * <!-- end-model-doc -->
	 * @see #HP1989
	 * @model literal="HP-1989"
	 * @generated
	 * @ordered
	 */
	public static final int HP1989_VALUE = 325;

	/**
	 * The '<em><b>HPND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPND_VALUE = 326;

	/**
	 * The '<em><b>HPNDDEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - DEC variant
	 * <!-- end-model-doc -->
	 * @see #HPNDDEC
	 * @model literal="HPND-DEC"
	 * @generated
	 * @ordered
	 */
	public static final int HPNDDEC_VALUE = 327;

	/**
	 * The '<em><b>HPND Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - documentation variant
	 * <!-- end-model-doc -->
	 * @see #HPND_DOC
	 * @model name="HPNDDoc" literal="HPND-doc"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_DOC_VALUE = 328;

	/**
	 * The '<em><b>HPND Doc Sell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - documentation sell variant
	 * <!-- end-model-doc -->
	 * @see #HPND_DOC_SELL
	 * @model name="HPNDDocSell" literal="HPND-doc-sell"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_DOC_SELL_VALUE = 329;

	/**
	 * The '<em><b>HPND Export US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US
	 * @model name="HPNDExportUS" literal="HPND-export-US"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_EXPORT_US_VALUE = 330;

	/**
	 * The '<em><b>HPND Export US Acknowledgement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning and acknowledgment
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US_ACKNOWLEDGEMENT
	 * @model name="HPNDExportUSAcknowledgement" literal="HPND-export-US-acknowledgement"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_EXPORT_US_ACKNOWLEDGEMENT_VALUE = 331;

	/**
	 * The '<em><b>HPND Export US Modify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control warning and modification rqmt
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT_US_MODIFY
	 * @model name="HPNDExportUSModify" literal="HPND-export-US-modify"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_EXPORT_US_MODIFY_VALUE = 332;

	/**
	 * The '<em><b>HPND Export2 US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND with US Government export control and 2 disclaimers
	 * <!-- end-model-doc -->
	 * @see #HPND_EXPORT2_US
	 * @model name="HPNDExport2US" literal="HPND-export2-US"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_EXPORT2_US_VALUE = 333;

	/**
	 * The '<em><b>HPND Fenneberg Livingston</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Fenneberg-Livingston variant
	 * <!-- end-model-doc -->
	 * @see #HPND_FENNEBERG_LIVINGSTON
	 * @model name="HPNDFennebergLivingston" literal="HPND-Fenneberg-Livingston"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_FENNEBERG_LIVINGSTON_VALUE = 334;

	/**
	 * The '<em><b>HPNDINRIAIMAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer    - INRIA-IMAG variant
	 * <!-- end-model-doc -->
	 * @see #HPNDINRIAIMAG
	 * @model literal="HPND-INRIA-IMAG"
	 * @generated
	 * @ordered
	 */
	public static final int HPNDINRIAIMAG_VALUE = 335;

	/**
	 * The '<em><b>HPND Intel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Intel variant
	 * <!-- end-model-doc -->
	 * @see #HPND_INTEL
	 * @model name="HPNDIntel" literal="HPND-Intel"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_INTEL_VALUE = 336;

	/**
	 * The '<em><b>HPND Kevlin Henney</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Kevlin Henney variant
	 * <!-- end-model-doc -->
	 * @see #HPND_KEVLIN_HENNEY
	 * @model name="HPNDKevlinHenney" literal="HPND-Kevlin-Henney"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_KEVLIN_HENNEY_VALUE = 337;

	/**
	 * The '<em><b>HPND Markus Kuhn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Markus Kuhn variant
	 * <!-- end-model-doc -->
	 * @see #HPND_MARKUS_KUHN
	 * @model name="HPNDMarkusKuhn" literal="HPND-Markus-Kuhn"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_MARKUS_KUHN_VALUE = 338;

	/**
	 * The '<em><b>HPND Merchantability Variant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - merchantability variant
	 * <!-- end-model-doc -->
	 * @see #HPND_MERCHANTABILITY_VARIANT
	 * @model name="HPNDMerchantabilityVariant" literal="HPND-merchantability-variant"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_MERCHANTABILITY_VARIANT_VALUE = 339;

	/**
	 * The '<em><b>HPNDMIT Disclaimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPNDMIT_DISCLAIMER
	 * @model name="HPNDMITDisclaimer" literal="HPND-MIT-disclaimer"
	 * @generated
	 * @ordered
	 */
	public static final int HPNDMIT_DISCLAIMER_VALUE = 340;

	/**
	 * The '<em><b>HPND Netrek</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Netrek variant
	 * <!-- end-model-doc -->
	 * @see #HPND_NETREK
	 * @model name="HPNDNetrek" literal="HPND-Netrek"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_NETREK_VALUE = 341;

	/**
	 * The '<em><b>HPND Pbmplus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - Pbmplus variant
	 * <!-- end-model-doc -->
	 * @see #HPND_PBMPLUS
	 * @model name="HPNDPbmplus" literal="HPND-Pbmplus"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_PBMPLUS_VALUE = 342;

	/**
	 * The '<em><b>HPND Sell MIT Disclaimer Xserver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell xserver variant with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_MIT_DISCLAIMER_XSERVER
	 * @model name="HPNDSellMITDisclaimerXserver" literal="HPND-sell-MIT-disclaimer-xserver"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_SELL_MIT_DISCLAIMER_XSERVER_VALUE = 343;

	/**
	 * The '<em><b>HPND Sell Regexpr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell regexpr variant
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_REGEXPR
	 * @model name="HPNDSellRegexpr" literal="HPND-sell-regexpr"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_SELL_REGEXPR_VALUE = 344;

	/**
	 * The '<em><b>HPND Sell Variant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - sell variant
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT
	 * @model name="HPNDSellVariant" literal="HPND-sell-variant"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_SELL_VARIANT_VALUE = 345;

	/**
	 * The '<em><b>HPND Sell Variant MIT Disclaimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND sell variant with MIT disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT_MIT_DISCLAIMER
	 * @model name="HPNDSellVariantMITDisclaimer" literal="HPND-sell-variant-MIT-disclaimer"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_SELL_VARIANT_MIT_DISCLAIMER_VALUE = 346;

	/**
	 * The '<em><b>HPND Sell Variant MIT Disclaimer Rev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HPND sell variant with MIT disclaimer - reverse
	 * <!-- end-model-doc -->
	 * @see #HPND_SELL_VARIANT_MIT_DISCLAIMER_REV
	 * @model name="HPNDSellVariantMITDisclaimerRev" literal="HPND-sell-variant-MIT-disclaimer-rev"
	 * @generated
	 * @ordered
	 */
	public static final int HPND_SELL_VARIANT_MIT_DISCLAIMER_REV_VALUE = 347;

	/**
	 * The '<em><b>HPNDUC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - University of California variant
	 * <!-- end-model-doc -->
	 * @see #HPNDUC
	 * @model literal="HPND-UC"
	 * @generated
	 * @ordered
	 */
	public static final int HPNDUC_VALUE = 348;

	/**
	 * The '<em><b>HPNDUC Export US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer - University of California, US export warning
	 * <!-- end-model-doc -->
	 * @see #HPNDUC_EXPORT_US
	 * @model name="HPNDUCExportUS" literal="HPND-UC-export-US"
	 * @generated
	 * @ordered
	 */
	public static final int HPNDUC_EXPORT_US_VALUE = 349;

	/**
	 * The '<em><b>HTMLTIDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML Tidy License
	 * <!-- end-model-doc -->
	 * @see #HTMLTIDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTMLTIDY_VALUE = 350;

	/**
	 * The '<em><b>IBM Pibs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM PowerPC Initialization and Boot Software
	 * <!-- end-model-doc -->
	 * @see #IBM_PIBS
	 * @model name="IBMPibs" literal="IBM-pibs"
	 * @generated
	 * @ordered
	 */
	public static final int IBM_PIBS_VALUE = 351;

	/**
	 * The '<em><b>ICU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICU License
	 * <!-- end-model-doc -->
	 * @see #ICU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICU_VALUE = 352;

	/**
	 * The '<em><b>IEC Code Components EULA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IEC    Code Components End-user licence agreement
	 * <!-- end-model-doc -->
	 * @see #IEC_CODE_COMPONENTS_EULA
	 * @model name="IECCodeComponentsEULA" literal="IEC-Code-Components-EULA"
	 * @generated
	 * @ordered
	 */
	public static final int IEC_CODE_COMPONENTS_EULA_VALUE = 353;

	/**
	 * The '<em><b>IJG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License
	 * <!-- end-model-doc -->
	 * @see #IJG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IJG_VALUE = 354;

	/**
	 * The '<em><b>IJG Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License - short
	 * <!-- end-model-doc -->
	 * @see #IJG_SHORT
	 * @model name="IJGShort" literal="IJG-short"
	 * @generated
	 * @ordered
	 */
	public static final int IJG_SHORT_VALUE = 355;

	/**
	 * The '<em><b>Image Magick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImageMagick License
	 * <!-- end-model-doc -->
	 * @see #IMAGE_MAGICK
	 * @model name="ImageMagick"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_MAGICK_VALUE = 356;

	/**
	 * The '<em><b>IMatix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iMatix Standard Function Library Agreement
	 * <!-- end-model-doc -->
	 * @see #IMATIX
	 * @model name="iMatix"
	 * @generated
	 * @ordered
	 */
	public static final int IMATIX_VALUE = 357;

	/**
	 * The '<em><b>Imlib2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imlib2 License
	 * <!-- end-model-doc -->
	 * @see #IMLIB2
	 * @model name="Imlib2"
	 * @generated
	 * @ordered
	 */
	public static final int IMLIB2_VALUE = 358;

	/**
	 * The '<em><b>Info ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Info-ZIP License
	 * <!-- end-model-doc -->
	 * @see #INFO_ZIP
	 * @model name="InfoZIP" literal="Info-ZIP"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_ZIP_VALUE = 359;

	/**
	 * The '<em><b>Inner Net20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner Net License v2.0
	 * <!-- end-model-doc -->
	 * @see #INNER_NET20
	 * @model name="InnerNet20" literal="Inner-Net-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int INNER_NET20_VALUE = 360;

	/**
	 * The '<em><b>Inno Setup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inno Setup License
	 * <!-- end-model-doc -->
	 * @see #INNO_SETUP
	 * @model name="InnoSetup"
	 * @generated
	 * @ordered
	 */
	public static final int INNO_SETUP_VALUE = 361;

	/**
	 * The '<em><b>Intel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel Open Source License
	 * <!-- end-model-doc -->
	 * @see #INTEL
	 * @model name="Intel"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_VALUE = 362;

	/**
	 * The '<em><b>Intel ACPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel ACPI Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #INTEL_ACPI
	 * @model name="IntelACPI" literal="Intel-ACPI"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_ACPI_VALUE = 363;

	/**
	 * The '<em><b>Interbase10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interbase Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #INTERBASE10
	 * @model name="Interbase10" literal="Interbase-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int INTERBASE10_VALUE = 364;

	/**
	 * The '<em><b>IPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPA Font License
	 * <!-- end-model-doc -->
	 * @see #IPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPA_VALUE = 365;

	/**
	 * The '<em><b>IPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #IPL10
	 * @model literal="IPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int IPL10_VALUE = 366;

	/**
	 * The '<em><b>ISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC License
	 * <!-- end-model-doc -->
	 * @see #ISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISC_VALUE = 367;

	/**
	 * The '<em><b>ISC Veillard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC Veillard variant
	 * <!-- end-model-doc -->
	 * @see #ISC_VEILLARD
	 * @model name="ISCVeillard" literal="ISC-Veillard"
	 * @generated
	 * @ordered
	 */
	public static final int ISC_VEILLARD_VALUE = 368;

	/**
	 * The '<em><b>Jam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jam License
	 * <!-- end-model-doc -->
	 * @see #JAM
	 * @model name="Jam"
	 * @generated
	 * @ordered
	 */
	public static final int JAM_VALUE = 369;

	/**
	 * The '<em><b>Jas Per20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JasPer License
	 * <!-- end-model-doc -->
	 * @see #JAS_PER20
	 * @model name="JasPer20" literal="JasPer-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int JAS_PER20_VALUE = 370;

	/**
	 * The '<em><b>Jove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jove License
	 * <!-- end-model-doc -->
	 * @see #JOVE
	 * @model name="jove"
	 * @generated
	 * @ordered
	 */
	public static final int JOVE_VALUE = 371;

	/**
	 * The '<em><b>JPL Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JPL Image Use Policy
	 * <!-- end-model-doc -->
	 * @see #JPL_IMAGE
	 * @model name="JPLImage" literal="JPL-image"
	 * @generated
	 * @ordered
	 */
	public static final int JPL_IMAGE_VALUE = 372;

	/**
	 * The '<em><b>JPNIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Japan Network Information Center License
	 * <!-- end-model-doc -->
	 * @see #JPNIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPNIC_VALUE = 373;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON License
	 * <!-- end-model-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 374;

	/**
	 * The '<em><b>Kastrup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kastrup License
	 * <!-- end-model-doc -->
	 * @see #KASTRUP
	 * @model name="Kastrup"
	 * @generated
	 * @ordered
	 */
	public static final int KASTRUP_VALUE = 375;

	/**
	 * The '<em><b>Kazlib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kazlib License
	 * <!-- end-model-doc -->
	 * @see #KAZLIB
	 * @model name="Kazlib"
	 * @generated
	 * @ordered
	 */
	public static final int KAZLIB_VALUE = 376;

	/**
	 * The '<em><b>Knuth CTAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Knuth CTAN License
	 * <!-- end-model-doc -->
	 * @see #KNUTH_CTAN
	 * @model name="KnuthCTAN" literal="Knuth-CTAN"
	 * @generated
	 * @ordered
	 */
	public static final int KNUTH_CTAN_VALUE = 377;

	/**
	 * The '<em><b>LAL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.2
	 * <!-- end-model-doc -->
	 * @see #LAL12
	 * @model literal="LAL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int LAL12_VALUE = 378;

	/**
	 * The '<em><b>LAL13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.3
	 * <!-- end-model-doc -->
	 * @see #LAL13
	 * @model literal="LAL-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int LAL13_VALUE = 379;

	/**
	 * The '<em><b>Latex2e</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e License
	 * <!-- end-model-doc -->
	 * @see #LATEX2E
	 * @model name="Latex2e"
	 * @generated
	 * @ordered
	 */
	public static final int LATEX2E_VALUE = 380;

	/**
	 * The '<em><b>Latex2e Translated Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e with translated notice permission
	 * <!-- end-model-doc -->
	 * @see #LATEX2E_TRANSLATED_NOTICE
	 * @model name="Latex2eTranslatedNotice" literal="Latex2e-translated-notice"
	 * @generated
	 * @ordered
	 */
	public static final int LATEX2E_TRANSLATED_NOTICE_VALUE = 381;

	/**
	 * The '<em><b>Leptonica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leptonica License
	 * <!-- end-model-doc -->
	 * @see #LEPTONICA
	 * @model name="Leptonica"
	 * @generated
	 * @ordered
	 */
	public static final int LEPTONICA_VALUE = 382;

	/**
	 * The '<em><b>LGPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20
	 * @model literal="LGPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL20_VALUE = 383;

	/**
	 * The '<em><b>LGPL201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL201
	 * @model literal="LGPL-2.0+"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL201_VALUE = 384;

	/**
	 * The '<em><b>LGPL20 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20_ONLY
	 * @model name="LGPL20Only" literal="LGPL-2.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL20_ONLY_VALUE = 385;

	/**
	 * The '<em><b>LGPL20 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL20_OR_LATER
	 * @model name="LGPL20OrLater" literal="LGPL-2.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL20_OR_LATER_VALUE = 386;

	/**
	 * The '<em><b>LGPL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21
	 * @model literal="LGPL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL21_VALUE = 387;

	/**
	 * The '<em><b>LGPL211</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL211
	 * @model literal="LGPL-2.1+"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL211_VALUE = 388;

	/**
	 * The '<em><b>LGPL21 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21_ONLY
	 * @model name="LGPL21Only" literal="LGPL-2.1-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL21_ONLY_VALUE = 389;

	/**
	 * The '<em><b>LGPL21 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL21_OR_LATER
	 * @model name="LGPL21OrLater" literal="LGPL-2.1-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL21_OR_LATER_VALUE = 390;

	/**
	 * The '<em><b>LGPL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30
	 * @model literal="LGPL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_VALUE = 391;

	/**
	 * The '<em><b>LGPL301</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL301
	 * @model literal="LGPL-3.0+"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL301_VALUE = 392;

	/**
	 * The '<em><b>LGPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30_ONLY
	 * @model name="LGPL30Only" literal="LGPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_ONLY_VALUE = 393;

	/**
	 * The '<em><b>LGPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL30_OR_LATER
	 * @model name="LGPL30OrLater" literal="LGPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_OR_LATER_VALUE = 394;

	/**
	 * The '<em><b>LGPLLR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lesser General Public License For Linguistic Resources
	 * <!-- end-model-doc -->
	 * @see #LGPLLR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LGPLLR_VALUE = 395;

	/**
	 * The '<em><b>Libpng</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpng License
	 * <!-- end-model-doc -->
	 * @see #LIBPNG
	 * @model name="Libpng"
	 * @generated
	 * @ordered
	 */
	public static final int LIBPNG_VALUE = 396;

	/**
	 * The '<em><b>Libpng1635</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PNG Reference Library License v1 (for libpng 0.5 through 1.6.35)
	 * <!-- end-model-doc -->
	 * @see #LIBPNG1635
	 * @model name="libpng1635" literal="libpng-1.6.35"
	 * @generated
	 * @ordered
	 */
	public static final int LIBPNG1635_VALUE = 397;

	/**
	 * The '<em><b>Libpng20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PNG Reference Library version 2
	 * <!-- end-model-doc -->
	 * @see #LIBPNG20
	 * @model name="libpng20" literal="libpng-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int LIBPNG20_VALUE = 398;

	/**
	 * The '<em><b>Libselinux10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libselinux public domain notice
	 * <!-- end-model-doc -->
	 * @see #LIBSELINUX10
	 * @model name="libselinux10" literal="libselinux-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int LIBSELINUX10_VALUE = 399;

	/**
	 * The '<em><b>Libtiff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libtiff License
	 * <!-- end-model-doc -->
	 * @see #LIBTIFF
	 * @model name="libtiff"
	 * @generated
	 * @ordered
	 */
	public static final int LIBTIFF_VALUE = 400;

	/**
	 * The '<em><b>Libutil David Nugent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libutil David Nugent License
	 * <!-- end-model-doc -->
	 * @see #LIBUTIL_DAVID_NUGENT
	 * @model name="libutilDavidNugent" literal="libutil-David-Nugent"
	 * @generated
	 * @ordered
	 */
	public static final int LIBUTIL_DAVID_NUGENT_VALUE = 401;

	/**
	 * The '<em><b>Li Li QP11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Permissive version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QP11
	 * @model name="LiLiQP11" literal="LiLiQ-P-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QP11_VALUE = 402;

	/**
	 * The '<em><b>Li Li QR11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QR11
	 * @model name="LiLiQR11" literal="LiLiQ-R-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QR11_VALUE = 403;

	/**
	 * The '<em><b>Li Li QRplus11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité forte version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QRPLUS11
	 * @model name="LiLiQRplus11" literal="LiLiQ-Rplus-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QRPLUS11_VALUE = 404;

	/**
	 * The '<em><b>Linux Man Pages1 Para</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages - 1 paragraph
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES1_PARA
	 * @model name="LinuxManPages1Para" literal="Linux-man-pages-1-para"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_MAN_PAGES1_PARA_VALUE = 405;

	/**
	 * The '<em><b>Linux Man Pages Copyleft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT
	 * @model name="LinuxManPagesCopyleft" literal="Linux-man-pages-copyleft"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_MAN_PAGES_COPYLEFT_VALUE = 406;

	/**
	 * The '<em><b>Linux Man Pages Copyleft2 Para</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft - 2 paragraphs
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT2_PARA
	 * @model name="LinuxManPagesCopyleft2Para" literal="Linux-man-pages-copyleft-2-para"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_MAN_PAGES_COPYLEFT2_PARA_VALUE = 407;

	/**
	 * The '<em><b>Linux Man Pages Copyleft Var</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux man-pages Copyleft Variant
	 * <!-- end-model-doc -->
	 * @see #LINUX_MAN_PAGES_COPYLEFT_VAR
	 * @model name="LinuxManPagesCopyleftVar" literal="Linux-man-pages-copyleft-var"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_MAN_PAGES_COPYLEFT_VAR_VALUE = 408;

	/**
	 * The '<em><b>Linux Open IB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Kernel Variant of OpenIB.org license
	 * <!-- end-model-doc -->
	 * @see #LINUX_OPEN_IB
	 * @model name="LinuxOpenIB" literal="Linux-OpenIB"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_OPEN_IB_VALUE = 409;

	/**
	 * The '<em><b>LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Lisp LOOP License
	 * <!-- end-model-doc -->
	 * @see #LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_VALUE = 410;

	/**
	 * The '<em><b>LPD Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LPD Documentation License
	 * <!-- end-model-doc -->
	 * @see #LPD_DOCUMENT
	 * @model name="LPDDocument" literal="LPD-document"
	 * @generated
	 * @ordered
	 */
	public static final int LPD_DOCUMENT_VALUE = 411;

	/**
	 * The '<em><b>LPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License Version 1.0
	 * <!-- end-model-doc -->
	 * @see #LPL10
	 * @model literal="LPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int LPL10_VALUE = 412;

	/**
	 * The '<em><b>LPL102</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License v1.02
	 * <!-- end-model-doc -->
	 * @see #LPL102
	 * @model literal="LPL-1.02"
	 * @generated
	 * @ordered
	 */
	public static final int LPL102_VALUE = 413;

	/**
	 * The '<em><b>LPPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #LPPL10
	 * @model literal="LPPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL10_VALUE = 414;

	/**
	 * The '<em><b>LPPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #LPPL11
	 * @model literal="LPPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL11_VALUE = 415;

	/**
	 * The '<em><b>LPPL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #LPPL12
	 * @model literal="LPPL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL12_VALUE = 416;

	/**
	 * The '<em><b>LPPL1 3a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3a
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3A
	 * @model name="LPPL13a" literal="LPPL-1.3a"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL1_3A_VALUE = 417;

	/**
	 * The '<em><b>LPPL1 3c</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3c
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3C
	 * @model name="LPPL13c" literal="LPPL-1.3c"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL1_3C_VALUE = 418;

	/**
	 * The '<em><b>Lsof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lsof License
	 * <!-- end-model-doc -->
	 * @see #LSOF
	 * @model name="lsof"
	 * @generated
	 * @ordered
	 */
	public static final int LSOF_VALUE = 419;

	/**
	 * The '<em><b>Lucida Bitmap Fonts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucida Bitmap Fonts License
	 * <!-- end-model-doc -->
	 * @see #LUCIDA_BITMAP_FONTS
	 * @model name="LucidaBitmapFonts" literal="Lucida-Bitmap-Fonts"
	 * @generated
	 * @ordered
	 */
	public static final int LUCIDA_BITMAP_FONTS_VALUE = 420;

	/**
	 * The '<em><b>LZMASDK911 To920</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA SDK License (versions 9.11 to 9.20)
	 * <!-- end-model-doc -->
	 * @see #LZMASDK911_TO920
	 * @model name="LZMASDK911To920" literal="LZMA-SDK-9.11-to-9.20"
	 * @generated
	 * @ordered
	 */
	public static final int LZMASDK911_TO920_VALUE = 421;

	/**
	 * The '<em><b>LZMASDK922</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA SDK License (versions 9.22 and beyond)
	 * <!-- end-model-doc -->
	 * @see #LZMASDK922
	 * @model literal="LZMA-SDK-9.22"
	 * @generated
	 * @ordered
	 */
	public static final int LZMASDK922_VALUE = 422;

	/**
	 * The '<em><b>Mackerras3 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mackerras 3-Clause License
	 * <!-- end-model-doc -->
	 * @see #MACKERRAS3_CLAUSE
	 * @model name="Mackerras3Clause" literal="Mackerras-3-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int MACKERRAS3_CLAUSE_VALUE = 423;

	/**
	 * The '<em><b>Mackerras3 Clause Acknowledgment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mackerras 3-Clause - acknowledgment variant
	 * <!-- end-model-doc -->
	 * @see #MACKERRAS3_CLAUSE_ACKNOWLEDGMENT
	 * @model name="Mackerras3ClauseAcknowledgment" literal="Mackerras-3-Clause-acknowledgment"
	 * @generated
	 * @ordered
	 */
	public static final int MACKERRAS3_CLAUSE_ACKNOWLEDGMENT_VALUE = 424;

	/**
	 * The '<em><b>Magaz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * magaz License
	 * <!-- end-model-doc -->
	 * @see #MAGAZ
	 * @model name="magaz"
	 * @generated
	 * @ordered
	 */
	public static final int MAGAZ_VALUE = 425;

	/**
	 * The '<em><b>Mailprio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mailprio License
	 * <!-- end-model-doc -->
	 * @see #MAILPRIO
	 * @model name="mailprio"
	 * @generated
	 * @ordered
	 */
	public static final int MAILPRIO_VALUE = 426;

	/**
	 * The '<em><b>Make Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MakeIndex License
	 * <!-- end-model-doc -->
	 * @see #MAKE_INDEX
	 * @model name="MakeIndex"
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_INDEX_VALUE = 427;

	/**
	 * The '<em><b>Man2html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * man2html License
	 * <!-- end-model-doc -->
	 * @see #MAN2HTML
	 * @model name="man2html"
	 * @generated
	 * @ordered
	 */
	public static final int MAN2HTML_VALUE = 428;

	/**
	 * The '<em><b>Martin Birgmeier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Martin Birgmeier License
	 * <!-- end-model-doc -->
	 * @see #MARTIN_BIRGMEIER
	 * @model name="MartinBirgmeier" literal="Martin-Birgmeier"
	 * @generated
	 * @ordered
	 */
	public static final int MARTIN_BIRGMEIER_VALUE = 429;

	/**
	 * The '<em><b>Mc Phee Slideshow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * McPhee Slideshow License
	 * <!-- end-model-doc -->
	 * @see #MC_PHEE_SLIDESHOW
	 * @model name="McPheeSlideshow" literal="McPhee-slideshow"
	 * @generated
	 * @ordered
	 */
	public static final int MC_PHEE_SLIDESHOW_VALUE = 430;

	/**
	 * The '<em><b>Metamail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * metamail License
	 * <!-- end-model-doc -->
	 * @see #METAMAIL
	 * @model name="metamail"
	 * @generated
	 * @ordered
	 */
	public static final int METAMAIL_VALUE = 431;

	/**
	 * The '<em><b>Minpack</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minpack License
	 * <!-- end-model-doc -->
	 * @see #MINPACK
	 * @model name="Minpack"
	 * @generated
	 * @ordered
	 */
	public static final int MINPACK_VALUE = 432;

	/**
	 * The '<em><b>MIPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIPS License
	 * <!-- end-model-doc -->
	 * @see #MIPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIPS_VALUE = 433;

	/**
	 * The '<em><b>Mir OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MirOS Licence
	 * <!-- end-model-doc -->
	 * @see #MIR_OS
	 * @model name="MirOS"
	 * @generated
	 * @ordered
	 */
	public static final int MIR_OS_VALUE = 434;

	/**
	 * The '<em><b>MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License
	 * <!-- end-model-doc -->
	 * @see #MIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIT_VALUE = 435;

	/**
	 * The '<em><b>MIT0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT No Attribution
	 * <!-- end-model-doc -->
	 * @see #MIT0
	 * @model literal="MIT-0"
	 * @generated
	 * @ordered
	 */
	public static final int MIT0_VALUE = 436;

	/**
	 * The '<em><b>MIT Advertising</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enlightenment License (e16)
	 * <!-- end-model-doc -->
	 * @see #MIT_ADVERTISING
	 * @model name="MITAdvertising" literal="MIT-advertising"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_ADVERTISING_VALUE = 437;

	/**
	 * The '<em><b>MIT Click</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Click License
	 * <!-- end-model-doc -->
	 * @see #MIT_CLICK
	 * @model name="MITClick" literal="MIT-Click"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_CLICK_VALUE = 438;

	/**
	 * The '<em><b>MITCMU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU License
	 * <!-- end-model-doc -->
	 * @see #MITCMU
	 * @model literal="MIT-CMU"
	 * @generated
	 * @ordered
	 */
	public static final int MITCMU_VALUE = 439;

	/**
	 * The '<em><b>MIT Enna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enna License
	 * <!-- end-model-doc -->
	 * @see #MIT_ENNA
	 * @model name="MITEnna" literal="MIT-enna"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_ENNA_VALUE = 440;

	/**
	 * The '<em><b>MIT Feh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * feh License
	 * <!-- end-model-doc -->
	 * @see #MIT_FEH
	 * @model name="MITFeh" literal="MIT-feh"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_FEH_VALUE = 441;

	/**
	 * The '<em><b>MIT Festival</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Festival Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_FESTIVAL
	 * @model name="MITFestival" literal="MIT-Festival"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_FESTIVAL_VALUE = 442;

	/**
	 * The '<em><b>MIT Khronos Old</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Khronos - old variant
	 * <!-- end-model-doc -->
	 * @see #MIT_KHRONOS_OLD
	 * @model name="MITKhronosOld" literal="MIT-Khronos-old"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_KHRONOS_OLD_VALUE = 443;

	/**
	 * The '<em><b>MIT Modern Variant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License Modern Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_MODERN_VARIANT
	 * @model name="MITModernVariant" literal="MIT-Modern-Variant"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_MODERN_VARIANT_VALUE = 444;

	/**
	 * The '<em><b>MIT Open Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Open Group variant
	 * <!-- end-model-doc -->
	 * @see #MIT_OPEN_GROUP
	 * @model name="MITOpenGroup" literal="MIT-open-group"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_OPEN_GROUP_VALUE = 445;

	/**
	 * The '<em><b>MIT Testregex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT testregex Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_TESTREGEX
	 * @model name="MITTestregex" literal="MIT-testregex"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_TESTREGEX_VALUE = 446;

	/**
	 * The '<em><b>MIT Wu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT Tom Wu Variant
	 * <!-- end-model-doc -->
	 * @see #MIT_WU
	 * @model name="MITWu" literal="MIT-Wu"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_WU_VALUE = 447;

	/**
	 * The '<em><b>MITNFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT +no-false-attribs license
	 * <!-- end-model-doc -->
	 * @see #MITNFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITNFA_VALUE = 448;

	/**
	 * The '<em><b>MMI Xware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MMIXware License
	 * <!-- end-model-doc -->
	 * @see #MMI_XWARE
	 * @model name="MMIXware"
	 * @generated
	 * @ordered
	 */
	public static final int MMI_XWARE_VALUE = 449;

	/**
	 * The '<em><b>Motosoto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Motosoto License
	 * <!-- end-model-doc -->
	 * @see #MOTOSOTO
	 * @model name="Motosoto"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOSOTO_VALUE = 450;

	/**
	 * The '<em><b>MPEGSSG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MPEG Software Simulation
	 * <!-- end-model-doc -->
	 * @see #MPEGSSG
	 * @model literal="MPEG-SSG"
	 * @generated
	 * @ordered
	 */
	public static final int MPEGSSG_VALUE = 451;

	/**
	 * The '<em><b>Mpi Permissive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpi Permissive License
	 * <!-- end-model-doc -->
	 * @see #MPI_PERMISSIVE
	 * @model name="mpiPermissive" literal="mpi-permissive"
	 * @generated
	 * @ordered
	 */
	public static final int MPI_PERMISSIVE_VALUE = 452;

	/**
	 * The '<em><b>Mpich2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpich2 License
	 * <!-- end-model-doc -->
	 * @see #MPICH2
	 * @model name="mpich2"
	 * @generated
	 * @ordered
	 */
	public static final int MPICH2_VALUE = 453;

	/**
	 * The '<em><b>MPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #MPL10
	 * @model literal="MPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int MPL10_VALUE = 454;

	/**
	 * The '<em><b>MPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #MPL11
	 * @model literal="MPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int MPL11_VALUE = 455;

	/**
	 * The '<em><b>MPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #MPL20
	 * @model literal="MPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int MPL20_VALUE = 456;

	/**
	 * The '<em><b>MPL20 No Copyleft Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0 (no copyleft exception)
	 * <!-- end-model-doc -->
	 * @see #MPL20_NO_COPYLEFT_EXCEPTION
	 * @model name="MPL20NoCopyleftException" literal="MPL-2.0-no-copyleft-exception"
	 * @generated
	 * @ordered
	 */
	public static final int MPL20_NO_COPYLEFT_EXCEPTION_VALUE = 457;

	/**
	 * The '<em><b>Mplus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mplus Font License
	 * <!-- end-model-doc -->
	 * @see #MPLUS
	 * @model name="mplus"
	 * @generated
	 * @ordered
	 */
	public static final int MPLUS_VALUE = 458;

	/**
	 * The '<em><b>MSLPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Limited Public License
	 * <!-- end-model-doc -->
	 * @see #MSLPL
	 * @model literal="MS-LPL"
	 * @generated
	 * @ordered
	 */
	public static final int MSLPL_VALUE = 459;

	/**
	 * The '<em><b>MSPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Public License
	 * <!-- end-model-doc -->
	 * @see #MSPL
	 * @model literal="MS-PL"
	 * @generated
	 * @ordered
	 */
	public static final int MSPL_VALUE = 460;

	/**
	 * The '<em><b>MSRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Reciprocal License
	 * <!-- end-model-doc -->
	 * @see #MSRL
	 * @model literal="MS-RL"
	 * @generated
	 * @ordered
	 */
	public static final int MSRL_VALUE = 461;

	/**
	 * The '<em><b>MTLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Matrix Template Library License
	 * <!-- end-model-doc -->
	 * @see #MTLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTLL_VALUE = 462;

	/**
	 * The '<em><b>Mulan PSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mulan Permissive Software License, Version 1
	 * <!-- end-model-doc -->
	 * @see #MULAN_PSL10
	 * @model name="MulanPSL10" literal="MulanPSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int MULAN_PSL10_VALUE = 463;

	/**
	 * The '<em><b>Mulan PSL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mulan Permissive Software License, Version 2
	 * <!-- end-model-doc -->
	 * @see #MULAN_PSL20
	 * @model name="MulanPSL20" literal="MulanPSL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int MULAN_PSL20_VALUE = 464;

	/**
	 * The '<em><b>Multics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multics License
	 * <!-- end-model-doc -->
	 * @see #MULTICS
	 * @model name="Multics"
	 * @generated
	 * @ordered
	 */
	public static final int MULTICS_VALUE = 465;

	/**
	 * The '<em><b>Mup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mup License
	 * <!-- end-model-doc -->
	 * @see #MUP
	 * @model name="Mup"
	 * @generated
	 * @ordered
	 */
	public static final int MUP_VALUE = 466;

	/**
	 * The '<em><b>NAIST2003</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nara Institute of Science and Technology License (2003)
	 * <!-- end-model-doc -->
	 * @see #NAIST2003
	 * @model literal="NAIST-2003"
	 * @generated
	 * @ordered
	 */
	public static final int NAIST2003_VALUE = 467;

	/**
	 * The '<em><b>NASA13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NASA Open Source Agreement 1.3
	 * <!-- end-model-doc -->
	 * @see #NASA13
	 * @model literal="NASA-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int NASA13_VALUE = 468;

	/**
	 * The '<em><b>Naumen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Naumen Public License
	 * <!-- end-model-doc -->
	 * @see #NAUMEN
	 * @model name="Naumen"
	 * @generated
	 * @ordered
	 */
	public static final int NAUMEN_VALUE = 469;

	/**
	 * The '<em><b>NBPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net Boolean Public License v1
	 * <!-- end-model-doc -->
	 * @see #NBPL10
	 * @model literal="NBPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NBPL10_VALUE = 470;

	/**
	 * The '<em><b>NCBIPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NCBI Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NCBIPD
	 * @model literal="NCBI-PD"
	 * @generated
	 * @ordered
	 */
	public static final int NCBIPD_VALUE = 471;

	/**
	 * The '<em><b>NCGLUK20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Commercial Government Licence
	 * <!-- end-model-doc -->
	 * @see #NCGLUK20
	 * @model literal="NCGL-UK-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int NCGLUK20_VALUE = 472;

	/**
	 * The '<em><b>NCL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NCL Source Code License
	 * <!-- end-model-doc -->
	 * @see #NCL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCL_VALUE = 473;

	/**
	 * The '<em><b>NCSA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * University of Illinois/NCSA Open Source License
	 * <!-- end-model-doc -->
	 * @see #NCSA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCSA_VALUE = 474;

	/**
	 * The '<em><b>Net SNMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net-SNMP License
	 * <!-- end-model-doc -->
	 * @see #NET_SNMP
	 * @model name="NetSNMP" literal="Net-SNMP"
	 * @generated
	 * @ordered
	 */
	public static final int NET_SNMP_VALUE = 475;

	/**
	 * The '<em><b>Net CDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NetCDF license
	 * <!-- end-model-doc -->
	 * @see #NET_CDF
	 * @model name="NetCDF"
	 * @generated
	 * @ordered
	 */
	public static final int NET_CDF_VALUE = 476;

	/**
	 * The '<em><b>Newsletr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Newsletr License
	 * <!-- end-model-doc -->
	 * @see #NEWSLETR
	 * @model name="Newsletr"
	 * @generated
	 * @ordered
	 */
	public static final int NEWSLETR_VALUE = 477;

	/**
	 * The '<em><b>NGPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nethack General Public License
	 * <!-- end-model-doc -->
	 * @see #NGPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NGPL_VALUE = 478;

	/**
	 * The '<em><b>Ngrep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ngrep License
	 * <!-- end-model-doc -->
	 * @see #NGREP
	 * @model name="ngrep"
	 * @generated
	 * @ordered
	 */
	public static final int NGREP_VALUE = 479;

	/**
	 * The '<em><b>NICTA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NICTA Public Software License, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #NICTA10
	 * @model literal="NICTA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NICTA10_VALUE = 480;

	/**
	 * The '<em><b>NISTPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NISTPD
	 * @model literal="NIST-PD"
	 * @generated
	 * @ordered
	 */
	public static final int NISTPD_VALUE = 481;

	/**
	 * The '<em><b>NISTPD Fallback</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Public Domain Notice with license fallback
	 * <!-- end-model-doc -->
	 * @see #NISTPD_FALLBACK
	 * @model name="NISTPDFallback" literal="NIST-PD-fallback"
	 * @generated
	 * @ordered
	 */
	public static final int NISTPD_FALLBACK_VALUE = 482;

	/**
	 * The '<em><b>NIST Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NIST Software License
	 * <!-- end-model-doc -->
	 * @see #NIST_SOFTWARE
	 * @model name="NISTSoftware" literal="NIST-Software"
	 * @generated
	 * @ordered
	 */
	public static final int NIST_SOFTWARE_VALUE = 483;

	/**
	 * The '<em><b>NLOD10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data (NLOD) 1.0
	 * <!-- end-model-doc -->
	 * @see #NLOD10
	 * @model literal="NLOD-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NLOD10_VALUE = 484;

	/**
	 * The '<em><b>NLOD20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data (NLOD) 2.0
	 * <!-- end-model-doc -->
	 * @see #NLOD20
	 * @model literal="NLOD-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int NLOD20_VALUE = 485;

	/**
	 * The '<em><b>NLPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Limit Public License
	 * <!-- end-model-doc -->
	 * @see #NLPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NLPL_VALUE = 486;

	/**
	 * The '<em><b>Nokia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOKIA
	 * @model name="Nokia"
	 * @generated
	 * @ordered
	 */
	public static final int NOKIA_VALUE = 487;

	/**
	 * The '<em><b>NOSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netizen Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOSL_VALUE = 488;

	/**
	 * The '<em><b>Noweb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noweb License
	 * <!-- end-model-doc -->
	 * @see #NOWEB
	 * @model name="Noweb"
	 * @generated
	 * @ordered
	 */
	public static final int NOWEB_VALUE = 489;

	/**
	 * The '<em><b>NPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #NPL10
	 * @model literal="NPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NPL10_VALUE = 490;

	/**
	 * The '<em><b>NPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #NPL11
	 * @model literal="NPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int NPL11_VALUE = 491;

	/**
	 * The '<em><b>NPOSL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Profit Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #NPOSL30
	 * @model literal="NPOSL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int NPOSL30_VALUE = 492;

	/**
	 * The '<em><b>NRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NRL License
	 * <!-- end-model-doc -->
	 * @see #NRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRL_VALUE = 493;

	/**
	 * The '<em><b>NTIAPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTIA Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #NTIAPD
	 * @model literal="NTIA-PD"
	 * @generated
	 * @ordered
	 */
	public static final int NTIAPD_VALUE = 494;

	/**
	 * The '<em><b>NTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP License
	 * <!-- end-model-doc -->
	 * @see #NTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NTP_VALUE = 495;

	/**
	 * The '<em><b>NTP0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP No Attribution
	 * <!-- end-model-doc -->
	 * @see #NTP0
	 * @model literal="NTP-0"
	 * @generated
	 * @ordered
	 */
	public static final int NTP0_VALUE = 496;

	/**
	 * The '<em><b>Nunit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nunit License
	 * <!-- end-model-doc -->
	 * @see #NUNIT
	 * @model name="Nunit"
	 * @generated
	 * @ordered
	 */
	public static final int NUNIT_VALUE = 497;

	/**
	 * The '<em><b>OUDA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Use of Data Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #OUDA10
	 * @model literal="O-UDA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OUDA10_VALUE = 498;

	/**
	 * The '<em><b>OAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAR License
	 * <!-- end-model-doc -->
	 * @see #OAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OAR_VALUE = 499;

	/**
	 * The '<em><b>OCCTPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Technology Public License
	 * <!-- end-model-doc -->
	 * @see #OCCTPL
	 * @model literal="OCCT-PL"
	 * @generated
	 * @ordered
	 */
	public static final int OCCTPL_VALUE = 500;

	/**
	 * The '<em><b>OCLC20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCLC Research Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #OCLC20
	 * @model literal="OCLC-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OCLC20_VALUE = 501;

	/**
	 * The '<em><b>ODb L10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Open Database License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODB_L10
	 * @model name="ODbL10" literal="ODbL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ODB_L10_VALUE = 502;

	/**
	 * The '<em><b>ODC By10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Attribution License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODC_BY10
	 * @model name="ODCBy10" literal="ODC-By-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ODC_BY10_VALUE = 503;

	/**
	 * The '<em><b>OFFIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OFFIS License
	 * <!-- end-model-doc -->
	 * @see #OFFIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFIS_VALUE = 504;

	/**
	 * The '<em><b>OFL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0
	 * <!-- end-model-doc -->
	 * @see #OFL10
	 * @model literal="OFL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OFL10_VALUE = 505;

	/**
	 * The '<em><b>OFL10 No RFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0 with no Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL10_NO_RFN
	 * @model name="OFL10NoRFN" literal="OFL-1.0-no-RFN"
	 * @generated
	 * @ordered
	 */
	public static final int OFL10_NO_RFN_VALUE = 506;

	/**
	 * The '<em><b>OFL10RFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0 with Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL10RFN
	 * @model literal="OFL-1.0-RFN"
	 * @generated
	 * @ordered
	 */
	public static final int OFL10RFN_VALUE = 507;

	/**
	 * The '<em><b>OFL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1
	 * <!-- end-model-doc -->
	 * @see #OFL11
	 * @model literal="OFL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OFL11_VALUE = 508;

	/**
	 * The '<em><b>OFL11 No RFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1 with no Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL11_NO_RFN
	 * @model name="OFL11NoRFN" literal="OFL-1.1-no-RFN"
	 * @generated
	 * @ordered
	 */
	public static final int OFL11_NO_RFN_VALUE = 509;

	/**
	 * The '<em><b>OFL11RFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1 with Reserved Font Name
	 * <!-- end-model-doc -->
	 * @see #OFL11RFN
	 * @model literal="OFL-1.1-RFN"
	 * @generated
	 * @ordered
	 */
	public static final int OFL11RFN_VALUE = 510;

	/**
	 * The '<em><b>OGC10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OGC Software License, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #OGC10
	 * @model literal="OGC-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGC10_VALUE = 511;

	/**
	 * The '<em><b>OGDL Taiwan10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Taiwan Open Government Data License, version 1.0
	 * <!-- end-model-doc -->
	 * @see #OGDL_TAIWAN10
	 * @model name="OGDLTaiwan10" literal="OGDL-Taiwan-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGDL_TAIWAN10_VALUE = 512;

	/**
	 * The '<em><b>OGL Canada20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence - Canada
	 * <!-- end-model-doc -->
	 * @see #OGL_CANADA20
	 * @model name="OGLCanada20" literal="OGL-Canada-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGL_CANADA20_VALUE = 513;

	/**
	 * The '<em><b>OGLUK10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v1.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK10
	 * @model literal="OGL-UK-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGLUK10_VALUE = 514;

	/**
	 * The '<em><b>OGLUK20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v2.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK20
	 * @model literal="OGL-UK-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGLUK20_VALUE = 515;

	/**
	 * The '<em><b>OGLUK30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Government Licence v3.0
	 * <!-- end-model-doc -->
	 * @see #OGLUK30
	 * @model literal="OGL-UK-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int OGLUK30_VALUE = 516;

	/**
	 * The '<em><b>OGTSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Group Test Suite License
	 * <!-- end-model-doc -->
	 * @see #OGTSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OGTSL_VALUE = 517;

	/**
	 * The '<em><b>OLDAP11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP11
	 * @model literal="OLDAP-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP11_VALUE = 518;

	/**
	 * The '<em><b>OLDAP12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP12
	 * @model literal="OLDAP-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP12_VALUE = 519;

	/**
	 * The '<em><b>OLDAP13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP13
	 * @model literal="OLDAP-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP13_VALUE = 520;

	/**
	 * The '<em><b>OLDAP14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP14
	 * @model literal="OLDAP-1.4"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP14_VALUE = 521;

	/**
	 * The '<em><b>OLDAP20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)
	 * <!-- end-model-doc -->
	 * @see #OLDAP20
	 * @model literal="OLDAP-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP20_VALUE = 522;

	/**
	 * The '<em><b>OLDAP201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP201
	 * @model literal="OLDAP-2.0.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP201_VALUE = 523;

	/**
	 * The '<em><b>OLDAP21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP21
	 * @model literal="OLDAP-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP21_VALUE = 524;

	/**
	 * The '<em><b>OLDAP22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP22
	 * @model literal="OLDAP-2.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP22_VALUE = 525;

	/**
	 * The '<em><b>OLDAP221</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP221
	 * @model literal="OLDAP-2.2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP221_VALUE = 526;

	/**
	 * The '<em><b>OLDAP222</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License 2.2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP222
	 * @model literal="OLDAP-2.2.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP222_VALUE = 527;

	/**
	 * The '<em><b>OLDAP23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP23
	 * @model literal="OLDAP-2.3"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP23_VALUE = 528;

	/**
	 * The '<em><b>OLDAP24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP24
	 * @model literal="OLDAP-2.4"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP24_VALUE = 529;

	/**
	 * The '<em><b>OLDAP25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.5
	 * <!-- end-model-doc -->
	 * @see #OLDAP25
	 * @model literal="OLDAP-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP25_VALUE = 530;

	/**
	 * The '<em><b>OLDAP26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.6
	 * <!-- end-model-doc -->
	 * @see #OLDAP26
	 * @model literal="OLDAP-2.6"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP26_VALUE = 531;

	/**
	 * The '<em><b>OLDAP27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.7
	 * <!-- end-model-doc -->
	 * @see #OLDAP27
	 * @model literal="OLDAP-2.7"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP27_VALUE = 532;

	/**
	 * The '<em><b>OLDAP28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.8
	 * <!-- end-model-doc -->
	 * @see #OLDAP28
	 * @model literal="OLDAP-2.8"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP28_VALUE = 533;

	/**
	 * The '<em><b>OLFL13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Logistics Foundation License Version 1.3
	 * <!-- end-model-doc -->
	 * @see #OLFL13
	 * @model literal="OLFL-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int OLFL13_VALUE = 534;

	/**
	 * The '<em><b>OML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Market License
	 * <!-- end-model-doc -->
	 * @see #OML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OML_VALUE = 535;

	/**
	 * The '<em><b>Open PBS23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenPBS v2.3 Software License
	 * <!-- end-model-doc -->
	 * @see #OPEN_PBS23
	 * @model name="OpenPBS23" literal="OpenPBS-2.3"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_PBS23_VALUE = 536;

	/**
	 * The '<em><b>Open SSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL
	 * @model name="OpenSSL"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SSL_VALUE = 537;

	/**
	 * The '<em><b>Open SSL Standalone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License - standalone
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL_STANDALONE
	 * @model name="OpenSSLStandalone" literal="OpenSSL-standalone"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SSL_STANDALONE_VALUE = 538;

	/**
	 * The '<em><b>Open Vision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenVision License
	 * <!-- end-model-doc -->
	 * @see #OPEN_VISION
	 * @model name="OpenVision"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VISION_VALUE = 539;

	/**
	 * The '<em><b>OPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPL10
	 * @model literal="OPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OPL10_VALUE = 540;

	/**
	 * The '<em><b>OPLUK30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * United    Kingdom Open Parliament Licence v3.0
	 * <!-- end-model-doc -->
	 * @see #OPLUK30
	 * @model literal="OPL-UK-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int OPLUK30_VALUE = 541;

	/**
	 * The '<em><b>OPUBL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Publication License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPUBL10
	 * @model literal="OPUBL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OPUBL10_VALUE = 542;

	/**
	 * The '<em><b>OSETPL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OSET Public License version 2.1
	 * <!-- end-model-doc -->
	 * @see #OSETPL21
	 * @model literal="OSET-PL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSETPL21_VALUE = 543;

	/**
	 * The '<em><b>OSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #OSL10
	 * @model literal="OSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL10_VALUE = 544;

	/**
	 * The '<em><b>OSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.1
	 * <!-- end-model-doc -->
	 * @see #OSL11
	 * @model literal="OSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSL11_VALUE = 545;

	/**
	 * The '<em><b>OSL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.0
	 * <!-- end-model-doc -->
	 * @see #OSL20
	 * @model literal="OSL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL20_VALUE = 546;

	/**
	 * The '<em><b>OSL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.1
	 * <!-- end-model-doc -->
	 * @see #OSL21
	 * @model literal="OSL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSL21_VALUE = 547;

	/**
	 * The '<em><b>OSL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #OSL30
	 * @model literal="OSL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL30_VALUE = 548;

	/**
	 * The '<em><b>PADL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PADL License
	 * <!-- end-model-doc -->
	 * @see #PADL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PADL_VALUE = 549;

	/**
	 * The '<em><b>Parity600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parity Public License 6.0.0
	 * <!-- end-model-doc -->
	 * @see #PARITY600
	 * @model name="Parity600" literal="Parity-6.0.0"
	 * @generated
	 * @ordered
	 */
	public static final int PARITY600_VALUE = 550;

	/**
	 * The '<em><b>Parity700</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parity Public License 7.0.0
	 * <!-- end-model-doc -->
	 * @see #PARITY700
	 * @model name="Parity700" literal="Parity-7.0.0"
	 * @generated
	 * @ordered
	 */
	public static final int PARITY700_VALUE = 551;

	/**
	 * The '<em><b>PDDL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Data Commons Public Domain Dedication & License 1.0
	 * <!-- end-model-doc -->
	 * @see #PDDL10
	 * @model literal="PDDL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int PDDL10_VALUE = 552;

	/**
	 * The '<em><b>PHP30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.0
	 * <!-- end-model-doc -->
	 * @see #PHP30
	 * @model literal="PHP-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int PHP30_VALUE = 553;

	/**
	 * The '<em><b>PHP301</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.01
	 * <!-- end-model-doc -->
	 * @see #PHP301
	 * @model literal="PHP-3.01"
	 * @generated
	 * @ordered
	 */
	public static final int PHP301_VALUE = 554;

	/**
	 * The '<em><b>Pixar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pixar License
	 * <!-- end-model-doc -->
	 * @see #PIXAR
	 * @model name="Pixar"
	 * @generated
	 * @ordered
	 */
	public static final int PIXAR_VALUE = 555;

	/**
	 * The '<em><b>Pkgconf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pkgconf License
	 * <!-- end-model-doc -->
	 * @see #PKGCONF
	 * @model name="pkgconf"
	 * @generated
	 * @ordered
	 */
	public static final int PKGCONF_VALUE = 556;

	/**
	 * The '<em><b>Plexus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plexus Classworlds License
	 * <!-- end-model-doc -->
	 * @see #PLEXUS
	 * @model name="Plexus"
	 * @generated
	 * @ordered
	 */
	public static final int PLEXUS_VALUE = 557;

	/**
	 * The '<em><b>Pnmstitch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pnmstitch License
	 * <!-- end-model-doc -->
	 * @see #PNMSTITCH
	 * @model name="pnmstitch"
	 * @generated
	 * @ordered
	 */
	public static final int PNMSTITCH_VALUE = 558;

	/**
	 * The '<em><b>Poly Form Noncommercial100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolyForm Noncommercial License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #POLY_FORM_NONCOMMERCIAL100
	 * @model name="PolyFormNoncommercial100" literal="PolyForm-Noncommercial-1.0.0"
	 * @generated
	 * @ordered
	 */
	public static final int POLY_FORM_NONCOMMERCIAL100_VALUE = 559;

	/**
	 * The '<em><b>Poly Form Small Business100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolyForm Small Business License 1.0.0
	 * <!-- end-model-doc -->
	 * @see #POLY_FORM_SMALL_BUSINESS100
	 * @model name="PolyFormSmallBusiness100" literal="PolyForm-Small-Business-1.0.0"
	 * @generated
	 * @ordered
	 */
	public static final int POLY_FORM_SMALL_BUSINESS100_VALUE = 560;

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostgreSQL License
	 * <!-- end-model-doc -->
	 * @see #POSTGRE_SQL
	 * @model name="PostgreSQL"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRE_SQL_VALUE = 561;

	/**
	 * The '<em><b>PPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peer Production License
	 * <!-- end-model-doc -->
	 * @see #PPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPL_VALUE = 562;

	/**
	 * The '<em><b>PSF20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python Software Foundation License 2.0
	 * <!-- end-model-doc -->
	 * @see #PSF20
	 * @model literal="PSF-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int PSF20_VALUE = 563;

	/**
	 * The '<em><b>Psfrag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psfrag License
	 * <!-- end-model-doc -->
	 * @see #PSFRAG
	 * @model name="psfrag"
	 * @generated
	 * @ordered
	 */
	public static final int PSFRAG_VALUE = 564;

	/**
	 * The '<em><b>Psutils</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psutils License
	 * <!-- end-model-doc -->
	 * @see #PSUTILS
	 * @model name="psutils"
	 * @generated
	 * @ordered
	 */
	public static final int PSUTILS_VALUE = 565;

	/**
	 * The '<em><b>Python20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0
	 * <!-- end-model-doc -->
	 * @see #PYTHON20
	 * @model name="Python20" literal="Python-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int PYTHON20_VALUE = 566;

	/**
	 * The '<em><b>Python201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0.1
	 * <!-- end-model-doc -->
	 * @see #PYTHON201
	 * @model name="Python201" literal="Python-2.0.1"
	 * @generated
	 * @ordered
	 */
	public static final int PYTHON201_VALUE = 567;

	/**
	 * The '<em><b>Python Ldap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python ldap License
	 * <!-- end-model-doc -->
	 * @see #PYTHON_LDAP
	 * @model name="pythonLdap" literal="python-ldap"
	 * @generated
	 * @ordered
	 */
	public static final int PYTHON_LDAP_VALUE = 568;

	/**
	 * The '<em><b>Qhull</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qhull License
	 * <!-- end-model-doc -->
	 * @see #QHULL
	 * @model name="Qhull"
	 * @generated
	 * @ordered
	 */
	public static final int QHULL_VALUE = 569;

	/**
	 * The '<em><b>QPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #QPL10
	 * @model literal="QPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int QPL10_VALUE = 570;

	/**
	 * The '<em><b>QPL10INRIA2004</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0 - INRIA 2004 variant
	 * <!-- end-model-doc -->
	 * @see #QPL10INRIA2004
	 * @model literal="QPL-1.0-INRIA-2004"
	 * @generated
	 * @ordered
	 */
	public static final int QPL10INRIA2004_VALUE = 571;

	/**
	 * The '<em><b>Radvd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * radvd License
	 * <!-- end-model-doc -->
	 * @see #RADVD
	 * @model name="radvd"
	 * @generated
	 * @ordered
	 */
	public static final int RADVD_VALUE = 572;

	/**
	 * The '<em><b>Rdisc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rdisc License
	 * <!-- end-model-doc -->
	 * @see #RDISC
	 * @model name="Rdisc"
	 * @generated
	 * @ordered
	 */
	public static final int RDISC_VALUE = 573;

	/**
	 * The '<em><b>RHe Cos11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Red Hat eCos Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #RHE_COS11
	 * @model name="RHeCos11" literal="RHeCos-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int RHE_COS11_VALUE = 574;

	/**
	 * The '<em><b>RPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #RPL11
	 * @model literal="RPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int RPL11_VALUE = 575;

	/**
	 * The '<em><b>RPL15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.5
	 * <!-- end-model-doc -->
	 * @see #RPL15
	 * @model literal="RPL-1.5"
	 * @generated
	 * @ordered
	 */
	public static final int RPL15_VALUE = 576;

	/**
	 * The '<em><b>RPSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RealNetworks Public Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #RPSL10
	 * @model literal="RPSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int RPSL10_VALUE = 577;

	/**
	 * The '<em><b>RSAMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RSA Message-Digest License
	 * <!-- end-model-doc -->
	 * @see #RSAMD
	 * @model literal="RSA-MD"
	 * @generated
	 * @ordered
	 */
	public static final int RSAMD_VALUE = 578;

	/**
	 * The '<em><b>RSCPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ricoh Source Code Public License
	 * <!-- end-model-doc -->
	 * @see #RSCPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSCPL_VALUE = 579;

	/**
	 * The '<em><b>Ruby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby License
	 * <!-- end-model-doc -->
	 * @see #RUBY
	 * @model name="Ruby"
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_VALUE = 580;

	/**
	 * The '<em><b>Ruby Pty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby pty extension license
	 * <!-- end-model-doc -->
	 * @see #RUBY_PTY
	 * @model name="RubyPty" literal="Ruby-pty"
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_PTY_VALUE = 581;

	/**
	 * The '<em><b>SAXPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #SAXPD
	 * @model literal="SAX-PD"
	 * @generated
	 * @ordered
	 */
	public static final int SAXPD_VALUE = 582;

	/**
	 * The '<em><b>SAXPD20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice 2.0
	 * <!-- end-model-doc -->
	 * @see #SAXPD20
	 * @model literal="SAX-PD-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SAXPD20_VALUE = 583;

	/**
	 * The '<em><b>Saxpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saxpath License
	 * <!-- end-model-doc -->
	 * @see #SAXPATH
	 * @model name="Saxpath"
	 * @generated
	 * @ordered
	 */
	public static final int SAXPATH_VALUE = 584;

	/**
	 * The '<em><b>SCEA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SCEA Shared Source License
	 * <!-- end-model-doc -->
	 * @see #SCEA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCEA_VALUE = 585;

	/**
	 * The '<em><b>Scheme Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Language Report License
	 * <!-- end-model-doc -->
	 * @see #SCHEME_REPORT
	 * @model name="SchemeReport"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEME_REPORT_VALUE = 586;

	/**
	 * The '<em><b>Sendmail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL
	 * @model name="Sendmail"
	 * @generated
	 * @ordered
	 */
	public static final int SENDMAIL_VALUE = 587;

	/**
	 * The '<em><b>Sendmail823</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License 8.23
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL823
	 * @model name="Sendmail823" literal="Sendmail-8.23"
	 * @generated
	 * @ordered
	 */
	public static final int SENDMAIL823_VALUE = 588;

	/**
	 * The '<em><b>Sendmail Open Source11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL_OPEN_SOURCE11
	 * @model name="SendmailOpenSource11" literal="Sendmail-Open-Source-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int SENDMAIL_OPEN_SOURCE11_VALUE = 589;

	/**
	 * The '<em><b>SGIB10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.0
	 * <!-- end-model-doc -->
	 * @see #SGIB10
	 * @model literal="SGI-B-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB10_VALUE = 590;

	/**
	 * The '<em><b>SGIB11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.1
	 * <!-- end-model-doc -->
	 * @see #SGIB11
	 * @model literal="SGI-B-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB11_VALUE = 591;

	/**
	 * The '<em><b>SGIB20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v2.0
	 * <!-- end-model-doc -->
	 * @see #SGIB20
	 * @model literal="SGI-B-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB20_VALUE = 592;

	/**
	 * The '<em><b>SGI Open GL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI OpenGL License
	 * <!-- end-model-doc -->
	 * @see #SGI_OPEN_GL
	 * @model name="SGIOpenGL" literal="SGI-OpenGL"
	 * @generated
	 * @ordered
	 */
	public static final int SGI_OPEN_GL_VALUE = 593;

	/**
	 * The '<em><b>SGP4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGP4 Permission Notice
	 * <!-- end-model-doc -->
	 * @see #SGP4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGP4_VALUE = 594;

	/**
	 * The '<em><b>SHL05</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v0.5
	 * <!-- end-model-doc -->
	 * @see #SHL05
	 * @model literal="SHL-0.5"
	 * @generated
	 * @ordered
	 */
	public static final int SHL05_VALUE = 595;

	/**
	 * The '<em><b>SHL051</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License, Version 0.51
	 * <!-- end-model-doc -->
	 * @see #SHL051
	 * @model literal="SHL-0.51"
	 * @generated
	 * @ordered
	 */
	public static final int SHL051_VALUE = 596;

	/**
	 * The '<em><b>Sim PL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #SIM_PL20
	 * @model name="SimPL20" literal="SimPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SIM_PL20_VALUE = 597;

	/**
	 * The '<em><b>SISSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SISSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SISSL_VALUE = 598;

	/**
	 * The '<em><b>SISSL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.2
	 * <!-- end-model-doc -->
	 * @see #SISSL12
	 * @model literal="SISSL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int SISSL12_VALUE = 599;

	/**
	 * The '<em><b>SL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SL License
	 * <!-- end-model-doc -->
	 * @see #SL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SL_VALUE = 600;

	/**
	 * The '<em><b>Sleepycat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sleepycat License
	 * <!-- end-model-doc -->
	 * @see #SLEEPYCAT
	 * @model name="Sleepycat"
	 * @generated
	 * @ordered
	 */
	public static final int SLEEPYCAT_VALUE = 601;

	/**
	 * The '<em><b>SMAILGPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMAIL General Public License
	 * <!-- end-model-doc -->
	 * @see #SMAILGPL
	 * @model literal="SMAIL-GPL"
	 * @generated
	 * @ordered
	 */
	public static final int SMAILGPL_VALUE = 602;

	/**
	 * The '<em><b>SMLNJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #SMLNJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMLNJ_VALUE = 603;

	/**
	 * The '<em><b>SMPPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Messaging Protocol Public License
	 * <!-- end-model-doc -->
	 * @see #SMPPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMPPL_VALUE = 604;

	/**
	 * The '<em><b>SNIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SNIA Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #SNIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNIA_VALUE = 605;

	/**
	 * The '<em><b>Snprintf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * snprintf License
	 * <!-- end-model-doc -->
	 * @see #SNPRINTF
	 * @model name="snprintf"
	 * @generated
	 * @ordered
	 */
	public static final int SNPRINTF_VALUE = 606;

	/**
	 * The '<em><b>SOFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOFA Software License
	 * <!-- end-model-doc -->
	 * @see #SOFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOFA_VALUE = 607;

	/**
	 * The '<em><b>Soft Surfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * softSurfer License
	 * <!-- end-model-doc -->
	 * @see #SOFT_SURFER
	 * @model name="softSurfer"
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_SURFER_VALUE = 608;

	/**
	 * The '<em><b>Soundex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soundex License
	 * <!-- end-model-doc -->
	 * @see #SOUNDEX
	 * @model name="Soundex"
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDEX_VALUE = 609;

	/**
	 * The '<em><b>Spencer86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 86
	 * <!-- end-model-doc -->
	 * @see #SPENCER86
	 * @model name="Spencer86" literal="Spencer-86"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER86_VALUE = 610;

	/**
	 * The '<em><b>Spencer94</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 94
	 * <!-- end-model-doc -->
	 * @see #SPENCER94
	 * @model name="Spencer94" literal="Spencer-94"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER94_VALUE = 611;

	/**
	 * The '<em><b>Spencer99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 99
	 * <!-- end-model-doc -->
	 * @see #SPENCER99
	 * @model name="Spencer99" literal="Spencer-99"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER99_VALUE = 612;

	/**
	 * The '<em><b>SPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #SPL10
	 * @model literal="SPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SPL10_VALUE = 613;

	/**
	 * The '<em><b>Ssh Keyscan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ssh-keyscan License
	 * <!-- end-model-doc -->
	 * @see #SSH_KEYSCAN
	 * @model name="sshKeyscan" literal="ssh-keyscan"
	 * @generated
	 * @ordered
	 */
	public static final int SSH_KEYSCAN_VALUE = 614;

	/**
	 * The '<em><b>SSH Open SSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSH OpenSSH license
	 * <!-- end-model-doc -->
	 * @see #SSH_OPEN_SSH
	 * @model name="SSHOpenSSH" literal="SSH-OpenSSH"
	 * @generated
	 * @ordered
	 */
	public static final int SSH_OPEN_SSH_VALUE = 615;

	/**
	 * The '<em><b>SSH Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSH short notice
	 * <!-- end-model-doc -->
	 * @see #SSH_SHORT
	 * @model name="SSHShort" literal="SSH-short"
	 * @generated
	 * @ordered
	 */
	public static final int SSH_SHORT_VALUE = 616;

	/**
	 * The '<em><b>SS Leay Standalone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSLeay License - standalone
	 * <!-- end-model-doc -->
	 * @see #SS_LEAY_STANDALONE
	 * @model name="SSLeayStandalone" literal="SSLeay-standalone"
	 * @generated
	 * @ordered
	 */
	public static final int SS_LEAY_STANDALONE_VALUE = 617;

	/**
	 * The '<em><b>SSPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Server Side Public License, v 1
	 * <!-- end-model-doc -->
	 * @see #SSPL10
	 * @model literal="SSPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SSPL10_VALUE = 618;

	/**
	 * The '<em><b>Standard MLNJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #STANDARD_MLNJ
	 * @model name="StandardMLNJ" literal="StandardML-NJ"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_MLNJ_VALUE = 619;

	/**
	 * The '<em><b>Sugar CRM113</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SugarCRM Public License v1.1.3
	 * <!-- end-model-doc -->
	 * @see #SUGAR_CRM113
	 * @model name="SugarCRM113" literal="SugarCRM-1.1.3"
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_CRM113_VALUE = 620;

	/**
	 * The '<em><b>SUL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sustainable Use License v1.0
	 * <!-- end-model-doc -->
	 * @see #SUL10
	 * @model literal="SUL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SUL10_VALUE = 621;

	/**
	 * The '<em><b>Sun PPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun PPP License
	 * <!-- end-model-doc -->
	 * @see #SUN_PPP
	 * @model name="SunPPP" literal="Sun-PPP"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_PPP_VALUE = 622;

	/**
	 * The '<em><b>Sun PPP2000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun PPP License (2000)
	 * <!-- end-model-doc -->
	 * @see #SUN_PPP2000
	 * @model name="SunPPP2000" literal="Sun-PPP-2000"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_PPP2000_VALUE = 623;

	/**
	 * The '<em><b>Sun Pro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SunPro License
	 * <!-- end-model-doc -->
	 * @see #SUN_PRO
	 * @model name="SunPro"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_PRO_VALUE = 624;

	/**
	 * The '<em><b>SWL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Widget Library (SWL) Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #SWL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWL_VALUE = 625;

	/**
	 * The '<em><b>Swrule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * swrule License
	 * <!-- end-model-doc -->
	 * @see #SWRULE
	 * @model name="swrule"
	 * @generated
	 * @ordered
	 */
	public static final int SWRULE_VALUE = 626;

	/**
	 * The '<em><b>Symlinks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symlinks License
	 * <!-- end-model-doc -->
	 * @see #SYMLINKS
	 * @model name="Symlinks"
	 * @generated
	 * @ordered
	 */
	public static final int SYMLINKS_VALUE = 627;

	/**
	 * The '<em><b>TAPROHL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TAPR Open Hardware License v1.0
	 * <!-- end-model-doc -->
	 * @see #TAPROHL10
	 * @model literal="TAPR-OHL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int TAPROHL10_VALUE = 628;

	/**
	 * The '<em><b>TCL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCL/TK License
	 * <!-- end-model-doc -->
	 * @see #TCL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCL_VALUE = 629;

	/**
	 * The '<em><b>TCP Wrappers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCP Wrappers License
	 * <!-- end-model-doc -->
	 * @see #TCP_WRAPPERS
	 * @model name="TCPWrappers" literal="TCP-wrappers"
	 * @generated
	 * @ordered
	 */
	public static final int TCP_WRAPPERS_VALUE = 630;

	/**
	 * The '<em><b>Term Read Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TermReadKey License
	 * <!-- end-model-doc -->
	 * @see #TERM_READ_KEY
	 * @model name="TermReadKey"
	 * @generated
	 * @ordered
	 */
	public static final int TERM_READ_KEY_VALUE = 631;

	/**
	 * The '<em><b>TGPPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive Grace Period Public Licence 1.0
	 * <!-- end-model-doc -->
	 * @see #TGPPL10
	 * @model literal="TGPPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int TGPPL10_VALUE = 632;

	/**
	 * The '<em><b>Third Eye</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ThirdEye License
	 * <!-- end-model-doc -->
	 * @see #THIRD_EYE
	 * @model name="ThirdEye"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_EYE_VALUE = 633;

	/**
	 * The '<em><b>Threeparttable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * threeparttable License
	 * <!-- end-model-doc -->
	 * @see #THREEPARTTABLE
	 * @model name="threeparttable"
	 * @generated
	 * @ordered
	 */
	public static final int THREEPARTTABLE_VALUE = 634;

	/**
	 * The '<em><b>TMate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TMate Open Source License
	 * <!-- end-model-doc -->
	 * @see #TMATE
	 * @model name="TMate"
	 * @generated
	 * @ordered
	 */
	public static final int TMATE_VALUE = 635;

	/**
	 * The '<em><b>TORQUE11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TORQUE v2.5+ Software License v1.1
	 * <!-- end-model-doc -->
	 * @see #TORQUE11
	 * @model literal="TORQUE-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int TORQUE11_VALUE = 636;

	/**
	 * The '<em><b>TOSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trusster Open Source License
	 * <!-- end-model-doc -->
	 * @see #TOSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOSL_VALUE = 637;

	/**
	 * The '<em><b>TPDL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time::ParseDate License
	 * <!-- end-model-doc -->
	 * @see #TPDL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TPDL_VALUE = 638;

	/**
	 * The '<em><b>TPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * THOR Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #TPL10
	 * @model literal="TPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int TPL10_VALUE = 639;

	/**
	 * The '<em><b>Trusted QSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TrustedQSL License
	 * <!-- end-model-doc -->
	 * @see #TRUSTED_QSL
	 * @model name="TrustedQSL"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_QSL_VALUE = 640;

	/**
	 * The '<em><b>TTWL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text-Tabs+Wrap License
	 * <!-- end-model-doc -->
	 * @see #TTWL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TTWL_VALUE = 641;

	/**
	 * The '<em><b>TTYP0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TTYP0 License
	 * <!-- end-model-doc -->
	 * @see #TTYP0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TTYP0_VALUE = 642;

	/**
	 * The '<em><b>TU Berlin10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Universitaet Berlin License 1.0
	 * <!-- end-model-doc -->
	 * @see #TU_BERLIN10
	 * @model name="TUBerlin10" literal="TU-Berlin-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int TU_BERLIN10_VALUE = 643;

	/**
	 * The '<em><b>TU Berlin20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Universitaet Berlin License 2.0
	 * <!-- end-model-doc -->
	 * @see #TU_BERLIN20
	 * @model name="TUBerlin20" literal="TU-Berlin-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int TU_BERLIN20_VALUE = 644;

	/**
	 * The '<em><b>Ubuntu Font10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ubuntu Font Licence v1.0
	 * <!-- end-model-doc -->
	 * @see #UBUNTU_FONT10
	 * @model name="UbuntuFont10" literal="Ubuntu-font-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_FONT10_VALUE = 645;

	/**
	 * The '<em><b>UCAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UCAR License
	 * <!-- end-model-doc -->
	 * @see #UCAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UCAR_VALUE = 646;

	/**
	 * The '<em><b>UCL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upstream Compatibility License v1.0
	 * <!-- end-model-doc -->
	 * @see #UCL10
	 * @model literal="UCL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int UCL10_VALUE = 647;

	/**
	 * The '<em><b>Ulem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ulem License
	 * <!-- end-model-doc -->
	 * @see #ULEM
	 * @model name="ulem"
	 * @generated
	 * @ordered
	 */
	public static final int ULEM_VALUE = 648;

	/**
	 * The '<em><b>UMich Merit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Michigan/Merit Networks License
	 * <!-- end-model-doc -->
	 * @see #UMICH_MERIT
	 * @model name="UMichMerit" literal="UMich-Merit"
	 * @generated
	 * @ordered
	 */
	public static final int UMICH_MERIT_VALUE = 649;

	/**
	 * The '<em><b>Unicode30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License v3
	 * <!-- end-model-doc -->
	 * @see #UNICODE30
	 * @model name="Unicode30" literal="Unicode-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE30_VALUE = 650;

	/**
	 * The '<em><b>Unicode DFS2015</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2015)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2015
	 * @model name="UnicodeDFS2015" literal="Unicode-DFS-2015"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_DFS2015_VALUE = 651;

	/**
	 * The '<em><b>Unicode DFS2016</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2016)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2016
	 * @model name="UnicodeDFS2016" literal="Unicode-DFS-2016"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_DFS2016_VALUE = 652;

	/**
	 * The '<em><b>Unicode TOU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode Terms of Use
	 * <!-- end-model-doc -->
	 * @see #UNICODE_TOU
	 * @model name="UnicodeTOU" literal="Unicode-TOU"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_TOU_VALUE = 653;

	/**
	 * The '<em><b>Unix Crypt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UnixCrypt License
	 * <!-- end-model-doc -->
	 * @see #UNIX_CRYPT
	 * @model name="UnixCrypt"
	 * @generated
	 * @ordered
	 */
	public static final int UNIX_CRYPT_VALUE = 654;

	/**
	 * The '<em><b>Unlicense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Unlicense
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE
	 * @model name="Unlicense"
	 * @generated
	 * @ordered
	 */
	public static final int UNLICENSE_VALUE = 655;

	/**
	 * The '<em><b>Unlicense Libtelnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unlicense - libtelnet variant
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_LIBTELNET
	 * @model name="UnlicenseLibtelnet" literal="Unlicense-libtelnet"
	 * @generated
	 * @ordered
	 */
	public static final int UNLICENSE_LIBTELNET_VALUE = 656;

	/**
	 * The '<em><b>Unlicense Libwhirlpool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unlicense - libwhirlpool variant
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_LIBWHIRLPOOL
	 * @model name="UnlicenseLibwhirlpool" literal="Unlicense-libwhirlpool"
	 * @generated
	 * @ordered
	 */
	public static final int UNLICENSE_LIBWHIRLPOOL_VALUE = 657;

	/**
	 * The '<em><b>UPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal Permissive License v1.0
	 * <!-- end-model-doc -->
	 * @see #UPL10
	 * @model literal="UPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int UPL10_VALUE = 658;

	/**
	 * The '<em><b>URTRLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utah Raster Toolkit Run Length Encoded License
	 * <!-- end-model-doc -->
	 * @see #URTRLE
	 * @model literal="URT-RLE"
	 * @generated
	 * @ordered
	 */
	public static final int URTRLE_VALUE = 659;

	/**
	 * The '<em><b>Vim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vim License
	 * <!-- end-model-doc -->
	 * @see #VIM
	 * @model name="Vim"
	 * @generated
	 * @ordered
	 */
	public static final int VIM_VALUE = 660;

	/**
	 * The '<em><b>VOSTROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VOSTROM Public License for Open Source
	 * <!-- end-model-doc -->
	 * @see #VOSTROM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOSTROM_VALUE = 661;

	/**
	 * The '<em><b>VSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vovida Software License v1.0
	 * <!-- end-model-doc -->
	 * @see #VSL10
	 * @model literal="VSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int VSL10_VALUE = 662;

	/**
	 * The '<em><b>W3C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (2002-12-31)
	 * <!-- end-model-doc -->
	 * @see #W3C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W3C_VALUE = 663;

	/**
	 * The '<em><b>W3C19980720</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (1998-07-20)
	 * <!-- end-model-doc -->
	 * @see #W3C19980720
	 * @model literal="W3C-19980720"
	 * @generated
	 * @ordered
	 */
	public static final int W3C19980720_VALUE = 664;

	/**
	 * The '<em><b>W3C20150513</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and Document License (2015-05-13)
	 * <!-- end-model-doc -->
	 * @see #W3C20150513
	 * @model literal="W3C-20150513"
	 * @generated
	 * @ordered
	 */
	public static final int W3C20150513_VALUE = 665;

	/**
	 * The '<em><b>W3m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * w3m License
	 * <!-- end-model-doc -->
	 * @see #W3M
	 * @model name="w3m"
	 * @generated
	 * @ordered
	 */
	public static final int W3M_VALUE = 666;

	/**
	 * The '<em><b>Watcom10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sybase Open Watcom Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #WATCOM10
	 * @model name="Watcom10" literal="Watcom-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int WATCOM10_VALUE = 667;

	/**
	 * The '<em><b>Widget Workshop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Widget Workshop License
	 * <!-- end-model-doc -->
	 * @see #WIDGET_WORKSHOP
	 * @model name="WidgetWorkshop" literal="Widget-Workshop"
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_WORKSHOP_VALUE = 668;

	/**
	 * The '<em><b>Wsuipa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wsuipa License
	 * <!-- end-model-doc -->
	 * @see #WSUIPA
	 * @model name="Wsuipa"
	 * @generated
	 * @ordered
	 */
	public static final int WSUIPA_VALUE = 669;

	/**
	 * The '<em><b>WTFPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do What The F*ck You Want To Public License
	 * <!-- end-model-doc -->
	 * @see #WTFPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTFPL_VALUE = 670;

	/**
	 * The '<em><b>Wwl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WWL License
	 * <!-- end-model-doc -->
	 * @see #WWL
	 * @model name="wwl"
	 * @generated
	 * @ordered
	 */
	public static final int WWL_VALUE = 671;

	/**
	 * The '<em><b>Wx Windows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * wxWindows Library License
	 * <!-- end-model-doc -->
	 * @see #WX_WINDOWS
	 * @model name="wxWindows"
	 * @generated
	 * @ordered
	 */
	public static final int WX_WINDOWS_VALUE = 672;

	/**
	 * The '<em><b>X11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License
	 * <!-- end-model-doc -->
	 * @see #X11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X11_VALUE = 673;

	/**
	 * The '<em><b>X11 Distribute Modifications Variant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License Distribution Modification Variant
	 * <!-- end-model-doc -->
	 * @see #X11_DISTRIBUTE_MODIFICATIONS_VARIANT
	 * @model name="X11DistributeModificationsVariant" literal="X11-distribute-modifications-variant"
	 * @generated
	 * @ordered
	 */
	public static final int X11_DISTRIBUTE_MODIFICATIONS_VARIANT_VALUE = 674;

	/**
	 * The '<em><b>X11 Swapped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 swapped final paragraphs
	 * <!-- end-model-doc -->
	 * @see #X11_SWAPPED
	 * @model name="X11Swapped" literal="X11-swapped"
	 * @generated
	 * @ordered
	 */
	public static final int X11_SWAPPED_VALUE = 675;

	/**
	 * The '<em><b>Xdebug103</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xdebug License v 1.03
	 * <!-- end-model-doc -->
	 * @see #XDEBUG103
	 * @model name="Xdebug103" literal="Xdebug-1.03"
	 * @generated
	 * @ordered
	 */
	public static final int XDEBUG103_VALUE = 676;

	/**
	 * The '<em><b>Xerox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xerox License
	 * <!-- end-model-doc -->
	 * @see #XEROX
	 * @model name="Xerox"
	 * @generated
	 * @ordered
	 */
	public static final int XEROX_VALUE = 677;

	/**
	 * The '<em><b>Xfig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xfig License
	 * <!-- end-model-doc -->
	 * @see #XFIG
	 * @model name="Xfig"
	 * @generated
	 * @ordered
	 */
	public static final int XFIG_VALUE = 678;

	/**
	 * The '<em><b>XFree8611</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XFree86 License 1.1
	 * <!-- end-model-doc -->
	 * @see #XFREE8611
	 * @model name="XFree8611" literal="XFree86-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int XFREE8611_VALUE = 679;

	/**
	 * The '<em><b>Xinetd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xinetd License
	 * <!-- end-model-doc -->
	 * @see #XINETD
	 * @model name="xinetd"
	 * @generated
	 * @ordered
	 */
	public static final int XINETD_VALUE = 680;

	/**
	 * The '<em><b>Xkeyboard Config Zinoviev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xkeyboard-config Zinoviev License
	 * <!-- end-model-doc -->
	 * @see #XKEYBOARD_CONFIG_ZINOVIEV
	 * @model name="xkeyboardConfigZinoviev" literal="xkeyboard-config-Zinoviev"
	 * @generated
	 * @ordered
	 */
	public static final int XKEYBOARD_CONFIG_ZINOVIEV_VALUE = 681;

	/**
	 * The '<em><b>Xlock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xlock License
	 * <!-- end-model-doc -->
	 * @see #XLOCK
	 * @model name="xlock"
	 * @generated
	 * @ordered
	 */
	public static final int XLOCK_VALUE = 682;

	/**
	 * The '<em><b>Xnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X.Net License
	 * <!-- end-model-doc -->
	 * @see #XNET
	 * @model name="Xnet"
	 * @generated
	 * @ordered
	 */
	public static final int XNET_VALUE = 683;

	/**
	 * The '<em><b>Xpp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPP License
	 * <!-- end-model-doc -->
	 * @see #XPP
	 * @model name="xpp"
	 * @generated
	 * @ordered
	 */
	public static final int XPP_VALUE = 684;

	/**
	 * The '<em><b>XSkat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XSkat License
	 * <!-- end-model-doc -->
	 * @see #XSKAT
	 * @model name="XSkat"
	 * @generated
	 * @ordered
	 */
	public static final int XSKAT_VALUE = 685;

	/**
	 * The '<em><b>Xzoom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xzoom License
	 * <!-- end-model-doc -->
	 * @see #XZOOM
	 * @model name="xzoom"
	 * @generated
	 * @ordered
	 */
	public static final int XZOOM_VALUE = 686;

	/**
	 * The '<em><b>YPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #YPL10
	 * @model literal="YPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int YPL10_VALUE = 687;

	/**
	 * The '<em><b>YPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #YPL11
	 * @model literal="YPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int YPL11_VALUE = 688;

	/**
	 * The '<em><b>Zed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zed License
	 * <!-- end-model-doc -->
	 * @see #ZED
	 * @model name="Zed"
	 * @generated
	 * @ordered
	 */
	public static final int ZED_VALUE = 689;

	/**
	 * The '<em><b>Zeeff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeeff License
	 * <!-- end-model-doc -->
	 * @see #ZEEFF
	 * @model name="Zeeff"
	 * @generated
	 * @ordered
	 */
	public static final int ZEEFF_VALUE = 690;

	/**
	 * The '<em><b>Zend20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zend License v2.0
	 * <!-- end-model-doc -->
	 * @see #ZEND20
	 * @model name="Zend20" literal="Zend-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ZEND20_VALUE = 691;

	/**
	 * The '<em><b>Zimbra13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA13
	 * @model name="Zimbra13" literal="Zimbra-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int ZIMBRA13_VALUE = 692;

	/**
	 * The '<em><b>Zimbra14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA14
	 * @model name="Zimbra14" literal="Zimbra-1.4"
	 * @generated
	 * @ordered
	 */
	public static final int ZIMBRA14_VALUE = 693;

	/**
	 * The '<em><b>Zlib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib License
	 * <!-- end-model-doc -->
	 * @see #ZLIB
	 * @model name="Zlib"
	 * @generated
	 * @ordered
	 */
	public static final int ZLIB_VALUE = 694;

	/**
	 * The '<em><b>Zlib Acknowledgement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib/libpng License with Acknowledgement
	 * <!-- end-model-doc -->
	 * @see #ZLIB_ACKNOWLEDGEMENT
	 * @model name="zlibAcknowledgement" literal="zlib-acknowledgement"
	 * @generated
	 * @ordered
	 */
	public static final int ZLIB_ACKNOWLEDGEMENT_VALUE = 695;

	/**
	 * The '<em><b>ZPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #ZPL11
	 * @model literal="ZPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL11_VALUE = 696;

	/**
	 * The '<em><b>ZPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #ZPL20
	 * @model literal="ZPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL20_VALUE = 697;

	/**
	 * The '<em><b>ZPL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.1
	 * <!-- end-model-doc -->
	 * @see #ZPL21
	 * @model literal="ZPL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL21_VALUE = 698;

	/**
	 * The '<em><b>389 Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 389 Directory Server Exception
	 * <!-- end-model-doc -->
	 * @see #_389_EXCEPTION
	 * @model name="_389Exception" literal="389-exception"
	 * @generated
	 * @ordered
	 */
	public static final int _389_EXCEPTION_VALUE = 699;

	/**
	 * The '<em><b>Asterisk Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asterisk exception
	 * <!-- end-model-doc -->
	 * @see #ASTERISK_EXCEPTION
	 * @model name="AsteriskException" literal="Asterisk-exception"
	 * @generated
	 * @ordered
	 */
	public static final int ASTERISK_EXCEPTION_VALUE = 700;

	/**
	 * The '<em><b>Asterisk Linking Protocols Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asterisk linking protocols exception
	 * <!-- end-model-doc -->
	 * @see #ASTERISK_LINKING_PROTOCOLS_EXCEPTION
	 * @model name="AsteriskLinkingProtocolsException" literal="Asterisk-linking-protocols-exception"
	 * @generated
	 * @ordered
	 */
	public static final int ASTERISK_LINKING_PROTOCOLS_EXCEPTION_VALUE = 701;

	/**
	 * The '<em><b>Autoconf Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf exception 2.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION20
	 * @model name="AutoconfException20" literal="Autoconf-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONF_EXCEPTION20_VALUE = 702;

	/**
	 * The '<em><b>Autoconf Exception30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf exception 3.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION30
	 * @model name="AutoconfException30" literal="Autoconf-exception-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONF_EXCEPTION30_VALUE = 703;

	/**
	 * The '<em><b>Autoconf Exception Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf generic exception
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_GENERIC
	 * @model name="AutoconfExceptionGeneric" literal="Autoconf-exception-generic"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONF_EXCEPTION_GENERIC_VALUE = 704;

	/**
	 * The '<em><b>Autoconf Exception Generic30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf generic exception for GPL-3.0
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_GENERIC30
	 * @model name="AutoconfExceptionGeneric30" literal="Autoconf-exception-generic-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONF_EXCEPTION_GENERIC30_VALUE = 705;

	/**
	 * The '<em><b>Autoconf Exception Macro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Autoconf macro exception
	 * <!-- end-model-doc -->
	 * @see #AUTOCONF_EXCEPTION_MACRO
	 * @model name="AutoconfExceptionMacro" literal="Autoconf-exception-macro"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONF_EXCEPTION_MACRO_VALUE = 706;

	/**
	 * The '<em><b>Bison Exception124</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bison exception 1.24
	 * <!-- end-model-doc -->
	 * @see #BISON_EXCEPTION124
	 * @model name="BisonException124" literal="Bison-exception-1.24"
	 * @generated
	 * @ordered
	 */
	public static final int BISON_EXCEPTION124_VALUE = 707;

	/**
	 * The '<em><b>Bison Exception22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bison exception 2.2
	 * <!-- end-model-doc -->
	 * @see #BISON_EXCEPTION22
	 * @model name="BisonException22" literal="Bison-exception-2.2"
	 * @generated
	 * @ordered
	 */
	public static final int BISON_EXCEPTION22_VALUE = 708;

	/**
	 * The '<em><b>Bootloader Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bootloader Distribution Exception
	 * <!-- end-model-doc -->
	 * @see #BOOTLOADER_EXCEPTION
	 * @model name="BootloaderException" literal="Bootloader-exception"
	 * @generated
	 * @ordered
	 */
	public static final int BOOTLOADER_EXCEPTION_VALUE = 709;

	/**
	 * The '<em><b>CGAL Linking Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CGAL Linking Exception
	 * <!-- end-model-doc -->
	 * @see #CGAL_LINKING_EXCEPTION
	 * @model name="CGALLinkingException" literal="CGAL-linking-exception"
	 * @generated
	 * @ordered
	 */
	public static final int CGAL_LINKING_EXCEPTION_VALUE = 710;

	/**
	 * The '<em><b>Classpath Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classpath exception 2.0
	 * <!-- end-model-doc -->
	 * @see #CLASSPATH_EXCEPTION20
	 * @model name="ClasspathException20" literal="Classpath-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSPATH_EXCEPTION20_VALUE = 711;

	/**
	 * The '<em><b>CLISP Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CLISP exception 2.0
	 * <!-- end-model-doc -->
	 * @see #CLISP_EXCEPTION20
	 * @model name="CLISPException20" literal="CLISP-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CLISP_EXCEPTION20_VALUE = 712;

	/**
	 * The '<em><b>Cryptsetup Open SSL Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cryptsetup OpenSSL exception
	 * <!-- end-model-doc -->
	 * @see #CRYPTSETUP_OPEN_SSL_EXCEPTION
	 * @model name="cryptsetupOpenSSLException" literal="cryptsetup-OpenSSL-exception"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTSETUP_OPEN_SSL_EXCEPTION_VALUE = 713;

	/**
	 * The '<em><b>Digia Qt LGPL Exception11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Digia Qt LGPL Exception version 1.1
	 * <!-- end-model-doc -->
	 * @see #DIGIA_QT_LGPL_EXCEPTION11
	 * @model name="DigiaQtLGPLException11" literal="Digia-Qt-LGPL-exception-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int DIGIA_QT_LGPL_EXCEPTION11_VALUE = 714;

	/**
	 * The '<em><b>Digi Rule FOSS Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DigiRule FOSS License Exception
	 * <!-- end-model-doc -->
	 * @see #DIGI_RULE_FOSS_EXCEPTION
	 * @model name="DigiRuleFOSSException" literal="DigiRule-FOSS-exception"
	 * @generated
	 * @ordered
	 */
	public static final int DIGI_RULE_FOSS_EXCEPTION_VALUE = 715;

	/**
	 * The '<em><b>ECos Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eCos exception 2.0
	 * <!-- end-model-doc -->
	 * @see #ECOS_EXCEPTION20
	 * @model name="eCosException20" literal="eCos-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECOS_EXCEPTION20_VALUE = 716;

	/**
	 * The '<em><b>Erlang Otp Linking Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang/OTP Linking Exception
	 * <!-- end-model-doc -->
	 * @see #ERLANG_OTP_LINKING_EXCEPTION
	 * @model name="erlangOtpLinkingException" literal="erlang-otp-linking-exception"
	 * @generated
	 * @ordered
	 */
	public static final int ERLANG_OTP_LINKING_EXCEPTION_VALUE = 717;

	/**
	 * The '<em><b>Fawkes Runtime Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fawkes Runtime Exception
	 * <!-- end-model-doc -->
	 * @see #FAWKES_RUNTIME_EXCEPTION
	 * @model name="FawkesRuntimeException" literal="Fawkes-Runtime-exception"
	 * @generated
	 * @ordered
	 */
	public static final int FAWKES_RUNTIME_EXCEPTION_VALUE = 718;

	/**
	 * The '<em><b>FLTK Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FLTK exception
	 * <!-- end-model-doc -->
	 * @see #FLTK_EXCEPTION
	 * @model name="FLTKException" literal="FLTK-exception"
	 * @generated
	 * @ordered
	 */
	public static final int FLTK_EXCEPTION_VALUE = 719;

	/**
	 * The '<em><b>Fmt Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fmt exception
	 * <!-- end-model-doc -->
	 * @see #FMT_EXCEPTION
	 * @model name="fmtException" literal="fmt-exception"
	 * @generated
	 * @ordered
	 */
	public static final int FMT_EXCEPTION_VALUE = 720;

	/**
	 * The '<em><b>Font Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font exception 2.0
	 * <!-- end-model-doc -->
	 * @see #FONT_EXCEPTION20
	 * @model name="FontException20" literal="Font-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int FONT_EXCEPTION20_VALUE = 721;

	/**
	 * The '<em><b>Freertos Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeRTOS Exception 2.0
	 * <!-- end-model-doc -->
	 * @see #FREERTOS_EXCEPTION20
	 * @model name="freertosException20" literal="freertos-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int FREERTOS_EXCEPTION20_VALUE = 722;

	/**
	 * The '<em><b>GCC Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC Runtime Library exception 2.0
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION20
	 * @model name="GCCException20" literal="GCC-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int GCC_EXCEPTION20_VALUE = 723;

	/**
	 * The '<em><b>GCC Exception20 Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC    Runtime Library exception 2.0 - note variant
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION20_NOTE
	 * @model name="GCCException20Note" literal="GCC-exception-2.0-note"
	 * @generated
	 * @ordered
	 */
	public static final int GCC_EXCEPTION20_NOTE_VALUE = 724;

	/**
	 * The '<em><b>GCC Exception31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GCC Runtime Library exception 3.1
	 * <!-- end-model-doc -->
	 * @see #GCC_EXCEPTION31
	 * @model name="GCCException31" literal="GCC-exception-3.1"
	 * @generated
	 * @ordered
	 */
	public static final int GCC_EXCEPTION31_VALUE = 725;

	/**
	 * The '<em><b>Gmsh Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gmsh exception
	 * <!-- end-model-doc -->
	 * @see #GMSH_EXCEPTION
	 * @model name="GmshException" literal="Gmsh-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GMSH_EXCEPTION_VALUE = 726;

	/**
	 * The '<em><b>GNAT Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNAT exception
	 * <!-- end-model-doc -->
	 * @see #GNAT_EXCEPTION
	 * @model name="GNATException" literal="GNAT-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GNAT_EXCEPTION_VALUE = 727;

	/**
	 * The '<em><b>GNOME Examples Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNOME examples exception
	 * <!-- end-model-doc -->
	 * @see #GNOME_EXAMPLES_EXCEPTION
	 * @model name="GNOMEExamplesException" literal="GNOME-examples-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GNOME_EXAMPLES_EXCEPTION_VALUE = 728;

	/**
	 * The '<em><b>GNU Compiler Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Compiler Exception
	 * <!-- end-model-doc -->
	 * @see #GNU_COMPILER_EXCEPTION
	 * @model name="GNUCompilerException" literal="GNU-compiler-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GNU_COMPILER_EXCEPTION_VALUE = 729;

	/**
	 * The '<em><b>Gnu Javamail Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU JavaMail exception
	 * <!-- end-model-doc -->
	 * @see #GNU_JAVAMAIL_EXCEPTION
	 * @model name="gnuJavamailException" literal="gnu-javamail-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GNU_JAVAMAIL_EXCEPTION_VALUE = 730;

	/**
	 * The '<em><b>GPL30389 Ds Base Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 389 DS Base Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30389_DS_BASE_EXCEPTION
	 * @model name="GPL30389DsBaseException" literal="GPL-3.0-389-ds-base-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30389_DS_BASE_EXCEPTION_VALUE = 731;

	/**
	 * The '<em><b>GPL30 Interface Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Interface Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_INTERFACE_EXCEPTION
	 * @model name="GPL30InterfaceException" literal="GPL-3.0-interface-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_INTERFACE_EXCEPTION_VALUE = 732;

	/**
	 * The '<em><b>GPL30 Linking Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Linking Exception
	 * <!-- end-model-doc -->
	 * @see #GPL30_LINKING_EXCEPTION
	 * @model name="GPL30LinkingException" literal="GPL-3.0-linking-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_LINKING_EXCEPTION_VALUE = 733;

	/**
	 * The '<em><b>GPL30 Linking Source Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL-3.0 Linking Exception (with Corresponding Source)
	 * <!-- end-model-doc -->
	 * @see #GPL30_LINKING_SOURCE_EXCEPTION
	 * @model name="GPL30LinkingSourceException" literal="GPL-3.0-linking-source-exception"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_LINKING_SOURCE_EXCEPTION_VALUE = 734;

	/**
	 * The '<em><b>GPLCC10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GPL Cooperation Commitment 1.0
	 * <!-- end-model-doc -->
	 * @see #GPLCC10
	 * @model literal="GPL-CC-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int GPLCC10_VALUE = 735;

	/**
	 * The '<em><b>GStreamer Exception2005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GStreamer Exception (2005)
	 * <!-- end-model-doc -->
	 * @see #GSTREAMER_EXCEPTION2005
	 * @model name="GStreamerException2005" literal="GStreamer-exception-2005"
	 * @generated
	 * @ordered
	 */
	public static final int GSTREAMER_EXCEPTION2005_VALUE = 736;

	/**
	 * The '<em><b>GStreamer Exception2008</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GStreamer Exception (2008)
	 * <!-- end-model-doc -->
	 * @see #GSTREAMER_EXCEPTION2008
	 * @model name="GStreamerException2008" literal="GStreamer-exception-2008"
	 * @generated
	 * @ordered
	 */
	public static final int GSTREAMER_EXCEPTION2008_VALUE = 737;

	/**
	 * The '<em><b>Harbour Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * harbour exception
	 * <!-- end-model-doc -->
	 * @see #HARBOUR_EXCEPTION
	 * @model name="harbourException" literal="harbour-exception"
	 * @generated
	 * @ordered
	 */
	public static final int HARBOUR_EXCEPTION_VALUE = 738;

	/**
	 * The '<em><b>I2p Gpl Java Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * i2p GPL+Java Exception
	 * <!-- end-model-doc -->
	 * @see #I2P_GPL_JAVA_EXCEPTION
	 * @model name="i2pGplJavaException" literal="i2p-gpl-java-exception"
	 * @generated
	 * @ordered
	 */
	public static final int I2P_GPL_JAVA_EXCEPTION_VALUE = 739;

	/**
	 * The '<em><b>Independent Modules Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent Module Linking exception
	 * <!-- end-model-doc -->
	 * @see #INDEPENDENT_MODULES_EXCEPTION
	 * @model name="IndependentModulesException" literal="Independent-modules-exception"
	 * @generated
	 * @ordered
	 */
	public static final int INDEPENDENT_MODULES_EXCEPTION_VALUE = 740;

	/**
	 * The '<em><b>Ki Cad Libraries Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KiCad Libraries Exception
	 * <!-- end-model-doc -->
	 * @see #KI_CAD_LIBRARIES_EXCEPTION
	 * @model name="KiCadLibrariesException" literal="KiCad-libraries-exception"
	 * @generated
	 * @ordered
	 */
	public static final int KI_CAD_LIBRARIES_EXCEPTION_VALUE = 741;

	/**
	 * The '<em><b>LGPL30 Linking Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LGPL-3.0 Linking Exception
	 * <!-- end-model-doc -->
	 * @see #LGPL30_LINKING_EXCEPTION
	 * @model name="LGPL30LinkingException" literal="LGPL-3.0-linking-exception"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_LINKING_EXCEPTION_VALUE = 742;

	/**
	 * The '<em><b>Libpri Open H323 Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpri OpenH323 exception
	 * <!-- end-model-doc -->
	 * @see #LIBPRI_OPEN_H323_EXCEPTION
	 * @model name="libpriOpenH323Exception" literal="libpri-OpenH323-exception"
	 * @generated
	 * @ordered
	 */
	public static final int LIBPRI_OPEN_H323_EXCEPTION_VALUE = 743;

	/**
	 * The '<em><b>Libtool Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libtool Exception
	 * <!-- end-model-doc -->
	 * @see #LIBTOOL_EXCEPTION
	 * @model name="LibtoolException" literal="Libtool-exception"
	 * @generated
	 * @ordered
	 */
	public static final int LIBTOOL_EXCEPTION_VALUE = 744;

	/**
	 * The '<em><b>Linux Syscall Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Syscall Note
	 * <!-- end-model-doc -->
	 * @see #LINUX_SYSCALL_NOTE
	 * @model name="LinuxSyscallNote" literal="Linux-syscall-note"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_SYSCALL_NOTE_VALUE = 745;

	/**
	 * The '<em><b>LLGPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LLGPL Preamble
	 * <!-- end-model-doc -->
	 * @see #LLGPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LLGPL_VALUE = 746;

	/**
	 * The '<em><b>LLVM Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LLVM Exception
	 * <!-- end-model-doc -->
	 * @see #LLVM_EXCEPTION
	 * @model name="LLVMException" literal="LLVM-exception"
	 * @generated
	 * @ordered
	 */
	public static final int LLVM_EXCEPTION_VALUE = 747;

	/**
	 * The '<em><b>LZMA Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LZMA exception
	 * <!-- end-model-doc -->
	 * @see #LZMA_EXCEPTION
	 * @model name="LZMAException" literal="LZMA-exception"
	 * @generated
	 * @ordered
	 */
	public static final int LZMA_EXCEPTION_VALUE = 748;

	/**
	 * The '<em><b>Mif Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Macros and Inline Functions Exception
	 * <!-- end-model-doc -->
	 * @see #MIF_EXCEPTION
	 * @model name="mifException" literal="mif-exception"
	 * @generated
	 * @ordered
	 */
	public static final int MIF_EXCEPTION_VALUE = 749;

	/**
	 * The '<em><b>Mxml Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mxml Exception
	 * <!-- end-model-doc -->
	 * @see #MXML_EXCEPTION
	 * @model name="mxmlException" literal="mxml-exception"
	 * @generated
	 * @ordered
	 */
	public static final int MXML_EXCEPTION_VALUE = 750;

	/**
	 * The '<em><b>Nokia Qt Exception11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Qt LGPL exception 1.1
	 * <!-- end-model-doc -->
	 * @see #NOKIA_QT_EXCEPTION11
	 * @model name="NokiaQtException11" literal="Nokia-Qt-exception-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int NOKIA_QT_EXCEPTION11_VALUE = 751;

	/**
	 * The '<em><b>OCaml LGPL Linking Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCaml LGPL Linking Exception
	 * <!-- end-model-doc -->
	 * @see #OCAML_LGPL_LINKING_EXCEPTION
	 * @model name="OCamlLGPLLinkingException" literal="OCaml-LGPL-linking-exception"
	 * @generated
	 * @ordered
	 */
	public static final int OCAML_LGPL_LINKING_EXCEPTION_VALUE = 752;

	/**
	 * The '<em><b>OCCT Exception10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Exception 1.0
	 * <!-- end-model-doc -->
	 * @see #OCCT_EXCEPTION10
	 * @model name="OCCTException10" literal="OCCT-exception-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OCCT_EXCEPTION10_VALUE = 753;

	/**
	 * The '<em><b>Open JDK Assembly Exception10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenJDK Assembly exception 1.0
	 * <!-- end-model-doc -->
	 * @see #OPEN_JDK_ASSEMBLY_EXCEPTION10
	 * @model name="OpenJDKAssemblyException10" literal="OpenJDK-assembly-exception-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_JDK_ASSEMBLY_EXCEPTION10_VALUE = 754;

	/**
	 * The '<em><b>Openvpn Openssl Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenVPN OpenSSL Exception
	 * <!-- end-model-doc -->
	 * @see #OPENVPN_OPENSSL_EXCEPTION
	 * @model name="openvpnOpensslException" literal="openvpn-openssl-exception"
	 * @generated
	 * @ordered
	 */
	public static final int OPENVPN_OPENSSL_EXCEPTION_VALUE = 755;

	/**
	 * The '<em><b>PCRE2 Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCRE2 exception
	 * <!-- end-model-doc -->
	 * @see #PCRE2_EXCEPTION
	 * @model name="PCRE2Exception" literal="PCRE2-exception"
	 * @generated
	 * @ordered
	 */
	public static final int PCRE2_EXCEPTION_VALUE = 756;

	/**
	 * The '<em><b>Polyparse Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polyparse Exception
	 * <!-- end-model-doc -->
	 * @see #POLYPARSE_EXCEPTION
	 * @model name="polyparseException" literal="polyparse-exception"
	 * @generated
	 * @ordered
	 */
	public static final int POLYPARSE_EXCEPTION_VALUE = 757;

	/**
	 * The '<em><b>PS Or PDF Font Exception20170817</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PS/PDF font exception (2017-08-17)
	 * <!-- end-model-doc -->
	 * @see #PS_OR_PDF_FONT_EXCEPTION20170817
	 * @model name="PSOrPDFFontException20170817" literal="PS-or-PDF-font-exception-20170817"
	 * @generated
	 * @ordered
	 */
	public static final int PS_OR_PDF_FONT_EXCEPTION20170817_VALUE = 758;

	/**
	 * The '<em><b>QPL10INRIA2004 Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * INRIA QPL 1.0 2004 variant exception
	 * <!-- end-model-doc -->
	 * @see #QPL10INRIA2004_EXCEPTION
	 * @model name="QPL10INRIA2004Exception" literal="QPL-1.0-INRIA-2004-exception"
	 * @generated
	 * @ordered
	 */
	public static final int QPL10INRIA2004_EXCEPTION_VALUE = 759;

	/**
	 * The '<em><b>Qt GPL Exception10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qt GPL exception 1.0
	 * <!-- end-model-doc -->
	 * @see #QT_GPL_EXCEPTION10
	 * @model name="QtGPLException10" literal="Qt-GPL-exception-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int QT_GPL_EXCEPTION10_VALUE = 760;

	/**
	 * The '<em><b>Qt LGPL Exception11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qt LGPL exception 1.1
	 * <!-- end-model-doc -->
	 * @see #QT_LGPL_EXCEPTION11
	 * @model name="QtLGPLException11" literal="Qt-LGPL-exception-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int QT_LGPL_EXCEPTION11_VALUE = 761;

	/**
	 * The '<em><b>Qwt Exception10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qwt exception 1.0
	 * <!-- end-model-doc -->
	 * @see #QWT_EXCEPTION10
	 * @model name="QwtException10" literal="Qwt-exception-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int QWT_EXCEPTION10_VALUE = 762;

	/**
	 * The '<em><b>Romic Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Romic Exception
	 * <!-- end-model-doc -->
	 * @see #ROMIC_EXCEPTION
	 * @model name="romicException" literal="romic-exception"
	 * @generated
	 * @ordered
	 */
	public static final int ROMIC_EXCEPTION_VALUE = 763;

	/**
	 * The '<em><b>RR Dtool FLOSS Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RRDtool FLOSS exception 2.0
	 * <!-- end-model-doc -->
	 * @see #RR_DTOOL_FLOSS_EXCEPTION20
	 * @model name="RRDtoolFLOSSException20" literal="RRDtool-FLOSS-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int RR_DTOOL_FLOSS_EXCEPTION20_VALUE = 764;

	/**
	 * The '<em><b>SANE Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SANE Exception
	 * <!-- end-model-doc -->
	 * @see #SANE_EXCEPTION
	 * @model name="SANEException" literal="SANE-exception"
	 * @generated
	 * @ordered
	 */
	public static final int SANE_EXCEPTION_VALUE = 765;

	/**
	 * The '<em><b>SHL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v2.0
	 * <!-- end-model-doc -->
	 * @see #SHL20
	 * @model literal="SHL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SHL20_VALUE = 766;

	/**
	 * The '<em><b>SHL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solderpad Hardware License v2.1
	 * <!-- end-model-doc -->
	 * @see #SHL21
	 * @model literal="SHL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int SHL21_VALUE = 767;

	/**
	 * The '<em><b>Stunnel Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * stunnel Exception
	 * <!-- end-model-doc -->
	 * @see #STUNNEL_EXCEPTION
	 * @model name="stunnelException" literal="stunnel-exception"
	 * @generated
	 * @ordered
	 */
	public static final int STUNNEL_EXCEPTION_VALUE = 768;

	/**
	 * The '<em><b>SWI Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SWI exception
	 * <!-- end-model-doc -->
	 * @see #SWI_EXCEPTION
	 * @model name="SWIException" literal="SWI-exception"
	 * @generated
	 * @ordered
	 */
	public static final int SWI_EXCEPTION_VALUE = 769;

	/**
	 * The '<em><b>Swift Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Swift Exception
	 * <!-- end-model-doc -->
	 * @see #SWIFT_EXCEPTION
	 * @model name="SwiftException" literal="Swift-exception"
	 * @generated
	 * @ordered
	 */
	public static final int SWIFT_EXCEPTION_VALUE = 770;

	/**
	 * The '<em><b>Texinfo Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Texinfo exception
	 * <!-- end-model-doc -->
	 * @see #TEXINFO_EXCEPTION
	 * @model name="TexinfoException" literal="Texinfo-exception"
	 * @generated
	 * @ordered
	 */
	public static final int TEXINFO_EXCEPTION_VALUE = 771;

	/**
	 * The '<em><b>UBoot Exception20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * U-Boot exception 2.0
	 * <!-- end-model-doc -->
	 * @see #UBOOT_EXCEPTION20
	 * @model name="uBootException20" literal="u-boot-exception-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int UBOOT_EXCEPTION20_VALUE = 772;

	/**
	 * The '<em><b>UBDL Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unmodified Binary Distribution exception
	 * <!-- end-model-doc -->
	 * @see #UBDL_EXCEPTION
	 * @model name="UBDLException" literal="UBDL-exception"
	 * @generated
	 * @ordered
	 */
	public static final int UBDL_EXCEPTION_VALUE = 773;

	/**
	 * The '<em><b>Universal FOSS Exception10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal FOSS Exception, Version 1.0
	 * <!-- end-model-doc -->
	 * @see #UNIVERSAL_FOSS_EXCEPTION10
	 * @model name="UniversalFOSSException10" literal="Universal-FOSS-exception-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSAL_FOSS_EXCEPTION10_VALUE = 774;

	/**
	 * The '<em><b>Vsftpd Openssl Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * vsftpd OpenSSL exception
	 * <!-- end-model-doc -->
	 * @see #VSFTPD_OPENSSL_EXCEPTION
	 * @model name="vsftpdOpensslException" literal="vsftpd-openssl-exception"
	 * @generated
	 * @ordered
	 */
	public static final int VSFTPD_OPENSSL_EXCEPTION_VALUE = 775;

	/**
	 * The '<em><b>Wx Windows Exception31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WxWindows Library Exception 3.1
	 * <!-- end-model-doc -->
	 * @see #WX_WINDOWS_EXCEPTION31
	 * @model name="WxWindowsException31" literal="WxWindows-exception-3.1"
	 * @generated
	 * @ordered
	 */
	public static final int WX_WINDOWS_EXCEPTION31_VALUE = 776;

	/**
	 * The '<em><b>X1 1vnc Openssl Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x11vnc OpenSSL Exception
	 * <!-- end-model-doc -->
	 * @see #X11VNC_OPENSSL_EXCEPTION
	 * @model name="x11vncOpensslException" literal="x11vnc-openssl-exception"
	 * @generated
	 * @ordered
	 */
	public static final int X11VNC_OPENSSL_EXCEPTION_VALUE = 777;

	/**
	 * An array of all the '<em><b>License Id</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LicenseId[] VALUES_ARRAY =
		new LicenseId[] {
			_0BSD,
			_3D_SLICER10,
			AAL,
			ABSTYLES,
			ADA_CORE_DOC,
			ADOBE2006,
			ADOBE_DISPLAY_POST_SCRIPT,
			ADOBE_GLYPH,
			ADOBE_UTOPIA,
			ADSL,
			AFL11,
			AFL12,
			AFL20,
			AFL21,
			AFL30,
			AFMPARSE,
			AGPL10,
			AGPL10_ONLY,
			AGPL10_OR_LATER,
			AGPL30,
			AGPL30_ONLY,
			AGPL30_OR_LATER,
			ALADDIN,
			AMD_NEWLIB,
			AMDPLPA,
			AML,
			AML_GLSLANG,
			AMPAS,
			ANTLRPD,
			ANTLRPD_FALLBACK,
			ANY_OSI,
			ANY_OSI_PERL_MODULES,
			APACHE10,
			APACHE11,
			APACHE20,
			APAFML,
			APL10,
			APP_S2P,
			APSL10,
			APSL11,
			APSL12,
			APSL20,
			ARPHIC1999,
			ARTISTIC10,
			ARTISTIC10_CL8,
			ARTISTIC10_PERL,
			ARTISTIC20,
			ARTISTIC_DIST,
			ASPELL_RU,
			ASWF_DIGITAL_ASSETS10,
			ASWF_DIGITAL_ASSETS11,
			BAEKMUK,
			BAHYPH,
			BARR,
			BCRYPT_SOLAR_DESIGNER,
			BEERWARE,
			BITSTREAM_CHARTER,
			BITSTREAM_VERA,
			BIT_TORRENT10,
			BIT_TORRENT11,
			BLESSING,
			BLUE_OAK100,
			BOEHM_GC,
			BOEHM_GC_WITHOUT_FEE,
			BORCEUX,
			BRIAN_GLADMAN2_CLAUSE,
			BRIAN_GLADMAN3_CLAUSE,
			BSD1_CLAUSE,
			BSD2_CLAUSE,
			BSD2_CLAUSE_DARWIN,
			BSD2_CLAUSE_FIRST_LINES,
			BSD2_CLAUSE_FREE_BSD,
			BSD2_CLAUSE_NET_BSD,
			BSD2_CLAUSE_PATENT,
			BSD2_CLAUSE_PKGCONF_DISCLAIMER,
			BSD2_CLAUSE_VIEWS,
			BSD3_CLAUSE,
			BSD3_CLAUSE_ACPICA,
			BSD3_CLAUSE_ATTRIBUTION,
			BSD3_CLAUSE_CLEAR,
			BSD3_CLAUSE_FLEX,
			BSD3_CLAUSE_HP,
			BSD3_CLAUSE_LBNL,
			BSD3_CLAUSE_MODIFICATION,
			BSD3_CLAUSE_NO_MILITARY_LICENSE,
			BSD3_CLAUSE_NO_NUCLEAR_LICENSE,
			BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014,
			BSD3_CLAUSE_NO_NUCLEAR_WARRANTY,
			BSD3_CLAUSE_OPEN_MPI,
			BSD3_CLAUSE_SUN,
			BSD4_CLAUSE,
			BSD4_CLAUSE_SHORTENED,
			BSD4_CLAUSE_UC,
			BSD43RENO,
			BSD43TAHOE,
			BSD_ADVERTISING_ACKNOWLEDGEMENT,
			BSD_ATTRIBUTION_HPND_DISCLAIMER,
			BSD_INFERNO_NETTVERK,
			BSD_PROTECTION,
			BSD_SOURCE_BEGINNING_FILE,
			BSD_SOURCE_CODE,
			BSD_SYSTEMICS,
			BSD_SYSTEMICS_W3_WORKS,
			BSL10,
			BUSL11,
			BZIP2105,
			BZIP2106,
			CUDA10,
			CAL10,
			CAL10_COMBINED_WORK_EXCEPTION,
			CALDERA,
			CALDERA_NO_PREAMBLE,
			CATHARON,
			CATOSL11,
			CCBY10,
			CCBY20,
			CCBY25,
			CCBY25AU,
			CCBY30,
			CCBY30AT,
			CCBY30AU,
			CCBY30DE,
			CCBY30IGO,
			CCBY30NL,
			CCBY30US,
			CCBY40,
			CCBYNC10,
			CCBYNC20,
			CCBYNC25,
			CCBYNC30,
			CCBYNC30DE,
			CCBYNC40,
			CCBYNCND10,
			CCBYNCND20,
			CCBYNCND25,
			CCBYNCND30,
			CCBYNCND30DE,
			CCBYNCND30IGO,
			CCBYNCND40,
			CCBYNCSA10,
			CCBYNCSA20,
			CCBYNCSA20DE,
			CCBYNCSA20FR,
			CCBYNCSA20UK,
			CCBYNCSA25,
			CCBYNCSA30,
			CCBYNCSA30DE,
			CCBYNCSA30IGO,
			CCBYNCSA40,
			CCBYND10,
			CCBYND20,
			CCBYND25,
			CCBYND30,
			CCBYND30DE,
			CCBYND40,
			CCBYSA10,
			CCBYSA20,
			CCBYSA20UK,
			CCBYSA21JP,
			CCBYSA25,
			CCBYSA30,
			CCBYSA30AT,
			CCBYSA30DE,
			CCBYSA30IGO,
			CCBYSA40,
			CCPDDC,
			CCPDM10,
			CCSA10,
			CC010,
			CDDL10,
			CDDL11,
			CDL10,
			CDLA_PERMISSIVE10,
			CDLA_PERMISSIVE20,
			CDLA_SHARING10,
			CECILL10,
			CECILL11,
			CECILL20,
			CECILL21,
			CECILLB,
			CECILLC,
			CERNOHL11,
			CERNOHL12,
			CERNOHLP20,
			CERNOHLS20,
			CERNOHLW20,
			CFITSIO,
			CHECK_CVS,
			CHECKMK,
			CL_ARTISTIC,
			CLIPS,
			CMU_MACH,
			CMU_MACH_NODOC,
			CNRI_JYTHON,
			CNRI_PYTHON,
			CNRI_PYTHON_GPL_COMPATIBLE,
			COIL10,
			COMMUNITY_SPEC10,
			CONDOR11,
			COPYLEFT_NEXT030,
			COPYLEFT_NEXT031,
			CORNELL_LOSSLESS_JPEG,
			CPAL10,
			CPL10,
			CPOL102,
			CRONYX,
			CROSSWORD,
			CRYPTO_SWIFT,
			CRYSTAL_STACKER,
			CUAOPL10,
			CUBE,
			CURL,
			CVE_TOU,
			DFSL10,
			DEC3_CLAUSE,
			DIFFMARK,
			DLDEBY20,
			DLDEZERO20,
			DOC,
			DOC_BOOK_DTD,
			DOC_BOOK_SCHEMA,
			DOC_BOOK_STYLESHEET,
			DOC_BOOK_XML,
			DOTSEQN,
			DRL10,
			DRL11,
			DSDP,
			DTOA,
			DVIPDFM,
			ECL10,
			ECL20,
			ECOS20,
			EFL10,
			EFL20,
			EGENIX,
			ELASTIC20,
			ENTESSA,
			EPICS,
			EPL10,
			EPL20,
			ERL_PL11,
			ETALAB20,
			EU_DATAGRID,
			EUPL10,
			EUPL11,
			EUPL12,
			EUROSYM,
			FAIR,
			FBM,
			FDKAAC,
			FERGUSON_TWOFISH,
			FRAMEWORX10,
			FREE_BSDDOC,
			FREE_IMAGE,
			FSFAP,
			FSFAP_NO_WARRANTY_DISCLAIMER,
			FSFUL,
			FSFULLR,
			FSFULLRSD,
			FSFULLRWD,
			FSL11A_LV2,
			FSL11MIT,
			FTL,
			FURUSETH,
			FWLW,
			GAME_PROGRAMMING_GEMS,
			GCR_DOCS,
			GD,
			GENERIC_XTS,
			GFDL11,
			GFDL11_INVARIANTS_ONLY,
			GFDL11_INVARIANTS_OR_LATER,
			GFDL11_NO_INVARIANTS_ONLY,
			GFDL11_NO_INVARIANTS_OR_LATER,
			GFDL11_ONLY,
			GFDL11_OR_LATER,
			GFDL12,
			GFDL12_INVARIANTS_ONLY,
			GFDL12_INVARIANTS_OR_LATER,
			GFDL12_NO_INVARIANTS_ONLY,
			GFDL12_NO_INVARIANTS_OR_LATER,
			GFDL12_ONLY,
			GFDL12_OR_LATER,
			GFDL13,
			GFDL13_INVARIANTS_ONLY,
			GFDL13_INVARIANTS_OR_LATER,
			GFDL13_NO_INVARIANTS_ONLY,
			GFDL13_NO_INVARIANTS_OR_LATER,
			GFDL13_ONLY,
			GFDL13_OR_LATER,
			GIFTWARE,
			GL2PS,
			GLIDE,
			GLULXE,
			GLWTPL,
			GNUPLOT,
			GPL10,
			GPL101,
			GPL10_ONLY,
			GPL10_OR_LATER,
			GPL20,
			GPL201,
			GPL20_ONLY,
			GPL20_OR_LATER,
			GPL20_WITH_AUTOCONF_EXCEPTION,
			GPL20_WITH_BISON_EXCEPTION,
			GPL20_WITH_CLASSPATH_EXCEPTION,
			GPL20_WITH_FONT_EXCEPTION,
			GPL20_WITH_GCC_EXCEPTION,
			GPL30,
			GPL301,
			GPL30_ONLY,
			GPL30_OR_LATER,
			GPL30_WITH_AUTOCONF_EXCEPTION,
			GPL30_WITH_GCC_EXCEPTION,
			GRAPHICS_GEMS,
			GSOAP1_3B,
			GTKBOOK,
			GUTMANN,
			HASKELL_REPORT,
			HDF5,
			HDPARM,
			HIDAPI,
			HIPPOCRATIC21,
			HP1986,
			HP1989,
			HPND,
			HPNDDEC,
			HPND_DOC,
			HPND_DOC_SELL,
			HPND_EXPORT_US,
			HPND_EXPORT_US_ACKNOWLEDGEMENT,
			HPND_EXPORT_US_MODIFY,
			HPND_EXPORT2_US,
			HPND_FENNEBERG_LIVINGSTON,
			HPNDINRIAIMAG,
			HPND_INTEL,
			HPND_KEVLIN_HENNEY,
			HPND_MARKUS_KUHN,
			HPND_MERCHANTABILITY_VARIANT,
			HPNDMIT_DISCLAIMER,
			HPND_NETREK,
			HPND_PBMPLUS,
			HPND_SELL_MIT_DISCLAIMER_XSERVER,
			HPND_SELL_REGEXPR,
			HPND_SELL_VARIANT,
			HPND_SELL_VARIANT_MIT_DISCLAIMER,
			HPND_SELL_VARIANT_MIT_DISCLAIMER_REV,
			HPNDUC,
			HPNDUC_EXPORT_US,
			HTMLTIDY,
			IBM_PIBS,
			ICU,
			IEC_CODE_COMPONENTS_EULA,
			IJG,
			IJG_SHORT,
			IMAGE_MAGICK,
			IMATIX,
			IMLIB2,
			INFO_ZIP,
			INNER_NET20,
			INNO_SETUP,
			INTEL,
			INTEL_ACPI,
			INTERBASE10,
			IPA,
			IPL10,
			ISC,
			ISC_VEILLARD,
			JAM,
			JAS_PER20,
			JOVE,
			JPL_IMAGE,
			JPNIC,
			JSON,
			KASTRUP,
			KAZLIB,
			KNUTH_CTAN,
			LAL12,
			LAL13,
			LATEX2E,
			LATEX2E_TRANSLATED_NOTICE,
			LEPTONICA,
			LGPL20,
			LGPL201,
			LGPL20_ONLY,
			LGPL20_OR_LATER,
			LGPL21,
			LGPL211,
			LGPL21_ONLY,
			LGPL21_OR_LATER,
			LGPL30,
			LGPL301,
			LGPL30_ONLY,
			LGPL30_OR_LATER,
			LGPLLR,
			LIBPNG,
			LIBPNG1635,
			LIBPNG20,
			LIBSELINUX10,
			LIBTIFF,
			LIBUTIL_DAVID_NUGENT,
			LI_LI_QP11,
			LI_LI_QR11,
			LI_LI_QRPLUS11,
			LINUX_MAN_PAGES1_PARA,
			LINUX_MAN_PAGES_COPYLEFT,
			LINUX_MAN_PAGES_COPYLEFT2_PARA,
			LINUX_MAN_PAGES_COPYLEFT_VAR,
			LINUX_OPEN_IB,
			LOOP,
			LPD_DOCUMENT,
			LPL10,
			LPL102,
			LPPL10,
			LPPL11,
			LPPL12,
			LPPL1_3A,
			LPPL1_3C,
			LSOF,
			LUCIDA_BITMAP_FONTS,
			LZMASDK911_TO920,
			LZMASDK922,
			MACKERRAS3_CLAUSE,
			MACKERRAS3_CLAUSE_ACKNOWLEDGMENT,
			MAGAZ,
			MAILPRIO,
			MAKE_INDEX,
			MAN2HTML,
			MARTIN_BIRGMEIER,
			MC_PHEE_SLIDESHOW,
			METAMAIL,
			MINPACK,
			MIPS,
			MIR_OS,
			MIT,
			MIT0,
			MIT_ADVERTISING,
			MIT_CLICK,
			MITCMU,
			MIT_ENNA,
			MIT_FEH,
			MIT_FESTIVAL,
			MIT_KHRONOS_OLD,
			MIT_MODERN_VARIANT,
			MIT_OPEN_GROUP,
			MIT_TESTREGEX,
			MIT_WU,
			MITNFA,
			MMI_XWARE,
			MOTOSOTO,
			MPEGSSG,
			MPI_PERMISSIVE,
			MPICH2,
			MPL10,
			MPL11,
			MPL20,
			MPL20_NO_COPYLEFT_EXCEPTION,
			MPLUS,
			MSLPL,
			MSPL,
			MSRL,
			MTLL,
			MULAN_PSL10,
			MULAN_PSL20,
			MULTICS,
			MUP,
			NAIST2003,
			NASA13,
			NAUMEN,
			NBPL10,
			NCBIPD,
			NCGLUK20,
			NCL,
			NCSA,
			NET_SNMP,
			NET_CDF,
			NEWSLETR,
			NGPL,
			NGREP,
			NICTA10,
			NISTPD,
			NISTPD_FALLBACK,
			NIST_SOFTWARE,
			NLOD10,
			NLOD20,
			NLPL,
			NOKIA,
			NOSL,
			NOWEB,
			NPL10,
			NPL11,
			NPOSL30,
			NRL,
			NTIAPD,
			NTP,
			NTP0,
			NUNIT,
			OUDA10,
			OAR,
			OCCTPL,
			OCLC20,
			ODB_L10,
			ODC_BY10,
			OFFIS,
			OFL10,
			OFL10_NO_RFN,
			OFL10RFN,
			OFL11,
			OFL11_NO_RFN,
			OFL11RFN,
			OGC10,
			OGDL_TAIWAN10,
			OGL_CANADA20,
			OGLUK10,
			OGLUK20,
			OGLUK30,
			OGTSL,
			OLDAP11,
			OLDAP12,
			OLDAP13,
			OLDAP14,
			OLDAP20,
			OLDAP201,
			OLDAP21,
			OLDAP22,
			OLDAP221,
			OLDAP222,
			OLDAP23,
			OLDAP24,
			OLDAP25,
			OLDAP26,
			OLDAP27,
			OLDAP28,
			OLFL13,
			OML,
			OPEN_PBS23,
			OPEN_SSL,
			OPEN_SSL_STANDALONE,
			OPEN_VISION,
			OPL10,
			OPLUK30,
			OPUBL10,
			OSETPL21,
			OSL10,
			OSL11,
			OSL20,
			OSL21,
			OSL30,
			PADL,
			PARITY600,
			PARITY700,
			PDDL10,
			PHP30,
			PHP301,
			PIXAR,
			PKGCONF,
			PLEXUS,
			PNMSTITCH,
			POLY_FORM_NONCOMMERCIAL100,
			POLY_FORM_SMALL_BUSINESS100,
			POSTGRE_SQL,
			PPL,
			PSF20,
			PSFRAG,
			PSUTILS,
			PYTHON20,
			PYTHON201,
			PYTHON_LDAP,
			QHULL,
			QPL10,
			QPL10INRIA2004,
			RADVD,
			RDISC,
			RHE_COS11,
			RPL11,
			RPL15,
			RPSL10,
			RSAMD,
			RSCPL,
			RUBY,
			RUBY_PTY,
			SAXPD,
			SAXPD20,
			SAXPATH,
			SCEA,
			SCHEME_REPORT,
			SENDMAIL,
			SENDMAIL823,
			SENDMAIL_OPEN_SOURCE11,
			SGIB10,
			SGIB11,
			SGIB20,
			SGI_OPEN_GL,
			SGP4,
			SHL05,
			SHL051,
			SIM_PL20,
			SISSL,
			SISSL12,
			SL,
			SLEEPYCAT,
			SMAILGPL,
			SMLNJ,
			SMPPL,
			SNIA,
			SNPRINTF,
			SOFA,
			SOFT_SURFER,
			SOUNDEX,
			SPENCER86,
			SPENCER94,
			SPENCER99,
			SPL10,
			SSH_KEYSCAN,
			SSH_OPEN_SSH,
			SSH_SHORT,
			SS_LEAY_STANDALONE,
			SSPL10,
			STANDARD_MLNJ,
			SUGAR_CRM113,
			SUL10,
			SUN_PPP,
			SUN_PPP2000,
			SUN_PRO,
			SWL,
			SWRULE,
			SYMLINKS,
			TAPROHL10,
			TCL,
			TCP_WRAPPERS,
			TERM_READ_KEY,
			TGPPL10,
			THIRD_EYE,
			THREEPARTTABLE,
			TMATE,
			TORQUE11,
			TOSL,
			TPDL,
			TPL10,
			TRUSTED_QSL,
			TTWL,
			TTYP0,
			TU_BERLIN10,
			TU_BERLIN20,
			UBUNTU_FONT10,
			UCAR,
			UCL10,
			ULEM,
			UMICH_MERIT,
			UNICODE30,
			UNICODE_DFS2015,
			UNICODE_DFS2016,
			UNICODE_TOU,
			UNIX_CRYPT,
			UNLICENSE,
			UNLICENSE_LIBTELNET,
			UNLICENSE_LIBWHIRLPOOL,
			UPL10,
			URTRLE,
			VIM,
			VOSTROM,
			VSL10,
			W3C,
			W3C19980720,
			W3C20150513,
			W3M,
			WATCOM10,
			WIDGET_WORKSHOP,
			WSUIPA,
			WTFPL,
			WWL,
			WX_WINDOWS,
			X11,
			X11_DISTRIBUTE_MODIFICATIONS_VARIANT,
			X11_SWAPPED,
			XDEBUG103,
			XEROX,
			XFIG,
			XFREE8611,
			XINETD,
			XKEYBOARD_CONFIG_ZINOVIEV,
			XLOCK,
			XNET,
			XPP,
			XSKAT,
			XZOOM,
			YPL10,
			YPL11,
			ZED,
			ZEEFF,
			ZEND20,
			ZIMBRA13,
			ZIMBRA14,
			ZLIB,
			ZLIB_ACKNOWLEDGEMENT,
			ZPL11,
			ZPL20,
			ZPL21,
			_389_EXCEPTION,
			ASTERISK_EXCEPTION,
			ASTERISK_LINKING_PROTOCOLS_EXCEPTION,
			AUTOCONF_EXCEPTION20,
			AUTOCONF_EXCEPTION30,
			AUTOCONF_EXCEPTION_GENERIC,
			AUTOCONF_EXCEPTION_GENERIC30,
			AUTOCONF_EXCEPTION_MACRO,
			BISON_EXCEPTION124,
			BISON_EXCEPTION22,
			BOOTLOADER_EXCEPTION,
			CGAL_LINKING_EXCEPTION,
			CLASSPATH_EXCEPTION20,
			CLISP_EXCEPTION20,
			CRYPTSETUP_OPEN_SSL_EXCEPTION,
			DIGIA_QT_LGPL_EXCEPTION11,
			DIGI_RULE_FOSS_EXCEPTION,
			ECOS_EXCEPTION20,
			ERLANG_OTP_LINKING_EXCEPTION,
			FAWKES_RUNTIME_EXCEPTION,
			FLTK_EXCEPTION,
			FMT_EXCEPTION,
			FONT_EXCEPTION20,
			FREERTOS_EXCEPTION20,
			GCC_EXCEPTION20,
			GCC_EXCEPTION20_NOTE,
			GCC_EXCEPTION31,
			GMSH_EXCEPTION,
			GNAT_EXCEPTION,
			GNOME_EXAMPLES_EXCEPTION,
			GNU_COMPILER_EXCEPTION,
			GNU_JAVAMAIL_EXCEPTION,
			GPL30389_DS_BASE_EXCEPTION,
			GPL30_INTERFACE_EXCEPTION,
			GPL30_LINKING_EXCEPTION,
			GPL30_LINKING_SOURCE_EXCEPTION,
			GPLCC10,
			GSTREAMER_EXCEPTION2005,
			GSTREAMER_EXCEPTION2008,
			HARBOUR_EXCEPTION,
			I2P_GPL_JAVA_EXCEPTION,
			INDEPENDENT_MODULES_EXCEPTION,
			KI_CAD_LIBRARIES_EXCEPTION,
			LGPL30_LINKING_EXCEPTION,
			LIBPRI_OPEN_H323_EXCEPTION,
			LIBTOOL_EXCEPTION,
			LINUX_SYSCALL_NOTE,
			LLGPL,
			LLVM_EXCEPTION,
			LZMA_EXCEPTION,
			MIF_EXCEPTION,
			MXML_EXCEPTION,
			NOKIA_QT_EXCEPTION11,
			OCAML_LGPL_LINKING_EXCEPTION,
			OCCT_EXCEPTION10,
			OPEN_JDK_ASSEMBLY_EXCEPTION10,
			OPENVPN_OPENSSL_EXCEPTION,
			PCRE2_EXCEPTION,
			POLYPARSE_EXCEPTION,
			PS_OR_PDF_FONT_EXCEPTION20170817,
			QPL10INRIA2004_EXCEPTION,
			QT_GPL_EXCEPTION10,
			QT_LGPL_EXCEPTION11,
			QWT_EXCEPTION10,
			ROMIC_EXCEPTION,
			RR_DTOOL_FLOSS_EXCEPTION20,
			SANE_EXCEPTION,
			SHL20,
			SHL21,
			STUNNEL_EXCEPTION,
			SWI_EXCEPTION,
			SWIFT_EXCEPTION,
			TEXINFO_EXCEPTION,
			UBOOT_EXCEPTION20,
			UBDL_EXCEPTION,
			UNIVERSAL_FOSS_EXCEPTION10,
			VSFTPD_OPENSSL_EXCEPTION,
			WX_WINDOWS_EXCEPTION31,
			X11VNC_OPENSSL_EXCEPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>License Id</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LicenseId> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>License Id</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseId get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseId result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Id</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseId getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseId result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Id</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseId get(int value) {
		switch (value) {
			case _0BSD_VALUE: return _0BSD;
			case _3D_SLICER10_VALUE: return _3D_SLICER10;
			case AAL_VALUE: return AAL;
			case ABSTYLES_VALUE: return ABSTYLES;
			case ADA_CORE_DOC_VALUE: return ADA_CORE_DOC;
			case ADOBE2006_VALUE: return ADOBE2006;
			case ADOBE_DISPLAY_POST_SCRIPT_VALUE: return ADOBE_DISPLAY_POST_SCRIPT;
			case ADOBE_GLYPH_VALUE: return ADOBE_GLYPH;
			case ADOBE_UTOPIA_VALUE: return ADOBE_UTOPIA;
			case ADSL_VALUE: return ADSL;
			case AFL11_VALUE: return AFL11;
			case AFL12_VALUE: return AFL12;
			case AFL20_VALUE: return AFL20;
			case AFL21_VALUE: return AFL21;
			case AFL30_VALUE: return AFL30;
			case AFMPARSE_VALUE: return AFMPARSE;
			case AGPL10_VALUE: return AGPL10;
			case AGPL10_ONLY_VALUE: return AGPL10_ONLY;
			case AGPL10_OR_LATER_VALUE: return AGPL10_OR_LATER;
			case AGPL30_VALUE: return AGPL30;
			case AGPL30_ONLY_VALUE: return AGPL30_ONLY;
			case AGPL30_OR_LATER_VALUE: return AGPL30_OR_LATER;
			case ALADDIN_VALUE: return ALADDIN;
			case AMD_NEWLIB_VALUE: return AMD_NEWLIB;
			case AMDPLPA_VALUE: return AMDPLPA;
			case AML_VALUE: return AML;
			case AML_GLSLANG_VALUE: return AML_GLSLANG;
			case AMPAS_VALUE: return AMPAS;
			case ANTLRPD_VALUE: return ANTLRPD;
			case ANTLRPD_FALLBACK_VALUE: return ANTLRPD_FALLBACK;
			case ANY_OSI_VALUE: return ANY_OSI;
			case ANY_OSI_PERL_MODULES_VALUE: return ANY_OSI_PERL_MODULES;
			case APACHE10_VALUE: return APACHE10;
			case APACHE11_VALUE: return APACHE11;
			case APACHE20_VALUE: return APACHE20;
			case APAFML_VALUE: return APAFML;
			case APL10_VALUE: return APL10;
			case APP_S2P_VALUE: return APP_S2P;
			case APSL10_VALUE: return APSL10;
			case APSL11_VALUE: return APSL11;
			case APSL12_VALUE: return APSL12;
			case APSL20_VALUE: return APSL20;
			case ARPHIC1999_VALUE: return ARPHIC1999;
			case ARTISTIC10_VALUE: return ARTISTIC10;
			case ARTISTIC10_CL8_VALUE: return ARTISTIC10_CL8;
			case ARTISTIC10_PERL_VALUE: return ARTISTIC10_PERL;
			case ARTISTIC20_VALUE: return ARTISTIC20;
			case ARTISTIC_DIST_VALUE: return ARTISTIC_DIST;
			case ASPELL_RU_VALUE: return ASPELL_RU;
			case ASWF_DIGITAL_ASSETS10_VALUE: return ASWF_DIGITAL_ASSETS10;
			case ASWF_DIGITAL_ASSETS11_VALUE: return ASWF_DIGITAL_ASSETS11;
			case BAEKMUK_VALUE: return BAEKMUK;
			case BAHYPH_VALUE: return BAHYPH;
			case BARR_VALUE: return BARR;
			case BCRYPT_SOLAR_DESIGNER_VALUE: return BCRYPT_SOLAR_DESIGNER;
			case BEERWARE_VALUE: return BEERWARE;
			case BITSTREAM_CHARTER_VALUE: return BITSTREAM_CHARTER;
			case BITSTREAM_VERA_VALUE: return BITSTREAM_VERA;
			case BIT_TORRENT10_VALUE: return BIT_TORRENT10;
			case BIT_TORRENT11_VALUE: return BIT_TORRENT11;
			case BLESSING_VALUE: return BLESSING;
			case BLUE_OAK100_VALUE: return BLUE_OAK100;
			case BOEHM_GC_VALUE: return BOEHM_GC;
			case BOEHM_GC_WITHOUT_FEE_VALUE: return BOEHM_GC_WITHOUT_FEE;
			case BORCEUX_VALUE: return BORCEUX;
			case BRIAN_GLADMAN2_CLAUSE_VALUE: return BRIAN_GLADMAN2_CLAUSE;
			case BRIAN_GLADMAN3_CLAUSE_VALUE: return BRIAN_GLADMAN3_CLAUSE;
			case BSD1_CLAUSE_VALUE: return BSD1_CLAUSE;
			case BSD2_CLAUSE_VALUE: return BSD2_CLAUSE;
			case BSD2_CLAUSE_DARWIN_VALUE: return BSD2_CLAUSE_DARWIN;
			case BSD2_CLAUSE_FIRST_LINES_VALUE: return BSD2_CLAUSE_FIRST_LINES;
			case BSD2_CLAUSE_FREE_BSD_VALUE: return BSD2_CLAUSE_FREE_BSD;
			case BSD2_CLAUSE_NET_BSD_VALUE: return BSD2_CLAUSE_NET_BSD;
			case BSD2_CLAUSE_PATENT_VALUE: return BSD2_CLAUSE_PATENT;
			case BSD2_CLAUSE_PKGCONF_DISCLAIMER_VALUE: return BSD2_CLAUSE_PKGCONF_DISCLAIMER;
			case BSD2_CLAUSE_VIEWS_VALUE: return BSD2_CLAUSE_VIEWS;
			case BSD3_CLAUSE_VALUE: return BSD3_CLAUSE;
			case BSD3_CLAUSE_ACPICA_VALUE: return BSD3_CLAUSE_ACPICA;
			case BSD3_CLAUSE_ATTRIBUTION_VALUE: return BSD3_CLAUSE_ATTRIBUTION;
			case BSD3_CLAUSE_CLEAR_VALUE: return BSD3_CLAUSE_CLEAR;
			case BSD3_CLAUSE_FLEX_VALUE: return BSD3_CLAUSE_FLEX;
			case BSD3_CLAUSE_HP_VALUE: return BSD3_CLAUSE_HP;
			case BSD3_CLAUSE_LBNL_VALUE: return BSD3_CLAUSE_LBNL;
			case BSD3_CLAUSE_MODIFICATION_VALUE: return BSD3_CLAUSE_MODIFICATION;
			case BSD3_CLAUSE_NO_MILITARY_LICENSE_VALUE: return BSD3_CLAUSE_NO_MILITARY_LICENSE;
			case BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_LICENSE;
			case BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014;
			case BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_WARRANTY;
			case BSD3_CLAUSE_OPEN_MPI_VALUE: return BSD3_CLAUSE_OPEN_MPI;
			case BSD3_CLAUSE_SUN_VALUE: return BSD3_CLAUSE_SUN;
			case BSD4_CLAUSE_VALUE: return BSD4_CLAUSE;
			case BSD4_CLAUSE_SHORTENED_VALUE: return BSD4_CLAUSE_SHORTENED;
			case BSD4_CLAUSE_UC_VALUE: return BSD4_CLAUSE_UC;
			case BSD43RENO_VALUE: return BSD43RENO;
			case BSD43TAHOE_VALUE: return BSD43TAHOE;
			case BSD_ADVERTISING_ACKNOWLEDGEMENT_VALUE: return BSD_ADVERTISING_ACKNOWLEDGEMENT;
			case BSD_ATTRIBUTION_HPND_DISCLAIMER_VALUE: return BSD_ATTRIBUTION_HPND_DISCLAIMER;
			case BSD_INFERNO_NETTVERK_VALUE: return BSD_INFERNO_NETTVERK;
			case BSD_PROTECTION_VALUE: return BSD_PROTECTION;
			case BSD_SOURCE_BEGINNING_FILE_VALUE: return BSD_SOURCE_BEGINNING_FILE;
			case BSD_SOURCE_CODE_VALUE: return BSD_SOURCE_CODE;
			case BSD_SYSTEMICS_VALUE: return BSD_SYSTEMICS;
			case BSD_SYSTEMICS_W3_WORKS_VALUE: return BSD_SYSTEMICS_W3_WORKS;
			case BSL10_VALUE: return BSL10;
			case BUSL11_VALUE: return BUSL11;
			case BZIP2105_VALUE: return BZIP2105;
			case BZIP2106_VALUE: return BZIP2106;
			case CUDA10_VALUE: return CUDA10;
			case CAL10_VALUE: return CAL10;
			case CAL10_COMBINED_WORK_EXCEPTION_VALUE: return CAL10_COMBINED_WORK_EXCEPTION;
			case CALDERA_VALUE: return CALDERA;
			case CALDERA_NO_PREAMBLE_VALUE: return CALDERA_NO_PREAMBLE;
			case CATHARON_VALUE: return CATHARON;
			case CATOSL11_VALUE: return CATOSL11;
			case CCBY10_VALUE: return CCBY10;
			case CCBY20_VALUE: return CCBY20;
			case CCBY25_VALUE: return CCBY25;
			case CCBY25AU_VALUE: return CCBY25AU;
			case CCBY30_VALUE: return CCBY30;
			case CCBY30AT_VALUE: return CCBY30AT;
			case CCBY30AU_VALUE: return CCBY30AU;
			case CCBY30DE_VALUE: return CCBY30DE;
			case CCBY30IGO_VALUE: return CCBY30IGO;
			case CCBY30NL_VALUE: return CCBY30NL;
			case CCBY30US_VALUE: return CCBY30US;
			case CCBY40_VALUE: return CCBY40;
			case CCBYNC10_VALUE: return CCBYNC10;
			case CCBYNC20_VALUE: return CCBYNC20;
			case CCBYNC25_VALUE: return CCBYNC25;
			case CCBYNC30_VALUE: return CCBYNC30;
			case CCBYNC30DE_VALUE: return CCBYNC30DE;
			case CCBYNC40_VALUE: return CCBYNC40;
			case CCBYNCND10_VALUE: return CCBYNCND10;
			case CCBYNCND20_VALUE: return CCBYNCND20;
			case CCBYNCND25_VALUE: return CCBYNCND25;
			case CCBYNCND30_VALUE: return CCBYNCND30;
			case CCBYNCND30DE_VALUE: return CCBYNCND30DE;
			case CCBYNCND30IGO_VALUE: return CCBYNCND30IGO;
			case CCBYNCND40_VALUE: return CCBYNCND40;
			case CCBYNCSA10_VALUE: return CCBYNCSA10;
			case CCBYNCSA20_VALUE: return CCBYNCSA20;
			case CCBYNCSA20DE_VALUE: return CCBYNCSA20DE;
			case CCBYNCSA20FR_VALUE: return CCBYNCSA20FR;
			case CCBYNCSA20UK_VALUE: return CCBYNCSA20UK;
			case CCBYNCSA25_VALUE: return CCBYNCSA25;
			case CCBYNCSA30_VALUE: return CCBYNCSA30;
			case CCBYNCSA30DE_VALUE: return CCBYNCSA30DE;
			case CCBYNCSA30IGO_VALUE: return CCBYNCSA30IGO;
			case CCBYNCSA40_VALUE: return CCBYNCSA40;
			case CCBYND10_VALUE: return CCBYND10;
			case CCBYND20_VALUE: return CCBYND20;
			case CCBYND25_VALUE: return CCBYND25;
			case CCBYND30_VALUE: return CCBYND30;
			case CCBYND30DE_VALUE: return CCBYND30DE;
			case CCBYND40_VALUE: return CCBYND40;
			case CCBYSA10_VALUE: return CCBYSA10;
			case CCBYSA20_VALUE: return CCBYSA20;
			case CCBYSA20UK_VALUE: return CCBYSA20UK;
			case CCBYSA21JP_VALUE: return CCBYSA21JP;
			case CCBYSA25_VALUE: return CCBYSA25;
			case CCBYSA30_VALUE: return CCBYSA30;
			case CCBYSA30AT_VALUE: return CCBYSA30AT;
			case CCBYSA30DE_VALUE: return CCBYSA30DE;
			case CCBYSA30IGO_VALUE: return CCBYSA30IGO;
			case CCBYSA40_VALUE: return CCBYSA40;
			case CCPDDC_VALUE: return CCPDDC;
			case CCPDM10_VALUE: return CCPDM10;
			case CCSA10_VALUE: return CCSA10;
			case CC010_VALUE: return CC010;
			case CDDL10_VALUE: return CDDL10;
			case CDDL11_VALUE: return CDDL11;
			case CDL10_VALUE: return CDL10;
			case CDLA_PERMISSIVE10_VALUE: return CDLA_PERMISSIVE10;
			case CDLA_PERMISSIVE20_VALUE: return CDLA_PERMISSIVE20;
			case CDLA_SHARING10_VALUE: return CDLA_SHARING10;
			case CECILL10_VALUE: return CECILL10;
			case CECILL11_VALUE: return CECILL11;
			case CECILL20_VALUE: return CECILL20;
			case CECILL21_VALUE: return CECILL21;
			case CECILLB_VALUE: return CECILLB;
			case CECILLC_VALUE: return CECILLC;
			case CERNOHL11_VALUE: return CERNOHL11;
			case CERNOHL12_VALUE: return CERNOHL12;
			case CERNOHLP20_VALUE: return CERNOHLP20;
			case CERNOHLS20_VALUE: return CERNOHLS20;
			case CERNOHLW20_VALUE: return CERNOHLW20;
			case CFITSIO_VALUE: return CFITSIO;
			case CHECK_CVS_VALUE: return CHECK_CVS;
			case CHECKMK_VALUE: return CHECKMK;
			case CL_ARTISTIC_VALUE: return CL_ARTISTIC;
			case CLIPS_VALUE: return CLIPS;
			case CMU_MACH_VALUE: return CMU_MACH;
			case CMU_MACH_NODOC_VALUE: return CMU_MACH_NODOC;
			case CNRI_JYTHON_VALUE: return CNRI_JYTHON;
			case CNRI_PYTHON_VALUE: return CNRI_PYTHON;
			case CNRI_PYTHON_GPL_COMPATIBLE_VALUE: return CNRI_PYTHON_GPL_COMPATIBLE;
			case COIL10_VALUE: return COIL10;
			case COMMUNITY_SPEC10_VALUE: return COMMUNITY_SPEC10;
			case CONDOR11_VALUE: return CONDOR11;
			case COPYLEFT_NEXT030_VALUE: return COPYLEFT_NEXT030;
			case COPYLEFT_NEXT031_VALUE: return COPYLEFT_NEXT031;
			case CORNELL_LOSSLESS_JPEG_VALUE: return CORNELL_LOSSLESS_JPEG;
			case CPAL10_VALUE: return CPAL10;
			case CPL10_VALUE: return CPL10;
			case CPOL102_VALUE: return CPOL102;
			case CRONYX_VALUE: return CRONYX;
			case CROSSWORD_VALUE: return CROSSWORD;
			case CRYPTO_SWIFT_VALUE: return CRYPTO_SWIFT;
			case CRYSTAL_STACKER_VALUE: return CRYSTAL_STACKER;
			case CUAOPL10_VALUE: return CUAOPL10;
			case CUBE_VALUE: return CUBE;
			case CURL_VALUE: return CURL;
			case CVE_TOU_VALUE: return CVE_TOU;
			case DFSL10_VALUE: return DFSL10;
			case DEC3_CLAUSE_VALUE: return DEC3_CLAUSE;
			case DIFFMARK_VALUE: return DIFFMARK;
			case DLDEBY20_VALUE: return DLDEBY20;
			case DLDEZERO20_VALUE: return DLDEZERO20;
			case DOC_VALUE: return DOC;
			case DOC_BOOK_DTD_VALUE: return DOC_BOOK_DTD;
			case DOC_BOOK_SCHEMA_VALUE: return DOC_BOOK_SCHEMA;
			case DOC_BOOK_STYLESHEET_VALUE: return DOC_BOOK_STYLESHEET;
			case DOC_BOOK_XML_VALUE: return DOC_BOOK_XML;
			case DOTSEQN_VALUE: return DOTSEQN;
			case DRL10_VALUE: return DRL10;
			case DRL11_VALUE: return DRL11;
			case DSDP_VALUE: return DSDP;
			case DTOA_VALUE: return DTOA;
			case DVIPDFM_VALUE: return DVIPDFM;
			case ECL10_VALUE: return ECL10;
			case ECL20_VALUE: return ECL20;
			case ECOS20_VALUE: return ECOS20;
			case EFL10_VALUE: return EFL10;
			case EFL20_VALUE: return EFL20;
			case EGENIX_VALUE: return EGENIX;
			case ELASTIC20_VALUE: return ELASTIC20;
			case ENTESSA_VALUE: return ENTESSA;
			case EPICS_VALUE: return EPICS;
			case EPL10_VALUE: return EPL10;
			case EPL20_VALUE: return EPL20;
			case ERL_PL11_VALUE: return ERL_PL11;
			case ETALAB20_VALUE: return ETALAB20;
			case EU_DATAGRID_VALUE: return EU_DATAGRID;
			case EUPL10_VALUE: return EUPL10;
			case EUPL11_VALUE: return EUPL11;
			case EUPL12_VALUE: return EUPL12;
			case EUROSYM_VALUE: return EUROSYM;
			case FAIR_VALUE: return FAIR;
			case FBM_VALUE: return FBM;
			case FDKAAC_VALUE: return FDKAAC;
			case FERGUSON_TWOFISH_VALUE: return FERGUSON_TWOFISH;
			case FRAMEWORX10_VALUE: return FRAMEWORX10;
			case FREE_BSDDOC_VALUE: return FREE_BSDDOC;
			case FREE_IMAGE_VALUE: return FREE_IMAGE;
			case FSFAP_VALUE: return FSFAP;
			case FSFAP_NO_WARRANTY_DISCLAIMER_VALUE: return FSFAP_NO_WARRANTY_DISCLAIMER;
			case FSFUL_VALUE: return FSFUL;
			case FSFULLR_VALUE: return FSFULLR;
			case FSFULLRSD_VALUE: return FSFULLRSD;
			case FSFULLRWD_VALUE: return FSFULLRWD;
			case FSL11A_LV2_VALUE: return FSL11A_LV2;
			case FSL11MIT_VALUE: return FSL11MIT;
			case FTL_VALUE: return FTL;
			case FURUSETH_VALUE: return FURUSETH;
			case FWLW_VALUE: return FWLW;
			case GAME_PROGRAMMING_GEMS_VALUE: return GAME_PROGRAMMING_GEMS;
			case GCR_DOCS_VALUE: return GCR_DOCS;
			case GD_VALUE: return GD;
			case GENERIC_XTS_VALUE: return GENERIC_XTS;
			case GFDL11_VALUE: return GFDL11;
			case GFDL11_INVARIANTS_ONLY_VALUE: return GFDL11_INVARIANTS_ONLY;
			case GFDL11_INVARIANTS_OR_LATER_VALUE: return GFDL11_INVARIANTS_OR_LATER;
			case GFDL11_NO_INVARIANTS_ONLY_VALUE: return GFDL11_NO_INVARIANTS_ONLY;
			case GFDL11_NO_INVARIANTS_OR_LATER_VALUE: return GFDL11_NO_INVARIANTS_OR_LATER;
			case GFDL11_ONLY_VALUE: return GFDL11_ONLY;
			case GFDL11_OR_LATER_VALUE: return GFDL11_OR_LATER;
			case GFDL12_VALUE: return GFDL12;
			case GFDL12_INVARIANTS_ONLY_VALUE: return GFDL12_INVARIANTS_ONLY;
			case GFDL12_INVARIANTS_OR_LATER_VALUE: return GFDL12_INVARIANTS_OR_LATER;
			case GFDL12_NO_INVARIANTS_ONLY_VALUE: return GFDL12_NO_INVARIANTS_ONLY;
			case GFDL12_NO_INVARIANTS_OR_LATER_VALUE: return GFDL12_NO_INVARIANTS_OR_LATER;
			case GFDL12_ONLY_VALUE: return GFDL12_ONLY;
			case GFDL12_OR_LATER_VALUE: return GFDL12_OR_LATER;
			case GFDL13_VALUE: return GFDL13;
			case GFDL13_INVARIANTS_ONLY_VALUE: return GFDL13_INVARIANTS_ONLY;
			case GFDL13_INVARIANTS_OR_LATER_VALUE: return GFDL13_INVARIANTS_OR_LATER;
			case GFDL13_NO_INVARIANTS_ONLY_VALUE: return GFDL13_NO_INVARIANTS_ONLY;
			case GFDL13_NO_INVARIANTS_OR_LATER_VALUE: return GFDL13_NO_INVARIANTS_OR_LATER;
			case GFDL13_ONLY_VALUE: return GFDL13_ONLY;
			case GFDL13_OR_LATER_VALUE: return GFDL13_OR_LATER;
			case GIFTWARE_VALUE: return GIFTWARE;
			case GL2PS_VALUE: return GL2PS;
			case GLIDE_VALUE: return GLIDE;
			case GLULXE_VALUE: return GLULXE;
			case GLWTPL_VALUE: return GLWTPL;
			case GNUPLOT_VALUE: return GNUPLOT;
			case GPL10_VALUE: return GPL10;
			case GPL101_VALUE: return GPL101;
			case GPL10_ONLY_VALUE: return GPL10_ONLY;
			case GPL10_OR_LATER_VALUE: return GPL10_OR_LATER;
			case GPL20_VALUE: return GPL20;
			case GPL201_VALUE: return GPL201;
			case GPL20_ONLY_VALUE: return GPL20_ONLY;
			case GPL20_OR_LATER_VALUE: return GPL20_OR_LATER;
			case GPL20_WITH_AUTOCONF_EXCEPTION_VALUE: return GPL20_WITH_AUTOCONF_EXCEPTION;
			case GPL20_WITH_BISON_EXCEPTION_VALUE: return GPL20_WITH_BISON_EXCEPTION;
			case GPL20_WITH_CLASSPATH_EXCEPTION_VALUE: return GPL20_WITH_CLASSPATH_EXCEPTION;
			case GPL20_WITH_FONT_EXCEPTION_VALUE: return GPL20_WITH_FONT_EXCEPTION;
			case GPL20_WITH_GCC_EXCEPTION_VALUE: return GPL20_WITH_GCC_EXCEPTION;
			case GPL30_VALUE: return GPL30;
			case GPL301_VALUE: return GPL301;
			case GPL30_ONLY_VALUE: return GPL30_ONLY;
			case GPL30_OR_LATER_VALUE: return GPL30_OR_LATER;
			case GPL30_WITH_AUTOCONF_EXCEPTION_VALUE: return GPL30_WITH_AUTOCONF_EXCEPTION;
			case GPL30_WITH_GCC_EXCEPTION_VALUE: return GPL30_WITH_GCC_EXCEPTION;
			case GRAPHICS_GEMS_VALUE: return GRAPHICS_GEMS;
			case GSOAP1_3B_VALUE: return GSOAP1_3B;
			case GTKBOOK_VALUE: return GTKBOOK;
			case GUTMANN_VALUE: return GUTMANN;
			case HASKELL_REPORT_VALUE: return HASKELL_REPORT;
			case HDF5_VALUE: return HDF5;
			case HDPARM_VALUE: return HDPARM;
			case HIDAPI_VALUE: return HIDAPI;
			case HIPPOCRATIC21_VALUE: return HIPPOCRATIC21;
			case HP1986_VALUE: return HP1986;
			case HP1989_VALUE: return HP1989;
			case HPND_VALUE: return HPND;
			case HPNDDEC_VALUE: return HPNDDEC;
			case HPND_DOC_VALUE: return HPND_DOC;
			case HPND_DOC_SELL_VALUE: return HPND_DOC_SELL;
			case HPND_EXPORT_US_VALUE: return HPND_EXPORT_US;
			case HPND_EXPORT_US_ACKNOWLEDGEMENT_VALUE: return HPND_EXPORT_US_ACKNOWLEDGEMENT;
			case HPND_EXPORT_US_MODIFY_VALUE: return HPND_EXPORT_US_MODIFY;
			case HPND_EXPORT2_US_VALUE: return HPND_EXPORT2_US;
			case HPND_FENNEBERG_LIVINGSTON_VALUE: return HPND_FENNEBERG_LIVINGSTON;
			case HPNDINRIAIMAG_VALUE: return HPNDINRIAIMAG;
			case HPND_INTEL_VALUE: return HPND_INTEL;
			case HPND_KEVLIN_HENNEY_VALUE: return HPND_KEVLIN_HENNEY;
			case HPND_MARKUS_KUHN_VALUE: return HPND_MARKUS_KUHN;
			case HPND_MERCHANTABILITY_VARIANT_VALUE: return HPND_MERCHANTABILITY_VARIANT;
			case HPNDMIT_DISCLAIMER_VALUE: return HPNDMIT_DISCLAIMER;
			case HPND_NETREK_VALUE: return HPND_NETREK;
			case HPND_PBMPLUS_VALUE: return HPND_PBMPLUS;
			case HPND_SELL_MIT_DISCLAIMER_XSERVER_VALUE: return HPND_SELL_MIT_DISCLAIMER_XSERVER;
			case HPND_SELL_REGEXPR_VALUE: return HPND_SELL_REGEXPR;
			case HPND_SELL_VARIANT_VALUE: return HPND_SELL_VARIANT;
			case HPND_SELL_VARIANT_MIT_DISCLAIMER_VALUE: return HPND_SELL_VARIANT_MIT_DISCLAIMER;
			case HPND_SELL_VARIANT_MIT_DISCLAIMER_REV_VALUE: return HPND_SELL_VARIANT_MIT_DISCLAIMER_REV;
			case HPNDUC_VALUE: return HPNDUC;
			case HPNDUC_EXPORT_US_VALUE: return HPNDUC_EXPORT_US;
			case HTMLTIDY_VALUE: return HTMLTIDY;
			case IBM_PIBS_VALUE: return IBM_PIBS;
			case ICU_VALUE: return ICU;
			case IEC_CODE_COMPONENTS_EULA_VALUE: return IEC_CODE_COMPONENTS_EULA;
			case IJG_VALUE: return IJG;
			case IJG_SHORT_VALUE: return IJG_SHORT;
			case IMAGE_MAGICK_VALUE: return IMAGE_MAGICK;
			case IMATIX_VALUE: return IMATIX;
			case IMLIB2_VALUE: return IMLIB2;
			case INFO_ZIP_VALUE: return INFO_ZIP;
			case INNER_NET20_VALUE: return INNER_NET20;
			case INNO_SETUP_VALUE: return INNO_SETUP;
			case INTEL_VALUE: return INTEL;
			case INTEL_ACPI_VALUE: return INTEL_ACPI;
			case INTERBASE10_VALUE: return INTERBASE10;
			case IPA_VALUE: return IPA;
			case IPL10_VALUE: return IPL10;
			case ISC_VALUE: return ISC;
			case ISC_VEILLARD_VALUE: return ISC_VEILLARD;
			case JAM_VALUE: return JAM;
			case JAS_PER20_VALUE: return JAS_PER20;
			case JOVE_VALUE: return JOVE;
			case JPL_IMAGE_VALUE: return JPL_IMAGE;
			case JPNIC_VALUE: return JPNIC;
			case JSON_VALUE: return JSON;
			case KASTRUP_VALUE: return KASTRUP;
			case KAZLIB_VALUE: return KAZLIB;
			case KNUTH_CTAN_VALUE: return KNUTH_CTAN;
			case LAL12_VALUE: return LAL12;
			case LAL13_VALUE: return LAL13;
			case LATEX2E_VALUE: return LATEX2E;
			case LATEX2E_TRANSLATED_NOTICE_VALUE: return LATEX2E_TRANSLATED_NOTICE;
			case LEPTONICA_VALUE: return LEPTONICA;
			case LGPL20_VALUE: return LGPL20;
			case LGPL201_VALUE: return LGPL201;
			case LGPL20_ONLY_VALUE: return LGPL20_ONLY;
			case LGPL20_OR_LATER_VALUE: return LGPL20_OR_LATER;
			case LGPL21_VALUE: return LGPL21;
			case LGPL211_VALUE: return LGPL211;
			case LGPL21_ONLY_VALUE: return LGPL21_ONLY;
			case LGPL21_OR_LATER_VALUE: return LGPL21_OR_LATER;
			case LGPL30_VALUE: return LGPL30;
			case LGPL301_VALUE: return LGPL301;
			case LGPL30_ONLY_VALUE: return LGPL30_ONLY;
			case LGPL30_OR_LATER_VALUE: return LGPL30_OR_LATER;
			case LGPLLR_VALUE: return LGPLLR;
			case LIBPNG_VALUE: return LIBPNG;
			case LIBPNG1635_VALUE: return LIBPNG1635;
			case LIBPNG20_VALUE: return LIBPNG20;
			case LIBSELINUX10_VALUE: return LIBSELINUX10;
			case LIBTIFF_VALUE: return LIBTIFF;
			case LIBUTIL_DAVID_NUGENT_VALUE: return LIBUTIL_DAVID_NUGENT;
			case LI_LI_QP11_VALUE: return LI_LI_QP11;
			case LI_LI_QR11_VALUE: return LI_LI_QR11;
			case LI_LI_QRPLUS11_VALUE: return LI_LI_QRPLUS11;
			case LINUX_MAN_PAGES1_PARA_VALUE: return LINUX_MAN_PAGES1_PARA;
			case LINUX_MAN_PAGES_COPYLEFT_VALUE: return LINUX_MAN_PAGES_COPYLEFT;
			case LINUX_MAN_PAGES_COPYLEFT2_PARA_VALUE: return LINUX_MAN_PAGES_COPYLEFT2_PARA;
			case LINUX_MAN_PAGES_COPYLEFT_VAR_VALUE: return LINUX_MAN_PAGES_COPYLEFT_VAR;
			case LINUX_OPEN_IB_VALUE: return LINUX_OPEN_IB;
			case LOOP_VALUE: return LOOP;
			case LPD_DOCUMENT_VALUE: return LPD_DOCUMENT;
			case LPL10_VALUE: return LPL10;
			case LPL102_VALUE: return LPL102;
			case LPPL10_VALUE: return LPPL10;
			case LPPL11_VALUE: return LPPL11;
			case LPPL12_VALUE: return LPPL12;
			case LPPL1_3A_VALUE: return LPPL1_3A;
			case LPPL1_3C_VALUE: return LPPL1_3C;
			case LSOF_VALUE: return LSOF;
			case LUCIDA_BITMAP_FONTS_VALUE: return LUCIDA_BITMAP_FONTS;
			case LZMASDK911_TO920_VALUE: return LZMASDK911_TO920;
			case LZMASDK922_VALUE: return LZMASDK922;
			case MACKERRAS3_CLAUSE_VALUE: return MACKERRAS3_CLAUSE;
			case MACKERRAS3_CLAUSE_ACKNOWLEDGMENT_VALUE: return MACKERRAS3_CLAUSE_ACKNOWLEDGMENT;
			case MAGAZ_VALUE: return MAGAZ;
			case MAILPRIO_VALUE: return MAILPRIO;
			case MAKE_INDEX_VALUE: return MAKE_INDEX;
			case MAN2HTML_VALUE: return MAN2HTML;
			case MARTIN_BIRGMEIER_VALUE: return MARTIN_BIRGMEIER;
			case MC_PHEE_SLIDESHOW_VALUE: return MC_PHEE_SLIDESHOW;
			case METAMAIL_VALUE: return METAMAIL;
			case MINPACK_VALUE: return MINPACK;
			case MIPS_VALUE: return MIPS;
			case MIR_OS_VALUE: return MIR_OS;
			case MIT_VALUE: return MIT;
			case MIT0_VALUE: return MIT0;
			case MIT_ADVERTISING_VALUE: return MIT_ADVERTISING;
			case MIT_CLICK_VALUE: return MIT_CLICK;
			case MITCMU_VALUE: return MITCMU;
			case MIT_ENNA_VALUE: return MIT_ENNA;
			case MIT_FEH_VALUE: return MIT_FEH;
			case MIT_FESTIVAL_VALUE: return MIT_FESTIVAL;
			case MIT_KHRONOS_OLD_VALUE: return MIT_KHRONOS_OLD;
			case MIT_MODERN_VARIANT_VALUE: return MIT_MODERN_VARIANT;
			case MIT_OPEN_GROUP_VALUE: return MIT_OPEN_GROUP;
			case MIT_TESTREGEX_VALUE: return MIT_TESTREGEX;
			case MIT_WU_VALUE: return MIT_WU;
			case MITNFA_VALUE: return MITNFA;
			case MMI_XWARE_VALUE: return MMI_XWARE;
			case MOTOSOTO_VALUE: return MOTOSOTO;
			case MPEGSSG_VALUE: return MPEGSSG;
			case MPI_PERMISSIVE_VALUE: return MPI_PERMISSIVE;
			case MPICH2_VALUE: return MPICH2;
			case MPL10_VALUE: return MPL10;
			case MPL11_VALUE: return MPL11;
			case MPL20_VALUE: return MPL20;
			case MPL20_NO_COPYLEFT_EXCEPTION_VALUE: return MPL20_NO_COPYLEFT_EXCEPTION;
			case MPLUS_VALUE: return MPLUS;
			case MSLPL_VALUE: return MSLPL;
			case MSPL_VALUE: return MSPL;
			case MSRL_VALUE: return MSRL;
			case MTLL_VALUE: return MTLL;
			case MULAN_PSL10_VALUE: return MULAN_PSL10;
			case MULAN_PSL20_VALUE: return MULAN_PSL20;
			case MULTICS_VALUE: return MULTICS;
			case MUP_VALUE: return MUP;
			case NAIST2003_VALUE: return NAIST2003;
			case NASA13_VALUE: return NASA13;
			case NAUMEN_VALUE: return NAUMEN;
			case NBPL10_VALUE: return NBPL10;
			case NCBIPD_VALUE: return NCBIPD;
			case NCGLUK20_VALUE: return NCGLUK20;
			case NCL_VALUE: return NCL;
			case NCSA_VALUE: return NCSA;
			case NET_SNMP_VALUE: return NET_SNMP;
			case NET_CDF_VALUE: return NET_CDF;
			case NEWSLETR_VALUE: return NEWSLETR;
			case NGPL_VALUE: return NGPL;
			case NGREP_VALUE: return NGREP;
			case NICTA10_VALUE: return NICTA10;
			case NISTPD_VALUE: return NISTPD;
			case NISTPD_FALLBACK_VALUE: return NISTPD_FALLBACK;
			case NIST_SOFTWARE_VALUE: return NIST_SOFTWARE;
			case NLOD10_VALUE: return NLOD10;
			case NLOD20_VALUE: return NLOD20;
			case NLPL_VALUE: return NLPL;
			case NOKIA_VALUE: return NOKIA;
			case NOSL_VALUE: return NOSL;
			case NOWEB_VALUE: return NOWEB;
			case NPL10_VALUE: return NPL10;
			case NPL11_VALUE: return NPL11;
			case NPOSL30_VALUE: return NPOSL30;
			case NRL_VALUE: return NRL;
			case NTIAPD_VALUE: return NTIAPD;
			case NTP_VALUE: return NTP;
			case NTP0_VALUE: return NTP0;
			case NUNIT_VALUE: return NUNIT;
			case OUDA10_VALUE: return OUDA10;
			case OAR_VALUE: return OAR;
			case OCCTPL_VALUE: return OCCTPL;
			case OCLC20_VALUE: return OCLC20;
			case ODB_L10_VALUE: return ODB_L10;
			case ODC_BY10_VALUE: return ODC_BY10;
			case OFFIS_VALUE: return OFFIS;
			case OFL10_VALUE: return OFL10;
			case OFL10_NO_RFN_VALUE: return OFL10_NO_RFN;
			case OFL10RFN_VALUE: return OFL10RFN;
			case OFL11_VALUE: return OFL11;
			case OFL11_NO_RFN_VALUE: return OFL11_NO_RFN;
			case OFL11RFN_VALUE: return OFL11RFN;
			case OGC10_VALUE: return OGC10;
			case OGDL_TAIWAN10_VALUE: return OGDL_TAIWAN10;
			case OGL_CANADA20_VALUE: return OGL_CANADA20;
			case OGLUK10_VALUE: return OGLUK10;
			case OGLUK20_VALUE: return OGLUK20;
			case OGLUK30_VALUE: return OGLUK30;
			case OGTSL_VALUE: return OGTSL;
			case OLDAP11_VALUE: return OLDAP11;
			case OLDAP12_VALUE: return OLDAP12;
			case OLDAP13_VALUE: return OLDAP13;
			case OLDAP14_VALUE: return OLDAP14;
			case OLDAP20_VALUE: return OLDAP20;
			case OLDAP201_VALUE: return OLDAP201;
			case OLDAP21_VALUE: return OLDAP21;
			case OLDAP22_VALUE: return OLDAP22;
			case OLDAP221_VALUE: return OLDAP221;
			case OLDAP222_VALUE: return OLDAP222;
			case OLDAP23_VALUE: return OLDAP23;
			case OLDAP24_VALUE: return OLDAP24;
			case OLDAP25_VALUE: return OLDAP25;
			case OLDAP26_VALUE: return OLDAP26;
			case OLDAP27_VALUE: return OLDAP27;
			case OLDAP28_VALUE: return OLDAP28;
			case OLFL13_VALUE: return OLFL13;
			case OML_VALUE: return OML;
			case OPEN_PBS23_VALUE: return OPEN_PBS23;
			case OPEN_SSL_VALUE: return OPEN_SSL;
			case OPEN_SSL_STANDALONE_VALUE: return OPEN_SSL_STANDALONE;
			case OPEN_VISION_VALUE: return OPEN_VISION;
			case OPL10_VALUE: return OPL10;
			case OPLUK30_VALUE: return OPLUK30;
			case OPUBL10_VALUE: return OPUBL10;
			case OSETPL21_VALUE: return OSETPL21;
			case OSL10_VALUE: return OSL10;
			case OSL11_VALUE: return OSL11;
			case OSL20_VALUE: return OSL20;
			case OSL21_VALUE: return OSL21;
			case OSL30_VALUE: return OSL30;
			case PADL_VALUE: return PADL;
			case PARITY600_VALUE: return PARITY600;
			case PARITY700_VALUE: return PARITY700;
			case PDDL10_VALUE: return PDDL10;
			case PHP30_VALUE: return PHP30;
			case PHP301_VALUE: return PHP301;
			case PIXAR_VALUE: return PIXAR;
			case PKGCONF_VALUE: return PKGCONF;
			case PLEXUS_VALUE: return PLEXUS;
			case PNMSTITCH_VALUE: return PNMSTITCH;
			case POLY_FORM_NONCOMMERCIAL100_VALUE: return POLY_FORM_NONCOMMERCIAL100;
			case POLY_FORM_SMALL_BUSINESS100_VALUE: return POLY_FORM_SMALL_BUSINESS100;
			case POSTGRE_SQL_VALUE: return POSTGRE_SQL;
			case PPL_VALUE: return PPL;
			case PSF20_VALUE: return PSF20;
			case PSFRAG_VALUE: return PSFRAG;
			case PSUTILS_VALUE: return PSUTILS;
			case PYTHON20_VALUE: return PYTHON20;
			case PYTHON201_VALUE: return PYTHON201;
			case PYTHON_LDAP_VALUE: return PYTHON_LDAP;
			case QHULL_VALUE: return QHULL;
			case QPL10_VALUE: return QPL10;
			case QPL10INRIA2004_VALUE: return QPL10INRIA2004;
			case RADVD_VALUE: return RADVD;
			case RDISC_VALUE: return RDISC;
			case RHE_COS11_VALUE: return RHE_COS11;
			case RPL11_VALUE: return RPL11;
			case RPL15_VALUE: return RPL15;
			case RPSL10_VALUE: return RPSL10;
			case RSAMD_VALUE: return RSAMD;
			case RSCPL_VALUE: return RSCPL;
			case RUBY_VALUE: return RUBY;
			case RUBY_PTY_VALUE: return RUBY_PTY;
			case SAXPD_VALUE: return SAXPD;
			case SAXPD20_VALUE: return SAXPD20;
			case SAXPATH_VALUE: return SAXPATH;
			case SCEA_VALUE: return SCEA;
			case SCHEME_REPORT_VALUE: return SCHEME_REPORT;
			case SENDMAIL_VALUE: return SENDMAIL;
			case SENDMAIL823_VALUE: return SENDMAIL823;
			case SENDMAIL_OPEN_SOURCE11_VALUE: return SENDMAIL_OPEN_SOURCE11;
			case SGIB10_VALUE: return SGIB10;
			case SGIB11_VALUE: return SGIB11;
			case SGIB20_VALUE: return SGIB20;
			case SGI_OPEN_GL_VALUE: return SGI_OPEN_GL;
			case SGP4_VALUE: return SGP4;
			case SHL05_VALUE: return SHL05;
			case SHL051_VALUE: return SHL051;
			case SIM_PL20_VALUE: return SIM_PL20;
			case SISSL_VALUE: return SISSL;
			case SISSL12_VALUE: return SISSL12;
			case SL_VALUE: return SL;
			case SLEEPYCAT_VALUE: return SLEEPYCAT;
			case SMAILGPL_VALUE: return SMAILGPL;
			case SMLNJ_VALUE: return SMLNJ;
			case SMPPL_VALUE: return SMPPL;
			case SNIA_VALUE: return SNIA;
			case SNPRINTF_VALUE: return SNPRINTF;
			case SOFA_VALUE: return SOFA;
			case SOFT_SURFER_VALUE: return SOFT_SURFER;
			case SOUNDEX_VALUE: return SOUNDEX;
			case SPENCER86_VALUE: return SPENCER86;
			case SPENCER94_VALUE: return SPENCER94;
			case SPENCER99_VALUE: return SPENCER99;
			case SPL10_VALUE: return SPL10;
			case SSH_KEYSCAN_VALUE: return SSH_KEYSCAN;
			case SSH_OPEN_SSH_VALUE: return SSH_OPEN_SSH;
			case SSH_SHORT_VALUE: return SSH_SHORT;
			case SS_LEAY_STANDALONE_VALUE: return SS_LEAY_STANDALONE;
			case SSPL10_VALUE: return SSPL10;
			case STANDARD_MLNJ_VALUE: return STANDARD_MLNJ;
			case SUGAR_CRM113_VALUE: return SUGAR_CRM113;
			case SUL10_VALUE: return SUL10;
			case SUN_PPP_VALUE: return SUN_PPP;
			case SUN_PPP2000_VALUE: return SUN_PPP2000;
			case SUN_PRO_VALUE: return SUN_PRO;
			case SWL_VALUE: return SWL;
			case SWRULE_VALUE: return SWRULE;
			case SYMLINKS_VALUE: return SYMLINKS;
			case TAPROHL10_VALUE: return TAPROHL10;
			case TCL_VALUE: return TCL;
			case TCP_WRAPPERS_VALUE: return TCP_WRAPPERS;
			case TERM_READ_KEY_VALUE: return TERM_READ_KEY;
			case TGPPL10_VALUE: return TGPPL10;
			case THIRD_EYE_VALUE: return THIRD_EYE;
			case THREEPARTTABLE_VALUE: return THREEPARTTABLE;
			case TMATE_VALUE: return TMATE;
			case TORQUE11_VALUE: return TORQUE11;
			case TOSL_VALUE: return TOSL;
			case TPDL_VALUE: return TPDL;
			case TPL10_VALUE: return TPL10;
			case TRUSTED_QSL_VALUE: return TRUSTED_QSL;
			case TTWL_VALUE: return TTWL;
			case TTYP0_VALUE: return TTYP0;
			case TU_BERLIN10_VALUE: return TU_BERLIN10;
			case TU_BERLIN20_VALUE: return TU_BERLIN20;
			case UBUNTU_FONT10_VALUE: return UBUNTU_FONT10;
			case UCAR_VALUE: return UCAR;
			case UCL10_VALUE: return UCL10;
			case ULEM_VALUE: return ULEM;
			case UMICH_MERIT_VALUE: return UMICH_MERIT;
			case UNICODE30_VALUE: return UNICODE30;
			case UNICODE_DFS2015_VALUE: return UNICODE_DFS2015;
			case UNICODE_DFS2016_VALUE: return UNICODE_DFS2016;
			case UNICODE_TOU_VALUE: return UNICODE_TOU;
			case UNIX_CRYPT_VALUE: return UNIX_CRYPT;
			case UNLICENSE_VALUE: return UNLICENSE;
			case UNLICENSE_LIBTELNET_VALUE: return UNLICENSE_LIBTELNET;
			case UNLICENSE_LIBWHIRLPOOL_VALUE: return UNLICENSE_LIBWHIRLPOOL;
			case UPL10_VALUE: return UPL10;
			case URTRLE_VALUE: return URTRLE;
			case VIM_VALUE: return VIM;
			case VOSTROM_VALUE: return VOSTROM;
			case VSL10_VALUE: return VSL10;
			case W3C_VALUE: return W3C;
			case W3C19980720_VALUE: return W3C19980720;
			case W3C20150513_VALUE: return W3C20150513;
			case W3M_VALUE: return W3M;
			case WATCOM10_VALUE: return WATCOM10;
			case WIDGET_WORKSHOP_VALUE: return WIDGET_WORKSHOP;
			case WSUIPA_VALUE: return WSUIPA;
			case WTFPL_VALUE: return WTFPL;
			case WWL_VALUE: return WWL;
			case WX_WINDOWS_VALUE: return WX_WINDOWS;
			case X11_VALUE: return X11;
			case X11_DISTRIBUTE_MODIFICATIONS_VARIANT_VALUE: return X11_DISTRIBUTE_MODIFICATIONS_VARIANT;
			case X11_SWAPPED_VALUE: return X11_SWAPPED;
			case XDEBUG103_VALUE: return XDEBUG103;
			case XEROX_VALUE: return XEROX;
			case XFIG_VALUE: return XFIG;
			case XFREE8611_VALUE: return XFREE8611;
			case XINETD_VALUE: return XINETD;
			case XKEYBOARD_CONFIG_ZINOVIEV_VALUE: return XKEYBOARD_CONFIG_ZINOVIEV;
			case XLOCK_VALUE: return XLOCK;
			case XNET_VALUE: return XNET;
			case XPP_VALUE: return XPP;
			case XSKAT_VALUE: return XSKAT;
			case XZOOM_VALUE: return XZOOM;
			case YPL10_VALUE: return YPL10;
			case YPL11_VALUE: return YPL11;
			case ZED_VALUE: return ZED;
			case ZEEFF_VALUE: return ZEEFF;
			case ZEND20_VALUE: return ZEND20;
			case ZIMBRA13_VALUE: return ZIMBRA13;
			case ZIMBRA14_VALUE: return ZIMBRA14;
			case ZLIB_VALUE: return ZLIB;
			case ZLIB_ACKNOWLEDGEMENT_VALUE: return ZLIB_ACKNOWLEDGEMENT;
			case ZPL11_VALUE: return ZPL11;
			case ZPL20_VALUE: return ZPL20;
			case ZPL21_VALUE: return ZPL21;
			case _389_EXCEPTION_VALUE: return _389_EXCEPTION;
			case ASTERISK_EXCEPTION_VALUE: return ASTERISK_EXCEPTION;
			case ASTERISK_LINKING_PROTOCOLS_EXCEPTION_VALUE: return ASTERISK_LINKING_PROTOCOLS_EXCEPTION;
			case AUTOCONF_EXCEPTION20_VALUE: return AUTOCONF_EXCEPTION20;
			case AUTOCONF_EXCEPTION30_VALUE: return AUTOCONF_EXCEPTION30;
			case AUTOCONF_EXCEPTION_GENERIC_VALUE: return AUTOCONF_EXCEPTION_GENERIC;
			case AUTOCONF_EXCEPTION_GENERIC30_VALUE: return AUTOCONF_EXCEPTION_GENERIC30;
			case AUTOCONF_EXCEPTION_MACRO_VALUE: return AUTOCONF_EXCEPTION_MACRO;
			case BISON_EXCEPTION124_VALUE: return BISON_EXCEPTION124;
			case BISON_EXCEPTION22_VALUE: return BISON_EXCEPTION22;
			case BOOTLOADER_EXCEPTION_VALUE: return BOOTLOADER_EXCEPTION;
			case CGAL_LINKING_EXCEPTION_VALUE: return CGAL_LINKING_EXCEPTION;
			case CLASSPATH_EXCEPTION20_VALUE: return CLASSPATH_EXCEPTION20;
			case CLISP_EXCEPTION20_VALUE: return CLISP_EXCEPTION20;
			case CRYPTSETUP_OPEN_SSL_EXCEPTION_VALUE: return CRYPTSETUP_OPEN_SSL_EXCEPTION;
			case DIGIA_QT_LGPL_EXCEPTION11_VALUE: return DIGIA_QT_LGPL_EXCEPTION11;
			case DIGI_RULE_FOSS_EXCEPTION_VALUE: return DIGI_RULE_FOSS_EXCEPTION;
			case ECOS_EXCEPTION20_VALUE: return ECOS_EXCEPTION20;
			case ERLANG_OTP_LINKING_EXCEPTION_VALUE: return ERLANG_OTP_LINKING_EXCEPTION;
			case FAWKES_RUNTIME_EXCEPTION_VALUE: return FAWKES_RUNTIME_EXCEPTION;
			case FLTK_EXCEPTION_VALUE: return FLTK_EXCEPTION;
			case FMT_EXCEPTION_VALUE: return FMT_EXCEPTION;
			case FONT_EXCEPTION20_VALUE: return FONT_EXCEPTION20;
			case FREERTOS_EXCEPTION20_VALUE: return FREERTOS_EXCEPTION20;
			case GCC_EXCEPTION20_VALUE: return GCC_EXCEPTION20;
			case GCC_EXCEPTION20_NOTE_VALUE: return GCC_EXCEPTION20_NOTE;
			case GCC_EXCEPTION31_VALUE: return GCC_EXCEPTION31;
			case GMSH_EXCEPTION_VALUE: return GMSH_EXCEPTION;
			case GNAT_EXCEPTION_VALUE: return GNAT_EXCEPTION;
			case GNOME_EXAMPLES_EXCEPTION_VALUE: return GNOME_EXAMPLES_EXCEPTION;
			case GNU_COMPILER_EXCEPTION_VALUE: return GNU_COMPILER_EXCEPTION;
			case GNU_JAVAMAIL_EXCEPTION_VALUE: return GNU_JAVAMAIL_EXCEPTION;
			case GPL30389_DS_BASE_EXCEPTION_VALUE: return GPL30389_DS_BASE_EXCEPTION;
			case GPL30_INTERFACE_EXCEPTION_VALUE: return GPL30_INTERFACE_EXCEPTION;
			case GPL30_LINKING_EXCEPTION_VALUE: return GPL30_LINKING_EXCEPTION;
			case GPL30_LINKING_SOURCE_EXCEPTION_VALUE: return GPL30_LINKING_SOURCE_EXCEPTION;
			case GPLCC10_VALUE: return GPLCC10;
			case GSTREAMER_EXCEPTION2005_VALUE: return GSTREAMER_EXCEPTION2005;
			case GSTREAMER_EXCEPTION2008_VALUE: return GSTREAMER_EXCEPTION2008;
			case HARBOUR_EXCEPTION_VALUE: return HARBOUR_EXCEPTION;
			case I2P_GPL_JAVA_EXCEPTION_VALUE: return I2P_GPL_JAVA_EXCEPTION;
			case INDEPENDENT_MODULES_EXCEPTION_VALUE: return INDEPENDENT_MODULES_EXCEPTION;
			case KI_CAD_LIBRARIES_EXCEPTION_VALUE: return KI_CAD_LIBRARIES_EXCEPTION;
			case LGPL30_LINKING_EXCEPTION_VALUE: return LGPL30_LINKING_EXCEPTION;
			case LIBPRI_OPEN_H323_EXCEPTION_VALUE: return LIBPRI_OPEN_H323_EXCEPTION;
			case LIBTOOL_EXCEPTION_VALUE: return LIBTOOL_EXCEPTION;
			case LINUX_SYSCALL_NOTE_VALUE: return LINUX_SYSCALL_NOTE;
			case LLGPL_VALUE: return LLGPL;
			case LLVM_EXCEPTION_VALUE: return LLVM_EXCEPTION;
			case LZMA_EXCEPTION_VALUE: return LZMA_EXCEPTION;
			case MIF_EXCEPTION_VALUE: return MIF_EXCEPTION;
			case MXML_EXCEPTION_VALUE: return MXML_EXCEPTION;
			case NOKIA_QT_EXCEPTION11_VALUE: return NOKIA_QT_EXCEPTION11;
			case OCAML_LGPL_LINKING_EXCEPTION_VALUE: return OCAML_LGPL_LINKING_EXCEPTION;
			case OCCT_EXCEPTION10_VALUE: return OCCT_EXCEPTION10;
			case OPEN_JDK_ASSEMBLY_EXCEPTION10_VALUE: return OPEN_JDK_ASSEMBLY_EXCEPTION10;
			case OPENVPN_OPENSSL_EXCEPTION_VALUE: return OPENVPN_OPENSSL_EXCEPTION;
			case PCRE2_EXCEPTION_VALUE: return PCRE2_EXCEPTION;
			case POLYPARSE_EXCEPTION_VALUE: return POLYPARSE_EXCEPTION;
			case PS_OR_PDF_FONT_EXCEPTION20170817_VALUE: return PS_OR_PDF_FONT_EXCEPTION20170817;
			case QPL10INRIA2004_EXCEPTION_VALUE: return QPL10INRIA2004_EXCEPTION;
			case QT_GPL_EXCEPTION10_VALUE: return QT_GPL_EXCEPTION10;
			case QT_LGPL_EXCEPTION11_VALUE: return QT_LGPL_EXCEPTION11;
			case QWT_EXCEPTION10_VALUE: return QWT_EXCEPTION10;
			case ROMIC_EXCEPTION_VALUE: return ROMIC_EXCEPTION;
			case RR_DTOOL_FLOSS_EXCEPTION20_VALUE: return RR_DTOOL_FLOSS_EXCEPTION20;
			case SANE_EXCEPTION_VALUE: return SANE_EXCEPTION;
			case SHL20_VALUE: return SHL20;
			case SHL21_VALUE: return SHL21;
			case STUNNEL_EXCEPTION_VALUE: return STUNNEL_EXCEPTION;
			case SWI_EXCEPTION_VALUE: return SWI_EXCEPTION;
			case SWIFT_EXCEPTION_VALUE: return SWIFT_EXCEPTION;
			case TEXINFO_EXCEPTION_VALUE: return TEXINFO_EXCEPTION;
			case UBOOT_EXCEPTION20_VALUE: return UBOOT_EXCEPTION20;
			case UBDL_EXCEPTION_VALUE: return UBDL_EXCEPTION;
			case UNIVERSAL_FOSS_EXCEPTION10_VALUE: return UNIVERSAL_FOSS_EXCEPTION10;
			case VSFTPD_OPENSSL_EXCEPTION_VALUE: return VSFTPD_OPENSSL_EXCEPTION;
			case WX_WINDOWS_EXCEPTION31_VALUE: return WX_WINDOWS_EXCEPTION31;
			case X11VNC_OPENSSL_EXCEPTION_VALUE: return X11VNC_OPENSSL_EXCEPTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LicenseId(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LicenseId
